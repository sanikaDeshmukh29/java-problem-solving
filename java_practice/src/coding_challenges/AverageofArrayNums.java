package coding_challenges;

public class AverageofArrayNums {

	
	    public static double findAverage(int[] array) {
	      
	        if(array == null || array.length == 0){
	          return 0.0;
	        }
	      
	        int sum = 0;
	        
	        for(int num : array){
	          sum += num;
	        }
	        
	        return (double) sum / array.length;
	    }
	
	     public static void main(String[] args) {
			
	    	 int array[] = {2,3,4,5,63,33};
	    	 
	    	 double average = findAverage(array);
	    	 
	    	 System.out.println(average);
		}
}
