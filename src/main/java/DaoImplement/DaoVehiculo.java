package DaoImplement;

public abstract class DaoVehiculo {

    public abstract String transportar();

    public abstract float calcularDistancia(float velocidadMax);

    public abstract float calcularDistancia(float velocidadMax, float tiempo);

    public abstract float calcularDistancia(float velocidadMax, float tiempo, float constante);
}
