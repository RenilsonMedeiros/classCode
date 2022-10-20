package gameApp;

public class Inimigo {
    private String nome;
    private String fraqueza;
    private int vidas;

    public Inimigo(String nome, String fraqueza, int vidas) {
        this.nome = nome;
        this.fraqueza = fraqueza;
        this.vidas = vidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    public void levarDano() {
        this.vidas -= 1;
        if(this.vidas == 0) {
            System.out.println("Moorreeeeeu! Mas passa bem!");    
        }
    }
    
}
