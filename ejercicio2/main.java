package ejercicio2;
public class main{
    Asignacion asig = new Asignacion(0);
    Direccion dir  = new Direccion("El calle", "caba", 1, 123);
    SueldoNeto sueldo = new SueldoNeto("f","repostero", asig); 
    Empleado repostera = new Empleado("Juliana", 1234, dir, 19823, sueldo); 

    Asignacion asig2 = new Asignacion(0);
    Direccion dir2  = new Direccion("Besares", "Centroamerica", 2, 9);
    SueldoNeto sueldo2 = new SueldoNeto("m","repostero", asig2); 
    Empleado repostero = new Empleado("Javier", 1476, dir2, 95463, sueldo2); 

    Asignacion asig3 = new Asignacion(4);
    Direccion dir3 = new Direccion("Thomas A Le bretton", "jerusalem", 1,3);
    SueldoNeto sueldo3 = new SueldoNeto("m","panadero",asig3);
    Empleado mamon = new Empleado("Joaquin", 1645, dir3, 64463, sueldo3);
    
    Asignacion asig4 = new Asignacion(2);
    Direccion dir4 = new Direccion("Jeremias Leiva Joyas", "la matanza avanza", 5,5);
    SueldoNeto sueldo4 = new SueldoNeto("f","vendedor",asig4);
    Vendedor vendedora= new Vemdedor("Julieta", 6543, dir4, 25472, sueldo4);

    Asignacion asig5= new Asignacion(2);
    Direccion dir5 = new Direccion("triunvirato y olazabal", "Bahia blanca", 3,3);
    SueldoNeto sueldo5 = new SueldoNeto("m","vendedor",asig5);
    Vendedor mamon = new Empleado("Jesus", 2115, dir5, 62343, sueldo5);
    
    
}
