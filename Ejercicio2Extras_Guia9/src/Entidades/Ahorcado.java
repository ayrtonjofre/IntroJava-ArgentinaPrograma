/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, la cantidad de 
letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
 */
package Entidades;

public class Ahorcado {

    private String[] vector;
    private int encontradas = 0;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] vector, int encontradas, int intentos) {
        this.vector = vector;
        this.encontradas = encontradas;
        this.intentos = intentos;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradita) {
        this.encontradas = encontradas + encontradita;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}
