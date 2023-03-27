
package Logica;

public class Guardado {
    int Tinventario;
    int Tproduccion;
    int Tempaquetado;
    int Tsalida;
    int Cinventario;
    int Cproduccion;
    int Cempaquetado;
    int Csalida;

    public Guardado() {
    }

    public Guardado(int Tinventario, int Tproduccion, int Tempaquetado, int Tsalida, int Cinventario, int Cproduccion, int Cempaquetado, int Csalida) {
        this.Tinventario = Tinventario;
        this.Tproduccion = Tproduccion;
        this.Tempaquetado = Tempaquetado;
        this.Tsalida = Tsalida;
        this.Cinventario = Cinventario;
        this.Cproduccion = Cproduccion;
        this.Cempaquetado = Cempaquetado;
        this.Csalida = Csalida;
    }

    public int getCinventario() {
        return Cinventario;
    }

    public void setCinventario(int Cinventario) {
        this.Cinventario = Cinventario;
    }

    public int getCproduccion() {
        return Cproduccion;
    }

    public void setCproduccion(int Cproduccion) {
        this.Cproduccion = Cproduccion;
    }

    public int getCempaquetado() {
        return Cempaquetado;
    }

    public void setCempaquetado(int Cempaquetado) {
        this.Cempaquetado = Cempaquetado;
    }

    public int getCsalida() {
        return Csalida;
    }

    public void setCsalida(int Csalida) {
        this.Csalida = Csalida;
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
