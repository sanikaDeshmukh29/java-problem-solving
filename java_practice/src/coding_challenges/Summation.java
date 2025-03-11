package coding_challenges;

/*
 * Write a program that finds the summation of every number from 1 to num. 
 * The number will always be a positive integer greater than 0. 
 * Your function only needs to return the result*/
public class Summation {
	
	public class GrassHopper {
	    public static int summation(int n) {
	        int i = 1;  
	        int sum = 0;
	        while (i <= n) {  
	            sum += i;
	            i++;  
	        }
	        return sum; 
	    }

	    public static void main(String[] args) {
	        System.out.println(summation(5));  
	        System.out.println(summation(10)); 
	    }
	}

	
}
