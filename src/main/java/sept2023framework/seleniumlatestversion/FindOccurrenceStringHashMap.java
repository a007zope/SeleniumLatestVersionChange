package sept2023framework.seleniumlatestversion;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceStringHashMap {
	
	public static void main(String[] args) {
		
		String name = "Alice is wondeful and Aditya is handsome but Aditya rocks and Alice flops Also Aditya is Aditya Zope Aditya Alice Aditya Aditya Aditya ";
		
		Map<String, Integer> nameMap = new HashMap<>();
		
		        String [] nameArray = name.split(" ");      
		        
		        for(String nameList : nameArray)
		        {
		        	  System.out.println(nameMap.get(nameList));
		        	if(nameMap.containsKey(nameList))
		        	{
		        		nameMap.put(nameList,nameMap.get(nameList)+1);
		        	}
		        	else
		        	{
		        		nameMap.put(nameList,1);
		        }
		        }
		        System.out.println(nameMap);
		
	}

}
