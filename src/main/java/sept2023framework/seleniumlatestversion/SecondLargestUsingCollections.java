package sept2023framework.seleniumlatestversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestUsingCollections {

	public static void main(String[] args) {

		Integer num[] = {12,23,75,56,78};

		List<Integer> numList = new ArrayList<>(Arrays.asList(num));

		Set<Integer> setNum = new TreeSet<>(numList);

		numList.clear();

		for(int value :setNum)
		{
			numList.add(value);
		}

		int n =numList.size();

		System.out.println("the second largest element is"+numList.get(n-2));


	}

}
