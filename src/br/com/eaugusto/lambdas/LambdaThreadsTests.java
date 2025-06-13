package br.com.eaugusto.lambdas;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 13, 2025
 */
public class LambdaThreadsTests {

	public static void main(String[] args) {

		// The older way of running and creating threads
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Common Runnable");
			}
		};
		new Thread(runnable).start();

		// Running and creating threads using lambdas, the code becomes much simpler and
		// shorter
		Runnable lambdaRunnable = () -> System.out.println("Lambda Runnable");
		new Thread(lambdaRunnable).start();

		// Threads receive a Runnable as a parameter, so that means we can give it a
		// lambda directly, making the code even smaller
		new Thread(() -> System.out.println("Thread Directly Running A Lambda")).start();
	}
}
