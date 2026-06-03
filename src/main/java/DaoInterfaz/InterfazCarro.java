
package DaoInterfaz;

public interface InterfazCarro {
    public String transportar();

    public float calcularDistancia(float velocidadMax);

    public float calcularDistancia(float velocidadMax, float tiempo);

    public float calcularDistancia(float velocidadMax, float tiempo, float constante) ;
}
