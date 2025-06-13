package br.com.eaugusto.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 12, 2025
 */
public class LambdaTests {

	public static void main(String[] args) {

		printToConsole("Using Lambda IntBinaryOperator - Sum Of (1 + 1)");
		IntBinaryOperator intBinaryOperator = (int a, int b) -> {
			return a + b;
		};
		printToConsole(intBinaryOperator.applyAsInt(1, 1));

		// The above can be used to replace this, making it unnecessary to create and
		// instantiate a custom Class.
		printToConsole("Using Manually Created Class IntBinaryOperatorClass - Sum Of (2 + 2)");
		IntBinaryOperator operator = new IntBinaryOperatorClass();
		printToConsole(operator.applyAsInt(2, 2));

		printToConsole("Using Lambda BiFunction To Print The Sum Of 4 + 4");
		BiFunction<Integer, Integer, Integer> biFunctionsIntegers = (Integer a, Integer b) -> {
			return a + b;
		};
		printToConsole(biFunctionsIntegers.apply(4, 4));

		printToConsole("Using Lambda BiFunction To Print The Sum Of The Doubles (4,5 + 4,5) Converted To String");
		BiFunction<Double, Double, String> biFunctionsDoubleToString = (Double a, Double b) -> {
			Double result = a + b;
			return String.valueOf(result);
		};
		printToConsole(biFunctionsDoubleToString.apply(4.5, 4.5));

		printToConsole("Calculating The Sum Of Two Long Values (15L + 15L) Through "
				+ "A Function That Receives\nTwo Long Values And A BiFunction As Parameters");
		// You have to be careful when working with Lambdas though, as they can easily
		// get hard to read and understand.
		// Here, let's calculate the sum of (15 + 15) using a function that receives two
		// values of type Long and a BiFunction Lambda as parameters.
		Long result = calculate(15L, 15L, (Long value1, Long value2) -> value1 + value2);
		printToConsole(result);

		printToConsole("Using Runnable To Print 'Hello World'");
		Runnable helloWorld = () -> System.out.println("Hello World");
		helloWorld.run();

		printToConsole("Using A Consumer Of Type String To Print 'Hello World - Consumer'");
		Consumer<String> stringConsumer = (String string) -> {
			System.out.println(string);
		};
		stringConsumer.accept("Hello World - Consumer");

		printToConsole("Using A Supplier Of Type Integer To Supply The Number 100");
		Supplier<Integer> callableInteger = () -> 100;
		printToConsole(callableInteger.get());
	}

	public static <T> void printToConsole(T value) {
		System.out.println(value);
	}

	private static Long calculate(Long value1, Long value2, BiFunction<Long, Long, Long> lambdaFunction) {
		return lambdaFunction.apply(value1, value2);
	}
}
