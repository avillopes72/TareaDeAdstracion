package lop.tallerl;

public class Carro extends Vehiculo {

    // transportar
    @Override
    public String transportar() {
        return "El carro transporta productos por cada carretera de forma eficiente.";
    }
    // getter

    @Override
    public String getMatricula() {
        return "--";
    }

    @Override
    public float getVelocidadMax() {
        return super.velocidadMax;
    }

    @Override
    public String getMarca() {
        return "--";
    }

    // setter
    @Override
    public void setMatricula(String matricula) {

    }

    @Override
    public void setVelocidadMax(float velocidadMax) {
        super.velocidadMax = velocidadMax;
    }

    @Override
    public void setMarca(String marca) {

    }
}
