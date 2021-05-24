package exemplos_20_a_29;

public class Ex22_UnixTime {

	public static void main (String[]args) {

		// Esse System.currentTimeMillis retorna a quantidade de milisegundos da era unix.
		long totalMilisegundos = System.currentTimeMillis();

		/* 
		 *  A Era UNIX ou Posix Time ou Unix epoch ou Unix Timestamp teve início no dia a 1 de janeiro de 1970.
		 *  O nome se deve ao fato de esta data, dia 1 de janeiro de 1970 às 00:00:00 do Tempo Universal
		 *  Coordenado (UTC) no calendário gregoriano proléptico, ser o marco zero do sistema de calendário
		 *  usado pelo sistema operacional UNIX. Também pode ser chamada de era POSIX.
		 *  O horário Unix, definido como o número de segundos passados desde o epoch, não considerando segundos
		 *  bissextos, é largamente utilizado em sistema operacionais do tipo Unix bem como em outros sistemas.
		 *  Ele não é uma representação linear nem uma representação verdadeira do tempo UTC, por não considerar
		 *  os segundos bissextos (e.g. 31-12-1998-12 23:59:60).
		 */

		// Calculando a hora atual usando o Unix Timestamp

		// Aqui eu to convertendo a qtde de milisegundos desde o inicio da era unix pra segundos
		long totalSegundos = totalMilisegundos / 1000;
		
		// Aqui eu uso o % pra separar os segundos que já foram dos segundos que passaram desde a
		// última hora. Porque não tem muita utilidade eu saber quando tempo se passou desde os anos 70
		long segundoAtual = totalSegundos % 60;

		// Vou seguindo a mesma lógica
		long totalMinutos = totalSegundos / 60;
		long minutoAtual = totalMinutos % 60;

		long totalHoras = totalMinutos / 60;
		long horaAtual = totalHoras % 24;

		System.out.println("Horário (UTC): "+horaAtual+":"+minutoAtual+":"+segundoAtual);
		
		// Como o unix timestamp se baseia no horário universal coordenado (UTC), pra mostrar o horário
		// na minha região (UTC-3) eu tenho que compensar subtraindo três horas.
		System.out.println("Horário (UTC-3): "+(horaAtual - 3)+":"+minutoAtual+":"+segundoAtual);
	}
}