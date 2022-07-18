package TesteParalelo;

import io.cucumber.java.pt.Quando;

public class StepDefinitions {
  @Quando("teste um")
  public void teste_um() {
    System.out.println("teste1");
    try{
      Thread.sleep(20000);
    }catch(InterruptedException e){
      System.out.println(e);
    }
  }

  @Quando("teste dois")
  public void teste_dois() {
    System.out.println("teste2");
    try{
      Thread.sleep(10000);
    }catch(InterruptedException e){
      System.out.println(e);
    }
  }

  @Quando("teste tres")
  public void teste_tres() {
    System.out.println("teste3");
    try{
      Thread.sleep(15000);
    }catch(InterruptedException e){
      System.out.println(e);
    }
  }
}
