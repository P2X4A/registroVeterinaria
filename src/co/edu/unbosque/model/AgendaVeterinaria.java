package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Agenda de citas medicas de la veterinaria.
 * Relaciona la identificacion de un veterinario con la lista de
 * mascotas que tiene asignadas como pacientes.
 */
public class AgendaVeterinaria {

	private final Map<String, List<Mascota>> citasMedicas;

	public AgendaVeterinaria() {
		citasMedicas = new HashMap<String, List<Mascota>>();
	}

	/**
	 * Asigna una mascota a un veterinario. Si el veterinario ya tiene
	 * agenda, la mascota se agrega a su lista existente.
	 *
	 * @param identificacionVeterinario clave del veterinario en la agenda
	 * @param mascota mascota a asignar
	 */
	public void asignarCitas(String identificacionVeterinario, Mascota mascota) {
		if (identificacionVeterinario == null || mascota == null) {
			throw new IllegalArgumentException("El veterinario y la mascota son obligatorios");
		}
		List<Mascota> asignadas = citasMedicas.get(identificacionVeterinario);
		if (asignadas == null) {
			asignadas = new ArrayList<Mascota>();
			citasMedicas.put(identificacionVeterinario, asignadas);
		}
		asignadas.add(mascota);
	}

	/**
	 * @return la lista de mascotas del veterinario, o null si no tiene agenda
	 */
	public List<Mascota> obtenerCitas(String identificacionVeterinario) {
		return citasMedicas.get(identificacionVeterinario);
	}

	/**
	 * @return numero de veterinarios que tienen agenda activa
	 */
	public int cantidadVeterinariosConAgenda() {
		return citasMedicas.size();
	}

	/**
	 * @return total de citas registradas en la agenda
	 */
	public int totalCitas() {
		int total = 0;
		for (List<Mascota> lista : citasMedicas.values()) {
			total += lista.size();
		}
		return total;
	}

	/**
	 * Genera el contenido que se persiste en el archivo de la veterinaria.
	 *
	 * @return informacion legible de la agenda
	 */
	public String informacionArchivo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Veterinarios con agenda: ").append(citasMedicas.size()).append("\n");
		for (Map.Entry<String, List<Mascota>> entrada : citasMedicas.entrySet()) {
			sb.append("Identificacion: ").append(entrada.getKey());
			sb.append(" | Citas Medicas: ");
			for (Mascota mascota : entrada.getValue()) {
				sb.append(mascota.getNombreMascota()).append(" (").append(mascota.getEspecieMascota()).append("); ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}