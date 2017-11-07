
import java.util.*;

public class Asterisks {
  public static void main (String[] args) { 



Scanner input = new Scanner(System.in);
while (true) {
System.out.println("Enter a number of asterisks: ");
int num = input.nextInt();
for (int i = 0;  i < num; i++) {
    System.out.print("*");
} 
    System.out.println(); 
System.out.println("Do you want to start again? yes/no ");
String ans;
ans = input.nextLine();
System.out.println("answer "+ans );

if ( ans == "no") {
break;
 

    }
   }
 }
}
