class LeafToNode {
    
    public static void helper(Node root , ArrayList<ArrayList<Integer>> arr ,ArrayList<Integer> temp) {
        if(root!=null && root.left==null && root.right==null) {
            temp.add(root.data);
            ArrayList<Integer> a=new ArrayList<>();
            a.addAll(temp);
            arr.add(a);
            temp.remove(temp.size()-1);
            return;
        }
        if(root==null)
            return;
        temp.add(root.data);
        helper(root.left,arr,temp);
        helper(root.right,arr,temp);
        temp.remove(temp.size()-1);
        
    }
    
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        helper(root ,arr ,temp);
        return arr;
    }
}
