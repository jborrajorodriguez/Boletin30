package boletin30;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int añosExperiencia;

    public Masajista(String titulacion, int añosExperiencia) {
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public Masajista(String titulacion, int añosExperiencia, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()+"Masajista{" + "titulacion=" + titulacion + ", a\u00f1osExperiencia=" + añosExperiencia + '}';
    }
    
    public void darMasaje(){
        System.out.println("Dar masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("Masajista concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("Masajista de viaje");
    }

    @Override
    public void entrenar() {
        System.out.println("Masajista no entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Masajista no juega");
    }

}
