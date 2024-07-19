import java.util.Scanner;
public  class LargestHistogram {


    public int getLargestHistogram(int arr[]) {
        int ps[]=new int[arr.length];
        int ns[]=new int[arr.length];
        int maxi=-1;
        ps[0]=-1;

        for(int i = 1;i<arr.length;i++) {
            int flag=0;
            for(int j= i-1; j>=0 ;j--) {
                if(arr[j] < arr[i]) {
                    flag=1;
                    ps[i]=j;
                    break;
                }
            }
            if(flag==0)
                    ps[i]=-1;
        }
        
        for(int i = 0;i<arr.length;i++) {
            int flag=0;
            for(int j= i+1; j<arr.length ;j++) {
                if(arr[j] < arr[i]) {
                    flag=1;
                    ns[i]=j;
                    break;
                }
            }
            if(flag==0)
                    ns[i]=9;
        }

        for(int i=0;i<arr.length;i++) {
            int area= (ns[i]-ps[i]-1)*arr[i];
            maxi=Math.max(area,maxi);
        }
        return maxi;
        
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();
        
            LargestHistogram l=new LargestHistogram();
            System.out.println(l.getLargestHistogram(arr));
            
    }
}
