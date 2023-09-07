package sept2023framework.seleniumlatestversion;

public class FindDuplicateString {


	public static void main(String[] args) {


		String s = "Big black bug bit a big Black dog right On his big black NOse";
		
		//String s ="Aditya in black ADITYA in BLACK";

		int count ;

		s = s.toLowerCase();
		String [] str = s.split(" ");
		
		//System.out.println(s);
		
		System.out.println("Duplicate String is ");
		
		

		for(int i =0;i<str.length;i++)
		{
			count =1;
			for(int j =i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="0";
				}
				}
				if(count>1 && str[i]!="0")
				{
					System.out.println(str[i]);
					
				}
			
		}

	}

}
