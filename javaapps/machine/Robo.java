package machine;

import java.util.Scanner;

public class Robo extends Maquinas {

  Scanner leia = new Scanner(System.in);
  
  public void dancar() {

  }

  @Override
  public void locomover() {

  }

  @Override
  public void mandarSinal() {
    System.out.println("Informe sua mensagem: ");
    String mensagem = leia.nextLine();

    System.out.println("Robô falando: " + mensagem);
  }

}
