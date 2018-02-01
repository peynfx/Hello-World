public class Add {

    public static void main(String[] args){

       final int x;
       final int y;
	x = Integer.valueOf(args[0]);
	y = Integer.valueOf(args[1]);
	    System.out.println("Il risultato della somma è: "+ addizione(x,y));


    }
     static  int addizione (int x, int y){


	    int z = x+y;

	    return z;
	    

	}    
}
