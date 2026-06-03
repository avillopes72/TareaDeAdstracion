
package lop.tallerl;

public class Avion extends Vehiculo{
    // transportar
    @Override
    public String transportar(){
       return "El avion transporta productos grandes o internacionales de forma rapida por el aire."; 
    }
     // getter
    @Override
    public String getMatricula(){
        return "--";
    }

    @Override
    public float getVelocidadMax(){
        return super.velocidadMax;
    }

    @Override
    public float getTiempo(){
        return super.tiempo;
    }

    @Override
    public String getMarca(){
        return "--";
    }
    // setter
    @Override
    public void setMatricula(String matricula){
        
    }

    @Override
    public void setVelocidadMax(float velocidadMax){
        super.velocidadMax=velocidadMax;
    }

    @Override
    public void setTiempo(float tiempo){
        super.tiempo=tiempo;
    }

    @Override
    public void setMarca(String marca){
        
    }
    
}
