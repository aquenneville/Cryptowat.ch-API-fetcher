package github.aq.cryptowatchapiassetfetcher.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Dumper {

	private static BufferedWriter writer;

	public static void dumpToFile(String data, String fileName) throws IOException {
		writer = new BufferedWriter(new FileWriter(fileName));
		writer.write(data);
		writer.close();
	}

	public Dumper() {

	}
}
