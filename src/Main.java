public class Main {
    public static void main(String[] args) {
        System.out.println("------------- aula -------------");
//
//        ListaDuplamenteLigada<String> lista = new ListaDuplamenteLigada();
//
//        lista.imprimirLista();
//
//        lista.adicionaFim("teste");
//        lista.adicionaFim("123");
//
//        lista.adicionaInicio("cleiton");
//
//        System.out.println(lista.contem("123"));
//        lista.imprimirLista();

        ListaDuplamenteLigada<Aluno> alunos = new ListaDuplamenteLigada<>();

        Aluno aluno1 = new Aluno("cleiton 1", 24);
        Aluno aluno2 = new Aluno("cleiton 2", 25);
        Aluno aluno3 = new Aluno("cleiton 3", 26);

        alunos.adicionaInicio(aluno1);
        alunos.adicionaInicio(aluno2);
        alunos.adicionaInicio(aluno3);

        alunos.imprimirLista();
    }
}