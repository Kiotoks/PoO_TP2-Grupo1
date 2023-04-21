
public class Asignacion {
    private int cantHijos;
    private int asignacionFamiliar = 11465;
    
    public Asignacion(int c, int a){
        this.cantHijos = c;
        this.asignacionFamiliar = a;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int CantHijos) {
        this.cantHijos = CantHijos;
    }

    public int getAsignacionFamiliar() {
        return asignacionFamiliar;
    }

    public void setAsignacionFamiliar(int AsignacionFamiliar) {
        this.asignacionFamiliar = AsignacionFamiliar;
    }
    public double CalcularAsignacion(){
        asignacionFamiliar = asignacionFamiliar * cantHijos;
        
        return asignacionFamiliar;
    }
}
