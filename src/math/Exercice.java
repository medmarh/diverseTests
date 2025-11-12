package math;

public class Exercice {

	private int[] prices;

	private static int getProfit(int[] prices) {
		int smaller = 0;
		int bigger = 0;
		 int day = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] < prices[j]) {

					if(smaller == 0) {
					smaller = prices[i];
					 day = i;
					}
					// bigger = prices[i+1];
					if(prices[i]<smaller) {
						smaller = prices[i];
						day = i;
					}
				}

			}
		}
		System.out.println(smaller);
		for (int i = day+1; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] < prices[j]) {

					if(bigger == 0) {
						bigger = prices[j];
					}
					// bigger = prices[i+1];
					if(prices[j]>bigger) {
						bigger = prices[j];
					}
					
					//System.out.println(i);
				}

			}
		}
		System.out.println(bigger);
		return bigger - smaller;
	}

	public static void main(String[] args) {
		int[] prices = {12,3,34,5,67};

		System.out.println(getProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main1(String[] args) {
       // BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        int[] prices = {12,3,34,5,67};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}
