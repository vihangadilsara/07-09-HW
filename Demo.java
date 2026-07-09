import java.util.*;
class Example{
	public static void main(String args[]){
		int x = 99;
		int y, z;
		if(x > 100) { // Cannot use Turnery Operator
			y = 100;
		} else {
			z = 200;
		}		
		System.out.println("x: " + x + " | y: " + y); // x:  | y: 
	}
}
