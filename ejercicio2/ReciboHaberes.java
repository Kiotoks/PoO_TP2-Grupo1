package direccion;

public class ReciboHaberes {
    private Empleado empleado;

    public ReciboHaberes(Empleado e){
        this.empleado = e;
    }



    public void mostrarRecibo(){
        empleado.MostrarDatos();
    }
}
