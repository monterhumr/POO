import javax.swing.*;

public class YoSoy196 {
	
	int lower, upper, pal=0, nonLych=0, lychrel=0;
		
	public YoSoy196(int a, int z){
		this.lower=a;
		this.upper=z;
	}

	void operations(){
		String palin="";
		String palinInverse="";
		long p1, p2, sum, j;
		
		System.out.println("SEARCH RESULTS:");
		System.out.println();
		System.out.println("Range of Search: "+ lower + " to " + upper);
		
		for(int i=lower; i<=upper; i++){
			palin= ""+i;
			palinInverse= new StringBuilder(palin).reverse().toString();
		
			if(palin.equals(palinInverse)){
			pal++;
			continue;
			}
		
			for(j=0; j<30; j++){
				p1=Long.parseLong(palin);
				p2=Long.parseLong(palinInverse);
				sum=p1+p2;
				palin="" +sum;
				palinInverse= new StringBuilder(palin).reverse().toString();
			
				if(palin.equals(palinInverse)){
				nonLych++;
				break;
				}
			}
		
			if(j==30){
				System.out.println("Lychrel number: "+i);
				lychrel++;
			}
		}
		
		System.out.println();
		System.out.println("Lycherel numbers found: "+ lychrel);
		System.out.println("Non-Lycherels found: " + nonLych);
		System.out.println("Natural Palindromes found: " + pal);
		
	}
	
	public static void main(String[] args){
		int lower= Integer.parseInt(JOptionPane.showInputDialog("Give me the lower bound")),
			upper= Integer.parseInt(JOptionPane.showInputDialog("Give me the upper bound"));
			YoSoy196 range= new YoSoy196(lower,upper);
			range.operations();
				
	}
}