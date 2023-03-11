package bytebank;

class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;

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

}