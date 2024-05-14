//Simple kaden algo which works for postivte&&Negative values
import java.util.Scanner;
public class Kadens_Neg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int ans=kaden(arr,n);
        System.out.println(ans);
        sc.close();
    }
    public static int kaden(int arr[] ,int n) {
        int meh=0;//max ending here
	int maxi=Integer.MIN_VALUE;
	for(int i=0;i<n;i++) {
	meh=meh+arr[i];
	if(arr[i]>meh)
		meh=arr[i];
	if(meh>maxi)
		maxi=meh;
		 
	}
        return maxi;
    }
}
