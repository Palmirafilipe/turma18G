package CLASSES;

public class ContaEd {
	

	protected int numero;
	public String cpf;
	protected double saldo;
	protected boolean ativa;
	public ContaEd(int numero, String cpf) {
		
	}
		
		//CONSTRUTOR
		
		public void conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
		
	}
		
		public ContaEd() {
			
		}
	//CONSTRUTOR - SOBRECARGA	
		public ContaEd(int numero) {
			
			this.numero = numero;
		}
		
		public ContaEd(int numero, String cpf, boolean ativa) {

			this.numero = numero;
			this.cpf = cpf;
			this.ativa = ativa;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public double getSaldo() {
			return saldo;
		}

		

		public boolean isAtiva() {
			return ativa;
		}

		public void setAtiva(boolean ativa) {
			this.ativa = ativa;
		}
		//METODOS
		public void Credito(double valor) {
			this.saldo = this.saldo + valor;
			
		}
		public void Debito(double valor) {
			
			
			if(this.saldo>=valor) {
			this.saldo = this.saldo - valor;
		}
	}

		
}
	
		
//public void setSaldo(double saldo) {
//this.saldo = saldo;
//}	
	