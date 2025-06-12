package br.com.eaugusto.lambdas;

import java.util.function.IntBinaryOperator;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 12, 2025
 */
public class IntBinaryOperatorClass implements IntBinaryOperator {

	@Override
	public int applyAsInt(int a, int b) {
		return a + b;
	}
}
