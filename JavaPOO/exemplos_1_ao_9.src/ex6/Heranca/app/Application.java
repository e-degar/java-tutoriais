package ex6.Heranca.app;

import ex6.Heranca.entities.Conta;
import ex6.Heranca.entities.ContaEmpresarial;

public class Application {

	public static void main(String[] args) {

		ContaEmpresarial contaEmp = new ContaEmpresarial();
		Conta contaCorrente = new Conta();

		// Repare que no objeto do tipo Conta (classe herdada)
		// eu consigo acessar todos os métodos e atributos da própria
		// classe, mas eu não tenho acesso ao método emprestimo()
		// pq ele pertence à classe ContaEmpresarial

		contaCorrente.deposito(20.0);
		contaCorrente.saque(10.0);
		//contaCorrente.emprestimo();

		// Mas no objeto do tipo ContaEmpresarial (classe que
		// herda) eu tenho acesso a todos os métodos e atributos
		// que estão em Classe (classe herdada)
		contaEmp.deposito(3.0);
		contaEmp.saque(1.0);
		contaEmp.emprestimo(10.0);
	}

}
