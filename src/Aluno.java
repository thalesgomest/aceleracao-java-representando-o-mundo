public class Aluno {
    private String name;
    private Integer age;
    private String cpf;
    Curso curso = new Curso();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----- Dados do Aluno ------" + "\n");
        sb.append("Nome: " + name + "\n");
        sb.append("Idade: " + age + "\n");
        sb.append("Cpf: " + cpf + "\n");
        sb.append("Curso: " + curso.getName() + "\n");
        sb.append("CH: " + curso.getDuration() + " hrs" + "\n");
        return sb.toString();
    }
}
