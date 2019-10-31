import java.util.*;
class HW2{
public static void main(){
Scanner sn=new Scanner(System.in);
System.out.print("Enter Array Size");//Entering Array Size as you want
int n=sn.nextInt();
int A[]=new int[n];
System.out.println("Enter Array Numbers");
    for(int i=0;i<n;i++)
        A[i]=sn.nextInt();
int t=0;System.out.print("Enter Array Rotation Number");//Entering from where to be rotated
int q=sn.nextInt();
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