public class TesteDuploEncadeado {

	public static void main(String[] args) {
		FilaNo filaDupla = new FilaNo(null, null);
		PilhaNo pilhaDupla = new PilhaNo(null, null);

		System.out.println("manuseando a fila \n");
		for (int i = 0; i < 10000000; i++){
			filaDupla.add(new DuploNo(i+1));
		}
		System.out.println("a fila tem " + filaDupla.countManual() + " itens \n");
		for (int i = 0; i < 10000000; i++){
			filaDupla.remover();
		}
		System.out.println("a fila tem " + filaDupla.countManual() + " itens \n");

		///////

		System.out.println("manuseando a pilha \n");
		for (int i = 0; i < 10000000; i++){
			pilhaDupla.addTopo(new DuploNo(i+1));
		}
		System.out.println("a pilha tem " + pilhaDupla.countManual() + " itens");
		for (int i = 0; i < 10000000; i++){
			pilhaDupla.remover();
		}
		System.out.println("a pilha tem " + pilhaDupla.countManual() + " itens");
	}
}
