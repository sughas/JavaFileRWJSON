package jsonfilere;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsontesting {

	public static void main(String[] args) {
		//input file
		String inputpath = "/home/gamer/eclipse-workspace/jsonfilere/File/colour.json";
		//output file
		String outputpath = "/home/gamer/eclipse-workspace/jsonfilere/File/op.json";

		JSONArray ja = new JSONArray();

		try {
			FileReader fr = new FileReader(inputpath);
			FileWriter myW = new FileWriter(outputpath);
			JSONParser jp = new JSONParser();

			ja = (JSONArray) jp.parse(fr);

			for (int i = 0; i < ja.size(); i++) {
				//adding new line to file 
				myW.append(ja.get(i).toString());
				myW.append("\n");
			}
			myW.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println();
		} catch (IOException e) {
			System.out.println();
		} catch (ParseException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(ja.size());
	}
}
