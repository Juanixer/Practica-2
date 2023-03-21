package dominio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * Esta clase es responsable de leer el tablero de un
 * fichero en forma de ceros y unos, ir transitando de
 * estados e ir mostrando dichos estados.
 */
public class Tablero{
    private static int DIMENSION = 30;
    private int[][] estadoActual; //matriz que representa el estado actual.
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION]; // Matriz que representa el estado siguiente.

/********************************************************
 * Lee el estado inicial de un fichero llamado ‘matriz‘.
 ********************************************************/

public void leerEstadoActual() throws FileNotFoundException {
//leer estado actual
int[][] estadoActual = new int[DIMENSION][DIMENSION];
    int i = 0;
    int j = 0;

        File file = new File("matriz.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (int k = 0; k < line.length(); k++) {
                estadoActual[i][j] = Integer.parseInt(String.valueOf(line.charAt(k)));
                j++;
            }
            i++;
            j = 0;

        sc.close();}

    this.estadoActual = estadoActual;
    this.estadoSiguiente = estadoActual;

}
// La secuencia de ceros y unos del fichero es guardada en ‘estadoActual‘ y, utilizando las reglas del juego
// de la vida, se insertan los ceros y unos correspondientes en ‘estadoSiguiente‘.

    /********************************************************
     * Genera un estado inicial aleatorio. Para cada celda
     * genera un número aleatorio en el intervalo [0, 1). Si
     * el número es menor que 0,5, entonces la celda está
     * inicialmente viva. En caso contrario, está muerta.
     *******************************************************/

    public void generarEstadoActualPorMontecarlo(){
    //generar estado actual por montecarlo
    int[][] estadoActual = new int[DIMENSION][DIMENSION];
    int i = 0;
    int j = 0;
    Random random = new Random();
    for (i = 0; i < DIMENSION; i++) {
        for (j = 0; j < DIMENSION; j++) {
            estadoActual[i][j] = random.nextInt(2);
        }



    }
// La secuencia de ceros y unos generada es guardada en ‘estadoActual‘ y, utilizando las reglas del juego
// de la vida, se insertan los ceros y unos correspondientes en ‘estadoSiguiente‘.

    /********************************************************
     * Transita al estado siguiente según las reglas del
     * juego de la vida.
     ********************************************************/

    public void transitarAlEstadoSiguiente(){}
// La variable ‘estadoActual‘ pasa a tener el contenido de ‘estadoSiguiente‘ y, éste útimo atributo pasar a
// reflejar el siguiente estado.

    /*******************************************************
     * Devuelve, en modo texto, el estado actual.
     * @return el estado actual.
     *******************************************************/

    @Override
    public String toString(){
        return ""; // Esta línea hay que modificarla.
    }
}