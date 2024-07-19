import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {


    static void getPermutations(int arr[], ArrayList<ArrayList<Integer>> ans ,ArrayList<Integer> ds ,boolean marked[]) {
        if(ds.size()==marked.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<arr.length;i++) {
            if(!marked[i]) {
                marked[i]=true;
                ds.add(arr[i]);
                getPermutations(arr, ans, ds, marked);
                marked[i]=false;
                ds.remove(ds.size()-1);
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
          
        boolean marked[]=new boolean[n];
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer>ds=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            marked[i]=false;
        }

        System.out.println(ans);
        
    }
}
