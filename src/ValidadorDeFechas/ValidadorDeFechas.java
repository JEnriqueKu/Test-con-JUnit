package ValidadorDeFechas;

public class ValidadorDeFechas {

    public boolean ValidadorDeFecha(int anio, int mes, int dia){
        boolean valido=true;
        if (mes>12||mes<0) return false;
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            if (dia>31||dia<0) return false;
        } else if (mes==2) {
            if (anio%4==0 && anio%100!=0){
                if (dia>29||dia<0) return false;
            } else if (dia>28||dia<0) return false;
        } else {
            if (dia>30||dia<0) return false;
        }

        return valido;
    }

}
