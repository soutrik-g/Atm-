
import java.util.Scanner;
import java.io.*;
 class AtmMachine
{
private double totalBal=1000;
private int account,pin;
Scanner sc=new Scanner(System.in);
public int userAccount()throws IOException
{
System.out.print("Enter your account number: ");
 account=sc.nextInt();
return account;
}
public int userPin()throws IOException
{
System.out.print("Enter your pin number: ");
pin=sc.nextInt();
return pin;
}

public void drawMainMenu()throws IOException
{
System.out.println("\nATM main menu:");
System.out.println("1 - View account balance");
System.out.println("2 - Withdraw funds");
System.out.println("3 - Add funds");
System.out.println("4 - Terminate transaction");
System.out.print("Choice: ");
int selection=sc.nextInt();
switch(selection)
{
case 1:
viewAccountInfo();
break;
case 2:
withdraw();
break;
case 3:
addFunds();
break;
case 4:
System.out.println("Thank you for using this ATM!!! goodbye");
}
}
public void startAtm()throws IOException
{
userAccount();
userPin();
drawMainMenu();
}
public void viewAccountInfo()throws IOException
{
System.out.println("Account Information:");
System.out.println("\t--Total Available balance:Rs."+totalBal);
choice();
}
public void withdraw()throws IOException
{
System.out.println("Withdraw money:");
System.out.println("1 - Rs.50");
System.out.println("2 - Rs.100");
System.out.println("3 - Rs.500");
System.out.println("4 - Rs.1000");
System.out.println("5 - Back to main menu");
System.out.print("Choice: ");
int withdrawSelection=sc.nextInt();
switch(withdrawSelection)
{
case 1:
checkNsf(50);
choice();
break;
case 2:
checkNsf(100);
choice();
break;
case 3:
checkNsf(500);
choice();
break;
case 4:
checkNsf(1000);
choice();
break;
case 5:
choice();
break;
}
}
public void checkNsf(int withdrawAmount)
{
if(totalBal -withdrawAmount < 0)
System.out.println("\n***ERROR!!! Insufficient funds in you accout***");
else
{
totalBal =totalBal -withdrawAmount;
System.out.println("\n***Please take your money now...***");
}
}
public void addFunds()throws IOException
{
System.out.println("Deposit funds:");
System.out.println("1 - Rs.50");
System.out.println("2 - Rs.100");
System.out.println("3 - Rs.500");
System.out.println("4 - Rs.1000");
System.out.println("5 - Back to main menu");
System.out.print("Choice: ");
int addSelection=sc.nextInt();
switch(addSelection)
{
case 1:
deposit(50);
choice();
break;
case 2:
deposit(100);
choice();
break;
case 3:
deposit(500);
choice();
break;
case 4:
deposit(1000);
choice();
break;
case 5:
choice();
break;
}
}
public void deposit(int depAmount)
{
System.out.println("\n***Please insert your money now...***");
totalBal =totalBal +depAmount;
}
public void choice()throws IOException
{
System.out.println("Do you want to continue?");
System.out.println("If yes press 1 or if no press 2");
int chioice=sc.nextInt();
if(chioice==1)
{drawMainMenu();
}
else if(chioice==2)
{
System.out.println("\n\nThank You for using this ATM!!! goodbye");
}
}

public static void main()throws IOException
{
AtmMachine1 myAtm = new AtmMachine1();
myAtm.startAtm();
}
}
