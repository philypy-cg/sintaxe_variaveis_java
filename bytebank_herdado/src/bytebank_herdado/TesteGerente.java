package bytebank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Jessica");
		g1.setCpf("321654987-78");
		g1.setSalario(5000.0);
		
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(121212);
		boolean autenticou = g1.autentica(121212);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		

	}

}
