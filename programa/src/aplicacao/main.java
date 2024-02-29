package aplicacao;

import calculo.soma;

public class main {

	public static void main(String[] args) {
		soma y;
		y = new soma();
		y.a = 10;
		y.b = 4;
		y.c = 5;
		double res = y.valores();
		System.out.println(res);
	}

}
