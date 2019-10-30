import java.util.*;
class HW2{
public static void main(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array Size");//Entering Array Size
int n=sc.nextInt();
int A[]=new int[n];
System.out.println("Enter Array Nos");
    for(int i=0;i<n;i++)
        A[i]=sc.nextInt();
int t=0;System.out.println("Enter Array Rotation Number");//Entering from where to be rotated
int q=sc.nextInt();
for(int k=0;k<q;k++){t=A[0];
    for(int j=0;j<n-1;j++){
    A[j]=A[j+1];
    }
    A[n-1]=t;
} 
for(int w=0;w<n;w++)
System.out.println(A[w]);           
}
}