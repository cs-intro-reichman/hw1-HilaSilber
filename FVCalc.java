// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double pRate = rate / 100;

		//System.out.println(rate);
		//System.out.println(pRate);

		double futureValue = currentValue * Math.pow((1 + pRate), n);
		//System.out.println((int) futureValue);

		System.out.printf("After %d years, $%d saved at %.1f%% will yield $%d",
		n,currentValue,rate,(int) futureValue);










	}
}