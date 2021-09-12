public class TestFecha
{
  public static void main(String []args){
    Fecha fechaNacimientoJuan = new Fecha(2011, Fecha.JULIO, 10);
    Fecha fechaIngresoJuan = new Fecha(2018, Fecha.AGOSTO, 25);
    
    Fecha fechaNacimientoMaria = new Fecha(2012, Fecha.ENERO, 10);
    Fecha fechaIngresoMaria = new Fecha(2017, Fecha.NOVIEMBRE, 15);
    
    Fecha fechaActual = new Fecha();
        
    System.out.println("Hoy es: " + fechaActual.format("dd/mm/yyyy")); 
    
    System.out.println("Juan nació el: " + fechaNacimientoJuan.format("dd/mm/yyyy") + ", hace " + fechaNacimientoJuan.tiempoTrascurridoEnAnios(fechaActual) + " años");
    
    System.out.println("Maria nació el: " + fechaNacimientoMaria.format("dd/mm/yyyy") + ", hace " + fechaNacimientoMaria.tiempoTrascurridoEnAnios(fechaActual) + " años");
    
    if(fechaNacimientoJuan.esDespues(fechaNacimientoMaria)){
       System.out.println("Juan nació " + fechaNacimientoJuan.tiempoTrascurridoEnDias(fechaNacimientoMaria) +  " dias después de Maria");
    } else {
       System.out.println("Juan nació " + fechaNacimientoJuan.tiempoTrascurridoEnDias(fechaNacimientoMaria) +  " dias antes de Maria");
    }
    
    if(fechaIngresoMaria.esAntes(fechaIngresoJuan)){
       System.out.println("Maria ingresó " + fechaNacimientoJuan.tiempoTrascurridoEnDias(fechaNacimientoMaria) +  " días antes que Juan");
    } else {
       System.out.println("Maria ingresó " + fechaNacimientoJuan.tiempoTrascurridoEnDias(fechaNacimientoMaria) +  " días después que Juan");
    }
     
    System.out.println("Desde que ingresó Juan en " + fechaIngresoJuan.format("yyyy-mm-dd") + " han pasado " + fechaActual.tiempoTrascurridoEnAnios(fechaIngresoJuan) + " años");
    System.out.println("Desde que ingresó Maria en " + fechaIngresoMaria.format("yyyy-mm-dd") + " han pasado " + fechaActual.tiempoTrascurridoEnAnios(fechaNacimientoMaria) + " años");
    
  }
}