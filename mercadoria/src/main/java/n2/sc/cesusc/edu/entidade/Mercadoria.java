package n2.sc.cesusc.edu.entidade;

import java.util.UUID;

public class Mercadoria {
	private UUID id;
	private String nome;
    private String descricao;
    
	public UUID getId() {
		return id;
	}
	public void setId(UUID id2) {
		this.id = id2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Mercadoria [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}

}
