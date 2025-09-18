class Teylor {
	public double Teylor(double x, double e) {
		double sum = 0;
		double term = x;
		int n = 1;

		while (Math.abs(term) > e) {
			sum += term;
			term = term * (-1) * x * x / ((2 * n) * (2 * n + 1));
			n++;

		}

		return sum;
	}
}