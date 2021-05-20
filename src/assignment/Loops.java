package assignment;

public class Loops {

public static void main(String[] args) {

// 1.) while loop
	
int i=1;// Initialization
while (i<=10)//(conditional) till what value we want to print the values
{ 
	System.out.println(i);
	 i=i+1;// (increment or decrement)the value increases by 1 till its equal to 10.
}

System.out.println("***************");

//2.) for loop

for(int j=1;j<=10;j++)
{ 
	System.out.println(j); // print 1 to 10
}

for(int k=10;k>=1;k--)
{ 
	System.out.println(k); // print 10 to 1
}

System.out.println("***************");


//3.) increment and decrement

int a=1;
int b= a++; // post increment- the value increases later on

System.out.println(a);
System.out.println(b);

System.out.println("------");

int c=1;
int d= ++c; // pre increment- the value increases before

System.out.println(c);
System.out.println(d);

System.out.println("------");


int a1=2;
int b1= a1--; // post decrement- the value decreases later on

System.out.println(a1);
System.out.println(b1);

System.out.println("------");

int c1=2;
int d1= --c1; // pr decrement- the value decreases before


System.out.println(c1);
System.out.println(d1);
}

}
