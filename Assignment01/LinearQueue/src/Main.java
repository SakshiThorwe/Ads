import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(4);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("0.Exit\n1.Push\n2.Pop\n3.Peek");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the number to push");
                    int num = sc.nextInt();
                    q.push(num);
                    break;
                case 2:
                    System.out.println("Poped data : " + q.pop());
                    break;
                case 3:
                    System.out.println("Peeked Data : " + q.peek());
                    break;
            }

        }while (choice != 0);
        sc.close();
    }
}