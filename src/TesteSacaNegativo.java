
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,22432);
		conta.deposita(100);
		
		System.out.println(conta.saca(200));
		System.out.println(conta.getSaldo());
	}

}
