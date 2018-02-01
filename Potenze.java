import java.util.*;

public class Potenze {

    public static void main(String[] args){

	System.out.println("\nInserire numero da potenziare: ");

	    int x;
	double y;

	Scanner in = new Scanner(System.in);

	x = in.nextInt();

	for (int a=1;a<10;a++){

	    y = Math.pow(x,a);

	    System.out.println("\n La potenza di "+a+"' livello è uguale a "+y);
	    
	    
	    

	}
			     
			 



    }

}
