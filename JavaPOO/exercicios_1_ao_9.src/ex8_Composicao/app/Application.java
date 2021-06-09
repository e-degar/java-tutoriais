package ex8_Composicao.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import ex8_Composicao.entities.Department;
import ex8_Composicao.entities.HourContract;
import ex8_Composicao.entities.Worker;
import ex8_Composicao.entities.enums.WorkerLevelEnum;

public class Application {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String depName = input.nextLine();

		System.out.print("Enter worker data:");
		System.out.print("\nName: ");
		String workerName = input.nextLine();
		System.out.print("Level: ");
		String workerLevel = input.nextLine();
		System.out.print("Base salary: U$D ");
		double baseSal = input.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevelEnum.valueOf(workerLevel), baseSal, new  Department(depName));

		System.out.print("How many contracts to this worker? ");
		int n = input.nextInt();

		for (int i=1; i<=n;i++) {
			System.out.println("Enter contract #"+i+" data: ");
			System.out.print("Date (DD/MM/YYYY)? ");
			Date contractDate = sdf.parse(input.next());
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = input.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}

		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = input.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income for "+monthAndYear+": "+ String.format("%.2f",worker.income(year, month)));
		
		input.close();
	}
}