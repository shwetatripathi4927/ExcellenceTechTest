import java.util.*;
class sortmaoKey {
	static Map<Integer, String> obj= new HashMap<>();
	public static void sortbykey()
	{
		TreeMap<Integer, String> sortObj= new TreeMap<>();
		sortObj.putAll(obj);
		System.out.print("sorted = ");	
		for (Map.Entry<Integer, String> entry : sortObj.entrySet())
			System.out.println(entry.getKey());	
	}
	public static void main(String args[])
	{
		obj.put(4, "abc");
		obj.put(10, "ab2");
		obj.put(5, "abc3");
		obj.put(6, "abc5");
		sortbykey();
	}
}