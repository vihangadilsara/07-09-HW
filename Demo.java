import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a: ");
		int a = input.nextInt();
		System.out.print("Input b: ");
		int b = input.nextInt();
		System.out.print("Input c: ");
		int c = input.nextInt();
		System.out.print("Input d: ");
		int d = input.nextInt();
		System.out.print("Input e: ");
		int e = input.nextInt();
		
		int max = a;
		
		if(max < b) {
			max = b;
		}
		// checked a, b 
		
		if(max < c) {
			max = c;
		}
		
		if(max < d) {
			max = d;
		}
		
		if(max < e) {
			max = e;
		}
		
		System.out.println("Maximum Value: " + max);
	}
}
