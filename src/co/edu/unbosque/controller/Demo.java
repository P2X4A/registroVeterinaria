package co.edu.unbosque.controller;

import co.edu.unbosque.model.Mascota;
import co.edu.unbosque.model.MascotaDTO;
import co.edu.unbosque.model.Veterinaria;
import co.edu.unbosque.model.Veterinario;

import java.util.List;

/**
 * Demostracion de uso del modelo de la veterinaria.
 *
 * El proyecto se centra en el modelo de dominio y la capa de persistencia,
 * por lo que esta clase existe para poder ejecutar una muestra funcional.
 */
public class Demo {

	public static void main(String[] args) {
		Veterinaria veterinaria = new Veterinaria();

		Veterinario drRamirez = new Veterinario("Dra. Ramirez", "VET-001");
		veterinaria.registrarVeterinario(drRamirez);

		Mascota luna = new Mascota("Luna", "Perro");
		Mascota misty = new Mascota("Misty", "Gato");
		veterinaria.registrarMascota(luna);
		veterinaria.registrarMascota(misty);

		veterinaria.asignarCitas("VET-001", luna);
		veterinaria.asignarCitas("VET-001", misty);

		System.out.println("=== AGENDA DE " + veterinaria.getAgendaVeterinaria().totalCitas() + " CITAS ===");
		System.out.println(veterinaria.getAgendaVeterinaria().informacionArchivo());

		List<MascotaDTO> citas = veterinaria.getCitasVeterinario("VET-001");
		System.out.println("=== CITAS DE " + drRamirez.getNombreVeterinario() + " (DTO) ===");
		for (MascotaDTO cita : citas) {
			System.out.println("  " + cita.getNombreMascota() + " - " + cita.getEspecieMascota());
		}

		System.out.println();
		System.out.println("Intento de registrar una mascota duplicada: "
				+ veterinaria.registrarMascota(new Mascota("luna", "Perro")));
	}
}