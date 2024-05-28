import java.util.Scanner;
public class Kadens_Algo {
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
        int sum=0;
        int maxi=arr[0];
        for(int i=0;i<n;i++) {
            sum=sum+arr[i];
            maxi=Math.max(sum,maxi);
            if(sum<0) 
                sum=0;
        }
        return maxi;
    }
}
