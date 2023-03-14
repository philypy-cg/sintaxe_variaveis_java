package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario phil = new Funcionario();
		phil.setNome("Philypy Gomes");
		phil.setCpf("789456123-78");
		phil.setSalario(2600.00);
		
		System.out.println(phil.getNome());
		System.out.println(phil.getBonificacao());

	}

}
