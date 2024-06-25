import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println ("                        Enem Vestibular           ");
    System.out.println(" ");
System.out.println("Faça seu Login e acesse o nosso site EnemVestibular!!");

    System.out.println("Login Admin:");
int Login = sc.nextInt ();
    int SenhaAdmin = 2024;
    int LoginA = 2506;
    if (Login == LoginA) {
      System.out.println("Coloque sua senha:");
      int senha = sc.nextInt();
      if(senha == SenhaAdmin);
      System.out.println("BEM-VINDO ADMIN");
    } else{
System.out.println("Acesso Negado");
    } 
    System.out.println(" ");
    System.out.println("Login Financeiro:");
    int Login2 = sc.nextInt ();
        int SenhaFinanceiro = 2025;
        int LoginB = 2000;
        if (Login2 == LoginB) {
          System.out.println("Coloque sua senha:");
          int senha = sc.nextInt();
          if(senha == SenhaFinanceiro);
          System.out.println("Já Pagou a Conta Hoje!!! Bem vindo");
        } else{
    System.out.println("Acesso Negado");
        } 
    System.out.println(" ");
    System.out.println("Login Cliente:");
    int Login3 = sc.nextInt ();
        int SenhaCliente = 3434;
        int LoginC = 2222;
        if (Login3 == LoginC) {
          System.out.println("Coloque sua senha:");
          int senha = sc.nextInt();
          if(senha == SenhaCliente);
          System.out.println("Seja MUITO Bem-Vindo ao nosso Site");
        } else{
    System.out.println("Acesso Negado");
        } 
    System.out.println(" ");
System.out.println("Tenha um Bom Dia");

    sc.close();
  }


}