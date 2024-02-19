import java.util.Scanner;
import java.util.Stack;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> stack = new Stack<String>();                                                                      //What the grocery list will consist of


        System.out.println("GROCERY LIST MAKER ");
        System.out.println("-----------------\n");
        System.out.println("'A' to add something new to your grocery list\n" +
                "'D' to delete \n" +
                "'S' to view list\n" +
                "'E' to exit\n\n");

        while(true){                                                                                                    //Loop so program doesn't quit after one input


        System.out.println("What would you like to do? (A,D,S,or E)");
        String Choice = scanner.nextLine();
        Choice = Choice.toUpperCase();                                                                                  //Capitalizes input so can accept more versions of A D S or E

        switch(Choice) {

            case "A":
                System.out.println("Enter item:");
                String item = scanner.nextLine();
                System.out.println(item + " added!");
                stack.push(item);
                break;

            case "D":
                stack.pop();
                System.out.println("Last item removed");
                break;

            case "S":
                System.out.println("GROCERY LIST\n");
                System.out.println(stack);
                break;

            case "E":
                System.exit(0);
                break;

            default:
                System.out.println("Wrong input. Use A,S,D or E.\n");


                   }


        }

    }
}
