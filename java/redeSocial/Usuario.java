package redeSocial;

import java.util.ArrayList;
import java.util.Random;

public class Usuario {
  
  private String id;     //IDENTIFICADOR
  private String nome;
  private String cpf;
  private String email;
  private ArrayList<Usuario> amigos = new ArrayList<Usuario>();

  public Usuario(String nome, String cpf, String email) {
    this.id = this.gerarId();
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
  }

  private String gerarId() {

    Random numero = new Random();
    String id = "cod" + numero.nextInt(100);

    return id;
  }

  public void buscarAmigos() {
    System.out.println(amigos.get(0).nome);
    System.out.println(amigos.get(1).nome);
    System.out.println("Quantidade Total de amigos: " + amigos.size());
  }

  public void seguirPessoa(Usuario pessoa) {
    System.out.println("Seguindo " + pessoa.nome);
    amigos.add(pessoa);
  }

  public void bloquearPessoa(Usuario pessoa) {
    System.out.println("Usuário " + pessoa.nome + " foi bloqueado.");
    amigos.remove(pessoa);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  

  

}
