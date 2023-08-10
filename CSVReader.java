import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		String path = "/Users/harish/Downloads/July23travel.CSV";
		String line = "";
		
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		
		while((line = reader.readLine()) != null) {
			
			String[] values = line.split(",");
			System.out.println(values[0] + "  " + values[5]);	
			
			
		}				
	}
}

