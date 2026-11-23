public class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    
    public void acelerar() {
        System.out.println(getModelo() + " " + getMarca()
                + " está acelerando e empinando a roda dianteira!");
    }
}