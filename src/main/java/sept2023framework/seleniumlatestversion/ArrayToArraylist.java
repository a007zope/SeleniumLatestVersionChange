package sept2023framework.seleniumlatestversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArraylist {

	public static void main(String[] args) {

		Integer [] 	num = {12,32,34,45,56,78};
//1) using Arrays.asList method
		List<Integer> numList = new ArrayList<>(Arrays.asList(num));	
		System.out.println(numList);
		
		
//2 ) using Collections.addAll() method 
		List<Integer> numericList = new ArrayList<>();
		Collections.addAll(numericList, num);
      System.out.println(numericList);
      
      
 //3) Manually adding in to arraylist using for index loop
      
      String [] names = {"Aditya","Sanjay","namdeo","Darshana","Sanju","namrata"};
      List<String> namesList = new ArrayList<>();
      for(int i =0;i<names.length;i++)
      {  
    	  namesList.add(names[i]);
    	     
      }
    
      //System.out.println(namesList);
      
      for(String h : namesList)
      {
    	  System.out.println(h);
      }





	}

}
