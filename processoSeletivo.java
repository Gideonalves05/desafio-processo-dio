package processo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {

    public static void main(String[] args) {
        String candidatos  [] =  {"Felipe", "Betania", "Adriano", "Gabriel", "Pedro"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                 tentativasRealizadas++;
                 else 
                     System.out.println("contato realizado com sucesso");
        }while(continuarTentando && tentativasRealizadas < 3 );

        if (atendeu)
              System.out.println("conseguimos contato com o " + candidato + " na " + tentativasRealizadas);
              System.out.println("nao conseguimos contato com o " + candidato + " numero maximo de tentativas" + tentativasRealizadas);

            }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimindoCandidatos(){
        String candidatos  [] =  {"Felipe", "Betania", "Adriano", "Gabriel", "Pedro"};
        System.out.println(" imprimindo lista de candidatos informando o indice do elemento");

        for( int indice= 0 ; indice < candidatos.length; indice++){
              System.out.println(" o candidato de numero " + (indice+1) + " eh " + candidatos[indice]);
        }

        System.out.println(" forma abrevidada de interacao for each ");

        for( String candidato: candidatos){
            System.out.println("o candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String candidatos [] = {" Felipe", "Betania", "Adriano", "Gabriel", "Pedro"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato  + " solicitou este valor de salario " + salarioPretendido );
            if(salarioBase >= salarioPretendido ){
                System.out.println(" o candidato " + candidato + " foi selecionado pra vaga ");
                candidatosSelecionados++;
            }

            candidatoAtual++;
            
        }
    }

    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analizarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println(" Ligar para o candidato");
        }else if ( salarioBase==salarioPretendido ){
            System.out.println(" Ligar para o candidato");
        }else if(salarioBase < salarioPretendido){
            System.out.println(" aguardando resultado dos demais candidatos ");
        }
    } 
}
