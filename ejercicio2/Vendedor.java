package ejercicio2;

public class Vendedor extends Empleado{
    private double ingresosVentas;
    
    public Vendedor(String n, int c, Direccion d, int t, SueldoNeto s, double i){
        super(n, c, d, t, s);
        this.ingresosVentas = i;
    }

    public double getIngresosVentas() {
        return ingresosVentas;
    }

    public void setIngresosVentas(double ingresosVentas) {
        this.ingresosVentas = ingresosVentas;
    }

}
