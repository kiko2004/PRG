public class Tienda {
    private Bicicleta[] referencias;
    private int numBicicletas[];
private int numReferencias;

    public Tienda(int tamanyoInicial){
        referencias = new Bicicleta[tamanyoInicial];
        numReferencias = 0;
    }

    public Bicicleta comprarReferencia(String referencia) {
            Bicicleta bicicleta = buscarPorReferencia(referencia);
            if (bicicleta != null) {
            return bicicleta; 
            }

    }

    public Bicicleta buscarPorReferencia(String referencia){
        for (Bicicleta bicicleta : referencias){
            if (referencia[i]getReferencia().equalsIgnoreCase(referencia)) {
                return bicicleta;
                
            }
        }
        return null;

    }
}
