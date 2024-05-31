package EstadoState;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private int edad;
    private String nombre;
    private List<Carta> mazo;
    private List<Carta> mano;
    private List<Carta> cartasEnDescarte;
    private int puntosVida;
    private Personaje personaje;



    public void atacar(){

    }

    public void defender(){

    }

    public void curar(){

    }

    public void tomarCarta(){

    }

    public void usarCarta(){

    }





    /*atributo privado que representara el estado de nuestro jugador */
    private Estado estado;


    /*metodo que nos ayudara con el cambio de estado de nustro jugador */
    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }

    /*metodo que invoca el metodo ejecu actual
    * nos permitira realizar una accion especifica segun su estado */
    public void realizarAccion() {
        this.estado.ejecutarAccion(this);
    }
}
