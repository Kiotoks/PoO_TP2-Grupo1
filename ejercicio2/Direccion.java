package ejercicio2;

public class Direccion {
    private String calle;
    private String localidad;
    private int piso;
    private int numero;
    
    public Direccion(String c, String l, int p, int n){
        this.calle = c;
        this.localidad = l;
        this.piso = p;
        this.numero = n;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String datosDire(){
        String datos = ("La calle donde vive es: "+calle + " en la localidad de "+localidad+ " en el piso " +piso + " en el numero "+numero);
        return datos;
    }
}
