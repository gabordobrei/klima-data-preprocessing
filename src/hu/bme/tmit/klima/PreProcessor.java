package hu.bme.tmit.klima;

import hu.bme.tmit.klima.db.DatabaseConnector;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.io.Files;
import com.google.common.io.LineProcessor;

public class PreProcessor {

	public static void main(String[] args) {
		DatabaseConnector db = DatabaseConnector.get();
		File input = new File("data/Pali_adatok_ossz_kod.csv");
		long start = System.currentTimeMillis();
		List<String> lines = null;

		LineProcessor<List<String>> dataFileReader = new LineProcessor<List<String>>() {

			List<String> trimmedLines = Lists.newLinkedList();
			List<String> line;
			PreparedStatement preparedStatement;
			int lineCounter = 0;
			int min = 1, max = 1;

			public boolean processLine(String lineFromFile) {

				if (Range.closed(min, max).contains(lineCounter)) {

					line = Splitter.on(";").splitToList(
							lineFromFile.replace(";  ;", ";;"));

				}

				lineCounter++;
				return Range.atMost(max).contains(lineCounter);
			}

			public List<String> getResult() {
				return trimmedLines;
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
		System.err.println(lines.size());
		System.err.println("Az input fájl mérete: " + (double) input.length()
				/ (1024.0 * 1024.0) + "MB");

	}
}
