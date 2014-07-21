package hu.bme.tmit.klima.model;


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

}
