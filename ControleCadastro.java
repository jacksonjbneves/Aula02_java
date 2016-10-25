/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Cadastro;
import java.util.List;
import modelo.ModeloCadastro;

/**
 *
 * @author Jackson2015
 */
public class ControleCadastro {
    
    private final ModeloCadastro modelo = new ModeloCadastro();
    
    public String salvar(Cadastro cadastro) {
        
        boolean retorno = modelo.salvar(cadastro);
        
        return retorno == true ? "Usuário salvo com sucesso!" : "Erro ao tentar salvar usuário!";
    }
    
    
    public String deletar(Cadastro cadastro) {
        
        boolean retorno = modelo.deletar(cadastro);
        
        return retorno == true ? "Usuário removido com sucesso!" : "Erro ao tentar remover usuário!";
    }
    
    public List<Cadastro> listar() {
        
        return modelo.listar();
    }
    
    public Cadastro listarPorEmail(String email) {
        
       return  modelo.listarPorEmail(email);
    } 
}
