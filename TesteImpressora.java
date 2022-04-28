public class TesteImpressora {
    public static void main(String[] args) {
        Impressora Imprime = new Impressora();

        Imprime.exibir(0.7f);
        Imprime.exibir(0.7f, 0.8f);
        Imprime.exibir(0.7f, "zero ponto oito");
        Imprime.exibir("zero ponto sete", 0.8f);
        Imprime.exibir("zero ponto sete", "zero ponto oitro", "zero ponto nove");
        Imprime.exibir(7, 8, "nove");
    }
}
