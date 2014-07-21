package hu.bme.tmit.klima.model;

import java.util.Map;

import com.google.gson.Gson;

import hu.bme.tmit.klima.model.interfaces.Databaseable;

public abstract class KlimaData implements Databaseable {
	protected Map<String, Object> meta;

	public KlimaData() {
	}
}
