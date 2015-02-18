import java.util.*;
import java.io.*;

public class Demo {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ReadWriteClass readwrite = new ReadWriteClass();
		ArrayList<String> SortedListOfFruitsByName = new ArrayList<String>();
        
    
		 Thread myThready = new Thread(new Runnable()
	        {
			 
	            public void run() 
	            {
	            	
					for(int i=0; i<Juicer.getSizeOfList(); i++)
						for(int j=0; j<Juicer.getListPosition(i).getCountNames(); j++)
							SortedListOfFruitsByName.add(Juicer.getListPosition(i).getElement(j));
	            	
	            	Comparator<String> comp = new Comparator<String>() {
						
						@Override
						public int compare(String o1, String o2) {
							// TODO Auto-generated method stub
							return o1.compareTo(o2);
						}
					};
	               Collections.sort(SortedListOfFruitsByName, comp);
	           
	            }
	        });
	                	
	                
	                
	        
	       myThready.start();
	       myThready.join();
	       
	        
	        
	        
	      
	        
	        readwrite.writeToFile("juice2.out.txt", SortedListOfFruitsByName);
	        
	        
	}
}
