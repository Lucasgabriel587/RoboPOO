package robo;

import java.util.Scanner;

public class TestarRobo {
    private Ambiente sala = new Ambiente();
    private Robo mig = new Robo();
    private Scanner entrada = new Scanner(System.in);
    
    public void definirAmbiente(){
        System.out.println("Informe o tamanho do ambiente (quantidade de linhas e colunas)");
        sala.setQtdLinhas(entrada.nextInt());
        sala.setQtdColunas(entrada.nextInt());
    }
    
    public void iniciarRobo(){
        System.out.println("Informe a posicao do robo no ambiente (linha e coluna)");
        mig.setLinha(entrada.nextInt());
        mig.setColuna(entrada.nextInt());
        
        //Fator de movimento sendo indicado na criação do robo
        /*System.out.println("Informe quantos passos o robo pode dar por vez: ");
        mig.setFatorMovimento(entrada.nextInt());*/
    }
            
    public void menu(){
        System.out.println("A sala tem tamanho: " + sala.getQtdLinhas() + " x " + sala.getQtdColunas());
        int menu = 0;
        do{
        System.out.println("\n[Robo] esta na posicao (" + mig.getLinha() + "," + mig.getColuna() + ") da sala");
        System.out.println("1-Andar para frente\n2-Andar para tras\n3-Parar\n4-Virar para direita\n5-Virar para esquerda\n6-Sair");
        menu = entrada.nextInt();
        if(menu == 1 && mig.getLinha() < sala.getQtdLinhas()){
            mig.andarFrente();
            //mig.fatorMovimento--;
        }else if(menu == 1){
            System.out.println("O robo nao pode se mover pois esta no limite "
            + "máximo de linhas do ambiente. Tente outro movimento.");
        }else if(menu == 2 && mig.getLinha() > 0){
            mig.andarTras();
            //mig.fatorMovimento--;
        }else if(menu == 2){
            System.out.println("O robo nao pode se mover pois esta no limite "
            + "mínimo de linhas do ambiente. Tente outro movimento.");
        }else if(menu == 3){
            mig.parar();
            //mig.fatorMovimento--;
        }else if(menu == 4 && mig.getColuna() < sala.getQtdColunas()){
            mig.virarDireita();
            //mig.fatorMovimento--;
        }else if(menu == 4){
            System.out.println("O robo nao pode se mover pois esta no limite "
            + "máximo de colunas do ambiente. Tente outro movimento.");
        }else if(menu == 5 && mig.getColuna() > 0){
            mig.virarEsquerda();
            //mig.fatorMovimento--;
        }else if(menu == 5){
            System.out.println("O robo nao pode se mover pois esta no limite "
            + "máximo de colunas do ambiente. Tente outro movimento.");
        }else if(menu == 6){
            //mig.fatorMovimento = 0;
        }else{
            System.out.println("Opção inválida. Escolha outra.");
        }
        }while(menu != 6 /*&& mig.fatorMovimento > 0*/);
        
            System.out.println("A posição final, atualmente, do seu robo é: "
            + "(" + mig.getLinha() + "," + mig.getColuna() + ").");
    }
}
