// import java.util.Scanner;

// public class main{
//   public static void main(String[] args){
//     Scanner teclado = new Scanner(System.in);

//     System.out.println("Bem-vindo a Calculadora Básica em Java");

//     Float num1;
//     Float num2;

//     System.out.println("Digite o número 1: ");
//     num1 = teclado.nextFloat();
//     System.out.println("Digite o número 2: ");
//     num2 = teclado.nextFloat();

//     System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
//     System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
//     System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
//     System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
//     System.out.printf("%f\n", Math.pow(num1, num2));
//   }
// }
// QUESTAO 1

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         System.out.println("Bem-vindo a Calculadora de Volume da Esfera");

//         Float raio;
//         Float volume;

//         System.out.println("Digite o raio da esfera: ");
//         raio = teclado.nextFloat();

//         volume = (4.0f / 3.0f) * (float) Math.PI * (float) Math.pow(raio, 3);

//         System.out.printf("Raio: %.2f\n", raio);
//         System.out.printf("Volume da esfera: %.2f\n", volume);
//     }
// }

// QUESTAO 2

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         System.out.println("Bem-vindo a Calculadora de Média Ponderada");

//         Float num1;
//         Float num2;
//         Float num3;

//         Float peso1;
//         Float peso2;
//         Float peso3;

//         Float media;

//         System.out.println("Digite o número 1: ");
//         num1 = teclado.nextFloat();
//         System.out.println("Digite o peso do número 1: ");
//         peso1 = teclado.nextFloat();

//         System.out.println("Digite o número 2: ");
//         num2 = teclado.nextFloat();
//         System.out.println("Digite o peso do número 2: ");
//         peso2 = teclado.nextFloat();

//         System.out.println("Digite o número 3: ");
//         num3 = teclado.nextFloat();
//         System.out.println("Digite o peso do número 3: ");
//         peso3 = teclado.nextFloat();

//         media = (num1 * peso1 + num2 * peso2 + num3 * peso3)
//                 / (peso1 + peso2 + peso3);

//         System.out.printf("Média ponderada: %.2f\n", media);
//     }
// }

// QUESTAO 3
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         System.out.println("Bem-vindo a Calculadora de Taxa de Homicídios");

//         Float homicidios;
//         Float habitantes;
//         Float taxa;

//         System.out.println("Digite a quantidade de homicídios: ");
//         homicidios = teclado.nextFloat();
//         System.out.println("Digite o número total de habitantes: ");
//         habitantes = teclado.nextFloat();

//         taxa = (homicidios / habitantes) * 100000;

//         System.out.printf("Taxa de homicídios: %.2f por 100 mil habitantes\n", taxa);
//     }
// }

// QUESTAO 4

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         System.out.println("Bem-vindo a Calculadora de Progressão Aritmética");

//         Float primeiro;
//         Float quantidade;
//         Float razao;
//         Float termo;

//         System.out.println("Digite o primeiro elemento: ");
//         primeiro = teclado.nextFloat();

//         System.out.println("Digite a quantidade de termos: ");
//         quantidade = teclado.nextFloat();

//         System.out.println("Digite o valor da razão: ");
//         razao = teclado.nextFloat();

//         termo = primeiro + (quantidade - 1) * razao;

//         System.out.printf("O %,.0fº termo da PROGRESSÃO ARITMÉDICA é: %.2f\n", quantidade, termo);
//     }
// }

 // // QUESTAO 5

 // import java.util.Scanner;

 //     public class main {
 //         public static void main(String[] args) {
 //             Scanner teclado = new Scanner(System.in);

 //             int horaInicial;
 //             int minutoInicial;
 //             int horaFinal;
 //             int minutoFinal;
 //             int duracao;

 //             System.out.println("Digite a hora inicial: ");
 //             horaInicial = teclado.nextInt();
 //             System.out.println("Digite o minuto inicial: ");
 //             minutoInicial = teclado.nextInt();
 //             System.out.println("Digite a hora final: ");
 //             horaFinal = teclado.nextInt();
 //             System.out.println("Digite o minuto final: ");
 //             minutoFinal = teclado.nextInt();

 //             duracao = (horaFinal * 60 + minutoFinal) - (horaInicial * 60 + minutoInicial);

 //             System.out.println("A duração do evento é: " + duracao + " minutos");
 //         }
 //     }
//6
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);
        // double base, altura, area;
        // System.out.print("Digite a base: ");
        // base = teclado.nextDouble();
        // System.out.print("Digite a altura: ");
        // altura = teclado.nextDouble();
        // area = (base * altura) / 2;
        // System.out.println("A área do triangulo é " + area);
        // teclado.close();

//7
      // double temperaturaCelsius, temperaturaFahrenheit;
      // System.out.print("Digite a temperatura em Celsius: ");
      // temperaturaCelsius = teclado.nextDouble();
      // temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
      // System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
      // teclado.close();

//8
      // double precooriginal, porcentgemDesconto;
      // System.out.print("Digite o preço original do produto: ");
      // precooriginal = teclado.nextDouble();
      // System.out.print("Digite a porcentagem de desconto: ");
      // porcentgemDesconto = teclado.nextDouble();
      // double valorDesconto = precooriginal * (porcentgemDesconto / 100);
      //  double precofinal = precooriginal - valorDesconto;
      //  System.out.println("O preço final do produto é: " + precofinal);
      //  teclado.close();

//9
      // double investimento, juros, tempo;
      // System.out.print("Digite o valor investido: ");
      // investimento = teclado.nextDouble();
      // System.out.print("Digite os juros: ");
      // juros = teclado.nextDouble();
      // System.out.print("Digite o tempo: ");
      // tempo = teclado.nextDouble();
      // double valorFinal = investimento * Math.pow(1 + juros / 100, tempo);
      // System.out.println("O investimento é: " + valorFinal);
      // teclado.close();

//10
      // double numeroTabuada;
      // System.out.print("Digite um número: ");
      // numeroTabuada = teclado.nextDouble();
      // for (int i = 1; i <= 10; i++)
      //   System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
      // teclado.close();
