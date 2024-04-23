package segpoo.transportes;


public class Caminhao extends Transportes {
    private int capacidadeCarga;
    private String tipoCarroceria;
    private boolean temCarreta;

    public Caminhao(String numeroCartaoCredito, String modelo, String cor, int anoFabricacao, double valorAluguelDiario, int capacidadeCarga, String tipoCarroceria, boolean temCarreta) {
        super(numeroCartaoCredito, "Caminhão", modelo, cor, anoFabricacao, valorAluguelDiario);
        this.capacidadeCarga = capacidadeCarga;
        this.tipoCarroceria = tipoCarroceria;
        this.temCarreta = temCarreta;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
        System.out.println("Tipo de Carroceria: " + tipoCarroceria);
        System.out.println("Tem Carreta: " + (temCarreta ? "Sim" : "Não"));
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public boolean isTemCarreta() {
        return temCarreta;
    }

    public void setTemCarreta(boolean temCarreta) {
        this.temCarreta = temCarreta;
    }

    
    
}
