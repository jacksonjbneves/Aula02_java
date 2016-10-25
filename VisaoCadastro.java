package visao;


import controle.ControleCadastro;
import entidade.Cadastro;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jackson2015
 */
@ManagedBean
public class VisaoCadastro {

    private Cadastro cadastro = new Cadastro();
    private final ControleCadastro controle = new ControleCadastro();
    
    public void cadastrar(){
        String mensagem = controle.salvar(cadastro);
        addMensagem(mensagem);
    }
    
    
    //METODO QUE SALVAR OS DADOS DIGITADOS NO CAMPO DE TEXTO NO BANCO SQL
    private void addMensagem(String msg){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
    }
    
    public Cadastro getCadastro(){
    return cadastro;
    }
    
    public void setCadastro(Cadastro cadastro){
         this.cadastro = cadastro;
    }
    
}
