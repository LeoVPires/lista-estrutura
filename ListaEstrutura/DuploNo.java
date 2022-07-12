public class DuploNo {
	private int descricao;
	private DuploNo proximo;
	private DuploNo anterior;

	public DuploNo(int descricao) {
		super();
		this.descricao = descricao;
	}

	public int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}

	public DuploNo getProximo() {
		return proximo;
	}

	public void setProximo(DuploNo proximo) {
		this.proximo = proximo;
	}

	public DuploNo getAnterior() {
		return anterior;
	}

	public void setAnterior(DuploNo anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "Encadeado{" + "descricao='" + descricao + '\'' + '}';
	}
}