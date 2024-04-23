package segpoo.transportes;

public class Moto extends Transportes  {

    private String estilo;
    private int cilindradas;
    private boolean temPartidaEletrica;

    public Moto(String numeroCartaoCredito, String modelo, String cor, int anoFabricacao, double valorAluguelDiario, String estilo, int cilindradas, boolean temPartidaEletrica) {
        super(numeroCartaoCredito, "Moto", modelo, cor, anoFabricacao, valorAluguelDiario);
        this.estilo = estilo;
        this.cilindradas = cilindradas;
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Estilo: " + estilo);
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Tem Partida Elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }


    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    
}
