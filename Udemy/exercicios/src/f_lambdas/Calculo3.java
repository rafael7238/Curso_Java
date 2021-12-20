package f_lambdas;

import java.util.function.BinaryOperator;

public class Calculo3 {

	public static void main(String[] args) {

		BinaryOperator<Double> calc = (x, y) -> { // BinaryOperator é como se fosse uma interface
			return x + y;
		};

		System.out.println(calc.apply(2.0, 4.0));

		calc = (x, y) -> x * y;

		System.out.println(calc.apply(2.0, 4.0));

	}
}
