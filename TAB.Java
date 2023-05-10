package misc;

import java.util.ArrayList;
import java.util.Random;

public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
		
		
	 System.out.println(grid_traveler_tab(18,18));
	
	
	
	}
	
	private static long grid_traveler_tab(int m,int n){
		
		long[][] tab = new long[m+1][n+1];
		tab[1][1] = 1;//base case
		
		for(int i = 0;i < tab.length;i++){
			for(int j = 0;j < tab[i].length;j++){
				if(i != tab.length - 1){
					tab[i+1][j] += tab[i][j];
				}
				if(j != tab[i].length-1) {
					tab[i][j+1] += tab[i][j];
				}
			}
		}
		
		return tab[m][n];
	}	
	
}
