package sept2023framework.seleniumlatestversion;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {


		//1) Conversion from ArrayList to Array
		List<String> techSkillSets = new ArrayList<>();

		techSkillSets.add("Selenium");
		techSkillSets.add("Java");
		techSkillSets.add("Javascript");
		techSkillSets.add("UFT");
		techSkillSets.add("Test-NG");

		String techSkillList[] = new String[techSkillSets.size()];

		for(int i =0;i<techSkillSets.size();i++)
		{
			techSkillList[i] =   techSkillSets.get(i);
		}

		for(String g:techSkillList)
		{

			// System.out.println(g);
		}


		//2) Method 2 for conversion from Arraylist to Array

		String [] p = new String [techSkillSets.size()];      
		String [] ar =  techSkillSets.toArray(p);

		for(String i:ar)
		{
			System.out.println(i);
		}

	}

}
