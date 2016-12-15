package br.com.facpoli.p3.entidade;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LcboResponse {

	@JsonProperty("results")
	private List<Lcbo> lcbo = new ArrayList<Lcbo>();

	public List<Lcbo> getLcbo() {
		return lcbo;
	}

	public void setLcbo(List<Lcbo> lcbo) {
		this.lcbo = lcbo;
	}
}
