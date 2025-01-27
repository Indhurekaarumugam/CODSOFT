import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class numbergame
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
//BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
Random random=new Random();
int val=random.nextInt(100)+1;
//System.out.println("Random number :" +val);
int  count=0;
for(int i=0;i<10;i++)
{
//System.out.println("Random number :" +val);
String choice="yes";
while(choice.equals("yes"))
{
int guessnum=input.nextInt();
//System.out.println("Enter the number:"+guessnum);
if(guessnum>=101)
{
System.out.println("please enter number between1 to 100");
break;
}
//int guessnum=input.nextInt();
//System.out.println("Enter the number:"+guessnum);
if(guessnum < val)
{
System.out.println("The number is low");
break;
}
if(guessnum >val)
{
System.out.println("the number is high");
break;
}
if(guessnum==val)
{
System.out.println("correct!well done");
count++;
System.out.println("Your score: "+count);
System.out.println("are you want play again (yes/no)");
input.nextLine();
choice=input.nextLine().toLowerCase();
if(choice.equals("no"))
{
i=10;
break;
} 
}
}
} 
}
}


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           