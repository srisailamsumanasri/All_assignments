import java.util.*;
public class menuDrivenMath
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int choice;
char c;
do
{
System.out.println("********** MENU **********");
System.out.println("1. Print Table of a Number");
System.out.println("2. Calculate Factorial");
System.out.println("3. Check Prime Number");
System.out.println("4. Print Fibonacci Series");
System.out.println("5. Exit");
System.out.println("**************************");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice)
{
case 1: 
System.out.print("Enter a number to print its table: ");
int n1 = sc.nextInt();
System.out.println("Table of " + n1 + ":");
for (int i = 1; i <= 10; i++)
{
System.out.println(n1 + " * " + i + " = " + (n1 * i));
}
break;
case 2: 
System.out.print("Enter a number to calculate factorial: ");
int n2 = sc.nextInt();
int fact = 1;
for (int i = 1; i <= n2; i++) 
{
fact *= i;
}
System.out.println("Factorial of " + n2 + " is: " + fact);
break;
case 3: 
System.out.print("Enter a number to check if it's prime: ");
int n3 = sc.nextInt();
boolean isPrime = true;
if (n3 <= 1)
{
 isPrime = false;
}
else 
{
for (int i = 2; i <= n3 / 2; i++)
{
if (n3 % i == 0)
{
isPrime = false;
break;
}
}
}
if (isPrime)
{
System.out.println(n3 + " is a prime number.");
}
else
{
System.out.println(n3 + " is not a prime number.");
}
break;
case 4: 
System.out.println("First 10 numbers of the Fibonacci series:");
int a = 0, b = 1;
System.out.print(a + " " + b + " ");
for (int i = 3; i <= 10; i++) 
{
int c1 = a + b;
System.out.print(c1 + " ");
a = b;
b = c1;
}
System.out.println(); 
break;
case 5:
System.out.println("Exit.");
break;
default:
System.out.println("Invalid choice! Please enter a number between 1 and 5.");
}
System.out.print("\nBack to Menu? (Y/N): ");
c = sc.next().charAt(0);
} 
while (c == 'Y' || c== 'y');
}
}
