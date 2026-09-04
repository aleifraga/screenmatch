public class Principal {
    static void main() {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Interestelar";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.duracaoEmMinutos = 160;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
        System.out.println(meuFilme.duracaoEmMinutos);

    }
}