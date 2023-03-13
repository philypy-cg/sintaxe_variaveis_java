package bytebank_encapsulamento;

public class Conta {
	private double saldo;
	private int agencia = 42;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;

		System.out.println("estou criando uma conta " + this.numero);
	}

	void deposita(double valor) {
		this.saldo = this.saldo + valor;
		// pode ser usado também o += no lugar do this.saldo, que iria ficar this.saldo
		// += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			// pode ser usado o -= no lugar do this.saldo, que iria ficar this.saldo -=
			// Valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (numero <= 0) {
			System.out.println("não pode valor <= 0");
			return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;

	}

}