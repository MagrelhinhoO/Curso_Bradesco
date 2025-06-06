package ControleCandidatos.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"CLEMENTINA","VAN HELLSING","lADY GAGA","CELLBIT","RODOLFO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato +" NA "+ tentativasRealizadas +" TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato +", NÚMERO MAXIMO DE TENTATIVAS "+ tentativasRealizadas +" REALIZADA");
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"CLEMENTINA","VAN HELLSING","lADY GAGA","CELLBIT","RODOLFO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int i=0;i< candidatos.length;i++){
            System.out.println("O candidato de n° "+ (i+1) + " é "+ candidatos[i]);
        }

        System.out.println("Imprimindo os candidatos de forma abreviada com for each");

        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"ARTHUR","JOÃO","SILVA","PEDRO","CLEMENTINA","VAN HELLSING","lADY GAGA","CELLBIT","MURILO","BLUEZÃO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato +" solicitou este valor de salário: R$"+ salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato +" foi selecionado para a vaga");
                candidatosSelecionados++;
            }else {
                System.out.println("O candidato "+ candidato +" não foi selecionado para a vaga");
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
