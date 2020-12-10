import java.io.FileReader;		
import java.io.BufferedReader;
import java.util.Map;			
import java.util.HashMap;		
import java.util.ArrayList;		
import java.io.IOException;		

public class Task2 {
	public static void main(String[] args) throws IOException {
		read_albums("albums.txt");
	}
	
	public static void read_albums(String filename) throws IOException {
		String[] lines = new String[100];
		int ln=0;
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(filename));
 
			String line;
			while ((line = inputStream.readLine()) != null) {
				lines[ln]=line;
				ln++;
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
		
		Map<String, ArrayList<String>> albums = new HashMap<String, ArrayList<String>>();
		
		for (String i:lines) {
			try {
				String owner = i.split("-", 2)[0].trim(); 
				ArrayList<String> album_name= new ArrayList<String>() {{
				    add(i.split("-", 2)[1].split("[()]+")[0].trim());
				}};
				if(albums.containsKey(owner)) {
					albums.get(owner).addAll(album_name);
				}else {
					
					albums.put(owner, album_name );
				}
			}catch(java.lang.NullPointerException e) {
				//Pass
			}
		}
		for(int j=6;j>0;j--) {
			for(String i :albums.keySet()) {
				if(albums.get(i).size()==j) {
					System.out.printf("%s : %d\n", i, albums.get(i).size());
				}
			}
			
		}
		
	}
}