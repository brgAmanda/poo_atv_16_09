package MamiferosEOviparos;
public class Cachorro extends Mamifero {
  private String nomeAnimal;
  private int qntPatas = 4;

  public void construir (){
    System.out.println(getNome() + " salvando mamifero...");
  }
}
