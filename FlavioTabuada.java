/*Flávio Mahoney
0050014221 */ 
import java.util.Scanner;
class FlavioTabuada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com um número: ");
    int num = sc.nextInt();

    System.out.println("Olá Flavio, você entrou com o número " + num);
    System.out.println("Tabuada de soma do " + num);

    for( int i = 1; i<=9; i++){
      System.out.format("%d + %d = %d\n", num, i, num+i);
    }
  }
}
/*https://github.com/flaviomahoney*/