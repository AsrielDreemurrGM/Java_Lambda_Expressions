package br.com.eaugusto.lambdas.anonymousclass;

/**
 * This class demonstrates the use of anonymous classes and lambda expressions
 * with a functional interface in Java.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 13, 2025
 */
public class AnonymousTests {

	public static void main(String[] args) {

		// Creating an anonymous class that implements MyEventConsumer.
		// The 'consumer' method is overridden to simply print the received value.
		MyEventConsumer anonymous = new MyEventConsumer() {
			@Override
			public void consumer(Object value) {
				System.out.println(value);
			}
		};

		// Calling the consumer method with a String
		anonymous.consumer("Test");

		// Creating a lambda expression that implements MyEventConsumer.
		// Lambda syntax is a more concise way to provide an implementation.
		MyEventConsumer anonymousLambda = (Object value) -> System.out.println(value);

		// Calling the lambda with an Integer
		anonymousLambda.consumer(10);

		// Passing a lambda expression directly as an argument to a method.
		// The lambda will be used to consume and print the given parameter.
		receiveInterfaceWithParameter("Hello World", value -> System.out.println(value));
	}

	/**
	 * This method receives an object and a functional interface implementation,
	 * then uses it to consume the object.
	 *
	 * @param o               The object to be passed to the consumer.
	 * @param anonymousLambda A lambda or anonymous class that consumes the object.
	 */
	private static void receiveInterfaceWithParameter(Object o, MyEventConsumer anonymousLambda) {
		anonymousLambda.consumer(o);
	}
}
