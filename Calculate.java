import java.lang.Math;
public class Calculate {
	
	public static void main (String[] arg) {
			System.out.println("Calculate...");
			int first = Integer.valueOf(arg[0]);
			int second = Integer.valueOf(arg[1]);
			int summ = first + second;
			System.out.println("Summa: " + summ);
			int razn = first - second;
			System.out.println("Raznost: " + razn);
			int umnog = first * second;
			System.out.println("Umnogenie: " + umnog);
			float del = first / second;
			System.out.println("Delenie: " + del);
			double stepen = Math.pow(first, second);
			System.out.println("Chislo " + first + " v stepeni " + second + " ravno:" + stepen);
			}
}