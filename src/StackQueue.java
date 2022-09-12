import java.util.LinkedList;
import java.util.Scanner;

public class StackQueue {
    public static void main(String[] args) {
        //Welcome Message for User
        System.out.println("Welcome to Stacks and Queues Problems using Linked List .");

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> linkedList = new LinkedList<>();

        int choice;
        do {
            System.out.println("STACK & QUEUE OPERATIONS");
            System.out.println("1. PUSH in STACK \n2. POP from STACK \n3. DISPLAY STACK \n4. ENQUEUE in QUEUE \n5. DEQUEUE in QUEUE \n6. DISPLAY QUEUE \n7. EXIT \nEnter the Choice for Operation : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Data to Push in Stack : ");
                    int dataFirst = sc.nextInt();
                    linkedList.addFirst(dataFirst);
                    break;
                case 2:
                    linkedList.peek();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(choice != 6);
    }
}
