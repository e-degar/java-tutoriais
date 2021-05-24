package exemplos_20_a_29;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Ex24_Calendar {

	public static void main(String[] args) {

		// Somando uma unidade de tempo

		// Cria um objeto format
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// Cria um objeto Date
		Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		// Imprime o objeto Date no formato do objeto "formato"
		System.out.println(formato.format(data));

		// Cria um objeto Calendar
		Calendar calendario = Calendar.getInstance();

		// Instancio meu objeto Date no meu objeto Calendar
		calendario.setTime(data);

		// Adiciono 4 horas
		calendario.add(Calendar.HOUR_OF_DAY, 4);

		// Atualizo meu objeto Date com o valor do meu objeto Calendar
		data = calendario.getTime();

		// Retorno usando o formato do meu objeto Format
		System.out.println(formato.format(data));

		// Obtendo uma unidade de tempo

		// Passo os minutos da data que ta instanciada no meu calendar pra uma variável
		int minutos = calendario.get(Calendar.MINUTE);

		// Passo o mês da data que ta lá pra outra variável  (vai o + 1 pq ele começa a contar os meses do 0)
		int mes = 1 + calendario.get(Calendar.MONTH);

		// Imprimo
		System.out.println("Minutos: " + minutos);
		System.out.println("Mês: " + mes);
	}
}