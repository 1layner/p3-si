package br.com.facpoli.p3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import br.com.facpoli.p3.entidade.Lcbo;
import br.com.facpoli.p3.entidade.LcboResponse;
import br.com.facpoli.p3.entidade.Result;
import br.com.facpoli.p3.pojo.LcboDrinksResponse;
import br.com.facpoli.p3.repositories.LcboRepository;

@Controller
public class LcboController {

	@Autowired
	LcboRepository lcboRepository;
	
	/*@Autowired
	ResultRepository resultRepository;*/
	
	@GetMapping("/")
	public String busca(Model model){
		model.addAttribute("produto", lcboRepository.findAll());
		return "busca";
	}
	
	@GetMapping("/admin")
	public String telaAdm(Model model){
		model.addAttribute("produto", new Lcbo());
		return "drinks";
	}
	
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	/*@PostMapping("/admin")
	public String registraDrink(){
		LcboResponse lcboResponse = generateLcboDrinksResponse();
		List<Lcbo> lcbo = lcboResponse.getLcbo();
		for(Lcbo lcbo : lcbos){
			lcboRepository.save(new Lcbo(lcbo));
		}
		return "redirect:/";
		
	}*/
	
	
	
	/*@PostMapping("/busca")
	public String buscaDrink(@ModelAttribute Result result, Model model){
		model.addAttribute("produto", resultRepository.findByNome(result.getNome()));
		return "busca";
	}*/
	
	
	
	private LcboDrinksResponse generateLcboDrinksResponse(){
		return new RestTemplate().getForObject("http://lcboapi.com/products", LcboDrinksResponse.class);
	}	
}