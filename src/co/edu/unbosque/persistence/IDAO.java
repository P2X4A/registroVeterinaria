package co.edu.unbosque.persistence;

import java.io.IOException;

public interface IDAO <T> {
	void guardar(T entidad) throws IOException;
}
