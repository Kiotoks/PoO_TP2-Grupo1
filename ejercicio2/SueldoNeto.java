package ejercicio2;

public class SueldoNeto {
    private int obraSocial = 3;
    private int jubilacion = 11;
    private Asignacion AF;
    private int presentismo = 10;
    private char genero;
    private String puesto;
    private double sueldo;
    
    public SueldoNeto(char g, String puesto){
        this.genero = g;
        this.puesto = puesto;
    }

    public int getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(int obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(int jubilacion) {
        this.jubilacion = jubilacion;
    }

    public Asignacion getAF() {
        return AF;
    }

    public void setAF(Asignacion AF) {
        this.AF = AF;
    }

    public int getPresentismo() {
        return presentismo;
    }

    public void setPresentismo(int presentismo) {
        this.presentismo = presentismo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double CalcularSueldo(String p){
        p = puesto;
        if(puesto.equals("Panadero")){
            sueldo = 98000;
        }
        if(puesto.equals("Repostero")){
            sueldo = 110000;
        }
        if(puesto.equals("Vendedor")){
            sueldo = 70000;
        }
        
        sueldo -= sueldo*obraSocial/100;
        sueldo -= sueldo*jubilacion/100;
        sueldo += sueldo*presentismo/100;
        sueldo += sueldo*AF.calcularAsignacion()/100;
        
        return sueldo;
    }
    
    public double PlusReposHom(){
        String gen = String.valueOf(genero);
        if(puesto.equals("Repostero") && gen.equals("H")){
            sueldo += sueldo*10/100;
        }
        return sueldo;
    }
}
