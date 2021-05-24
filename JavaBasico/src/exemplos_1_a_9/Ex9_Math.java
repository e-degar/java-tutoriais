package exemplos_1_a_9;

// Math é uma biblioteca de operações matemáticas.
public class Ex9_Math {

	public static void main(String[] args) {
		// Alguns exemplos de operações matemáticas:
		double x = 4f; double y = 3f; double z = -4;
		// Raiz quadrada (precisa receber double).
		double a = Math.sqrt(x);
		System.out.println(a);
		// Potenciação (recebe dois valores double e faz o primeiro elevado ao segundo)
		double b = Math.pow(x, y);
		System.out.println(b);
		// Valor absoluto (se houver sinal negativo, mostra sem o sinal)
		double c = Math.abs(z);
		System.out.println(c);
	}
}