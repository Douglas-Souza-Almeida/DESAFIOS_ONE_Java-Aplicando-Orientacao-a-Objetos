//criando a classe aluno
public class Student {
    //definindo atributos
    String name;
    int age;

    //definindo método para exibir dados
    void displayStudentData () {
        System.out.println(String.format("""
                Nome: %s
                Idade: %d""", name, age));
    }
}
