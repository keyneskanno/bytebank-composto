
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		Cliente marcela = new Cliente();
		marcela.setNome("Marcela");
		contaDaMarcela.setTitular(marcela);
		

		System.out.println(contaDaMarcela.getTitular().getNome());
	}

}
