package ex7.UpcastDowncast.app;

import ex7.UpcastDowncast.entities.Conta;
import ex7.UpcastDowncast.entities.ContaEmpresarial;
import ex7.UpcastDowncast.entities.ContaPoupanca;

public class Application {

	public static void main(String[] args) {

		ContaEmpresarial contaEmp = new ContaEmpresarial(0002, "Empresa de ossinho ltda.", 50000.0,10000.0);
		Conta contaCorrente = new Conta(0001,"Lipi",1000.0);

// UPCASTING

		// Basicamente eu pego um objeto do tipo ConrtaEmpresarial e atribuir
		// atribui-lo em uma variável do tipo Conta.
		Conta cCorrente = contaEmp;
		Conta outraConta = new ContaPoupanca(0003, "João",5000.0, 300.0);
		// Só que não dá pra acessar os atributos e métodos de ContaEmpresarial
		//cCorrente.emprestimo();
		//outraConta.emprestimo();

// DOWNCASTING

		// Converter um objeto da superclasse pra subclasse. Se eu tentar pegar um objeto
		// do tipo ContaEmpresarial que tá dentro de uma variável do tipo conta, dentro de
		// cCorrente, por exemplo, eu preciso fazer um casting, pq o compilador não sabe
		// que tipo de objeto tem dentro da minha variável cCorrente e isso pode dar erro
		ContaEmpresarial maisConta = (ContaEmpresarial)cCorrente;
		maisConta.emprestimo(1.0);

		// Se eu quiser fazer um cast de uma variável do tipo Conta, que recebeu
		// um objeto do tipo ContaPoupanca pra outra variável do tipo ContaEmpresarial 
		// (outraConta), o compilador não vai dar erro, pq ele não sabe qual o tipo de
		// objeto que tá dentro da variável. Mas na hora da execução vai dar um erro ClassCastException
		//ContaEmpresarial conta = (ContaEmpresarial)outraConta;

		// Um jeito de testar pra saber se o objeto dentro da variável é compatível, é usando
		// o comando instanceOf

		if (outraConta instanceof ContaEmpresarial) {
			ContaEmpresarial conta = (ContaEmpresarial)outraConta;
		} else {
			System.out.println("Incompatível");
		}

	}
}