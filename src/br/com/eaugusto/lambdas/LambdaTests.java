package br.com.eaugusto.lambdas;

import java.util.function.IntBinaryOperator;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 12, 2025
 */
public class LambdaTests {

	public static void main(String[] args) {

		printToConsole("Using Lambda");
		IntBinaryOperator intBinaryOperator = (int a, int b) -> {
			return a + b;
		};
		printToConsole(intBinaryOperator.applyAsInt(1, 1));

//		The above can be used to replace this, making it unnecessary to instantiate and create custom Classes.
		printToConsole("Using Manually Created Class");
		IntBinaryOperator operator = new IntBinaryOperatorClass();
		printToConsole(operator.applyAsInt(2, 2));
	}

	public static <T> void printToConsole(T value) {
		System.out.println(value);
	}
}
