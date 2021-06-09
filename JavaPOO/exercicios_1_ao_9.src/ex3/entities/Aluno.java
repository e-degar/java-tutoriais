package ex3.entities;

public class Aluno {
	public String nome;
	public double primeiroBimestre;
	public double segundoBimestre;
	public double terceiroBimestre;
	public double quartoBimestre;

	public double media () {
		return (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre)/4.0;
	}
	public double quantoFalta () {
		if (media() < 6.0) {
			return 6.0 - media();
		} else {
			return 0.0;
		}
	}
	@Override
	public String toString() {
		return "\nAluno: " + nome + "\nMédia: " + String.format("%.2f", media());
	}	
}