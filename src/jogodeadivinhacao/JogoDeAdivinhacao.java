package jogodeadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        
        int opcao;
        int escolha_computador;
        int escolha_usuario;
        String nome;
        
        System.out.println("Olá! Qual é o seu nome?");
        nome = sc.nextLine();
        System.out.println("Prazer em conhece-lo " + nome + "!");
        System.out.println(nome + " , você quer jogar comigo?");
        System.out.println("\nInforme o número da sua opção: \n1 -> Sim\n2 -> Não");
        opcao = sc.nextInt();
        
        if(opcao == 2){
            System.out.println("Que pena! Mas tudo bem, fica para a próxima!");
        }else if(opcao == 1){
            System.out.println("Ok! O jogo é assim...");
            System.out.println("Eu vou escolher um número de 0 a 10");
            System.out.println("Mas eu não vou falar pra você qual foi o número");
            System.out.println("Se voce adivinhar qual foi o número");
            System.out.println("Você será o vencedor!");
            
            escolha_computador = gerador.nextInt(11);
            
            System.out.println("Ok, " + nome + ". Eu já escolhi!");
            System.out.println("Agora tente adivinhar o número!");
            
            do{
                escolha_usuario = sc.nextInt();
                if(escolha_usuario != escolha_computador){
                    System.out.println("Resposta errada!");
                }else{
                    System.out.println("Parabéns! Você acertou!");
                }
            }while(escolha_computador != escolha_usuario);
        }
    }
    
}
