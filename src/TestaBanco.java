
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira"); 
		paulo.setCpf("222.222.222-22");
		paulo.setProfissao("Programador");
		
		Conta contaDoPaulo = new Conta(1337,24226);
		contaDoPaulo.deposita(100);
		System.out.println(contaDoPaulo.getTitular().getNome());
	}
	

}
