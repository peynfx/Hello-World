import java.util.*;

public class Calc{

    public static void main(String[] args){

    String[] menu = {"Plus","Minus","Molt","Div"};
    
    Scanner in = new Scanner(System.in);
    
     for(int i=0;i < menu.length;i++){

	String sM = menu[i];
	
     System.out.println("Choose your option: "+sM+":");

     }
    System.out.print(">");

    try{
    String oP = in.nextLine();

   



    
    switch(oP){
	
    case "Plus":
	System.out.print(">");
	int x = in.nextInt();
	System.out.print(">");
	int y = in.nextInt();

	int z =	plus(x,y);
	System.out.println("Il risultato è "+z);
    
    case "Minus":
	System.out.print(">");
	x = in.nextInt();
	System.out.print(">");
	y = in.nextInt();

	z = minus(x,y);
	System.out.println("Il risultato è "+z);
    	
    }

     }
    catch(java.util.InputMismatchException err){
        
    }
    }


    

    public static int plus(int x,int y){
	
	int z =x+y;
	return z;
    }
    public static int minus(int x,int y){
	int z = x-y;
	return z;
      
    }
}
