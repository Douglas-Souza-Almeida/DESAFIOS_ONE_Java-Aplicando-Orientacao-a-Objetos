import models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        01. Crie uma classe Carro com métodos para representar um modelo específico ao longo de
        três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada
        ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para
         criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
         */
        System.out.println("01. Crie uma classe Carro com métodos para representar um modelo " +
                "específico ao longo de três anos. Implemente métodos para definir o nome do " +
                "modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior " +
                "preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, " +
                "utilizando-a na classe principal para definir preços e mostrar informações.");
        //instanciando objetos
        ModelCar opala = new ModelCar();
        ModelCar maverick = new ModelCar();

        //atribuindo dados
        opala.setName("Opala");
        opala.setManufacturer("Chevrolet");
        opala.setCountryOrigin("Brasil");
        opala.setPriceYear1(30000);
        opala.setPriceYear2(11000);
        opala.setPriceYear3(5000);
        //exibindo dados
        opala.showData();
        System.out.println("-------------------------");
        //atribuindo dados
        maverick.setName("Maverick");
        maverick.setManufacturer("Ford");
        maverick.setCountryOrigin("Brasil");
        maverick.setPriceYear1(40000);
        maverick.setPriceYear2(45000);
        maverick.setPriceYear2(23000);
        //exibindo dados
        maverick.showData();

        /*
        02. Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses:
        Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas
        subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o
        método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo()
        para o Cachorro e arranharMoveis() para o Gato.
         */
        System.out.println("*********************************************************************");
        System.out.println("02. Crie uma classe Animal com um método emitirSom(). Em seguida, " +
                "crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o " +
                "método emitirSom() nas subclasses, utilizando a anotação @Override para indicar " +
                "que estão sobrescrevendo o método. Além disso, adicione métodos específicos para" +
                " cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o " +
                "Gato.");
        //instanciando os objetos
        Dog dog = new Dog();
        Cat cat = new Cat();
        //acessando os métodos
        System.out.println(String.format("""
                O cachorro faz: %s
                O gato faz: %s""", dog.makeSound(),cat.makeSound()));
        System.out.println(String.format("""
                Ações
                Gato: %s
                Cachorro: %s""", cat.scratch(), dog.wagTail()));
        System.out.println("*********************************************************************");
        /*
        03. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como
        depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que
         herda da classe ContaBancaria. Adicione um método específico para a subclasse, como
         cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
         */
        System.out.println("03. Crie uma classe ContaBancaria com métodos para realizar operações" +
                " bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma " +
                "subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método " +
                "específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa " +
                "mensal da conta corrente.");
        //iniciando objeto para leitura de dados
        Scanner reading = new Scanner(System.in);
        //instanciando objeto
        CheckingAccount checkingAccount = new CheckingAccount();
        //definindo variável para opçao
        int option = 0;
        //laço de repetição
        while (option != 5) {
            System.out.printf("""
                ------------------------------------
                MENU PRINCIPAL
                1 - Depósito
                2 - Saque
                3 - Consultar saldo
                4 - Descontar tarida
                5 - Sair
                -------------------------------------
                Informe o número da opção desejada:\t""");
            option = reading.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Informe o valor para depósito: ");
                    double valueDeposit = reading.nextDouble();
                    checkingAccount.deposit(valueDeposit);
                    System.out.println("DEPÓSITO REALIZADO!\n\n");
                    break;

                case 2:
                    System.out.printf("Informe o valor para saque: ");
                    double valueWithdraw = reading.nextDouble();
                    if (valueWithdraw > checkingAccount.getAccountBalance()) {
                        System.out.println("\n\nSALDO INSUFICIENTE!\n\n");
                        break;
                    } else {
                        checkingAccount.withdraw(valueWithdraw);
                        System.out.println("SAQUE REALIZADO!");
                        break;
                    }
                case 3:
                    System.out.println(String.format("""
                            SALDO EM CONTA: R$ %.2f""", checkingAccount.getAccountBalance()));
                    break;
                case 4:
                    System.out.printf("Informe o valor de tarifa: ");
                    double valueServiceFee = reading.nextDouble();
                    checkingAccount.serviceFee(valueServiceFee);
                    System.out.println("\n\nDESCONTO REALIZADO\n\n");
                    break;
                case 5:
                    System.out.println("Saíndo do sistema...\n\n");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            reading.nextLine();
        }
        /*
       04. Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
        Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe
        NumerosPrimos. Adicione um método específico para cada uma das subclasses, como
        verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
         */
        System.out.println("*********************************************************************");
        System.out.println("04. Crie uma classe NumerosPrimos com métodos como " +
                "verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, " +
                        "VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. " +
                        "Adicione um método específico para cada uma subclasses, como " +
                        "verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.");
        //instanciando as classses
        PrimeChecker primeChecker = new PrimeChecker();
        PrimeGenerator primeGenerator = new PrimeGenerator();
        //solicitando ao usuário para que informe um número
        System.out.printf("Informe um número para verificar se este é um número primo: ");
        //leitura do dado
        int num = reading.nextInt();
        //verificando se o número é primo
        primeChecker.primeChecker(num);
        //listando números primos
        primeChecker.listPrimeNumbers(num);
        //informando qual seria o próximo número primo
        primeGenerator.generateNextPrime(num);
    }
}