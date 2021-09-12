public class Fecha {

    public static final int JULIO = 7;
    public static final int AGOSTO = 8;
    public static final int ENERO = 1;
    public static final int NOVIEMBRE = 10;

    private int anio;
    private int mes;
    private int dia;

    public Fecha(){
        anio = 2021;
        mes = 9;
        dia = 11;
    }


    public Fecha(int anio,int mes, int dia){
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public Boolean esAntes(Fecha fecha){

        if(this.anio <= fecha.anio)
        {
            if(this.mes <= fecha.mes)
            {
                if(this.dia < fecha.dia)
                {
                    return false;
                }
            }
        }
        return true;

    }

    public Boolean esDespues(Fecha fecha){
        if(this.anio >= fecha.anio)
        {
            if(this.mes >= fecha.mes)
            {
                if(this.dia > fecha.dia)
                {
                    return true;
                }
            }
        }
        return false;

    }

    public Boolean esMismoDia(Fecha fecha){
        if(this.anio == fecha.anio)
        {
            if(this.mes == fecha.mes)
            {
                if(this.dia == fecha.dia)
                {
                    return true;
                }
            }
        }
        return false;

    }

    public void avanzaDias(int dias){
        this.dia += dias;
    }

    public void retrocedeDias(int dias){
        this.dia -= dias;

    }

    public int tiempoTrascurridoEnDias(Fecha fecha){
        int aux;
        int dia = fecha.dia;
        int mes = fecha.mes*30;
        int anio = fecha.anio*365;

        aux = dia + mes + anio - this.dia - (this.mes * 30) - (this.anio * 365);

        return(aux);
    }

    public int tiempoTrascurridoEnAnios(Fecha fecha){
        int aux;
        int anio = fecha.anio;

        aux = anio - this.anio;

        return(aux);
    }

    public String format(String formatString) {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }

}

