package robo;

public class Principal {
    public static void main(String[] args) {
        TestarRobo t = new TestarRobo();
        t.definirAmbiente();
        t.iniciarRobo();
        t.menu();
    }
}