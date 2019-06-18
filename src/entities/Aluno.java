package entities;

public class Aluno {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double calcNota() {
		return n1 + n2 + n3;
	}
	
	public double pontosRestantes() {
		if (calcNota() < 60.0) {
			return 60.0 - calcNota();
		}
		else {
			return 0.0;
		}
	}
}
