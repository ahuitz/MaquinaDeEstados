package MaquinaDulce;
import MaquinaDulce.EstadoInicial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class MaquinaDulce {
    
    private int estado;
    private boolean moneda=false;
    public List<Estado> estados;
    public Estado es;
    
    //public Vector  myEstado;

    
    public MaquinaDulce(boolean moneda) {
        this.moneda=moneda;       
      
    }    
    
    public void procesar() {    
        estados.add(new EstadoInicial(null));
    }
    
    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
    
    
    public boolean getMoneda() {
        return true;
    }
    

}