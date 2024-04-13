import models.*;

public class Main {
    public static void main(String[] args) {
        /*
        01. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo
        (privado) e titular (publico). Implemente métodos getters e setters para os atributos
        privados.
         */
        System.out.println("01. Crie uma classe ContaBancaria com os seguintes atributos: " +
                "numeroConta" +
                " (privado), saldo (privado) e titular (publico). Implemente métodos getters e " +
                "setters para os atributos privados");
        //instanciando a classe
        BankAccount bankAccount = new BankAccount();

        //atribuindo valores
        bankAccount.setAccountNumber("190945-7");
        bankAccount.setHolder("José Maria Silveira");

        //obtendo valores
        System.out.println(String.format("""
                Titular: %s
                Conta: %s""", bankAccount.getHolder(), bankAccount.getAccountNumber()));

        /*
        Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos
        getters e setters para acessar e modificar esses atributos. Adicione um método
        verificarIdade que imprime se a pessoa é maior de idade ou não.
         */
        System.out.println("02. Crie uma classe idadePessoa com os atributos privados nome e " +
                "idade. Utilize métodos getters e setters para acessar e modificar esses " +
                "atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de " +
                "idade ou não.");
        //criando um novo objeto
        PersonAge personAge = new PersonAge();

        //atribuindo valores aos atributos
        personAge.setName("Fernanda Oliveira Lima");
        personAge.setAge(32);

        //obtendo dados
        System.out.println(String.format("""
                Nome: %s
                Idade: %d
                Situação: %s""", personAge.getName(), personAge.getAge(), personAge.checkLegalAge()));

        /*
        Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos
        getters e setters para acessar e modificar esses atributos. Adicione um método
        aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
         */
        System.out.println("03. Desenvolva uma classe Produto com os atributos privados nome e " +
                "preco. Utilize métodos getters e setters para acessar e modificar esses " +
                "atributos. Adicione um método aplicarDesconto que recebe um valor percentual e " +
                "reduz o preço do produto.");
        //criando o objeto
        Product product = new Product();

        //atribuindo valores aos atributos
        product.setName("Cerveja Heineken Garrafa 600ml");
        product.setPrice(8.3);

        //aplicando desconto
        product.applyDiscount(2);

        //obtendo dados
        System.out.println(String.format("""
                Produto: %s
                Valor: %.2f""", product.getName(), product.getPrice()));

        /*
        Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos
        getters e setters para acessar e modificar esses atributos. Adicione um método
        calcularMedia que retorna a média das notas do aluno.
         */
        System.out.println("04. Desenvolva uma classe Aluno com os atributos privados nome e " +
                "notas. Utilize métodos getters e setters para acessar e modificar esses " +
                "atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.");
        //instanciando a classe
        Student student = new Student();

        //atribuindo valores aos atributos
        student.setName("Lucas Alves da Cruz");
        student.setScores(9);
        student.setScores(7);
        student.setScores(8.2);

        //obtendo dados
        System.out.println(String.format("""
                Aluno: %s
                Média das notas: %.2f""", student.getName(), student.calculateMean()));

        /*
        Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos
        getters e setters para acessar e modificar esses atributos. Adicione um método
        exibirDetalhes que imprime o título e o autor do livro.
         */
        System.out.println("05. Desenvolva uma classe Livro com os atributos privados titulo e " +
                "autor. Utilize métodos getters e setters para acessar e modificar esses " +
                "atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.");
        //instanciando a classe
        Book book = new Book();

        //atribuindo valores aos atributos
        book.setAuthor("George Orwell");
        book.setTitle("1984");

        //exibindo os detalhes do livro
        book.displayDetails();


    }
}
