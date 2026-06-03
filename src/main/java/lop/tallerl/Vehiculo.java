
package lop.tallerl;


public abstract class Vehiculo {
    private String matricula;
    protected float velocidadMax;    
    private String marca;
   // transportar
    public abstract String transportar();
    // getter
    public abstract String getMatricula();

    public abstract float getVelocidadMax();

    public abstract String getMarca(); 
    // setter

    public abstract void setMatricula(String matricula) ;

    public abstract void setVelocidadMax(float velocidadMax);    

    public abstract void setMarca(String marca) ;
    
    
}
