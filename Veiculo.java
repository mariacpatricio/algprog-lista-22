public abstract class Veiculo {

    // Atributos (encapsulados com private)
    private String marca;
    private String modelo;
    private int ano;

    // Construtor que inicializa os três atributos
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters para que as subclasses acessem os atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Método concreto: herdado por todas as subclasses
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Método abstrato: sem corpo, cada subclasse implementa o seu
    public abstract void acelerar();
}