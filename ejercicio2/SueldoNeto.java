public class SueldoNeto {
    private int obraSocial = 3;
    private int jubilacion = 11;
    private Asignacion asignacion;
    private int presentismo = 10;
    private char genero;
    private String puesto;
    private double sueldoBasico;
    private int sueldo;
    
    public SueldoNeto(char g, String puesto, Asignacion a){
        this.genero = g;
        this.puesto = puesto;
        this.asignacion = a;
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

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
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

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public double CalcularSueldo(){
        if(puesto.equals("panadero")){
            sueldo = 98000;
        }
        if(puesto.equals("repostero")){
            sueldo = 110000;
        }
        if(puesto.equals("vendedor")){
            sueldo = 70000;
        }
        
        sueldo -= 3*sueldo/100;
        sueldo -= 11*sueldo/100;
        sueldo += 10*sueldo/100;
        sueldo += asignacion;
        
        return sueldo;
    }
    public double PlusReposHorn(){
        return 0;
    }
    public void mostrarSueldo(){
        System.out.println(sueldoBasico);
    }
     
}
