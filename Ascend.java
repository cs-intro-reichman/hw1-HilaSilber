// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int min, max, mid;
		int lim = Integer.parseInt(args[0]);
		int n1 = (int) (Math.random()*lim);
		int n2 = (int) (Math.random()*lim);
		int n3 = (int) (Math.random()*lim);

		min = Math.min(n1, n2);
		min = Math.min(min, n3);
		max = Math.max(n1, Math.max(n2, n3));
		mid = n1 + n2 + n3 - min - max;

		System.out.printf("%d %d %d\n%d %d %d",n1, n2,n3, min, mid,  max);
		}
}
