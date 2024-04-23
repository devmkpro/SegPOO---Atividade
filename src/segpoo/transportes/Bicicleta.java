package segpoo.transportes;

public class Bicicleta extends Transportes {
    private String tipo;
    private int numeroMarchas;
    private boolean temCesto;

    public Bicicleta(String numeroCartaoCredito, String modelo, String cor, int anoFabricacao, double valorAluguelDiario, String tipo, int numeroMarchas, boolean temCesto) {
        super(numeroCartaoCredito, "Bicicleta", modelo, cor, anoFabricacao, valorAluguelDiario);
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
        this.temCesto = temCesto;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de Marchas: " + numeroMarchas);
        System.out.println("Tem Cesto: " + (temCesto ? "Sim" : "Não"));
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isTemCesto() {
        return temCesto;
    }

    public void setTemCesto(boolean temCesto) {
        this.temCesto = temCesto;
    }

    

}
