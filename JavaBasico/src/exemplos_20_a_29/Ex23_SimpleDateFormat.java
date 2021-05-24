package exemplos_20_a_29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Ex23_SimpleDateFormat {

	public static void main(String[] args) throws ParseException {

		// Um objeto format pra especificar como as datas serão formatadas.
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// Faz com que o objeto formate o horário pra UTC
		data3.setTimeZone(TimeZone.getTimeZone("GMT"));

		// Cria uma variável com a data atual
		Date x1 = new Date();

		// Pega o instante no sistema e converte pra milisegundos
		Date x2 = new Date(System.currentTimeMillis());

		// Cria uma data passando 0 milisegundos (Unix Timestamp)
		Date x3 = new Date(0L);

		// Converte do formato data1 pro formato date
		Date y1 = data1.parse("25/06/2018");
		Date y2 = data2.parse("25/06/2018 15:42:07");

		// Cria uma variável no formato UTC
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(y1);
		System.out.println(y2);
		
		// Imprime sem formatação
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println("--------------------------");

		// Converte do formato date pro formato data1
		System.out.println(data1.format(y1));
		System.out.println(data2.format(y2));
		System.out.println(data2.format(y3));
		System.out.println(data2.format(x1));
		System.out.println(data2.format(x2));
		System.out.println(data2.format(x3));
		System.out.println("--------------------------");

		// Imprimindo no padrão UTC
		System.out.println(data3.format(y1));
		System.out.println(data3.format(y2));
		System.out.println(data3.format(y3));
		System.out.println(data3.format(x1));
		System.out.println(data3.format(x2));
		System.out.println(data3.format(x3));
	}
}