//program 5
//sort Dictionary by IDs

import java.util.Map;
import java.util.TreeMap;

public class SortKeyObject{
	public static void main(String[] args) {
		Map<Integer, String>obj= new TreeMap<>();
		obj.put(4,"abc");
		obj.put(10,"ab2");
		obj.put(5,"abc3");
		obj.put(6,"abc5");
		
		for(Map.Entry<Integer, String> entry : obj.entrySet() ) {
			
			Integer key= entry.getKey();
			String element = entry.getValue();
			System.out.println("id: " + key + "\t\tName:" + element);
		}
				
	}

}