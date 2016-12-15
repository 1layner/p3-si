package br.com.facpoli.p3.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.facpoli.p3.pojo.LcboDrinks;

@Entity
public class Result {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String tags;
	private int precoCentavo;
	private String categoria;
	private int totalCentavos;
	private int volume;
	private String nomeProdutor;
	private String imgUrl;
	private int numProd;
	
	public Result(){
		
	}

	public Result(LcboDrinks lcboDrinks) {
		this.nome = lcboDrinks.getResult().getName();
		this.tags = lcboDrinks.getResult().getTags();
		this.precoCentavo = lcboDrinks.getResult().getPrice_in_cents();
		this.categoria = lcboDrinks.getResult().getPrimary_category();		
		this.totalCentavos = lcboDrinks.getResult().getTotal_package_units();	
		this.volume = lcboDrinks.getResult().getVolume_in_milliliters();			
		this.nomeProdutor = lcboDrinks.getResult().getProducer_name();
		this.imgUrl = lcboDrinks.getResult().getImage_thumb_url();			
		this.numProd = lcboDrinks.getResult().getProduct_no();		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getPrecoCentavo() {
		return precoCentavo;
	}

	public void setPrecoCentavo(int precoCentavo) {
		this.precoCentavo = precoCentavo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getTotalCentavos() {
		return totalCentavos;
	}

	public void setTotalCentavos(int totalCentavos) {
		this.totalCentavos = totalCentavos;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getNomeProdutor() {
		return nomeProdutor;
	}

	public void setNomeProdutor(String nomeProdutor) {
		this.nomeProdutor = nomeProdutor;
	}
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getNumProd() {
		return numProd;
	}

	public void setNumProd(int numProd) {
		this.numProd = numProd;
	}
}
