import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age: ");
        String age=scanner.nextLine();
        System.out.println("First Name: ");
        String firstName=scanner.nextLine();
        System.out.println("Favourite food: ");
        String favouriteFood=scanner.nextLine();
        System.out.println("Age: "+age);
        System.out.println("First Name: "+firstName);
        System.out.println("Favourite food: "+favouriteFood);
    }

}
