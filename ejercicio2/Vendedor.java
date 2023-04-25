package ejercicio2;

public class Vendedor extends Empleado{
    private int cantVentas;
    
    public Vendedor(String n, int c, Direccion d, int t, SueldoNeto s, int cant){
        super(n, c, d, t, s);
        this.cantVentas = cant;
    }

    public double getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cant) {
        this.cantVentas = cant;
    }

    public double comision(){
        
    }
}
