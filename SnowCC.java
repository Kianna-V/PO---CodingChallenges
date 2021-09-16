import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Imagine you are responsible for a portfolio of profitable stocks represented in an array. 
 * Each item in the array represents the yearly profit of a corresponding stock. 
 * The analyst gathers all distinct pairs of stocks that reached the target profit. 
 * Distinct pairs are pairs that differ in at least one element. Given the array of profits, 
 * find the number of distinct pairs of stocks where the sum of each pair’s profits is exactly equal to the target sum.
Example:
stocksProfit = [5, 7, 9, 13, 11, 6, 6, 3, 3]
target = 12 profit's target
*/


public class SnowCC {

	public static void main(String[] args) {
		/*
		int arr[] = {1, 1, 3, 4, 4, 5, 5, 6, 6, 7, 9}; 
	    //Arrays.sort(arr); 
	    SnowCC sc = new SnowCC();
	    sc.pairedElements(arr, 12);
		 */
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input the number of stocks: ");
		int yearlyProfits = in.nextInt();
		
		System.out.println("What is your Profit Target? ");
		int target = in.nextInt();
		
		int[] stocksProfit = new int[yearlyProfits];
		System.out.println("Input the profit stocks (add spaces)");
		
		for (int i = 0; i < yearlyProfits; i++) {
			stocksProfit[i] = in.nextInt();
		}
		pairedElements(yearlyProfits, stocksProfit, target);
		}
		
	
	
	public static void pairedElements(int yearlyProfits, int[] arr, int sum  ) {
		
		int counter = 0;
		int arrLength = arr.length - 1;
		
		while(counter < arrLength) {
			if(arr[counter] + arr[arrLength] == sum) {
				System.out.println("(" + arr[counter] + ", " + arr[arrLength] + ")");
			}
			if(arr[counter] + arr[arrLength] > sum) {
				arrLength --;
			}
			else counter ++;
		}
		
		List<String> pairs = new ArrayList<>();
		for( int x : arr) {
			for (int y : arr) {
				if (x + y == sum)
					pairs.add("(" + x + "," + y + ")");
			}
		}
		pairs.forEach(x -> System.out.println(x));
		
		
		
		
		
		
		
	}

}
