import com.sunbeam.Stack;

import java.util.Scanner;

public class DescendingStackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        Stack st = new Stack(4);
        do {
            System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter value : ");
                    int value = sc.nextInt();
                    st.push(value);
                    break;
                case 2:
                    System.out.println("Poped value: " + st.pop());
                    break;
                case 3:
                    System.out.println("Peeked value: " + st.peek());
            }
        }while (choice != 0);

        sc.close();
    }
}