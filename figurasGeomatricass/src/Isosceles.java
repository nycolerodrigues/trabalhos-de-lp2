
public class Isosceles extends Triangulo {

    public Isosceles() {

    }

    public Isosceles(String nome, float[] dimensoes) {
        super(nome, dimensoes);
        if (dimensoes.length != 3) {
            throw new IllegalArgumentException("O vetor " + this.nome + " deve ter um tamanho de 3 elementos.");
        }

        // Verifica se os lados formam um triângulo isósceles
        if (!(dimensoes[0] == dimensoes[1] || dimensoes[0] == dimensoes[2] || dimensoes[1] == dimensoes[2])) {
            throw new IllegalArgumentException("Os lados não formam um triângulo isósceles.");
        }
    }


}
