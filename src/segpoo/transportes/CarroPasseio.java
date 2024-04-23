package segpoo.transportes;

public class CarroPasseio extends Transportes {
    private int numeroPortas;
    private String tipoCombustivel;
    private boolean temArCondicionado;

    public CarroPasseio(String numeroCartaoCredito, String modelo, String cor, int anoFabricacao, double valorAluguelDiario, int numeroPortas, String tipoCombustivel, boolean temArCondicionado) {
        super(numeroCartaoCredito, "Carro de Passeio", modelo, cor, anoFabricacao, valorAluguelDiario);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Tem Ar Condicionado: " + (temArCondicionado ? "Sim" : "Não"));
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    
    
}
