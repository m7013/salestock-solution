import java.util.*;

public class AgeSorter{
	
	public static void main(String []args){
		int numOfLine = 10000000;
		int maxAge = 1;	
		//int total = 0;
		Scanner reader = new Scanner(System.in);

		HashMap<Integer,Integer> table=new HashMap<Integer,Integer>(); 
		for (int input = 1; input <= numOfLine; input++) {
			int age = reader.nextInt();
			Integer currentVal = table.get(age);
			if (currentVal == null) 
				table.put(age, 1);
			else table.put(age, currentVal+1 );

			maxAge = ((maxAge < age) ? age : maxAge);	
		}
		//System.out.println("max age: " + maxAge);
		for (int age = 1; age <= maxAge; age++) {
			Integer currentVal = table.get(age);
			if (currentVal != null){
				for (int j = 0; j < currentVal; j++)
					System.out.println(age);
			}
		}
	}
}

