package ejercicio2;

public class Asignacion {
    private int cantHijos;
    private int AsignacionFamiliar = 11465;
    
    public Asignacion(int c, int a){
        this.cantHijos = c;
        this.AsignacionFamiliar = a;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public int getAsignacionFamiliar() {
        return AsignacionFamiliar;
    }

    public void setAsignacionFamiliar(int AsignacionFamiliar) {
        this.AsignacionFamiliar = AsignacionFamiliar;
    }
    
    public double calcularAsignacion(){
        int asignacion = AsignacionFamiliar*cantHijos;
        return asignacion;
    }
    
}
