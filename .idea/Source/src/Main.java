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
        scanner.nextLine();
        System.out.print("Age: "+age);
        scanner.nextLine();
        System.out.print("First Name: "+firstName);
        scanner.nextLine();
        System.out.print("Favourite food: "+favouriteFood);
        scanner.nextLine();
System.out.println("Age: "+age+"First Name: "+firstName+" Favourite food: "+favouriteFood);

    }

}
