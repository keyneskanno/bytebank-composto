
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(122232);
		Conta conta2 = new Conta(1232, 23232);
		Conta conta4 = new Conta(1337, 42324232);
		
		System.out.println(Conta.getTotal());
		
	}

}
