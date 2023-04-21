package ejercicio2;

public class Empleado {
    private String nombre;
    private int cuit;
    private Direccion direccion;
    private int telefono;
    private SueldoNeto sueldo;
    
    public Empleado(String n, int c, Direccion d, int t, SueldoNeto s){
        this.nombre = n;
        this.cuit = c;
        this.direccion = d;
        this.telefono = t;
        this.sueldo = s;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public SueldoNeto getSueldo() {
        return sueldo;
    }

    public void setSueldo(SueldoNeto sueldo) {
        this.sueldo = sueldo;
    }
    
    public void MostrarDatos(){
        System.out.println("El nombre del empleado es: "+nombre+" CUIT: "+cuit+", "
        + "la direccion: "+direccion+" el telefono: "+telefono+" y su sueldo: "+sueldo);
    }
}
