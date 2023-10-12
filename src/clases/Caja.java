package clases;

public class Caja {
    /* Atributos */
    int ancho;
    int alto;
    int profundo;

    /* Constructor vacío */
    public Caja(){
    }
    /* Constructor con tres argumentos (ancho, alto, profundo) */
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    /* Método Calcular Volumen */
    public int calculaVolumen(){
        return this.ancho * this.alto * this.profundo;
    }


}
