package ex10_Orders.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ex10_Pedidos.model.entities.Cliente;
import ex10_Pedidos.model.entities.ItemPedido;
import ex10_Pedidos.model.entities.Pedido;
import ex10_Pedidos.model.entities.Produto;
import ex10_Pedidos.model.enums.StatusEnum;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Scanner input =  new Scanner(System.in);
		char chec = 's';
		int n = 1;

		System.out.println("###### Cadastro de cliente ######");
		System.out.print("Nome: ");
		String nomeCliente = input.nextLine();
		System.out.print("E-mail: ");
		String email = input.nextLine();
		System.out.println("Data de nascimento (dd/mm/aaaa): ");
		Date nasc = dateFormat.parse(input.next());
		input.nextLine();

		Cliente cliente = new Cliente(nomeCliente, email, nasc);
	
		System.out.println("###### Iniciando Pedido ######");
		System.out.print("Status: ");
		String status = input.nextLine();
		Pedido pedido = new Pedido(new Date(), StatusEnum.valueOf(status), cliente);

		do {
			System.out.printf("\nItem nº %d:\n", n);
			System.out.print("Nome do produto: ");
			String nomeProd = input.nextLine();
			System.out.print("Preço unitário: R$");
			double valorUnit = input.nextDouble();
			System.out.print("Quantidade: ");
			int qtdeProd = input.nextInt();
			System.out.println();
			Produto prod = new Produto(nomeProd, valorUnit);
			ItemPedido item = new ItemPedido(qtdeProd, valorUnit, prod);
			pedido.addItem(item);
			System.out.print("Deseja incluir mais itens? (s/n) ");
			chec = input.next().charAt(0);
			input.nextLine();
			n++;

		}while(chec != 'n');

		input.close();
		cliente.addPedido(pedido);

		System.out.println("\n####### Detalhes do pedido #######");
		System.out.println(pedido);

	}
}