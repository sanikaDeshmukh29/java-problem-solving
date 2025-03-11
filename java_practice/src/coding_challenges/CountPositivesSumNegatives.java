package coding_challenges;

/*Given an array of integers.

	Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

	If the input is an empty array or is null, return an empty array.*/

public class CountPositivesSumNegatives {

	public static int[] countPositivesSumNegatives(int[] input)
    {
       if (input == null || input.length == 0) return new int[] {};
       int count = 0,sum = 0;
       for (int i : input) {
         if (i > 0) count ++;
         if (i < 0) sum += i;
       }
       return new int[] {count,sum};
    }
	
}
