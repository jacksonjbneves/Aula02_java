/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Jackson2015
 */
@Entity
@ManagedBean
public class Cadastro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String nome;
    private String email;
    
   
    public int getID() {
        return ID;
    }

    
    public void setID(int ID) {
        this.ID = ID;
    }

   
    public String getNome() {
        return nome;
    }

  
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String Email) {
        this.email = Email;
    }
    
   
    public static void main(String[] args) {
        
        Cadastro c=new Cadastro();
        
        System.out.println(c.nome+" -- "+c.email);
        
    }
    
    
}
