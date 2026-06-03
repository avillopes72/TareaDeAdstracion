
package DaoImplement;

import DaoInterfaz.InterfazCarro;

public class DaoImplementCarro extends DaoVehiculo implements InterfazCarro{
    @Override
    public String transportar() {
        return "";
    }

    @Override
    public float calcularDistancia(float velocidadMax) {
        int tiempo=1;// una hora
        float resultado=velocidadMax*tiempo;
        return resultado;
    }

    @Override
    public float calcularDistancia(float velocidadMax, float tiempo) {
        float resultado=velocidadMax*tiempo;
        return resultado;
    }

    @Override
    public float calcularDistancia(float velocidadMax, float tiempo, float constante) {
        float resultado=0;
        if(constante>=0 && constante<=1){
            resultado=velocidadMax*tiempo*constante;
        
        }else{
            System.out.println("error de constante ");
        }
        return resultado;
    }
}
