package ex9_Polimorfismo.app;

import ex9_Polimorfismo.entities.ContaEmpresarial;
import ex9_Polimorfismo.entities.Conta;
import ex9_Polimorfismo.entities.ContaPoupanca;
/*
 * Polimorfismo é a capacidade de uma variável do tipo mais genérico armazenar
 * um objeto do tipo mais específico.
 */
public class Application {

	public static void main(String[] args) {

		// Veja que todas as contas estão em variáveis do tipo Conta
		Conta contaCorrente = new Conta(0001,"Lipi",1000.0);
		// Mas no caso dessas, estão sendo instanciados objetos de classes
		// derivadas (mais específicas)
		Conta contaPoupanca = new ContaPoupanca(0002,"Lipi",1000.0, 5.0);
		Conta contaEmpresarial = new ContaEmpresarial(0003, "Empresa de Ossinho ltda.", 1000.0, 1000000000.0);

		contaCorrente.saque(100.0);
		System.out.println("Saldo Conta corrente:"+contaCorrente.getSaldo());
		contaPoupanca.saque(100.0);
		System.out.println("Saldo Conta Poupança:"+contaPoupanca.getSaldo());
		contaEmpresarial.saque(100.0);
		System.out.println("Saldo Conta Empresarial:"+contaEmpresarial.getSaldo());

		// Importante: 
		// A associação entre o tipo especifico e genérico é feita por upcasting
		// O compilador não sabe pra qual tipo específico de objeto o método tá sendo
		// chamado, só sabe que são variáveis do mesmo tipo.
	}
}