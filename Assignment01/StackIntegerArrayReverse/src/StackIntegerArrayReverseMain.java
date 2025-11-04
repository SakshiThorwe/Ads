import java.util.Scanner;

public class StackIntegerArrayReverseMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;

        Stack st = new Stack(4);
        do{
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Print");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter value : ");
                    int value = sc.nextInt();
                    st.push(value);
                    break;
                case 2:
                    System.out.println("Poped value : " + st.pop());
                    break;
                case 3:
                    System.out.println("Peeked value : " + st.peek());
                    break;
                case 4:
                    st.print();
            }
        }while(choice != 0);
    }
}