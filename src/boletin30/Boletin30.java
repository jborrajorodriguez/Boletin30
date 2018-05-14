
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author Juan Borrajo Rodriguez
 */
public class Boletin30 {

    
    public static void main(String[] args) {
       ArrayList <SeleccionFutbol> sfut=new ArrayList();
       sfut.add(new Futbolista(10,"Delantero",01,23,"Juan","Borrajo"));
       sfut.add(new Entrenador(001,02,50,"Pepe","Rodriguez"));
       sfut.add(new Masajista("Masajista",15,03,25,"Carlos","Castro"));
       sfut.add(new Seleccionador(04,54,"Osacar","lopez"));
       
       sfut.stream().forEach(sf->System.out.println(sf));
        
    }

}
