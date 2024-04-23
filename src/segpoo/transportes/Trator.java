package segpoo.transportes;

public class Trator extends Transportes {
    private int potenciaMotor;
    private boolean temImplementoAgricola;
    private boolean tracao4x4;

    public Trator(String numeroCartaoCredito, String modelo, String cor, int anoFabricacao, double valorAluguelDiario, int potenciaMotor, boolean temImplementoAgricola, boolean tracao4x4) {
        super(numeroCartaoCredito, "Trator", modelo, cor, anoFabricacao, valorAluguelDiario);
        this.potenciaMotor = potenciaMotor;
        this.temImplementoAgricola = temImplementoAgricola;
        this.tracao4x4 = tracao4x4;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Potência do Motor: " + potenciaMotor);
        System.out.println("Tem Implemento Agrícola: " + (temImplementoAgricola ? "Sim" : "Não"));
        System.out.println("Tração 4x4: " + (tracao4x4 ? "Sim" : "Não"));
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public boolean isTemImplementoAgricola() {
        return temImplementoAgricola;
    }

    public void setTemImplementoAgricola(boolean temImplementoAgricola) {
        this.temImplementoAgricola = temImplementoAgricola;
    }

    public boolean isTracao4x4() {
        return tracao4x4;
    }

    public void setTracao4x4(boolean tracao4x4) {
        this.tracao4x4 = tracao4x4;
    }

    

}