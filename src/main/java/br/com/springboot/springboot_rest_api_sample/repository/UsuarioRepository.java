package br.com.springboot.springboot_rest_api_sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.springboot.springboot_rest_api_sample.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@Query(value = "select u from Usuario u where upper(trim(u.nome)) like %?1%")
	List<Usuario> buscarPorNome(String name);	

}
