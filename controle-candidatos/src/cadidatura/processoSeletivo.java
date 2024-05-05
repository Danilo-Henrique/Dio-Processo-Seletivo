package cadidatura;

public class processoSeletivo {
    public static void main(String[] args) {
       
    }
    static void selecaoCandidatos() {
        
    }
    static void analisarCandidato(double SalarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > SalarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if(salarioBase == SalarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
