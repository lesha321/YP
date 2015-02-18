import java.util.ArrayList;

public class Juicer {
	private static ArrayList<Juice> listOfJuices = new ArrayList<Juice>();
	private  int numberOfCleanings = 0 ;
	
	
	public static void putFruitesInList(Juice var) 
	{
		listOfJuices.add(var);
	}
	
	public static void ShowList()
	{
		for (Juice s : listOfJuices) {
			System.out.println(s.toString());
		}
	}
	
	public static Juice getListPosition(int ListPosition)
	{
		return listOfJuices.get(ListPosition);
	}
	
	public static int getSizeOfList()
	{
		return listOfJuices.size();
	}
	
	public static ArrayList<Juice> getListOfJuices() {
		return (ArrayList<Juice>)listOfJuices.clone();

	}
	
	
	
	
	public  void findMin(ArrayList<Juice> juiceList){
		while(!juiceList.isEmpty()){
			Juice currJuice = juiceList.get(0);
			for( int j = 1 ; j < juiceList.size() ; ){
				Juice tmp = juiceList.get(j);
				if(currJuice.isSubJuice(tmp)){
					juiceList.remove(currJuice);
					currJuice = tmp;
				}
				else
					j++;
			}
			juiceList.remove(currJuice);
			numberOfCleanings++;
		}
	}
	
	public int getNumberOfCleanings() {
		return numberOfCleanings;
	}
	

	
}
