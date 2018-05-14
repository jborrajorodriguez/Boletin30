package boletin30;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Entrenador extends SeleccionFutbol {
    private int idFederacion;
     public void planificarEntrenamiento(){
         System.out.println("Entrenamiento planificado");
     }

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
     
     

    @Override
    public void concentrarse() {
      System.out.println("Entrenador concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("Entrenador de viaje");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenador entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Entrenador no juega");
    }

}
