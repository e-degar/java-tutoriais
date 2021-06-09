package ex8_Composicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ex8_Composicao.entities.enums.WorkerLevelEnum;

public class Worker {

	// Atributos básicos
	private String name;
	private WorkerLevelEnum level;
	private Double baseSalary;

	// Associações
	private Department department;
	// A lista precisa ser instanciada
	private List<HourContract> contracts = new ArrayList<>();
	// O trabalhador começa recebendo uma lista vazia que só vai ser manipulada
	// pelas funções add e remove. A função setContracts vai ser omitida. Do
	// contrário isso possibilitaria substituir a lista por outra lista usando
	// o set contracts

	public Worker () {
	}

	public Worker(String name, WorkerLevelEnum level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		// Não coloca a lista no construtor
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevelEnum getLevel() {
		return level;
	}

	public void setLevel(WorkerLevelEnum level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	// Função que calcula o total mensal de acordo com o valor digitado pra mês e ano
	public double income(int year, int month) {
		// Variável de soma. Já é inicializada com o valor do salário base
		double sum = baseSalary;
		// Cria um obj Calendar vazio
		Calendar cal = Calendar.getInstance();
		// For each pra iterar na lista. A ideia é ver cada contrato da lista e,
		// se corresponder ao ano e mês inserido ele pega o valor total e junta
		// com o salário base na soma.
		for (HourContract c : contracts) {
			// Pra cada contrato que ele for iterando, ele coloca a data do contrato
			// no objeto calendar. 
			cal.setTime(c.getDate());
			// Essas variáveis recebem o ano e o mês do objeto calendar que vai estar
			// com a data do contrato que tá iterando na lista.
			int c_year = cal.get(Calendar.YEAR);
			// Precisa colocar + 1 pq o mês do calendar começa com zero
			int c_month = 1 + cal.get(Calendar.MONTH);
			// Compara se corresponde ao ano e mês informado
			if (year == c_year && month == c_month){
				// Se for, soma
				sum += c.totalValue();
			}
		}
		return sum;
	}
}