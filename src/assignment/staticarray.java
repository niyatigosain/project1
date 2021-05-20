package assignment;

public class staticarray {

	public static void main(String[] args) {
		
// Array -data structure which can store similar data types.	
		
// 1.) integer array- works for integers		

int i[]= new int [5];
i[0]= 10;
i[1]= 20;
i[2]= 30;
i[3]= 40;
i[4]= 50;

System.out.println(i[4]);
System.out.println(i.length);// to see the length of array

// Print all values of array using for loop

for(int j=0; j<i.length; j++)
{ System.out.println(i[j]); }


//2.) double array- works for decimals

double d[]= new double [4];
d[0]=11.33;
d[1]=12.44;
d[2]=13.55;
d[3]=14.66;

System.out.println(d[3]);

//3.) character array- works for characters

char g[]= new char [4];
g[0]='M';
g[1]='2';
g[2]='$';

System.out.println(g[2]);

//4.) boolean array- works for true and false condition.

boolean h[]= new boolean [2];
h[0]=true;
h[1]=false;

System.out.println(h[1]);
	
//5.) string array- works for sting variable type.

String s[]= new String [2];
s[0]="you" ;
s[1]="rock";

System.out.println(s[1]);

//In static array the values are fixed and it can store only similar data types, therefore we use Object array and Dynamic array.

//5.) object array- object is the class
// in below example James is a gym member and below we will display his details.

Object ob[]=new Object[5];
ob[0]= "James";
ob[1]= "30";
ob[2]= "75.2";
ob[3]= "2/2/1990";
ob[4]= "M";

System.out.println(ob[3]);
System.out.println(ob.length);

// running for loop to display Jame's full information.
for(int t=0; t<ob.length; t++)
{ System.out.println(ob[t]); }


}

}
