import java.util.Scanner;

public class BabMeth {
	
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a positive integer and I'll give you its root.");
        int num = input.nextInt();
        
        double guess = num/2;
        double r = 0.00;
        double ans = 0;
        
        //This if statement is just to avoid calculating the root of 1 as "infinity".
        if(num>1){
        	for(int count = 0; count < 10; count++){
        		r = num / guess;
        		ans = (guess + r) / 2;
        	}
        System.out.println("The root of the reuqested number is " + ans);
        }else{
        	System.out.println("The root of the reuqested number is 1");
        }
	}
}