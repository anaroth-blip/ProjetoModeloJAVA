import java.util.Scanner;
  
public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Bem-vindo ao meu primeiro programa Java!");
        System.out.println("Meu nome é Ana e eu estudo no Colégio Costa e Silva.");

       Integer idade = Integer.valueOf(25);
       System.out.println("Eu tenho " + idade + " anos de idade!");

      Integer num1 = Integer.valueOf(10);
      Integer num2 = Integer.valueOf(25);
      System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);

      Double preco = Double.valueOf(59.90);
      Double peso = Double.valueOf(85.50);
      System.out.printf("Preço: R$%.2f | Peso: %.2f\n", preco, peso);

      System.out.println("Me diga o seu nome: ");
      String nomeUsuario = String.value0f(teclado.nextLine());
      System.out.printf("Que bom te conhecer %s\n", nomeUsuario");
    }
}