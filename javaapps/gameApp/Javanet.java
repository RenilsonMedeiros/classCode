package netcom.javanet;

public class Javanet {

    public static void main(String[] args) {
        Personagem spider = new Personagem("lançar teia", "sp1", "tecTeia", true, 3);
        Inimigo venom = new Inimigo("Venon", "som", 3);
        
        System.out.println("Informações do personagem Spider: ");
        System.out.println("Arma: " + spider.getArma());
        System.out.println("Poder: " + spider.getPoder());
        
        spider.andar();
        
        spider.setVestuario("roupaVoar");
        
        spider.pular();
        
        System.out.println("----------");
        
        spider.atirar(10, venom);
    }
}
