import java.util.*;

public class ArraySum{

    public static void main(String[] args){

	int[] array = new int[10];
	int x=0;
	Scanner in = new  Scanner(System.in);

	String[] nChar = new String[10]; 
        
	    nChar[0] = "First";
        
	    nChar[1] = "Second";
        
	    nChar[2] = "Third";
        
	    nChar[3] = "Fourth";
  2      
	    nChar[4] = "Fifth";
        
	    nChar[5] = "Sixth";
        
	    nChar[6] = "Seventh";
        
	    nChar[7] = "Eighth";
        
	    nChar[8] = "Ninth";
        
	    nChar[9] = "Tenth";
	    
	for(int i=0;i<10;i++){
	    
	    
		String nc = nChar[i];
	    System.out.print("Enter the " +nc+" number: ");
	    
		    
        array[i] = in.nextInt();

	    
	    
	}
	for (int num : array) {
	    x = x + num;
	}
	
	System.out.println("Welldone, the result is:"+x);
	 
    }



 


}
