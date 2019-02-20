package repository;

import modelo.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@ApplicationScoped
public class PessoaDAO implements Serializable {

    @PersistenceContext
    private EntityManager em;


    @Transactional
    public void salvar (Pessoa pessoa){
        em.persist(pessoa);

    }

    public List<Pessoa> consultar(){
        return em.createQuery("select pessoa from Pessoa pessoa",Pessoa.class).getResultList();
    }

    @Transactional
    public void remover(Pessoa pessoa){
        pessoa = em.find(Pessoa.class,pessoa.getId());
        em.remove(pessoa);
    }
}
