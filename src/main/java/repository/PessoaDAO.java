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
        System.out.println("salvando1...");
        System.out.println("salvando2...");
        System.out.println("salvando3...");
        System.out.println("salvando4...");
    }

    public List<Pessoa> consultar(){
        return em.createQuery("select pessoa from Pessoa pessoa", Pessoa.class).getResultList();
    }


    @Transactional
    public void remover(Pessoa pessoa){
        // pessoa = em.merge(pessoa); //passando a em de detached para managed
        // em.remove(pessoa); //interessa a bagaça estar dentro de uma transação para remover

        pessoa = em.find(Pessoa.class, pessoa.getId());
        em.remove(pessoa);

    }
}
