package coding_challenges;

public class BetterThanAverage {
	
	
		  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		    
		    int sum = 0;
		    
		    for(int ele : classPoints){
		        sum += ele; 
		    }
		    
		    // Corrected average calculation
		    double average = (sum + yourPoints) / (double) (classPoints.length + 1);
		    
		    return yourPoints > average;
		  }

		  public static void main(String[] args) {
		    int[] classPoints = {60, 70, 80, 90}; 
		    int yourPoints = 85; 
		    
		    System.out.println(betterThanAverage(classPoints, yourPoints)); // Expected: true
		  }
		

}
