import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class numberguess{
public static void main(String[] args) throws Exception {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
Random random = new Random();
int val = random.nextInt(101);
//System.out.println(val);
int count =0;
for (int i=0; i<10; i++)
{
String choice = "yes";
while (choice.equals("yes")) {
System.out.println("Guss the Number Between (0 to 100 )");
int num = Integer.parseInt(reader.readLine());
if (num >= 101){
System.out.println("Worng Input");
break;
}
if (val > num) {
System.out.println("the number is low");
break;
} 
if (val < num) {
System.out.println("the number is high");
break;
}
if (val == num) {
count++;
System.out.println("Congratution You gussed the correct Number ");
System.out.println("Your Score : " + count);
System.out.println("Are you want to play Again (Yes/No)");
choice = reader.readLine().toLowerCase();
if (choice.equals("no")){
i =10;
break;
}
while (!choice.equals("yes")){
System.out.println("Enter the Correct Input (Yes/No )");
choice = reader.readLine().toLowerCase();
}
val=random.nextInt(101);
//System.out.println(val);
}
}
}
}
}
