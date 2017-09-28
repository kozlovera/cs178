
import java.util.*;

public class Asterisks {
  public static void main (String[] args) { 


while (true){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number of asterisks: ");
int num = input.nextInt();
for (int i = 0;  i < num; i++) {
    System.out.print("*"); 
   // System.out.print(ln);
} 
System.out.println("Do you want to start again? yes/no ");
String ans = input.nextLine();
if ( ans == "no") {
break;
 

    }
   }
 }
}
