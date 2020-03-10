package exemploclasse;

public class Gerente extends Funcionario{
    
    private String usuario;
    private String senha;
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return usuario;
    }   
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
    
    public double calculaBonificacao(){
        return this.getSalario() * 0.6 + 100;
        // this.getSalario() pois salario é atributo herdado de funcionario
    }
    
}
