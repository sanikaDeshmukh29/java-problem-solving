package otherChallenges;

public class TwoToOne {

	public static String longest (String s1, String s2) {
        // your code
      
      String s = s1 + s2;
      return s.chars().distinct().sorted().collect(StringBuilder :: new, StringBuilder :: appendCodePoint,StringBuilder::append).toString();
      
 
	}
	
	public static void main(String[] args) {
	    String a = "xyaabbbccccdefww";
	    String b = "xxxxyyyyabklmopq";
	    System.out.println(longest(a, b)); 
	
	
}
}
