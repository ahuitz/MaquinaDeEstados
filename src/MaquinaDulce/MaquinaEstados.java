/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaDulce;

import java.util.List;

/**
 *
 * @author Rosario
 */
public class MaquinaEstados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
            MaquinaDulce maq=new MaquinaDulce(true);
            Estado est=new EstadoInicial(maq);
            //maq.setEstados();
            maq.procesar();
        }catch(Exception e){
           e.printStackTrace();
        }
        /*est=new EstadoInicial(null);
        maq.setEstados((List<Estado>) est);
        maq.procesar();*/
        /*MaquinaDulce dulces=new MaquinaDulce(true);
        dulces.procesar();
        dulces.setEstados(null);*/
    }
    
}
