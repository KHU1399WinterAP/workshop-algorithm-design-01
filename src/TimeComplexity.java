public class TimeComplexity {
	public static void main(String[] args) {
		n();
	}
	
	private static void n() {
		System.out.println("#".repeat(20) + " n " + "#".repeat(20));
		
		int n = 10;
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			System.out.println(2 * i);
			System.out.println(2 * i + 1);
			System.out.println("-".repeat(20));
		}
		
		for (int i = 1; i <= n; i++)
			System.out.println(i);
		
		for (int i = 1; i <= n; i++)
			System.out.println(2 * i);
		
		for (int i = 1; i <= n; i++)
			System.out.println(2 * i + 1);
		
		for (int i = 1; i <= n; i++)
			System.out.println("-".repeat(20));
	}
	
	private static void logN() {
		System.out.println("#".repeat(20) + " log(n) " + "#".repeat(20));
		
		int n = 1000;
		
		for (int i = 1; i <= n; i *= 10)
			System.out.println(i);
	}
	
	private static void n3() {
		System.out.println("#".repeat(20) + " n^3 " + "#".repeat(20));
		
		int n = 4;
		
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++)
				for (int k = 1; k <= n; k++)
					System.out.println(i + j + k);
	}
	
	private static void nLogN() {
		System.out.println("#".repeat(20) + " n.log(n) " + "#".repeat(20));
		
		int n = 100;
		
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j *= 10)
				System.out.println(i + j);
	}
}
