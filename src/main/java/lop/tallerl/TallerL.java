package lop.tallerl;

import DaoImplement.DaoImplementAvion;
import DaoImplement.DaoImplementCarro;
import DaoImplement.DaoImplementMoto;
import DaoImplement.DaoVehiculo;

public class TallerL {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Avion();
        Vehiculo vehiculo2 = new Carro();
        Vehiculo vehiculo3 = new Moto();
        Vehiculo[] vehiculoList=new Vehiculo[3];
        vehiculoList[0]=vehiculo1;
        vehiculoList[1]=vehiculo2;
        vehiculoList[2]=vehiculo3;
        
        
        // velocida maxima
        vehiculoList[0].setVelocidadMax(38);
        vehiculoList[1].setVelocidadMax(56);
        vehiculoList[2].setVelocidadMax(25);
        //tiempo
        vehiculoList[0].setTiempo(2);
        vehiculoList[1].setTiempo(2);
        vehiculoList[2].setTiempo(2);
        //constante
        float constante[]=new float[3];
        constante[0]=0.4f;
        constante[1]=0.6f;
        constante[2]=0.8f;
        // objet de velocidad
        DaoVehiculo velodida1=new DaoImplementAvion();
        DaoVehiculo velodida2=new DaoImplementCarro();
        DaoVehiculo velodida3=new DaoImplementMoto();
        DaoVehiculo [] velocidades=new DaoVehiculo[3];
        velocidades[0]=velodida1;
        velocidades[1]=velodida2;
        velocidades[2]=velodida3;
        for (int i = 0; i < vehiculoList.length; i++) {
             System.out.println("Vehiculo de transporte: "+vehiculoList[i].transportar());
            System.out.println("Velocidades Tiempo 1h: "+velocidades[i].calcularDistancia(vehiculoList[i].getVelocidadMax())+" km/h");
            System.out.println("Velocidades por tiempo: "+velocidades[i].calcularDistancia(vehiculoList[i].getVelocidadMax(),vehiculoList[i].getTiempo())+"km*h");
            System.out.println("Velocidades por constantes: "+velocidades[i].calcularDistancia(vehiculoList[i].getVelocidadMax(),vehiculoList[i].getTiempo(),constante[i])+"km/h");
        }
        
        
    }
}
