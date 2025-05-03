package Cap3;

public class Account {

    private String name;
    private double balance;
    private boolean credit;
    private int score;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void setScore(int score){
        if (score >= -1000 & score <= 1000){
            this.score = score;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getScore() {
        return score;
    }

    public void deposit(double depositAmmount){
        if (depositAmmount > 0){
            this.balance += depositAmmount;
        }
        }
    }

