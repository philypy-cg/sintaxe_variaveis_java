package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPhil = new Conta();
		contaDoPhil.saldo = 100;
		contaDoPhil.deposita(50);
		System.out.println(contaDoPhil.saldo);
		contaDoPhil.saca(20);

		Conta contaDaJessica = new Conta();
		contaDaJessica.deposita(1000);

		if (contaDaJessica.transfere(300, contaDoPhil)) {
			System.out.println("Transferencia feita com sucesso !");
		} else {
			System.out.println("Faltou dinheiro !");
		}
		System.out.println(contaDaJessica.saldo);
		System.out.println(contaDoPhil.saldo);

		contaDoPhil.titular = "Philypy Gomes";
		System.out.println(contaDoPhil.titular);

	}

}
