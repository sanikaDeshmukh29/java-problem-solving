package coding_challenges;

/*Grade book
Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	'F'*/

public class GradeCalculator {
	
	public static char getGrade(int s1, int s2, int s3) {
	      
	      int sum = s1 + s2 + s3;
	      int average = sum / 3;
	     
	      
	      if(average >= 90 && average <= 100){
	        return 'A';
	      }else if(average >= 80 && average <= 90){
	        return 'B';
	      }
	      else if(average >= 70 && average <= 80){
	        return 'C';
	      }
	      else if(average >= 60 && average <= 70){
	        return 'D';
	      }else {
	        return 'F';
	      }
	      
	    }
	
	public static void main(String[] args) {
		
		int s1 = 60;
		int s2 = 80;
		int s3 = 40;
		
		char grade = getGrade( s1,  s2, s3) ;
		System.out.println(grade);
	}

}
