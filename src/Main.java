import segpoo.transportes.*;

public class Main {

    private static final String NUMEROCARTAO = "5352410783912912";

    public static void main(String[] args) {
        cadastrarCaminhoes();
        cadastrarTratores();
        cadastrarCarrosDePasseio();
        cadastrarMotos();
        cadastrarBicicletas();
    }

    private static void imprimirDetalhes(Transportes... transportes) { 
        for (Transportes transporte : transportes) { 
            transporte.imprimirDetalhes();
            System.out.println();
        }
    }

    private static void cadastrarCaminhoes() {
        System.out.println("\n--- Caminhões ---");
        Caminhao caminhao1 = new Caminhao(NUMEROCARTAO, "Volvo FH", "Branco", 2022, 300.00, 20000, "Baú", true);
        Caminhao caminhao2 = new Caminhao(NUMEROCARTAO, "Scania R450", "Azul", 2021, 280.00, 18000, "Graneleiro", false);
        Caminhao caminhao3 = new Caminhao(NUMEROCARTAO, "Mercedes-Benz Actros", "Vermelho", 2023, 320.00, 22000, "Baú Refrigerado", true);
        Caminhao caminhao4 = new Caminhao(NUMEROCARTAO, "DAF XF", "Verde", 2020, 260.00, 16000, "Caçamba", false);
        imprimirDetalhes(caminhao1, caminhao2, caminhao3, caminhao4);
    }

    private static void cadastrarTratores() {
        System.out.println("\n--- Tratores ---");
        Trator trator1 = new Trator(NUMEROCARTAO, "John Deere 8330", "Verde", 2019, 150.00, 200, true, true);
        Trator trator2 = new Trator(NUMEROCARTAO, "Massey Ferguson 6713", "Vermelho", 2021, 180.00, 250, false, false);
        Trator trator3 = new Trator(NUMEROCARTAO, "New Holland T7.245", "Azul", 2020, 170.00, 230, true, true);
        Trator trator4 = new Trator(NUMEROCARTAO, "Case IH Farmall 80", "Amarelo", 2018, 140.00, 180, false, false);
        imprimirDetalhes(trator1, trator2, trator3, trator4);
    }

    private static void cadastrarCarrosDePasseio() {
        System.out.println("\n--- Carros de Passeio ---");
        CarroPasseio carro1 = new CarroPasseio(NUMEROCARTAO, "Volkswagen Gol", "Prata", 2022, 100.00, 4, "Flex", true);
        CarroPasseio carro2 = new CarroPasseio(NUMEROCARTAO, "Chevrolet Onix", "Preto", 2023, 110.00, 4, "Flex", true);
        CarroPasseio carro3 = new CarroPasseio(NUMEROCARTAO, "Ford Ka", "Branco", 2021, 95.00, 4, "Flex", false);
        CarroPasseio carro4 = new CarroPasseio(NUMEROCARTAO, "Fiat Argo", "Vermelho", 2020, 90.00, 4, "Flex", false);
        imprimirDetalhes(carro1, carro2, carro3, carro4);
    }

    private static void cadastrarMotos() {
        System.out.println("\n--- Motos ---");
        Moto moto1 = new Moto(NUMEROCARTAO, "Honda CB 500X", "Azul", 2022, 70.00, "Trail", 500, true);
        Moto moto2 = new Moto(NUMEROCARTAO, "Yamaha MT-07", "Preto", 2021, 65.00, "Naked", 700, true);
        Moto moto3 = new Moto(NUMEROCARTAO, "Kawasaki Ninja 400", "Verde", 2023, 75.00, "Esportiva", 400, false);
        Moto moto4 = new Moto(NUMEROCARTAO, "Suzuki Burgman 125", "Prata", 2020, 60.00, "Scooter", 125, false);
        imprimirDetalhes(moto1, moto2, moto3, moto4);
    }
    
    private static void cadastrarBicicletas() {
        System.out.println("\n--- Bicicletas ---");
        Bicicleta bicicleta1 = new Bicicleta(NUMEROCARTAO, "Caloi Elite", "Vermelho", 2022, 30.00, "Mountain Bike", 21, true);
        Bicicleta bicicleta2 = new Bicicleta(NUMEROCARTAO, "Specialized Sirrus", "Preto", 2021, 35.00, "Híbrida", 18, true);
        Bicicleta bicicleta3 = new Bicicleta(NUMEROCARTAO, "Trek FX", "Branco", 2023, 40.00, "Fitness", 24, false);
        Bicicleta bicicleta4 = new Bicicleta(NUMEROCARTAO, "Giant Talon", "Azul", 2020, 25.00, "Mountain Bike", 21, false);
        imprimirDetalhes(bicicleta1, bicicleta2, bicicleta3, bicicleta4);
    }




    
}