package examp;

public class asalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =4;
		boolean isPrime=true;
		if(number<2) {System.out.println("sayı asla değildir"); return;}
		for(int i=2;i<number;i++ ) {
				if ( number % i==0  ) {
					isPrime=false;
				}
			}
		 if(isPrime) {
			System.out.println("asalsayı");
		}else {System.out.println("asalsayı değil");}
	}

}
