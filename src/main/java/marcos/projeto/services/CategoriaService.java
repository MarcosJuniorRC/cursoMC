package marcos.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marcos.projeto.domain.Categoria;
import marcos.projeto.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	public Categoria bucar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
}
