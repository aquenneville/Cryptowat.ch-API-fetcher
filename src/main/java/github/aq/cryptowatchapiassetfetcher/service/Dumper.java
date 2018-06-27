package github.aq.cryptowatchapiassetfetcher.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Dumper {

	public static void dumpToFile(String data, String fileName) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
	}

}
