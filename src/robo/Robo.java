package robo;

public class Robo {
    private int linha, coluna;
    private Ambiente sala;
    /*Constante inteira para criar um fator de movimento
    int fatorMovimento;*/
    
    public void Robo(int linha, int coluna,int fatorMovimento, Ambiente sala){
        this.linha = linha;
        this.coluna = coluna;
        this.sala = sala;
        //this.fatorMovimento = fatorMovimento;
    }
    /*Getter e Setter para uso do fator de movimento. Caso o valor deva
    ser fixo, usasse o setFatorMovimento com sua constante definida. Ou
    declarasse como final = 2.*/
    /*public int getFatorMovimento() {
        return fatorMovimento;
    }
    public void setFatorMovimento(int fatorMovimento) {
        this.fatorMovimento = fatorMovimento;
    }*/
    
    public void setLinha(int linha) {
        this.linha = linha;
    }
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    public int getLinha() {
        return linha;
    }
    public int getColuna() {
        return coluna;
    }
    public void mostrarPosicao(){
        System.out.println("O robo está na posição: " + linha + "," + coluna);
    }    
    public void andarFrente(){
        /*if(linha < sala.getQtdLinhas()){*/
            linha = linha + 1;
            System.out.println("[Robo]: Andando para frente");
        /*}else
            System.out.println("O robo nao pode se mover pois esta no limite "
            + "máximo de linhas do ambiente. Tente outro movimento.");*/
    }
    public void andarTras(){
        /*if(this.linha > 0){*/
            this.linha = linha - 1;
            System.out.println("[Robo]: Andando para tras");
        /*}else
            System.out.println("O robo nao pode se mover pois esta no limite "
            + "mínimo de linhas do ambiente. Tente outro movimento.");*/
    }
    public void parar(){
        System.out.println("O robo não se moveu.");
    }
    public void virarDireita(){
        /*if(this.coluna < sala.getQtdColunas()){*/
            this.coluna = coluna + 1;
            System.out.println("[Robo]: Virando para direita");
        /*}else
            System.out.println("O robo nao pode se mover pois esta no limite "
            + "máximo de colunas do ambiente. Tente outro movimento.");*/
    }
    public void virarEsquerda(){
        /*if(this.coluna > 0){*/
            this.coluna = coluna - 1;
            System.out.println("[Robo]: Virando para esquerda");
        /*}else
            System.out.println("O robo nao pode se mover pois esta no limite "
            + "máximo de colunas do ambiente. Tente outro movimento.");*/
    }
}
