public class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é;"+ nome);
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Tenho "+ altura + " de altura");
    }
}
