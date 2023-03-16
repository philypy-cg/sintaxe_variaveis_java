package bytebank_herdado;

public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do editor de Video");
		return super.getBonificacao() + 100;
	}

}
