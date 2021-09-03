
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);

		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		Cliente titularDaConta = conta.getTitular();
		System.out.println(titularDaConta.getNome());
		
	}
}
