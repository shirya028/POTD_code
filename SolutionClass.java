import java.util.*;
public class SolutionClass{
    
  
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       Set<Integer> s1=new HashSet<>();
       Set<Integer> s2=new HashSet<>();
       Set<Integer> s3=new HashSet<>();
       ArrayList<Integer> myarr=new ArrayList<>();

       
       for(int i=0;i<n1;i++) {
        s1.add(sc.nextInt());
       }
       for(int i=0;i<n2;i++) {
        s2.add(sc.nextInt());
       }
       for(Integer i : s1) {
        if(s2.contains(i)) {
            myarr.add(i);
        }
       }

       if(myarr.isEmpty()) {
            System.out.print(-1);
       }
       else {
       Collections.sort(myarr);
       for(int i=0;i<myarr.size();i++) {
        System.out.print(myarr.get(i));
       }
    }
       System.out.println("");
       s3.addAll(s1);
       s3.addAll(s2);
       myarr.clear();
       for(Integer i : s3) {
        myarr.add(i);
       }
       if(myarr.isEmpty()) {
        System.out.println(-1);
        }
    else {
       Collections.sort(myarr);
       for(int i=0;i<myarr.size();i++) {
        System.out.print(myarr.get(i)+" ");
       }
    }
       
    }
}