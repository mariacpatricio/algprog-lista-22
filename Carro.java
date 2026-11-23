public class Carro extends Veiculo {

    // Tempo (em segundos) para ir de 0 a 100 km/h
    private static final double TEMPO_0_A_100 = 9.5;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void acelerar() {
        System.out.println(getModelo() + " " + getMarca()
                + " está acelerando de 0 a 100 km/h em " + TEMPO_0_A_100 + " segundos.");
    }
}