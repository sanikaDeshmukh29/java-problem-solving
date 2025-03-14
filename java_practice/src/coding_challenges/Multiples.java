package coding_challenges;

/*Create a function with two arguments that will return an array of the first n multiples of x.

Assume both the given number and the number of times to count will be positive numbers greater than 0.

Return the results as an array or list ( depending on language ).*/

public class Multiples {

	public static int[] getMultiples(int x, int n) {
        int[] multiples = new int[n];
        for (int i = 0; i < n; i++) {
            multiples[i] = x * (i + 1);
        }
        return multiples;
    }
	
	public static void main(String[] args) {
        int x = 3; 
        int n = 5; 
        int[] result = getMultiples(x, n);

        
        for (int value : result) {
            System.out.print(value + " ");
        }
}
}