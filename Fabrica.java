package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jackson2015
 */
public class Fabrica {

    public static EntityManager getConexao(){
        
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("conexao");    
        EntityManager Fab = fabrica.createEntityManager();
        
        return Fab;
       
    }
    
}
