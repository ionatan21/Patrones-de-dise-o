
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterUsuario;

import Adapter.RoundHoles;
//import Adapter.RoundPeg;
import Adapter.SquarePeg;
import Adapter.SquarePegAdapter;


/**
 *
 * @author Isaac GL
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RoundHoles hole = new RoundHoles (5); 
       // RoundPeg rpeg = new RoundPeg (5); 
        
       // if (hole.fits(rpeg)) {
        //    System.out.println("La pieza redonda r5 encaja en el orificio redondo r5");
       // }
        
        SquarePeg smallSqPeg = new SquarePeg (2); 
        SquarePeg largeSqPeg = new SquarePeg (20); 
        
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter (smallSqPeg);
         SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter (largeSqPeg);
         if (hole.fits(smallSqPegAdapter)){
             System.out.println("La pieza cuadrada w20 encaja en el orificio redondo r5");
         }else if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("La pieza cuadrada w20 no encaja en el oricifio redondo r5");
        }
        
        
    }
    
}
