public class App {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setName("Thales Gomes");
        aluno1.setAge(31);
        aluno1.setCpf("076.235.234.67");
        aluno1.curso.setName("Engenharia de Software");
        aluno1.curso.setDuration(1200);

        System.out.println(aluno1);
        
        Aluno aluno2 = new Aluno();

        aluno2.setName("Raimundo Nonato");
        aluno2.setAge(60);
        aluno2.setCpf("012.655.208.01");
        aluno2.curso.setName("Tecnologia em Análise e Desenvolvimento de Sistemas");
        aluno2.curso.setDuration(500);

        System.out.println(aluno2);
    }
}