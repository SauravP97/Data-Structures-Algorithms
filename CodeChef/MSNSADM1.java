//https://www.codechef.com/AUG19B/problems/MSNSADM1
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=0; 
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    int max= 0;
		    for(int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		        a[i] = a[i]*20;
		    }
		    for(int i=0; i<n; i++){
		        b[i] = sc.nextInt();
		        b[i] = b[i]*10;
		    }
		    int f=0;
		    for(int i=0; i<n; i++){
		        int num = a[i]-b[i];
		        if(num<0)num=0;
		        if(max<num)max=num;
		        }
		    System.out.println(max);
		}
		sc.close();
	}
}
