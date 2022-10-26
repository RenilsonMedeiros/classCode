package redeSocial;

public abstract class Publicacao {

  private String id;
  private Usuario autor;
  private String data;

  public Publicacao(String id, Usuario autor, String data) {
    this.id = id;
    this.autor = autor;
    this.data = data;
  }



  public void mostrarPublicacao() {
    System.out.println("Publicação do autor " + this.autor.getNome() + " e Id:" + this.id);
  }
  
}