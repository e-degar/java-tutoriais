package ex8_Sobreposicao.app;

import ex8_Sobreposicao.entities.ContaEmpresarial;
import ex8_Sobreposicao.entities.Conta;
import ex8_Sobreposicao.entities.ContaPoupanca;

public class Application {

	public static void main(String[] args) {

		Conta contaCorrente = new Conta(0001,"Lipi",1000.0);
		ContaPoupanca contaPoupanca = new ContaPoupanca(0002,"Lipi",1000.0, 5.0);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(0003, "Empresa de Ossinho ltda.", 1000.0, 1000000000.0);

		// Os métodos saque() vão resultar em valores diferentes pq apesar de a classe 
		// ContaPoupanca ter herdado esse método classe Conta, esse método foi
		// sobrescrito na classe ContaPoupanca pra ter um comportamento diferente.
		contaCorrente.saque(100.0);
		System.out.println("Saldo Conta corrente:"+contaCorrente.getSaldo());
		contaPoupanca.saque(100.0);
		System.out.println("Saldo Conta Poupança:"+contaPoupanca.getSaldo());
	
		// O método saque() da ContaEmpresarial também vai retornar um resultado diferente
		// pq ele foi sobrescrito pra implementar o método principal e aplicar uma taxa de 
		// mais 5.0
		contaEmpresarial.saque(100.0);
		System.out.println("Saldo Conta Empresarial:"+contaEmpresarial.getSaldo());
	}
}