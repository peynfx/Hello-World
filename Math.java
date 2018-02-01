import java.util.*;

public class Math {

    public static void main(String[] args){
	int inOp;
	Scanner in = new Scanner(System.in);
    do{
        
	System.out.println("\n1)Addizioni");
	System.out.println("\n2)Sottrazioni");
	System.out.println("\n3)Moltiplicazioni");
	System.out.println("\n4)Divisioni");
	System.out.println("\n5)Esci");
	System.out.println("\nQuale operazione vuoi svolgere(1-4)?: ");

	try{
	inOp = in.nextInt();
	}catch(InputMismatchException e){
	    inOp = 5;
	}

	int x, y, z;
	
	switch(inOp){
	case 1:
	    System.out.println("Inserisci il primo numero\n");
	    x = in.nextInt();
	    System.out.println("Inserisci il secondo numero\n");
	    y = in.nextInt();

	    z = x+y;
	    System.out.println("La somma dei due numeri è: "+z);

	    break;

	    case 2:
	    System.out.println("Inserisci il primo numero\n");
	    x = in.nextInt();
	    System.out.println("Inserisci il secondo numero\n");
	    y = in.nextInt();

	    z = x-y;
	    System.out.println("Il risultato dei due numeri è: "+z);

	    break;

	    case 3:
	    System.out.println("Inserisci il primo numero\n");
	    x = in.nextInt();
	    System.out.println("Inserisci il secondo numero\n");
	    y = in.nextInt();

	    z = x*y;
	    System.out.println("Il risultato è: "+z);

	    break;

	    case 4:
	    System.out.println("Inserisci il primo numero\n");
	    final double a = in.nextInt();
	    System.out.println("Inserisci il secondo numero\n");
	    final double b = in.nextInt();
	    
	    if (b!=0){
	    final double z2 = a/b;
	    System.out.println("Il risultato è: "+z2);

	    break;
	    }
	    else{
		System.out.println("\nNon se pol");
		break;

	    
	    }
	    case 5:
		System.out.println("\nciao!");
		System.exit(0);
	    
	}
   }while(inOp != 5);
	




    }






}
