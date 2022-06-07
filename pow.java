package dailyCodingPractice;

public class pow {

	public static void main(String[] args) {
		System.out.println(Pow(2,10));
	}
	
	public static int Pow(int x , int y) {
		int z =1;
		for(int i=1;i<=y;i++) {
			z=z*x;
		}
		
		return z;
	}

}
