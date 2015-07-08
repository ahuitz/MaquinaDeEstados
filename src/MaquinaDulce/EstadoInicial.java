
package MaquinaDulce;


public class EstadoInicial implements Estado {
    
    private MaquinaDulce m;
   
    public EstadoInicial(MaquinaDulce m){
        this.m=m;        
    }
    
    
  @Override
  public void cambioEstado() {
      m.getMoneda();
      m.estados.add(new GiroInicial(m));
      //m.setEstados(GiroInicial);
      System.out.println("Estado 1");
  }

    

}