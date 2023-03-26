
package Logica;

public class Guardado {
    int Tinventario;
    int Tproduccion;
    int Tempaquetado;
    int Tsalida;

    public Guardado() {
    }

    public Guardado(int Tinventario, int Tproduccion, int Tempaquetado, int Tsalida) {
        this.Tinventario = Tinventario;
        this.Tproduccion = Tproduccion;
        this.Tempaquetado = Tempaquetado;
        this.Tsalida = Tsalida;
    }

    public int getTinventario() {
        return Tinventario;
    }

    public void setTinventario(int Tinventario) {
        this.Tinventario = Tinventario;
    }

    public int getTproduccion() {
        return Tproduccion;
    }

    public void setTproduccion(int Tproduccion) {
        this.Tproduccion = Tproduccion;
    }

    public int getTempaquetado() {
        return Tempaquetado;
    }

    public void setTempaquetado(int Tempaquetado) {
        this.Tempaquetado = Tempaquetado;
    }

    public int getTsalida() {
        return Tsalida;
    }

    public void setTsalida(int Tsalida) {
        this.Tsalida = Tsalida;
    }
    
}
