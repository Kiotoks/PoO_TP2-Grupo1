package ejercicio2;

public class ReciboHaberes {
    private Empleado empleado;
    private SueldoNeto sueldo;
    
    public ReciboHaberes(Empleado e, SueldoNeto s){
        this.empleado = e;
        this.sueldo = s;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public SueldoNeto getSueldo() {
        return sueldo;
    }

    public void setSueldo(SueldoNeto sueldo) {
        this.sueldo = sueldo;
    }
    
    public void MostrarRecibo(){
        System.out.println("El empleado "+empleado+" cobró "+sueldo);
    }
    
}
