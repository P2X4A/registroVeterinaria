package co.edu.unbosque.persistence;

import java.io.IOException;

import co.edu.unbosque.model.AgendaVeterinaria;

public class CitaDAOImpl implements IDAO <AgendaVeterinaria> {

	@Override
	public void guardar(AgendaVeterinaria entidad) throws IOException {
		FileHandler.escribirData(entidad.informacionArchivo());

	}

}
