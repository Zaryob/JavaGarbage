import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
	public static void main(String[] args) throws IOException { 
		count_letters("task1_1.txt", "out1_1.txt");
	}
	public static void count_letters(String in_file, String out_file) throws IOException {
		ArrayList<String> lines = new ArrayList<String>();

		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(in_file));
 
			String line;
			while ((line = inputStream.readLine()) != null) {
				if(!line.equals("")) {
					lines.add(line.toLowerCase().replaceAll("\\s+", ""));
				}
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
		
		Map<Character, Integer> letters = new HashMap<Character, Integer >();
		for(String i: lines) {

			for (int j=0;j<i.length();j++) {
				char C=i.charAt(j);
				if(letters.containsKey(C)) {
					int val=letters.get(C);
					letters.replace(C,++val);
				}else {
					letters.put(C, 1);
				}
					
			}
		}
        char karakter;
        
        File file= new File(out_file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
         
        PrintWriter outputStream = new PrintWriter(fileOutputStream);
        for(karakter= 'a'; karakter <= 'z'; ++karakter) {
			if(letters.containsKey(karakter)) {
				outputStream.printf("%c %d\n", karakter, letters.get(karakter));
			}else {
				outputStream.printf("%c %d\n", karakter, 0);
			}
        }
        outputStream.close();
        
	} 
}
