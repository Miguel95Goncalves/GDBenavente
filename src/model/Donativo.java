package model;

public class Donativo {
	private Socio socio;
	private String nome,contacto,localidade,donativo;
	float quantidade;
	
	public Donativo(Socio socio, String donativo, float quantidade) {
		super();
		this.socio = socio;
		this.donativo = donativo;
		this.quantidade = quantidade;
	}
	
	public Donativo(String nome, String contacto, String localidade, String donativo, float quantidade) {
		super();
		this.nome = nome;
		this.contacto = contacto;
		this.localidade = localidade;
		this.donativo = donativo;
		this.quantidade = quantidade;
	}
	
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getDonativo() {
		return donativo;
	}
	public void setDonativo(String donativo) {
		this.donativo = donativo;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
}
