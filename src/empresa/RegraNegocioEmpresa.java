package empresa;

public class RegraNegocioEmpresa {

	private Empresa[] empresas;
	private int quantidade;

	public RegraNegocioEmpresa() {
		empresas = new Empresa[5];
		quantidade = 0;
	}

	public void cadastrarEmpresa(Empresa empresa) {

		if (quantidade == empresas.length) {
			aumentarVetor();
		}

		empresas[quantidade] = empresa;
		quantidade++;
	}

	public void listarEmpresa() {

		for (int i = 0; i < quantidade; i++) {
			System.out.println(empresas[i]);
		}
	}

	public void adicionarPorPosicao(int posicao, Empresa empresa) {

		if (posicao < 0 || posicao > quantidade) {
			System.out.println("Posição inválida!");
			return;
		}

		if (quantidade == empresas.length) {
			aumentarVetor();
		}

		for (int i = quantidade; i > posicao; i--) {
			empresas[i] = empresas[i - 1];
		}

		empresas[posicao] = empresa;
		quantidade++;
	}

	public void removerPorPosicao(int posicao) {

		if (posicao < 0 || posicao >= quantidade) {
			System.out.println("Posição inválida!");
			return;
		}

		for (int i = posicao; i < quantidade - 1; i++) {
			empresas[i] = empresas[i + 1];
		}

		empresas[quantidade - 1] = null;
		quantidade--;
	}

	public Empresa procurar(String cnpj) {

		for (int i = 0; i < quantidade; i++) {

			if (empresas[i].getCnpj().equals(cnpj)) {
				return empresas[i];
			}
		}

		return null;
	}

	public void aumentarVetor() {

		Empresa[] novo = new Empresa[empresas.length * 2];

		for (int i = 0; i < empresas.length; i++) {
			novo[i] = empresas[i];
		}

		empresas = novo;
	}
}