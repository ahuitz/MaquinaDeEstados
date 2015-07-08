package MaquinaDulce;

public class GiroInicial implements Estado {
    private MaquinaDulce m;

    public GiroInicial(MaquinaDulce m){
        this.m=m;
    }
    
  @Override
  public void cambioEstado() {
      m.getMoneda();
      System.out.println("Estado 2");
  }

}