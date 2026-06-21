public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade;

    public Carro(String marca, String modelo, int ano ){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
    }
    public void acelerar() {
        velocidade = velocidade + 10;
        System.out.println("Acelerando! Velocidade: "+ velocidade);

    }
    public void frear() {
        velocidade = velocidade - 10;
        System.out.println("Freando! Velocidade: "+ velocidade);


    }
}
