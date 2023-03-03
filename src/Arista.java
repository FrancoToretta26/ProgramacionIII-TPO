public class Arista<T> {
    private T origen;
    private T destino;
    private int rotulo;

    public Arista(T origen, T destino, int rotulo) {
        this.origen = origen;
        this.destino = destino;
        this.rotulo = rotulo;
    }

    public T getOrigen() {
        return origen;
    }

    public void setOrigen(T origen) {
        this.origen = origen;
    }

    public T getDestino() {
        return destino;
    }

    public void setDestino(T destino) {
        this.destino = destino;
    }

    public int getRotulo() {
        return rotulo;
    }

    public void setRotulo(int rotulo) {
        this.rotulo = rotulo;
    }
}