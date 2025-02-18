# Using Data

## Declaring named constants
    Variables that remain the same
```bash
    final int RANDOM_INT_VALUE = 5;
    final double PI = 3.14159;
    final Long A_BING_NUMBER = 5000000000000; 
    final String NAME = "Him";
```
The final key identifies the variable as constant, constant variable names are uppercase
and separated by an underscore.

## Concatenating
    Strings, variables and constants can be concatenated by using the
    (+) sign.

## Integer data types
    A byte has a min value of -128, max value of 127 and byte size of 1
    A byte has a min value of -32,768, max value of 32,767 and byte size of 2
    A byte has a min value of -2,147,483,648, max value of 2,147,483,647 and byte size of 4
    A byte has a min value of -9,223,372,036,854,775,808, max value of 9,223,372,036,854,775,807 and byte size of 8

## Floating-Point data types

    float has a min value of -3.4*10^38, max value 3.4*10^38 (up to 7 decemal places) and a byte size of 4
    float has a min value of -1.7*10^308, max value -1.7*10^308(up to several 15 decemal places) and a byte size of 8

## Char data type
A char can hold any single character.
```bash
   char myLetterName = 'N'
```
char values are surrounded by single quotation marks.


## Using the scanner class to accept keyboard input
To create a scanner object and connect it to the system.in object:
```bash
   import java.util.Scanner; 
   public class testing
   {
     public static void main(String[] args)
     {
       String name;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter you name>> ");
       name = input.nextLine();
       System.out.println(name);
     }
   }
 ```
To except other data type, int>>(input.nextInt), double>>(input.nextDouble)...
### Warning!:
    if you accept numeric input(nextInt, nextDouble, nextShort...) before accepting string input (next.Line()),
    the string input is ignored.
    Solution:
    After accepting any numeric input add an extra input.nextLine() method
    then the actual (String var = input.nextLine()) input.
```bash
import java.util.Scanner; 
   public class testing
   {
     public static void main(String[] args)
     {
       String name;
       int age;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter you age>> ");
       age = input.nextInt();
       input.nextLine(); // solution
       System.out.println("Enter you name>> ");
       name = input.nextLine();
       System.out.println(name);
     }
   }
```
## JOption class extended
THE JOptionPane class provide more method to display specific dialog box's such as, 
    1. InputDialog >> which prompts the use for text input.
    2. ConfirmDialog >> which display predefined answers for the user to choose from, to respond to a question.
The format is the same as the showMessageDialog()
```bash
String var = JOptionPane.InputDialog(null, "Enter something please!");
String answers = JOptionPane.CornfrmDialog(null, "Enter something please!");
```

### Modifying the appearance of a dialog box
The dialog box method can take up to 4 arguments that can change its appearance.
```bash
String var = JOptionPane.showInputDailog(null, "text to be displayed", "The title of the dialog box", "The type of dialog box")
String var = JOptionPane.showInputDialog(null, "Are you ok guys? Lets talk to each.", "Concerned...", "QUESTION_MESSAGE");
```
The type of dialog box can only be chosen from the following:
ERROR_MESSAGE, INFORMATION_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE or WARNING_MESSAGE.

## Exercises 
1. Create a branch and complete these exercise.

### MinutesConversion
In a file called MinutesConversion.java create an application that takes use input as an int and 
int of minutes and coverts it to hours and days.

### ElectionStatistics
In a file called ElectionStatistics.java create an application that takes user input for three
politicians and the number of votes each of them received and calculate their
percentage and display the winner of the elections.

### RandomGuessMatch
In a file called RandomGuessMatch.java create an application that selects a random number 
between 1 and 5 and asks the user to guess the number. 
Display another message that displays the random number  and a boolean value 
depending on whether the user's guess is correct.