package coding_challenges;

/*Make a program that filters a list of strings and returns a list with only your friends name in it.

If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...

Input = ["Ryan", "Kieran", "Jason", "Yous"]
Output = ["Ryan", "Yous"]

Input = ["Peter", "Stephen", "Joe"]
Output = []*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdentifyYourFreinds {

	public static List<String> getYourFreinds(List<String> freinds){
		
		List<String> myFreinds = new ArrayList<>();
		
		for(String name : freinds) {
			
			if(name.length() == 4) {
			myFreinds.add(name);
			}
		}
		
		
		return myFreinds;
		
	}
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("sani","Aaru","vaishu","Anamika","annanya");
		
		List<String> displayOnlyMyFreinds = getYourFreinds(names);
		
		System.out.println(displayOnlyMyFreinds);
	}
}
