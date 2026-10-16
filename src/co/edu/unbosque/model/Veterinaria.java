package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de la veterinaria: administra las mascotas registradas,
 * los veterinarios y la agenda de citas medicas.
 */
public class Veterinaria {

	private final List<Mascota> mascotas;
	private final List<Veterinario> veterinarios;
	private final AgendaVeterinaria agendaVeterinaria;

	public Veterinaria() {
		this.mascotas = new ArrayList<Mascota>();
		this.veterinarios = new ArrayList<Veterinario>();
		this.agendaVeterinaria = new AgendaVeterinaria();
	}

	/**
	 * Registra una nueva mascota en la veterinaria.
	 * No se permiten nombres repetidos.
	 *
	 * @param mascota mascota a registrar
	 * @return true si se registro, false si ya existia
	 */
	public boolean registrarMascota(Mascota mascota) {
		if (mascota == null) {
			throw new IllegalArgumentException("La mascota es obligatoria");
		}
		for (Mascota existente : mascotas) {
			if (existente.getNombreMascota().equalsIgnoreCase(mascota.getNombreMascota())) {
				return false;
			}
		}
		mascotas.add(mascota);
		return true;
	}

	/**
	 * Registra un nuevo veterinario en la clinica.
	 *
	 * @param veterinario veterinario a registrar
	 * @return true si se registro, false si ya existia su identificacion
	 */
	public boolean registrarVeterinario(Veterinario veterinario) {
		if (veterinario == null) {
			throw new IllegalArgumentException("El veterinario es obligatorio");
		}
		for (Veterinario existente : veterinarios) {
			if (existente.getIdentificacionVeterinario().equals(veterinario.getIdentificacionVeterinario())) {
				return false;
			}
		}
		veterinarios.add(veterinario);
		return true;
	}

	/**
	 * Asigna una cita medica delegando en la agenda.
	 *
	 * @param identificacionVeterinario clave del veterinario
	 * @param mascota mascota paciente
	 */
	public void asignarCitas(String identificacionVeterinario, Mascota mascota) {
		agendaVeterinaria.asignarCitas(identificacionVeterinario, mascota);
	}

	/**
	 * Obtiene las citas de un veterinario en forma de DTO, lista para persistir.
	 *
	 * @param identificacionVeterinario clave del veterinario
	 * @return lista de MascotaDTO, vacia si el veterinario no tiene agenda
	 */
	public List<MascotaDTO> getCitasVeterinario(String identificacionVeterinario) {
		List<MascotaDTO> resultado = new ArrayList<MascotaDTO>();
		List<Mascota> citas = agendaVeterinaria.obtenerCitas(identificacionVeterinario);
		if (citas != null) {
			for (Mascota mascota : citas) {
				resultado.add(new MascotaDTO(mascota.getNombreMascota(), mascota.getEspecieMascota()));
			}
		}
		return resultado;
	}

	/**
	 * @return todas las mascotas registradas
	 */
	public List<Mascota> getMascotas() {
		return mascotas;
	}

	/**
	 * @return todos los veterinarios registrados
	 */
	public List<Veterinario> getVeterinarios() {
		return veterinarios;
	}

	/**
	 * @return la agenda de la veterinaria
	 */
	public AgendaVeterinaria getAgendaVeterinaria() {
		return agendaVeterinaria;
	}

	/**
	 * @return informacion completa de la veterinaria para persistir
	 */
	public String informacionArchivo() {
		return "Mascotas: " + mascotas.size() + "\n"
				+ "Veterinarios: " + veterinarios.size() + "\n"
				+ agendaVeterinaria.informacionArchivo();
	}
}