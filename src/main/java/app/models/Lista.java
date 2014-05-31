package app.models;

@javax.persistence.Entity
public class Lista extends Entity {

	private Integer idLista;
	private String nome;

	public void setIdLista(Integer idLista) {
		this.idLista = idLista;
	}

	public Integer getIdLista() {
		return idLista;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
