package br.com.facpoli.p3.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LcboDrinksResponse {

	@JsonProperty("results")
	private List<LcboDrinks> lcboDrinks = new ArrayList<LcboDrinks>();

	public List<LcboDrinks> getLcboDrinks() {
		return lcboDrinks;
	}

	public void setLcboDrinks(List<LcboDrinks> lcboDrinks) {
		this.lcboDrinks = lcboDrinks;
	}
}
