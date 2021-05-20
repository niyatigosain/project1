package assignment;

public class StringConcatination {

public static void main(String[] args) {

// declaration
int a=100,b=200,c=300;
String x= "Hi", y="There";


// 1.) String works as left to right execution.
System.out.println(a+b);
System.out.println(x+y+a+b);// adding string before integer, the integer becomes string.
System.out.println(a+b+x+y+a+x+b+y);

// 2.) + sign is concatenation operator.
System.out.println("the value of a is:" +a);
System.out.println("the value of b is:" +b);
System.out.println("the value of a & b is:"+(a+b));

// HAVE QUESTIONS**

// 3.) if & else condition

if (a<b)// true
{System.out.println("b is greater than a");}
else
{System.out.println("a is greater than b");}

// 4.) nested if else condition/& operator

if (a>b & a>c)// false & false = false
{System.out.println("a is the greater");}

else if (b>c)// false
{System.out.println("b is greater than b");}

else // true
{System.out.println("c is greater than b");}

}

}
