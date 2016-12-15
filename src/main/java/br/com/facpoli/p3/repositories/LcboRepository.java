package br.com.facpoli.p3.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.facpoli.p3.entidade.Lcbo;
import br.com.facpoli.p3.entidade.Result;

public interface LcboRepository extends CrudRepository<Result, Integer> {

	/*@Query("select r from result r where u.nome like %?1")
	List<Result> findByNome(String nome);*/
	
}
