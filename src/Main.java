import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Insira nome de usuario ");

    String userName = myObj.nextLine();
    System.out.println("O nome do usuario é: " + userName);
  }
}