package exemploclasse;

public class ExemploClasse {

    public static void main(String[] args) {
       
        Gerente gerente = new Gerente();
        gerente.setNome("Carlos Vieira");
        gerente.setSalario(3000.58);
        gerente.setUsuario("carlos.vieira");
        gerente.setSenha("5523");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro Castelo");
        funcionario.setSalario(1500);
        
        System.out.println("Gerente");
        System.out.println("Salario: "+gerente.getSalario());
        System.out.println();
        
        System.out.println("Funcionario");
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println();
        
        double gerenteSalario = gerente.calculaBonificacao();
        
        System.out.println("Gerente");
        System.out.println("Salario: "+gerenteSalario);
        System.out.println();

        double funcSalario =  funcionario.calculaBonificacao();
        
        System.out.println("Funcionario");
        System.out.println("Salario: " + funcSalario);
        
    }
    
}
