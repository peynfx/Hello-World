import java.util.*;


    public class Firsts {


	public static void main(String[] args){

	    int i,y,n;
	    boolean checkS =true;
	    Scanner in = new Scanner(System.in);
	    do{
	    System.out.print("Inserisci un numero: ");

	    n = in.nextInt();

	    for(i=2;i<=n/2;i++){

		y = n%i;

		if(y==0){
		    checkS =false;
		}
		
	    }
	    if(checkS){
		System.out.println("Il numero "+n+" è Primo");
	    }
	    else{
		System.out.println("Il numero "+n+" non è Primo");
	    }
	    
	    }while(n!=0);
	   


	}
    }
