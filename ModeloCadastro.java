
package modelo;

import entidade.Cadastro;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jackson2015
 */

public class ModeloCadastro {
 
      EntityManager conexao = Fabrica.getConexao();
    
    public boolean salvar(Cadastro cadastro){
        
        try {
            
            conexao.getTransaction().begin();
            conexao.persist(cadastro);
            conexao.getTransaction().commit();
            return true;
            
        } catch (Exception e) {
           
        conexao.getTransaction().rollback();
        return false;
        
        }
    
    
    }
    
    
    public boolean deletar(Cadastro cadastro){
    
    
        try {
            conexao.getTransaction().begin();
            conexao.remove(cadastro);
            conexao.getTransaction().commit();
            return true; 
        } catch (Exception e) {
            
            conexao.getTransaction().rollback();
            
            return false;
            
        }
    
    }
    
    
    public List<Cadastro> listar(){
    
         return conexao.createQuery("select c from Cadastro c").getResultList();
   
    }
    
    
    public Cadastro listarPorEmail(String email){
    
        javax.persistence.Query sql = conexao.createQuery("select c from Cadastro c where c.email = :email");
        sql.setParameter("email", email);
        
        return (Cadastro) sql.getSingleResult();
        
    }
    
    
}
