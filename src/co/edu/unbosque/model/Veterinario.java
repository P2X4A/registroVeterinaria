package co.edu.unbosque.model;

public class Veterinario {

	private String nombreVeterinario;
	private String identificacionVeterinario;

	public Veterinario(String nombreVeterinario, String identificacionVeterinario) {
		this.nombreVeterinario = nombreVeterinario;
		this.identificacionVeterinario = identificacionVeterinario;
	}

	public String getNombreVeterinario() {
		return nombreVeterinario;
	}

	public void setNombreVeterinario(String nombreVeterinario) {
		this.nombreVeterinario = nombreVeterinario;
	}

	public String getIdentificacionVeterinario() {
		return identificacionVeterinario;
	}

	public void setIdentificacionVeterinario(String identificacionVeterinario) {
		this.identificacionVeterinario = identificacionVeterinario;
	}

}
