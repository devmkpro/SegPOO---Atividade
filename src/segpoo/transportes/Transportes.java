package segpoo.transportes;
import segpoo.util.ValidadorCartao;

public class Transportes {
    private String numeroCartaoCredito;
    private String tipoTransporte;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private double valorAluguelDiario;

    public Transportes(String numeroCartaoCredito, String tipoTransporte, String modelo, String cor, int anoFabricacao, double valorAluguelDiario) {
        this.numeroCartaoCredito = validarCartao(numeroCartaoCredito);
        this.tipoTransporte = tipoTransporte;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.valorAluguelDiario = valorAluguelDiario;
    }

    private String validarCartao(String numeroCartao) {
        ValidadorCartao validadorCartao = new ValidadorCartao();
        if (validadorCartao.solved(numeroCartao)) {
            return numeroCartao;
        } else {
            throw new IllegalArgumentException("Número de cartão inválido");
        }
    }

    public double calcularValorTotalAluguel(int dias) {
        return valorAluguelDiario * dias;
    }

    public void imprimirDetalhes() {
        System.out.println("Tipo: " + tipoTransporte);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Valor do Aluguel Diário: " + valorAluguelDiario);
        System.out.println("Número do Cartão de Crédito: " + numeroCartaoCredito);
    }


    public String getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorAluguelDiario() {
        return valorAluguelDiario;
    }

    public void setValorAluguelDiario(double valorAluguelDiario) {
        this.valorAluguelDiario = valorAluguelDiario;
    }
}
