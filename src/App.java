import java.util.Scanner;

public class App{
    public static void main(String[] args){
        System.out.println("\n:::   Rock-Paper-Scissors   :::\n\n");

        System.out.println("What's your choice? (Enter the number)\n");
        rock();
        paper();
        scissors();

        Scanner input = new Scanner(System.in);
        int you;
        while(true){
            System.out.print("=> ");
            you = input.nextInt();
            if(you == 1 || you == 2 || you == 3)
                break;
            System.out.println("Invalid input. Enter Again.");
        }

        System.out.println("\nYOU");
        switch (you) {
            case 1:
                rock();
                break;
            case 2:
                paper();
                break;
            case 3:
                scissors();
                break;
        }

        int computer = (int)Math.floor(Math.random()*(3-1+1)+1);
        System.out.println("\nCOMPUTER");
        switch (computer) {
            case 1:
                rock();
                break;
            case 2:
                paper();
                break;
            case 3:
                scissors();
                break;
        }

        if(you == computer)
            System.out.println("::: It's a draw! :::");
        else if((you == 1 && computer == 3) || (you == 2 && computer == 1) || (you == 3 && computer == 2))
            System.out.println("::: You won! :::");
        else
            System.out.println("::: You lost! :::");
    }

    public static void rock(){
        System.out.println(" _____ ");
        System.out.println("/ --- \\");
        System.out.println("\\_____/\t\t1. R O C K\n");
    }

    public static void paper(){
        System.out.println("_____ ");
        System.out.println("\\ ab \\");
        System.out.println("/ cd /");
        System.out.println("\\____\\\t\t2. P A P E R\n");
    }

    public static void scissors(){
        System.out.println("O  /");
        System.out.println(" \\/");
        System.out.println(" /\\");
        System.out.println("O  \\\t\t3. S C I S S O R S\n");
    }
}