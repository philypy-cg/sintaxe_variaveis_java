package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente phil = new Cliente();
		phil.nome = "Philypy Gomes";
		phil.cpf = "222.222.333-28";
		phil.profissão = "programador";
		
		Conta contaDoPhil = new Conta();
		contaDoPhil.deposita(100);
		
		contaDoPhil.titular = phil;
		System.out.println(contaDoPhil.titular.nome);
	}

}
