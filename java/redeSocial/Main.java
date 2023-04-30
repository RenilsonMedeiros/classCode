package redeSocial;

public class Main {
  public static void main(String[] args) {
    Usuario nils = new Usuario("Renilson", "123", "nils@gmail.com");
    Usuario reni = new Usuario("Reeni", "888", "reni@hotmail.com");
    Usuario leticia = new Usuario("Leticia", "777", "lety@hotmail.com");
    Usuario jonas = new Usuario("Jonas", "666", "jonas@hotmail.com");

    Video v1 = new Video("94029", nils, "26/10/2022", "www.minhaimagem.com", "São Paulo", "Passeando no zoológico");

    v1.mostrarPublicacao();
    
    nils.seguirPessoa(reni); //nils seguindo reni
    nils.seguirPessoa(leticia); //nils seguindo lety
    nils.seguirPessoa(jonas); //nils seguindo jonas
    nils.buscarAmigos();


    
  }
}
