public class SueldoNeto {
    private int obraSocial = 3;
    private int jubilacion = 11;
    private Asignacion asignacion;
    private int presentismo = 10;
    private char genero;
    private String puesto;
    private double sueldoBasico;
    
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
            sueldoBasico = 98000;
        }
        if(puesto.equals("repostero")){
            sueldoBasico = 110000;
            PlusReposHom();
        }
        if(puesto.equals("vendedor")){
            sueldoBasico = 70000;
        }
        
        sueldoBasico -= 3*sueldoBasico/100;
        sueldoBasico -= 11*sueldoBasico/100;
        sueldoBasico += 10*sueldoBasico/100;
        sueldoBasico += asignacion;
        
        return sueldoBasico;
    }
    public double PlusReposHom(){
        double plus = 0;
        String gen = String.valueOf(genero);
        if(gen.equals("m")){
            plus += sueldoBasico*10/100;
        }
        else{
            plus = 0;
        }
        
        return plus;
    }
    public void mostrarSueldo(){
        System.out.println("El sueldo es: "+sueldoBasico);
    }
     
}
