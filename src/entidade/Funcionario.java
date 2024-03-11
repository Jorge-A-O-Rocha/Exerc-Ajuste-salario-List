package entidade;

public class Funcionario {
	private int id;
	private String nome;
	private float salario;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(int id, String nome, float salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
	

}
