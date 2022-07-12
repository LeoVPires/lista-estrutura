public class FilaNo {
	DuploNo primeiro;
	DuploNo ultimo;

	public void add(DuploNo duploNo) {
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

	private void removerPrimeiro(DuploNo duploNo){
		if (primeiro == null){
			System.out.println("Lista Vazia");
		}
		if (primeiro.getProximo() == null){
			primeiro = null;
		}
		else if (primeiro != null){
			primeiro.getProximo().setAnterior(null);
			primeiro = primeiro.getProximo();
		}
	}

	public void remover(){
		removerPrimeiro(primeiro);
	}

	public FilaNo(DuploNo primeiro, DuploNo ultimo) {
		super();
		this.primeiro = primeiro;
		this.ultimo = ultimo;
	}

	private int varrerFilaPraContar(DuploNo duploNo) {
		if (duploNo.getProximo() == null) {
			return 1;
		} else {
			return 1 + varrerFilaPraContar(duploNo.getProximo());
		}
	}

	public int countManual() {
		if (primeiro == null) {
			return 0;
		} else if (ultimo == null) {
			return 1;
		}
		return varrerFilaPraContar(primeiro);
	}
}