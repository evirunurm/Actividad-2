/**
 *  Abtracción de un Jugador al Piedra, Papel o Tijera.
 */

package ende;

class Jugador {
    public static final String PIEDRA = "piedra";
    public static final String PAPEL = "papel";
    public static final String TIJERAS = "tijeras";
    int éxitos;      // número de partidas ganadas
    int winTotal;

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar() {
        String opcion="";
        Integer num = (int)(Math.random()*3);
        switch(num){
            case 0:
                opcion= PIEDRA;
                break;
            case 1:
                opcion= PAPEL;
                break;
            case 2:
                opcion= TIJERAS;
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

