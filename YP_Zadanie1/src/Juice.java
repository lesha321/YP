

public class Juice implements Comparable<Juice> {
	private String[] names;
	private int countNames;
	
	public Juice(String[] name) {
		names = new String[name.length];
		System.arraycopy(name, 0, names, 0, name.length);
		countNames = name.length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			sb.append(names[i]);
			sb.append(" ");
		}
		String juice = sb.toString();
		return juice;
	}
	
	public int getCountNames()
	{
		return countNames;
	}
	
	public String getElement(int j) 
	{
		if(j<0 || j >countNames)
			return "";
		return names[j];
	}
	
	
	


	public boolean isSubJuice(Juice other)
	{
		int result = this.compareTo(other);
		if(result==0) return true;
		else {
			int count = 0;
			for(int i = 0 ; i < names.length ; i ++)
			{
				for(int j=0; j<other.names.length; j++)
				{
				if((other.names[j].compareTo(names[i])==0))
					count++;
					
				}
			}
			if(count!=names.length) return false;
		return true;
		}
	}

	
	public int compareTo(Juice o) {
		
		if(names.length == o.names.length)
		{
			for(int i = 0 ; i < names.length; i ++)
				if(names[i].compareTo(o.names[i])!=0)
					return names[i].compareTo(o.names[i]);
				return 0;
		}
		else return names.length - o.names.length;
	}
	

}
