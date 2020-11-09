package MamiferosEOviparos;
public class Gato extends Mamifero {
  private String nomeAnimal;
  private int qntPatas = 4;

  public void construir (){
    System.out.println(getNome() + " salvando mamifero...");
  }
}
