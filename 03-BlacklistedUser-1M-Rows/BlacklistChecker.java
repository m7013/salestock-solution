import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlacklistChecker{
	
	public HashMap table ;

	public static void main(String []args){
		BlacklistChecker checker = new BlacklistChecker();
		checker.initialize("blacklist.txt");
		boolean result = checker.check_blacklist("QBPT2U", "1999976");
		System.out.println(result);
	}

	public BlacklistChecker(){
		this.table = new HashMap<String,String>(); 
	}

	private void initialize (String filename){
		//TODO: load file and put all data to table (hashmap)
		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				String[] a = sCurrentLine.split(" ", 2);
				//System.out.println(a[1]+" - " + a[0]);
				this.table.put(a[1], a[0]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public boolean check_blacklist(String name, String phone_number) {
		return ((String)this.table.get(phone_number)).equals(name);
	}
}

