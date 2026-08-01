package empresa;

public class Funcionario {

	private String cpf;
	private String nome;
	private String rg;
	private String telefone;

	public Funcionario() {
	}

	public Funcionario(String cpf, String nome, String rg, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "CPF: " + cpf + " | Nome: " + nome + " | RG: " + rg + " | Telefone: " + telefone;
	}
}