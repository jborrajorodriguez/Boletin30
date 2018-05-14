package boletin30;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
    
    
    public void entrevista(){
        System.out.println("Entrevista");
    }

    @Override
    public void concentrarse() {
        System.out.println("Futbolista concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("Futbolista de viaje");
    }

    @Override
    public void entrenar() {
        System.out.println("Jugador no entrena partido");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugador juega partido");
    }
    
    
    

}
