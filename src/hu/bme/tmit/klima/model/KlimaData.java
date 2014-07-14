package hu.bme.tmit.klima.model;

public abstract class KlimaData {
	private static int idGenerator = 0;
	private final int ID;

	public KlimaData() {
		ID = idGenerator++;
	}

	public int getID() {
		return ID;
	}

}
