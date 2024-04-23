package segpoo.util;

public class ValidadorCartao {

    public boolean solved (String numeroCartao) {
        
        if (!validarNumeroCartao(numeroCartao)) {
            System.out.println("Número de cartão inválido!");
            return false;
        }

        String bandeira = identificarBandeira(numeroCartao);
        int digitoVerificador = calcularDigitoVerificador(numeroCartao);

        if (verificarCartaoValido(numeroCartao, digitoVerificador)) {
            System.out.println("Cartão válido! Bandeira: " + bandeira);

            return true;

        } 
        
        
        System.out.println("Cartão inválido!");

        return false;
        
    }

    private boolean validarNumeroCartao(String numeroCartao) {
        return numeroCartao.length() == 16;
    }

    private String identificarBandeira(String numeroCartao) {
        int primeiroDigito = Integer.parseInt(numeroCartao.substring(0, 1));
        int segundoDigito = Integer.parseInt(numeroCartao.substring(1, 2));

        if (primeiroDigito == 4) {
            System.out.println("Visa");
            return "Visa";
        } else if (primeiroDigito == 5) {
            if (segundoDigito >= 1 && segundoDigito <= 5) {
                return "Mastercard";
            } else if (segundoDigito == 0 || (segundoDigito >= 6 && segundoDigito <= 9)) {
                return "Maestro";
            }
        } else if (primeiroDigito == 3) {
            int segundoDigitoAmex = Integer.parseInt(numeroCartao.substring(1, 2));
            if (segundoDigitoAmex == 4 || segundoDigitoAmex == 7) {
                return "American Express";
            }
        }
        return "Outra Bandeira";
    }

    private int calcularDigitoVerificador(String numeroCartao) {
        int soma = 0;
        for (int i = 0; i < 15; i++) {
            int digito = Integer.parseInt(numeroCartao.substring(i, i + 1));
            if (i % 2 == 0) {
                digito *= 2;
                if (digito > 9) {
                    String strDigito = String.valueOf(digito);
                    digito = Integer.parseInt(strDigito.substring(0, 1)) + Integer.parseInt(strDigito.substring(1, 2));
                }
            }
            soma += digito;
        }
        int digitoVerificador = 10 - (soma % 10);
        if (digitoVerificador == 10) {
            digitoVerificador = 0;
        }
        return digitoVerificador;
    }

    private boolean verificarCartaoValido(String numeroCartao, int digitoVerificador) {
        return digitoVerificador == Integer.parseInt(numeroCartao.substring(15, 16));
    }
}
