/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remedian;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author aycakckdrmz
 */
public class Remedian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calendarYear ( 2015 );
    }
    public static void phone(){//1
        System.out.println("Ring Ring");
    }
    public static void helloWorld(){//2
        System.out.println("Hello World! ");
    }
    public static void myData(){//3
        int val1 = 42; 
        double val2 = 99.42; 
        char val3 = 'L'; 
        String val4 = "I am going to learn programming"; 
        boolean val5 = true;
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
    }
    public static void helloPrompt(){//4
        System.out.print("Please enter your name:     ");
        Scanner input = new Scanner (System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name);        
    }
    public static void helloArgument ( String name ){//5
        System.out.println("Hello " + name);
    }
    public static void mathPrompt(){//6
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter first number:     ");
        int num1 = input.nextInt();
        System.out.print("Please enter secont=d number:     ");
        int num2 = input.nextInt();
        System.out.println("The sum is "+(num1+num2)); 
        System.out.println("The difference is "+(num1-num2) );
        System.out.println("The average is  "+ Math.floor((num1+num2)/2));
        if (num1<num2)
        {
            System.out.println("The biggest # is " + num2);
            System.out.println("The smaller # is " + num1);
        }
        else if (num1>num2)
        {
            System.out.println("The biggest # is " + num1);
            System.out.println("The smaller # is " + num2);
        }
        else if (num1==num2)
            System.out.println("The numbers are equal! ");
        else 
            System.out.println("Oops! Invalid input! ");
    
    }
    public static void mathArgument(int num1, int num2){//7
        System.out.println("The sum is " + ( num1 + num2 ) ); 
        System.out.println("The difference is " + ( num1 - num2 ) );
        System.out.println("The average is  " + Math.floor( (num1 + num2)/2));
        if (num1<num2)
        {
            System.out.println("The biggest # is " + num2);
            System.out.println("The smaller # is " + num1);
        }
        else if (num1>num2)
        {
            System.out.println("The biggest # is " + num1);
            System.out.println("The smaller # is " + num2);
        }
        else
            System.out.println("The numbers are equal! ");
    }
    public static void metersConversion(double mtToFt){//8
        mtToFt = mtToFt * 3.8;     //1 mt=3.8feet
        if (mtToFt <= 1)
            System.out.println(mtToFt + " foot");
        else if (mtToFt > 1)
            System.out.println(mtToFt + " feet");
        else 
            System.out.println("Oops! Invalid input! ");
    }
    public static double ftoC(double fToC){//9
        fToC = fToC * 9/5 + 32;
        return fToC;
    }
    public static double ctoF(double cToF){//10
        cToF= (cToF-32)*5/9;
        return cToF;
    }
    public static String posNegZero(int num){//11
        String output=" ";
        if (num>0)
            output = "Positive";
        else if (num<0)
            output = "Negtive";
        else
            output = "Zero";
        return output;
    }
    public static int numDays(int month){//12
        int output = 0;
        if (month>0 && month<13){
            if (month==4 || month==6 || month==9 || month==11)
                output = 30;
            else if (month==2)
                output = 28;
            else 
                output = 31;
        }
        else 
            output = 0;
        return output;
    }
    public static String numberToMonth(int num){//13
        String output=" ";
        if (num==1)
            output = "January";
        else if (num==2)
            output = "Feburary";
        else if (num==3)
            output = "March";
        else if (num==4)
            output = "April";
        else if (num==5)
            output = "May";
        else if (num==6)
            output = "Jun";
        else if (num==7)
            output = "July";
        else if (num==8)
            output = "August";
        else if (num==9)
            output = "September";
        else if (num==10)
            output = "October";
        else if (num==11)
            output = "November";
        else if (num==12)
            output = "December";
        else
            output = "Error";
        return output;
    }
    public static String numberToDay(int num){//14
        String output=" ";
        if (num==0)
            output = "Sunday";
        else if (num==1)
            output = "Monday";
        else if (num==2)
            output = "Tuesday";
        else if (num==3)
            output = "Wednesday";
        else if (num==4)
            output = "Thursday";
        else if (num==5)
            output = "Friday";
        else if (num==6)
            output = "Saturday";
        else
            output = "Error";
        return output;
    }
    public static double dayOfTheWeek(int m, int y, int d){//15
        double y0,m0,x;
        double num = 0; 
        y0 = y - (14 - m) / 12;
        x = y0 + y0/4 - y0/100 + y0/400;
        m0 = m + 12 * ( ( 14 - m ) / 12 ) - 2;
        num = ( d + x + ( 31 * m0 ) / 12 ) % 7;
        return (int) num;
    }
    public static boolean leapYear(int year){//16
        boolean check = false;
        if (year % 4 == 0)
          check = true;
        if (year % 100 == 0 && year % 400 != 0)
          check = false; //else >> false we dont need it 
        return check;
    }
    public static void easter(int eYear){ //17
        if (eYear <= 2048 && eYear >= 1982){
          int a = eYear % 19;
          int b = eYear % 4;
          int c = eYear % 7;
          int d = (19 * a + 24) % 30;
          int e = (2 * b + 4 * c + 6 * d + 5) % 7;
          if (d + e > 9){
            int apr = d+ e- 9;
            System.out.println ("Easter is Sunday, April "+apr+", in "+eYear  );
          }
          else {
            int mar = 22+d+e;
            System.out.println ("Easter is Sunday, March "+mar+", in "+eYear  );
          }
        }
        else {
          System.out.println("Oops invalid value! ");
        }
    }
    public static void lottery(){//18
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please enter the first number:  ");
        int num1 = input.nextInt();
        System.out.println  ("Please enter the second number:  ");
        int num2 = input.nextInt();
        int com1 = rand.nextInt(99) + 1;
        int com2 = rand.nextInt(99) + 1;
        if (num1==com1 && num2==com2)
          System.out.println("You won the lottery!! Congrats $10.000 is now yours!! ");
        else if (num1==com2 && num2==com1)
          System.out.println("You won the lottery!! Congrats $3.000 is now yours!! ");
        else if (num1==com2 || num2==com1 || num1==com1 || num2==com2)
          System.out.println ("You won the lottery!! Congrats $1.000 is now yours!! ");
        else
          System.out.println ("Oops! You got $0. But hey, next time ");
      }  
    public static int hurricane(int wsp){//19
        int cat = 0;
        if(wsp >= 155)
            cat = 5;
        else if(155>wsp && 130<wsp)
            cat = 4;
        else if(131>wsp && 110<wsp)
            cat = 3;
        else if(111>wsp && 95<wsp)
            cat = 2;
        else if(96>wsp && 73<wsp)
            cat = 1;
        return cat;
    }
    public static String season(int m, int d){//20
        String out="";
        if (d<=31 && d>0)    //we assume short day months wouldn't make an error 
        { //I couldn't find more practical and shorter if lines for this one :( 
            if((m==3 && (d>22 && d<31)) || (m==6 && (d>0 && d<21)) || (m==4) || (m==5)) 
                    out = "Spring";
            else if((m==6 && (d>22 && d<31)) || (m==9 && (d>0 && d<23)) || (m==7) || (m==8)) 
                    out = "Summer";
            else if((m==9 && (d>22 && d<32)) || (m==12 && (d>0 && d<22)) || (m==10) || (m==11)) 
                    out = "Fall";
            else if((m==12 && (d>22 && d<32)) || (m==3 && (d>0 && d<21)) || (m==1) || (m==2)) 
                    out = "Winter";
        }
        else 
            out = "This is not a day exist in the year!";
        return out;  
    }
    public static String muayThai (int weight){//21
        String output=" ";
        if(weight< 112)
            output = "Flyweight";
        else if (weight>=112 && weight<115 )
            output = "Super flyweight";
        else if (weight>=115 && weight<118 )
            output = " Bantamweight";
        else if (weight>=118 && weight<122 )
            output = " Super Bantamweight";
        else if (weight>=122 && weight<126 )
            output = " Featherweight";
        else if (weight>=126 && weight<130 )
            output = " Super featherweight";
        else if (weight>=130 && weight<135 )
            output = " Light weight";
        else if (weight>=135 && weight<140 )
            output = " Super lightweight";
        else if (weight>=140 && weight<147 )
            output = " Welterweight";
        else if (weight>=147 && weight<154 )
            output = " Super welterweight";
        else if (weight>=154 && weight<160 )
            output = " Middleweight";
        else if (weight>=160 && weight<167 )
            output = " Super middle weight";
        else if (weight>=167 && weight<175 )
            output = " Light heavyweight";
        else if (weight>=175 && weight<183 )
            output = " Super light heavyweight";
        else if (weight>=183 && weight<190 )
            output = " Cruiserweight";
        else if (weight>=190 && weight<220 )
            output = " Heavyweight";
        else if (weight>=220 )
            output = " Super heavyweight";
        else 
            output = "Invalid input! ";
        return output;
    }
    public static double poundsToKg (double pound){//22
        double kg = 0; //1 pound = 0.453592 kg
        kg = pound * 0.453592;
        return kg;
    }
    public static double heightToM (double feet, double inch){//23
        double mt = 0; //1 foot = 0.304mt & 1 inch = 0.0254mt
        mt = feet * 0.304 + inch * 0.0254;
        return mt;
    }
    public static String bmi (double feet, double inch, double pound){//24
        double bmi= 0;
        String out=" ";
        bmi = poundsToKg(pound)/ Math.pow(heightToM (feet, inch), 2);
        if (bmi<15)
            out = " Starvation ";
        else if (bmi < 17.5) //else if lets us not define the other side of limit
            out = "Anorexic";
        else if (bmi < 18.5)
            out = "Underweight";
        else if (bmi < 25)
            out = "Ideal";
        else if (bmi < 30)
            out = "Overweight";
        else if (bmi < 40)
            out = "Obese";
        else if (bmi >= 40)
            out = " Morbidly Obese";
        return out;
    }
    public static void moneyToChange (double reminder){//25
        int hun= (int) Math.floor(reminder/100);
        reminder = reminder%100;
        int fift = (int) Math.floor(reminder/50);
        reminder = reminder%50;
        int twn= (int) Math.floor(reminder/20); 
        reminder = reminder%20;
        int ten = (int) Math.floor(reminder/10);
        reminder = reminder%10;
        int five = (int) Math.floor(reminder/5); 
        reminder = reminder%5;
        int one = (int) Math.floor(reminder/1);
        reminder = reminder%1;
        int quar = (int) Math.floor(reminder/0.25);
        reminder = reminder%0.25;
        int dime = (int) Math.floor(reminder/0.10);
        reminder = reminder%0.10;
        int nick = (int) Math.floor(reminder/0.05);
        reminder = reminder%0.05;
        int pen = (int) Math.floor(reminder/0.01+1);
        System.out.println("100 dollar bills " + hun);
        System.out.println("50 dollar bills " + fift);
        System.out.println("20 dollar bills " + twn);
        System.out.println("10 dollar bills " + ten);
        System.out.println("5 dollar bills " + five);
        System.out.println("1 dollar bills " + one);
        System.out.println("Quarters " + quar);
        System.out.println("Dimes " + dime);
        System.out.println("Nickels " + nick);
        System.out.println("Pennies " + pen);       
    }
    public static void wages (){//26
        Scanner input = new Scanner(System.in);
        double pay=0;
        System.out.print("Please enter weekly hours: ");
        double hour = input.nextDouble();
        System.out.print("Please enter hourly wage: ");
        double wage = input.nextDouble();
        if (hour > 40)
            pay = ( hour - 40 ) * 1.5 * wage + 40 * wage;
        else //assuming there will be perfect input 
            pay = hour*wage;
        System.out.print("Your paycheck amount: " + pay);
    }
    public static int smallest(int a, int b, int c){//27
        int sm = 0; 
        if (a <= b && a <= c)
           sm=a; 
        else if (b<=a && b<=c)
            sm=b;
        else if(c<=a && c<=b)
            sm=c;
        return sm;   
    }
    public static boolean allTheSame (int a, int b, int c){//28
        boolean check=false; 
        if (a == b && a == c && b == c)
            check = true; 
        return check;   
    }
    public static boolean allDifferent (int a, int b, int c){//29
        boolean check=false; 
        if (a!=b && a!=c && b!=c)
            check = true; 
        return check;   
    }
    public static boolean sorted (int a, int b, int c){//30
        boolean check=false; 
        if (a<b && b<c && a<c)
            check = true; 
        return check;   
    }
    public static int caughtSpeeding (int speed, boolean bd){//31
        int pun = 0;
        if (speed<=60)
            pun=0;
        else if ((speed <= 81 && bd==false) || (speed <= 86 && bd==true))
            pun=1;
        else if ((speed > 81 && bd==false) || (speed > 91 && bd==true ))
            pun=2;
        return pun;
    }
    public static String alarmClock (int day, boolean ch){//32
        String out = " ";
        if ((day==6 || day==0) && ch == true)
            out = "off";
        else if ((day>0 && day<6) && ch == false)
            out = "7:00";
        else if ((day>0 && day<6) && ch == true)
            out = "10:00";
        else if ((day==6 || day==0) && ch == false)
            out = "10:00";    
        return out;
    }
    public static int luckySum (int a, int b, int c){//33
        int sum = 0;
        if (a != 13 && b != 13 && c != 13)
            sum = a+b+c;
        else if (a!=13 && b!=13)
            sum = a + b;
        else if(a != 13)
            sum = a;
        else //all 3 is 13 return 0 
            sum = 0;
        return sum;
    }
    public static void whileNum (int num){//34
        int counter = 1;
        while(counter < num){
            System.out.println(counter);
            counter++;
        }
    }
    public static void forNum (int num){//35
        for(int i=1; i<num; i++)
            System.out.println(i); 
    }
    public static void doNum (int num){//36
        int counter = 1;
        do{
            System.out.println(counter);
            counter++;
        }while(counter<num);
    }
    public static void bottlesOfBeer (int num){//37
        for(int i=num; i>0; i--)
            System.out.println(i + " Bottles of Beer on the wall!"); 
    }
    public static void headsOrTails (int times){//38
        Random rand = new Random ();
        int countH = 0; 
        int countT = 0;
        for (int i = 0; i<times; i++){
            int ht = rand.nextInt(1);
            if ( ht==0 )
                countH++;
            else if ( ht==1 )
                countT++;
        }
        System.out.println("Heads " + countH + " times!"); 
        System.out.println("Tails " + countT + " times!"); 
    }
    public static void nextLeapYear(int year){//39
        int counter = 0;
        int nextYear = 0;
        while (counter<=20){
            if(leapYear(year + nextYear)== true){
                System.out.println(year + nextYear);
                counter++;
            }
            nextYear++;    
        }
    }
    public static void binary(int num ){//40
        while (num > 2){
        System.out.println( num % 2 );
        num = (int) Math.floor( num / 2 );
        }
    }
    public static void userNums (){//41
        int cou2=0; 
        int cou3=0; 
        int cou5=0; 
        int unum=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Please enter a positive num! Any other to exit!"); 
            unum = input.nextInt();
            if (unum % 2 == 0)      // NO ELSE cuz unum could be devide by 2,3,5 at the same time!
                cou2++;
            if (unum % 3 == 0)
                cou3++;
            if (unum % 5 == 0)
                cou5++;
        }while (unum > 0 );
        System.out.println("Number of inputs that divisible by 2 is "+cou2);
        System.out.println("Number of inputs that divisible by 3 is "+cou3);
        System.out.println("Number of inputs that divisible by 5 is "+cou5);
    }
    public static void whilePractice (){ //42
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: "); 
        int firstNum = input.nextInt();
        System.out.println("Please enter the second number: "); 
        int secNum = input.nextInt();
        int counter = firstNum; 
        int sum=0;
        while(counter >= firstNum && counter<=secNum){
            if (counter % 2 == 0)
                sum = counter + sum;
            else if (counter % 2 == 1)
                System.out.println(counter); 
            counter++;
            }
        System.out.println("The sum of all even numbers is "+sum); 
        }
    public static void forPractice (){ //43
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: "); 
        int firstNum = input.nextInt();
        System.out.println("Please enter the second number: "); 
        int secNum = input.nextInt();
        int sum = 0;
       for (int i = firstNum; i <= secNum; i++ ){
            if (i % 2 == 0)
                sum = i + sum;
            else if (i % 2 == 1)
                System.out.println(i);    
            }
        System.out.println("The sum of all even numbers is "+sum); 
    }
    public static void doPractice (){ //44
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: "); 
        int firstNum = input.nextInt();
        System.out.println("Please enter the second number: "); 
        int secNum = input.nextInt();
        int counter = firstNum; int sum=0;
        do{
            if (counter%2==0)
                sum = counter+sum;
            else if (counter%2==1)
                System.out.println(counter);    
            counter++;
            }while(counter>=firstNum && counter<=secNum);
        System.out.println("The sum of all even numbers is "+sum);   
    }
    public static void guessingGame(){ //45
        Random rand = new Random ();
        Scanner input = new Scanner(System.in);
        int gamepick=0;
        boolean keeplay=true;
        do{
            System.out.println("Welcome to the guessing game! ");
            System.out.println("I picked a number between 0 and 10000! Guess what? ");
            gamepick= rand.nextInt(10000)+1;
            while(keeplay==true){
                System.out.println("Please guess my number \\o/  or enter zero to exit! "); 
                int guess = input.nextInt();
                if (guess==0){
                    keeplay = false; 
                    break;
                }
                else if(guess==gamepick){
                    System.out.println("Congrats! You've found it!!  ");
                    System.out.println("");
                    keeplay=false;
                }
                else if(guess>gamepick)
                    System.out.println("Too high! ");   
                else if(guess<gamepick)
                    System.out.println("Too low! "); 
            }
            System.out.println("Press 'Y' to play again, press any other key to exit!");
            System.out.println("");
            String inp = input.next();
            if (inp.charAt(0)=='Y' || inp.charAt(0)=='y')
                keeplay=true;
            else keeplay=false;
        }while(keeplay==true);
    }
    public static void calendarMonth ( int month, int year ){//46
        int x = (int) dayOfTheWeek(month, year, 1);
        System.out.println("");
        System.out.println("    " + numberToMonth(month) +"  "+ year);
        System.out.println( x );
        System.out.println("  S  |  M   |  T   |   W  |  T   |   F  |   S  |");
            for(int j =1; j<=numDays(month); j++)
            {
                if (j == 1 && x==0)
                    System.out.print("  0"+j+" | ");
                else if (j == 1 && x==1)
                    System.out.print("     |  0"+j+"  | ");
                else if ( j == 1 && x==2)
                    System.out.print("     |      |  0"+j+"  | ");
                else if ( j == 1 && x==3)
                    System.out.print("     |      |      |   0"+j+" | ");
                else if ( j == 1 && x==4)
                    System.out.print("     |      |      |      |   0"+j+" | ");
                else if ( j == 1 && x==5)
                    System.out.print("     |      |      |      |      |   0"+j+" | ");
                else if ( j == 1 && x==6)
                    System.out.print("     |      |      |      |      |      |   0"+j+" |"); 
                
                if(j!=1 && j<10)
                    System.out.print("  0"+j+" | ");
                else if(j!=1 && j>=10)
                    System.out.print("  "+j+" | ");
                if(dayOfTheWeek(month, year, j)==6)
                    System.out.println("");
            }
        }
    public static void calendarYear (int year ){ //47
        for(int i = 1; i <= 12; i++)
            calendarMonth( i, year);
            System.out.println("");
            System.out.println("");
    }
    public static void carpetEstimate(){//48
        double carp =0; 
        double inst=0; 
        double total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght of the room in feet: "); 
        double l = input.nextDouble();
        System.out.println("Please enter the lenght of the room in width: "); 
        double w = input.nextDouble();
        System.out.println("Please enter the cost of the carpet per sq ft: "); 
        double per = input.nextDouble();
        carp = l * w * per;
        inst = carp * 0.2;
        total = carp + inst;
        System.out.println("The cost of the carpet: " + carp); 
        System.out.println("The installation cost : " + inst); 
        System.out.println("The total installed cost : " + total); 
    }
    public static void deptStore (){ //49
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the item number "); 
        double item = input.nextDouble();
        double cust = Math.floor(item / 1000000);
        System.out.println("The customer bought to item number " + cust); 
        item = item % 1000000;
        double many = Math.floor( item / 100000); //we have to assume that numbers of item that been bought is one digit number
        item = item % 100000;
        double price = item / 100; 
        System.out.println("He/she bought 3 of them, at a unit cost of $" + price + " for a total cost of $" + (price*many));
    }
    public static void marketingResearch (){ //50
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score from person 1"); 
        double score = input.nextDouble();
        double min = score; 
        double max = score;
        double total = score;
        for( int i = 2; i < 9; i++){
            System.out.print("Enter the score from person "+i); 
            score = input.nextDouble();
            while(score > 10 || score < 0){
            System.out.println("This is not a valid score. "); 
            System.out.print("Enter the correct score: ");
            score = input.nextDouble();
           }
            total = total+score;
            if(score < min)
                min = score;
            if(score > max)
                max = score;
        }
        System.out.print("The average score for this product is " +((total - max - min) / 6)); 
    }
    
}
