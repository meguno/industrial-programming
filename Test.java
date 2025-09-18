import java.util.Scanner;
import java.util.Formatter;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Formatter fmtX = new Formatter();
		Formatter fmtK = new Formatter();
		System.out.print("Enter x (degrees): ");
		int xDegrees = scanner.nextInt();
		System.out.print("Enter k: ");
		int k = scanner.nextInt();
		double e = Math.pow(10, -k);

		while (Math.abs(xDegrees) > 360) {
			if (xDegrees < 0) {
				xDegrees = -(Math.abs(xDegrees) - 360);
			} else {
				xDegrees -= 360;
			}

		}

		double xRadians = Math.toRadians(xDegrees);

		Teylor row = new Teylor();
		double sum = row.Teylor(xRadians, e);

		System.out.println("Taylor result: " + sum);
		System.out.println("Math result: " + Math.sin(xRadians));

		fmtX.format("Formatting x in octal (8) form: %o | in hexadecimal form: %x", xDegrees, xDegrees);
		System.out.println(fmtX);
		fmtK.format("Formatting k in octal (8) form: %o | in hexadecimal form: %x", k, k);
		System.out.println(fmtK);

		scanner.close();
		fmtX.close();
		fmtK.close();
	}
}
