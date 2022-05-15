/**
 *  Abtracción de un Jugador al Piedra, Papel o Tijera.
 */

package ende;

class Jugador {
    int éxitos;      // número de partidas ganadas
    int winTotal;

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar()
    {
        String opcion="";
        Integer num = (int)(Math.random()*3);
        switch(num){
            case 0:
                opcion=("piedra");
                break;
            case 1:
                opcion=("papel");
                break;
            case 2:
                opcion=("tijeras");
        }
        return opcion;
    }

    public void setÉxitos() {
        éxitos++;
    }
    public int getÉxitos() {
        return(éxitos);
    }

}

