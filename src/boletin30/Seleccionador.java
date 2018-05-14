package boletin30;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
    }
    
    
    public void selecionXogador(){
        System.out.println("Seleccionar Xogador");
    }
    @Override
    public void concentrarse() {
        System.out.println("Seleccionador concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("Seleccionador de viaje");
    }

    @Override
    public void entrenar() {
        System.out.println("Seleccionador entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Seleccionador no juega");
    }
    

}
