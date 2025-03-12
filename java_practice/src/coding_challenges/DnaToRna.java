package coding_challenges;

/*Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').

Create a function which translates a given DNA string into RNA.

For example:

"GCAT"  =>  "GCAU"*/

public class DnaToRna {

	public static String dnaToRna(String dna) {
	      
	      StringBuilder rna = new StringBuilder();
	      
	      for(int i = 0; i < dna.length(); i++){
	        
	         char charInDna = dna.charAt(i);
	        
	         if(charInDna == 'T'){
	         rna.append('U');
	         }
	         else{
	           rna.append(charInDna);
	         }
	      }
	      return rna.toString();
	    } 
	
	public static void main(String[] args) {
		
		String dna = "GCAT";
		
		String rna = dnaToRna(dna);
		System.out.println(rna);
	}
}
