public class SistemaVeiculos {

    public static void main(String[] args) {

        // 1. Instanciando e usando a referência do tipo Veiculo (Polimorfismo)
        Veiculo carro = new Carro("Toyota", "Corolla", 2023);
        Veiculo moto = new Moto("Honda", "CBR 600", 2024);
        Veiculo caminhao = new Caminhao("Volvo", "FH 540", 2020);

        // 2. Testando o Carro
        System.out.println("--- Teste Carro ---");
        carro.exibirDetalhes(); // Método concreto herdado
        carro.acelerar();       // Método abstrato implementado (Carro)
        System.out.println("-------------------");

        // 3. Testando a Moto
        System.out.println("--- Teste Moto ---");
        moto.exibirDetalhes();
        moto.acelerar();
        System.out.println("------------------");

        // 4. Testando o Caminhão
        System.out.println("--- Teste Caminhão ---");
        caminhao.exibirDetalhes();
        caminhao.acelerar();
        System.out.println("----------------------");
    }
}