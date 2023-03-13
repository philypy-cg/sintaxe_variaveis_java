package bytebank_encapsulamento;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getNumero());

		Cliente phil = new Cliente();
		// conta.titular = phil;
		phil.setNome("Philypy Gomes");

		conta.setTitular(phil);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().getProfissão();
	}

}
