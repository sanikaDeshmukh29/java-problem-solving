
package otherChallenges;
import java.util.*;
public class Kata {

	public static List<Object> filterList(final List<Object> list) {
		// Return the List with the Strings filtered out
		List<Object> result = new ArrayList<>();

		for (Object o : list) {
			if (o instanceof Integer) {
				result.add((Integer) o);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Object> input = Arrays.asList(1, "a", 2, "b", 3);
		System.out.println(filterList(input));
	}
}






//In this kata you will create a function that takes a list of non-negative integers and strings and 
//returns a new list with the strings filtered out.