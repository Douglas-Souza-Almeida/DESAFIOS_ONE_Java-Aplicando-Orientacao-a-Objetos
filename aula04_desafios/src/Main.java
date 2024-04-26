import JavaClass.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        01. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
        converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como
        parâmetro.
         */
        //instanciando a classe para leitura de dados
        Scanner reading = new Scanner(System.in);

        System.out.println("*******************************************************************************************");
        System.out.println("01. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o" +
                " método " + "converterDolarParaReal() para converter um valor em dólar para reais. A classe deve " +
                "receber o valor em dólar como parâmetro.");

        //instanciando a classe para conversão do valor
        CurrencyConverter currencyConverter = new CurrencyConverter();

        //solicitando dados ao usuário
        System.out.printf("Informe um valor em dólar para realizar a conversão: US$ ");

        //leitura e gravação do dado informado
        double dollar = reading.nextDouble();

        //realizando a conversão e exibindo o resultado na tela
        System.out.println(String.format("""
                O valor informado foi: US$ %.2f
                Este valor equivale a: R$ %.2f""",dollar, currencyConverter.convertDollarToReal(dollar)));

        /*
        02. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
        calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve
         receber altura e largura como parâmetros.
         */
        System.out.println("*******************************************************************************************");
        System.out.println("02. Crie uma classe CalculadoraSalaRetangular que implementa uma interface " +
                "CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o " +
                "perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.");

        //instanciando a classe
        RectangularRoomCalculator rectangularRoomCalculator = new RectangularRoomCalculator();

        //solicitando ao usuário que informe o valor de altura da sala
        System.out.printf("Informe o valor em metros da altura da sala: ");

        //leitura e gravação do valor
        double height = reading.nextDouble();

        //solicitando ao usuário que informe o valor de largura da sala
        System.out.printf("Informe o valor em metros da largura da sala: ");
        double width = reading.nextDouble();

        //calculo e exibição dos dados em tela
        System.out.println(String.format("""
                Segue os valores para uma sala com %.2f metros de altura e %.2f metros de largura: 
                Área: %.2f m²
                Perímetro: %.2f m""", height, width, rectangularRoomCalculator.calculateArea(height, width),
                rectangularRoomCalculator.calculatePerimeter(height, width)));

        /*
        03. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada()
        para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
         */
        System.out.println("*******************************************************************************************");
        System.out.println("03. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o " +
                "método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como " +
                "parâmetro.");

        //instanciando a classe
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        //solicitando ao usuário que informe um número
        System.out.printf("Informe um número para exibir a tabuada: ");

        //acessando o método e exibindo os dados
        multiplicationTable.showMultiplicationTable(reading.nextDouble());

        /*
        04. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
        Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e
         exibe os resultados.
         */
        System.out.println("*******************************************************************************************");
        System.out.println("04. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e " +
                "fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa " +
                "interface com as fórmulas de conversão e exibe os resultados");

        //instanciando o objeto
        StandardTemperatureConverter standardTemperatureConverter = new StandardTemperatureConverter();

        //solicitando ao usuário o valor em temperatura celsius
        System.out.printf("Informe um valor de temperatura em graus Celsius: ");

        //realizando leitura de dado
        double celsius = reading.nextDouble();

        //realizando a conversão e exibindo os dados
        System.out.println(String.format("O valor de %.2f graus Celsius equivale a %.2f graus Fahrenheit.",
                celsius, standardTemperatureConverter.celsiusToFahrenheit(celsius)));

        //solicitando ao usuário o valor de temperatura fahrenheit
        System.out.printf("Informe o valor de temperatura Fahrenheit: ");

        //leitura do dado
        double fahrenheit = reading.nextDouble();

        //realizando a conversão e exibindo os dados
        System.out.println(String.format("O valor de %.2f graus Fahrenheit equivale a %.2f graus Celsius.", fahrenheit,
                standardTemperatureConverter.fahrenheitToCelsius(fahrenheit)));

        /*
        04. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas
        classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
         */
        System.out.println("*******************************************************************************************");
        System.out.println("04. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente " +
                "essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando " +
                "descontos ou taxas adicionais.");

        //instanciando o objeto
        Book book = new Book();

        //solicitando ao usuário o valor de compra do livro
        System.out.printf("Informe o valor de compra do livro: R$ ");

        //leitura do dado
        double price = reading.nextDouble();

        //solicitando ao usuário o percentual de desconto
        System.out.printf("Qual o percentual de desconto deve-se aplicar ao valor final: ");

        //leitura do dado
        double discount = reading.nextDouble();

        //solicitando ao usuário o percentual de taxas adiconais
        System.out.printf("Qual o percentual de taxas adicionais: ");

        //leitura do dado
        double fee = reading.nextDouble();

        //calculando e exibindo o valor final em tela
        System.out.println(String.format("Para os dados informados o valor final do livro será de R$ %.2f",
                book.calculateFinalPrice(price, discount, fee)));

        //instanciando o objeto produto físico
        PhysicalProduct physicalProduct = new PhysicalProduct();

        //solicitando o valor de compra ao usuário
        System.out.printf("Informe o valor de compra do produto: R$ ");

        //leitura do dado
        double value = reading.nextDouble();

        //solicitando ao usuário o percentual de desconto
        System.out.printf("Informe o percentual de desconto: ");

        //leitura do dado
        double discount2 = reading.nextDouble();

        //calculando e exibindo o valor final em tela
        System.out.println(String.format("Para os dados informados o valor final do produto físico será de R$ %.2f",
                physicalProduct.calculateFinalPrice(value, discount2, 27)));

        /*
        Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade
        comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a
        sua própria lógica de cálculo de preço.
         */
        System.out.println("05. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com" +
                " base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e " +
                "Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.");

        //instanciando o objeto
        Product product = new Product();

        //solicitando dados de compra para o usuário
        System.out.printf("Informe o valor unitário de compra do produto: R$ ");

        //leitura do dado
        double valueProduct = reading.nextDouble();

        //solicitando ao usuário dado de desconto
        System.out.printf("Informe o valor percentual de desconto a ser aplicado: ");

        //leitura do dado
        double discountProduct = reading.nextDouble();

        //solicitando ao usuário dado de taxas
        System.out.printf("Informe o percentual de demais taxas a serem acrescidas: ");

        //leitura do dado
        double feeProduct = reading.nextDouble();

        //solicitando dado de quantidade
        System.out.printf("Informe a quantidade comprada: ");

        //leitura do dado
        double quantityProduct = reading.nextDouble();

        //calculando valor de compra e exibindo em tela
        System.out.println(String.format("O valor final da compra foi de R$ %.2f",
                product.calculatePrice(valueProduct, discountProduct, feeProduct) * quantityProduct));

        //instanciando o objeto
        Services services = new Services();

        //solicitando preço ao usuario
        System.out.printf("Informe o valor do serviço: R$ ");

        //leitura de dado
        double valueService = reading.nextDouble();

        //solicitando valor de desconto
        System.out.printf("Informe o percentual de desconto: ");

        //leitura de dado
        double discountServices = reading.nextDouble();

        //solicitando valor de taxa
        System.out.printf("Informe o percentual de taxas adiconais: ");
        double feeServices = reading.nextDouble();

        //calculando valores e exibindo dados na tela
        System.out.println(String.format("O valor a ser recebido pelo serviço prestado será de R$ %.2f",
                services.calculatePrice(valueService, discountServices, feeServices)));

    }
}
