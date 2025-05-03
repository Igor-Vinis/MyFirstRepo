package Cap3;
// Classe Driver/Condutora da classe Account

import java.util.Scanner;

public class AccountTest   {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       // String nome = "Igor";
        System.out.println("Digite a sua renda inicial: ");
        double blc = scan.nextDouble();
        Account myAccount = new Account("Igor", blc);
        myAccount.deposit(1000);
        displayAcc(myAccount);

//        System.out.printf("Olá, %s! Por favor, digite o seu novo nome: ", myAccount.getName());
//        String nome = scan.nextLine();
//        myAccount.setName(nome);
//
//        System.out.printf("Seu nome é %s, correto?", (myAccount.getName()));
    }

    public static void displayAcc(Account acc) {
        System.out.println(acc.getName());
        System.out.println(acc.getBalance());
    }
}
