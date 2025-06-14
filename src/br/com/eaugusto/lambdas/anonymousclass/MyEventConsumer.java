package br.com.eaugusto.lambdas.anonymousclass;

/**
 * This is a functional interface with a single abstract method named
 * 'consumer'. It is designed to accept and process any object passed to it.
 *
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 13, 2025
 */
public interface MyEventConsumer {

	public void consumer(Object value);
}
