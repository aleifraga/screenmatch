public class Principal {
    static void main() {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Interestelar";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.duracaoEmMinutos = 160;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.3);
        meuFilme.avalia(7.4);
        meuFilme.avalia(9.2);
        meuFilme.avalia(5.4);
        System.out.println("Avaliação: " + meuFilme.somaDasAvaliacoes);
    }
}