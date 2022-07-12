public class PilhaNo {
	DuploNo primeiro;
	DuploNo ultimo;

	public void addTopo(DuploNo duploNo) {
		if (primeiro == null) {
			primeiro = duploNo;
		} else if (ultimo == null) {
			ultimo = duploNo;
			primeiro.setProximo(ultimo);
			ultimo.setAnterior(primeiro);
		} else {
			ultimo.setProximo(duploNo);
			duploNo.setAnterior(ultimo);
			ultimo = duploNo;
		}
	}

	private void removerTopo(DuploNo duploNo){
		if (primeiro == null){
			System.out.println("Lista Vazia");
		}
		if (ultimo.getAnterior() == null){
			primeiro = null;
		} else if (ultimo != null){
			ultimo.getAnterior().setProximo(null);
			ultimo = ultimo.getAnterior();
		}
	}

	public void remover(){
		removerTopo(primeiro);
	}

	public PilhaNo(DuploNo primeiro, DuploNo ultimo) {
		super();
		this.primeiro = primeiro;
		this.ultimo = ultimo;
	}

	private int varrerPilhaPraContar(DuploNo duploNo) {
		if (duploNo.getProximo() == null) {
			return 1;
		} else {
			return 1 + varrerPilhaPraContar(duploNo.getProximo());
		}
	}

	public int countManual() {
		if (primeiro == null) {
			return 0;
		} else if (ultimo == null) {
			return 1;
		}
		return varrerPilhaPraContar(primeiro);
	}
}