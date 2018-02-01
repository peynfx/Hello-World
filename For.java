import java.util.*;

public class For {

    

    public static void main(String[] args) {

	int x, y;
	Scanner in = new Scanner(System.in);
	System.out.print("Insert a number: ");
	x = in.nextInt ();
	System.out.println("\n \n \n Ready? \n \n \n");

	for(y=x; y>0; y--){

	    System.out.println("_____> "+y);
	   

	}
	 if(y==0){
	    System.out.println("YEAH");
	    }

    }


}
