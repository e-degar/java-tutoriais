package ex13_Conta.model.exceptions;

public class ErroDeSaque extends Exception {
	private static final long serialVersionUID = 1L;

	public ErroDeSaque(String msg) {
		super(msg);
	}
}