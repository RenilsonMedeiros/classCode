package redeSocial;

public class Video extends Publicacao {
  private String link;
  private String local;
  private String descricao;

  public Video(String id, Usuario autor, String data, String link, String local, String descricao) {
    super(id, autor, data);
    this.link = link;
    this.local = local;
    this.descricao = descricao;
  }
  
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }
  public String getLocal() {
    return local;
  }
  public void setLocal(String local) {
    this.local = local;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
}
