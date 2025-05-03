package Cap3;
// Classe Driver/Condutora da classe Account

import java.util.Scanner;

public class AccountTest   {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       // String nome = "Igor";
        Account myAccount = new Account("Igor",0);
        myAccount.deposit(7846.2);
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
