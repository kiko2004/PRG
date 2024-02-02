public class Bicicleta {
    private final String referencia;

    private final String marca;

    private final String modelo;

    private final float peso;

    private final float tamanyo;

    private final boolean motor;

    private final String fecha;

    private final float precio;

    private int existencias;

    public Bicicleta(String referencia, String marca, String modelo, float peso, float tamanyo, boolean motor, String fecha, float precio, int existencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanyo = tamanyo;
        this.motor = motor;
        this.fecha = fecha;
        this.precio = precio;
        this.existencias = existencias;
    }


    public String getReferencia() {
        return this.referencia;
    }


    public String getMarca() {
        return this.marca;
    }


    public String getModelo() {
        return this.modelo;
    }


    public float getPeso() {
        return this.peso;
    }


    public float getTamanyo() {
        return this.tamanyo;
    }


    public boolean isMotor() {
        return this.motor;
    }

    public boolean getMotor() {
        return this.motor;
    }


    public String getFecha() {
        return this.fecha;
    }


    public float getPrecio() {
        return this.precio;
    }


    public int getExistencias() {
        return this.existencias;
    }

    public void comprar(){
        existencias++;

    }
    public boolean vender(){
        if (existencias < 1) {
            return false;
            existencias--;
            return true;
        }




    }
    @Override
    public String toString() {
        return "{" +
            " referencia='" + getReferencia() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", peso='" + getPeso() + "'" +
            ", tamanyo='" + getTamanyo() + "'" +
            ", motor='" + isMotor() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", existencias='" + getExistencias() + "'" +
            "}";
    }
    

}

