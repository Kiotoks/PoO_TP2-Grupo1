/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package direccion;

/**
 *
 * @author ET36
 */
public class Direccion {
    private String calle;
    private int piso;
    private int numero;
    private String localidad;
    
    public Direccion(String c, int p, int n, String l){
        this.calle = c;
        this.piso = p;
        this.numero = n;
        this.localidad = l;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String DatosDire(){
      
        String datos = "La localidad es: "+ localidad +"la calle es: "+calle+"el piso es el: " +piso+ "el numero es: "+numero;
        return datos;
    }
}
