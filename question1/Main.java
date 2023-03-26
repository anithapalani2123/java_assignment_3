
package question1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book bk=new Book();
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        bk.setTitle(s);
        System.out.println("This title is "+bk.getTitle());
    }

}