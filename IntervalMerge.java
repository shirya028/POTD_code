import java.util.*;;
public class IntervalMerge {
    
    public static int[][] helper(int arr[][]) {

        Comparator<Integer[]> cmp=new Comparator<Integer[]>() {
            public int compare(Integer i[] ,Integer j[]) {
                if(i[0] > j[0])
                    return 1;
                return -1;
            }
        };
        Arrays.sort(arr,cmp);
    }
    public static void main(String[] args) {
        int arr[][]={{1,3},{8,10},{2,6},{15,18}};
        int ans[][]=helper(arr);
        for(int i=0;i<ans.length;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
