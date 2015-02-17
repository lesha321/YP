import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



public class ReadWriteClass {
		
	private ArrayList<Juice> sortFruites = new ArrayList<Juice>(); 
	private Set<String> differentFruites = new LinkedHashSet<String>();
		{
		try {
			String filename = "juice.in.txt";
			
			
			FileInputStream fin = new FileInputStream(filename);
			InputStreamReader in = new InputStreamReader(fin);
			BufferedReader r = new BufferedReader(in);
			
			
			String buffer1;
			
		
			
			while ((buffer1 = r.readLine()) != null) {
				if(buffer1.isEmpty()) continue;
				String[] buffer = buffer1.split(" ");
				
				for(int i=0; i<buffer.length; i++)
				{
					differentFruites.add(buffer[i]);
				}
				
				Juicer.putFruitesInList(new Juice(buffer));
				Arrays.sort(buffer);
				sortFruites.add(new Juice(buffer));
				
			}
			r.close();
			
			
			
			 BufferedWriter out1 = new BufferedWriter(new FileWriter("juice1.out.txt"));
				for(String s : differentFruites)
				{
					out1.write(s + '\n');
					
				}
				
				out1.close();

				  out1 = new BufferedWriter(new FileWriter("juice2.out.txt"));
				  for(Juice s : sortFruites)
				  {
					  out1.write(s.toString() + '\n');
				  }
					out1.close();
			
			
				
			
			
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public ArrayList<Juice> getSortedListByName() {
			return (ArrayList<Juice>)sortFruites.clone();
	
		}
	

}
