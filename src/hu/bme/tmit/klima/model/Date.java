package hu.bme.tmit.klima.model;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.rowset.serial.SerialBlob;

import com.google.gson.Gson;

public class Date extends KlimaData {
	private final long id;
	private int year, month, day, hour;

	public Date(long id, int year, int month, int day, int hour, Map<String, Object> meta) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.meta = meta;
	}

	@Override
	public boolean insert(Connection connection) throws SQLException {

		String query = "INSERT INTO datum (id, year, month, day, hour, meta) "
				+ "VALUES (?, ?, ?, ?, ?, ?) " +
				"ON DUPLICATE KEY UPDATE meta = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setLong(1, id);
		ps.setInt(2, year);
		ps.setInt(3, month);
		ps.setInt(4, day);
		ps.setInt(5, hour);
		Blob map = new SerialBlob((new Gson()).toJson(meta).getBytes());
		ps.setBlob(6, map);
		ps.setBlob(7, map);

		ps.executeUpdate();

		return true;
	}

	@Override
	public String toString() {
		return (new Gson()).toJson(this);
	}

}
