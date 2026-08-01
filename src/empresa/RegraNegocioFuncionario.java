package empresa;

public class RegraNegocioFuncionario {

	private Funcionario[] funcionarios;
	private int quantidade;

	public RegraNegocioFuncionario() {
		funcionarios = new Funcionario[5];
		quantidade = 0;
	}

	public void cadastrarFuncionario(Funcionario funcionario) {

		if (quantidade == funcionarios.length) {
			aumentarVetor();
		}

		funcionarios[quantidade] = funcionario;
		quantidade++;
	}

	public void listarFuncionario() {

		for (int i = 0; i < quantidade; i++) {
			System.out.println(funcionarios[i]);
		}
	}

	public void adicionarPorPosicao(int posicao, Funcionario funcionario) {

		if (posicao < 0 || posicao > quantidade) {
			System.out.println("Posição inválida!");
			return;
		}

		if (quantidade == funcionarios.length) {
			aumentarVetor();
		}

		for (int i = quantidade; i > posicao; i--) {
			funcionarios[i] = funcionarios[i - 1];
		}

		funcionarios[posicao] = funcionario;
		quantidade++;
	}

	public void removerPorPosicao(int posicao) {

		if (posicao < 0 || posicao >= quantidade) {
			System.out.println("Posição inválida!");
			return;
		}

		for (int i = posicao; i < quantidade - 1; i++) {
			funcionarios[i] = funcionarios[i + 1];
		}

		funcionarios[quantidade - 1] = null;
		quantidade--;
	}

	public Funcionario procurar(String cpf) {

		for (int i = 0; i < quantidade; i++) {

			if (funcionarios[i].getCpf().equals(cpf)) {
				return funcionarios[i];
			}
		}

		return null;
	}

	public void aumentarVetor() {

		Funcionario[] novo = new Funcionario[funcionarios.length * 2];

		for (int i = 0; i < funcionarios.length; i++) {
			novo[i] = funcionarios[i];
		}

		funcionarios = novo;
	}
}