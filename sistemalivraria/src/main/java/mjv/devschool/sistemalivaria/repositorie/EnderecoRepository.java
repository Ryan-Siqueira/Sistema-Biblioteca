package mjv.devschool.sistemalivaria.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mjv.devschool.sistemalivaria.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long>{

	
	
	
}