package sept2023framework.seleniumlatestversion;

import java.util.Arrays;

public class SecondlargestElementArray {
	
	public static void main(String[] args) {
		
		int nu  [] = {79,84,56,78,90};
		Arrays.sort(nu); 
		System.out.println(Arrays.toString(nu));
		System.out.println(nu.length);
		for(int y =nu.length-3;y>0;y--)
		{
			if((nu[y]!=(nu.length-1)))
			{
				System.out.println("the Third largest element is "+nu[y]);
				break;
			}
			
		}
	}

}
