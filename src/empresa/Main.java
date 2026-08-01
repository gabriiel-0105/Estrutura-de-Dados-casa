package empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		RegraNegocioFuncionario rnf = new RegraNegocioFuncionario();

		RegraNegocioEmpresa rne = new RegraNegocioEmpresa();

		Empresa empresa = new Empresa();

		System.out.println("=== CADASTRO EMPRESA ===");

		System.out.print("CNPJ: ");
		empresa.setCnpj(sc.nextLine());

		System.out.print("Nome: ");
		empresa.setNome(sc.nextLine());

		System.out.print("Telefone: ");
		empresa.setTelefone(sc.nextLine());

		rne.cadastrarEmpresa(empresa);

		Funcionario funcionario = new Funcionario();

		System.out.println("\n=== CADASTRO FUNCIONÁRIO ===");

		System.out.print("CPF: ");
		funcionario.setCpf(sc.nextLine());

		System.out.print("Nome: ");
		funcionario.setNome(sc.nextLine());

		System.out.print("RG: ");
		funcionario.setRg(sc.nextLine());

		System.out.print("Telefone: ");
		funcionario.setTelefone(sc.nextLine());

		rnf.cadastrarFuncionario(funcionario);

		System.out.println("\n=== EMPRESAS CADASTRADAS ===");
		rne.listarEmpresa();

		System.out.println("\n=== FUNCIONÁRIOS CADASTRADOS ===");
		rnf.listarFuncionario();

		System.out.println("\n=== PROCURA FUNCIONÁRIO ===");

		System.out.print("Digite o CPF: ");
		String cpf = sc.nextLine();

		Funcionario f = rnf.procurar(cpf);

		if (f != null) {
			System.out.println("Encontrado:");
			System.out.println(f);
		} else {
			System.out.println("Funcionário não encontrado.");
		}

		sc.close();
	}
}