public class Primes{
	
	public static void main(String[] args) {
		
		int nValues = 50;
		
		outerLoop:
		for (int i = 2; i <= nValues; i++) {
			int sqrt = (int) Math.sqrt(i);
			
			for (int j = 2; j <= sqrt; j++) {
				if (i % j == 0) {
					continue outerLoop;
				}
			}
			System.out.println(i);
		}
	}
}