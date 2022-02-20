import java.util.Objects;
public class Task10 {
    public static void main(String[] args) {
       TreeNode treeQ=new TreeNode(20,new TreeNode(2,new TreeNode(2,null,null),null),new TreeNode(3,null,null));
        System.out.println(maxDepth(treeQ));


    }
    public static int maxDepth(TreeNode a){

    if(a==null){
       return 0;
    }
        int left = maxDepth(a.left);
        int right = maxDepth(a.right);

        return Math.max(left, right) + 1;

    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, left, right);
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
