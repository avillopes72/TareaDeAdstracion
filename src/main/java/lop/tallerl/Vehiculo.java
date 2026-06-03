
package lop.tallerl;


public abstract class Vehiculo {
    private String matricula;
    protected float velocidadMax;
    protected float tiempo;
    private String marca;
   // transportar
    public abstract String transportar();
    // getter
    public abstract String getMatricula();

    public abstract float getVelocidadMax();

    public abstract float getTiempo();

    public abstract String getMarca(); 
    // setter

    public abstract void setMatricula(String matricula) ;

    public abstract void setVelocidadMax(float velocidadMax);

    public abstract void setTiempo(float tiempo) ;

    public abstract void setMarca(String marca) ;
    
    
}
