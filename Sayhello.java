import java.util.*;


public class Sayhello{

    static void sayHello(String name){
	System.out.println("Hello " + name);
    }

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
        
	    
	    if(args.length > 0){
		for(int i=0; i<args.length;i++){
	    
		    String nameArgs = args[i];
		    sayHello(nameArgs);
		    
		}
	    }
        
	      
	    else{
	      String name = sc.nextLine();
	      sayHello(name);
	      	}
	
    }

}
