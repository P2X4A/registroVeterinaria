package co.edu.unbosque.model;

public class MascotaDTO {

	private String nombreMascota;
	private String especieMascota;

	public MascotaDTO(String nombreMascota, String especieMascota) {
		this.nombreMascota = nombreMascota;
		this.especieMascota = especieMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public String getEspecieMascota() {
		return especieMascota;
	}

}
