package JuegoDadosTests;

public class Dados {

    private int valor;

    public Dados() {
        this.nuevoValor();
    }

    public int getValor() {
        return valor;
    }

    public void nuevoValor() {
        valor = (int)(Math.random()*6 +1);
    }
}