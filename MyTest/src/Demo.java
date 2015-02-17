import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
	public static void main(String[] args) throws IOException {
		ReadWriteClass t = new ReadWriteClass();
		
		Juicer juicer = new Juicer();
		ArrayList<Juice> juices = t.getSortedListByName();
		
		Collections.sort(juices);
		
	
		
		juicer.findMin(juices);
		
		
		 BufferedWriter out3 = new BufferedWriter(new FileWriter("juice3.out.txt"));
		 int t1 = juicer.getNumberOfCleanings();
		 out3.write("" + t1);
		
		 out3.close();
	}
}
