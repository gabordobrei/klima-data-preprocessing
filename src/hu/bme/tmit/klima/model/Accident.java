package hu.bme.tmit.klima.model;

import java.sql.Connection;
import java.sql.SQLException;


public class Accident extends KlimaData {
	long id;
	
	/**
	 * HALÁLOSBALESET, SÚLYOSBALESET KÖNNYŰBALESET
	 */
	int sulyossag;
	
	/**
	 * lakottterületen / lakottterületenkívül
	 */
	boolean lakottTerulet;
	
	
	
	Date date;
	Location location;
	@Override
	public boolean insert(Connection connection) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
