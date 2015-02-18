import java.io.*;
import java.util.*;



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
			
			
			
			writeToFile("juice1.out.txt", differentFruites);

				  
			
			
					
					
				
					Juicer juicer = new Juicer();
					ArrayList<Juice> juices = getSortedListByName();
					Collections.sort(juices);
					juicer.findMin(juices);
					 BufferedWriter out3 = new BufferedWriter(new FileWriter("juice3.out.txt"));
					 int t1 = juicer.getNumberOfCleanings();
					 out3.write("" + t1);
					 out3.close();
			
			
			

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
		
		public void writeToFile(String filename, Collection<? extends String> col) throws IOException
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			for(String s : col)
			{
				out.write(s + '\n');
				
			}
			
			out.close();
		}
	

}
