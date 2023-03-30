package misc;


public class main_misc {
	private static long[][] cache = new long[999][999];//

	public static void main(String[] args) {
		//
     //System.out.println(factorial(4));
		System.out.println(grid_traveler(18,18));
		
	
		
	}	
	/*
	 * 
	 * 
	 */
	private static long grid_traveler(int m,int n) {
		//assuming that m,n >= 1
		if(m == 1 || n == 1) {
			return 1;
		}
		if(cache[m][n] != 0) {
			return cache[m][n];
		}
        long k = grid_traveler(m,n-1) + grid_traveler(m-1,n);	
        cache[m][n] = k;
		return k;
	}

	}
	

	
	

