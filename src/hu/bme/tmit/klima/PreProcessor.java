package hu.bme.tmit.klima;

import hu.bme.tmit.klima.db.DatabaseConnector;
import hu.bme.tmit.klima.model.Accident;
import hu.bme.tmit.klima.model.Date;
import hu.bme.tmit.klima.model.Weather;
import hu.bme.tmit.klima.model.interfaces.Databaseable;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.io.Files;
import com.google.common.io.LineProcessor;
import com.google.gson.Gson;
import com.sun.xml.internal.bind.v2.runtime.Location;

public class PreProcessor {

	public static void main(String[] args) {
		final DatabaseConnector db = DatabaseConnector.get();
		File input = new File("data/Pali_adatok_ossz_kod.csv");
		long start = System.currentTimeMillis();
		List<String> lines = null;

		LineProcessor<List<String>> dataFileReader = new LineProcessor<List<String>>() {

			// List<String> trimmedLines = Lists.newLinkedList();
			List<String> line;
			int lineCounter = 0;
			int min = 1, max = 1;

			public boolean processLine(String lineFromFile) {

				if (Range.closed(min, max).contains(lineCounter)) {
					// if (Range.atLeast(min).contains(lineCounter)) {

					line = Splitter.on(";").splitToList(
							lineFromFile.replace(";  ;", ";;"));

					List<Databaseable> data = Lists.newLinkedList();

					Date accidentDate, weatherDate;
					Location accidentLocation, weatherLocation;
					Accident accident;
					Weather weather;
					Map<String, Object> meta = new HashMap<String, Object>();
					/**
					 * Baleseti és időjárási Dátum-ok metadatok feldolgozása
					 */
					int year = Integer.parseInt(line.get(6));
					int month = Integer.parseInt(line.get(7));
					int day = Integer.parseInt(line.get(8));
					int hour = Integer.parseInt(line.get(9));
					long id = hour + 100 * day + 10000 * month + 1000000 * year;

					meta.put("Napnév", line.get(31));
					meta.put("ANapJellegeNév", line.get(32));
					meta.put("IdőszámításTéliVagyNyári", line.get(38));

					accidentDate = new Date(id, year, month, day, hour, meta);

					data.add(accidentDate);
					/**
					 * Baleseti helyszín metadatok feldolgozása
					 */

					/**
					 * Baleset feldolgozása
					 */

					/**
					 * Időjárás feldolgozása
					 */

					/**
					 * Objektumok adatbázisba töltése
					 */
					for (Databaseable d : data) {
						try {
							System.err.println(d);
							d.insert(db.connection());
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}

				}

				lineCounter++;
				return Range.atMost(max).contains(lineCounter);
			}

			public List<String> getResult() {
				return null; // trimmedLines;
			}
		};

		try {
			lines = Files.readLines(input, Charsets.UTF_8, dataFileReader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("--------------------------");
		System.err.println("totál: " + (System.currentTimeMillis() - start)
				+ " ms...");
		try {
			System.err.println(lines.size());
		} catch (Exception e) {
		}

		System.err.println("Az input fájl mérete: " + (double) input.length()
				/ (1024.0 * 1024.0) + "MB");

	}
}
