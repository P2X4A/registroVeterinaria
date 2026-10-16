package co.edu.unbosque.model;

public class Mascota {

	private String nombreMascota;
	private String especieMascota;
	
	public Mascota(String nombreMascota, String especieMascota) {
		this.nombreMascota = nombreMascota;
		this.especieMascota = especieMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getEspecieMascota() {
		return especieMascota;
	}

	public void setEspecieMascota(String especieMascota) {
		this.especieMascota = especieMascota;
	}
	
	
	
}
