package gameApp;

public class Personagem {
    
    private String poder;
    private String vestuario;
    private String arma;
    private boolean vivo;
    private int vidas;

    public Personagem(String poder, String vestuario, String arma, boolean vivo, int vidas) {
        this.poder = poder;
        this.vestuario = vestuario;
        this.arma = arma;
        this.vivo = vivo;
        this.vidas = vidas;
    }

    public String getPoder() {
        return poder;
    }

    public String getVestuario() {
        return vestuario;
    }

    public String getArma() {
        return arma;
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getVidas() {
        return vidas;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setVestuario(String vestuario) {
        this.vestuario = vestuario;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    public void andar() {
        if(this.isVivo()) {
            System.out.println("Personagem andando...");
        } else {
            System.out.println("Personagem está morto.");
        }
        
    }
    
    public void pular() {
        if(this.isVivo()) {
            System.out.println("Personagem pulando...");
            if(this.vestuario == "roupaVoar"){
                System.out.println("Personagem voando...");
            }
        } else {
            System.out.println("Personagem está morto.");
        }
    }
    
    public void atirar(int balas, Inimigo alvo) {
        System.out.println("Atirando " + balas + " balas no " + alvo.getNome());
        alvo.levarDano();
    }
    
    public void lancarPoder() {
        System.out.println("Lançando poder... AHHHHHHHHHHH!");
    }
}
