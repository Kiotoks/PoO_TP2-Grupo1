package direccion;

public class ReciboHaberes {
    private Empleado empleado;

    public ReciboHaberes(Empleado e){
        this.empleado = e;
    }

    public void setEmpleado(Empleado e){
        this.empleado = e;
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public void mostrarRecibo(){
        empleado.MostrarDatos();
    }
}
