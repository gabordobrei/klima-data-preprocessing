package hu.bme.tmit.klima.model.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface Databaseable {
	public boolean insert(Connection connection) throws SQLException;
}
