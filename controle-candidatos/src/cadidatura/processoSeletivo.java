package cadidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Lucas", "Cleiton", "Marina"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);


        }
       
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADOP COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu)
            System.out.println("CONSEGUMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS" + tentativasRealizadas + "REALIZADAS");

    }
    //auxiliar 
    static boolean atender() {
        return new Random().nextInt(3)==1;

    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Lucas", "Cleiton", "Marina"};
        
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice =0; indice < candidatos.length;indice++) {
            System.out.println("O cadidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
    }
    static void selecaoCandidatos() {

        String [] candidatos = {"Felipe", "Marcia", "Lucas", "Cleiton", "Marina", "Alisson", "DanDan", "Matheus", "Kaio"};

        int candidatoSelecionados =0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double SalarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de sálario " + SalarioPretendido);
            if (salarioBase >= SalarioPretendido) {
                System.out.println("O candidato " + candidato + " Foi selecionado");
                candidatoSelecionados++;

            }
            candidatoAtual++;

        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
