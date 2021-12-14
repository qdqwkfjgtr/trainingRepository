import java.util.Objects;

public class Task9 {
    public static void main(String[] args) {
        TreeNode treeQ=new TreeNode(20,new TreeNode(2,null,null),new TreeNode(3,null,null));
        TreeNode treeP=new TreeNode(20,new TreeNode(2,null,null),new TreeNode(3,null,null));
        System.out.println(isSameTree(treeP,treeQ));

    }



    public static boolean isSameTree(TreeNode p, TreeNode q){

        boolean flag=false;
        if(p.val==q.val){
            if(p.left!=null&&q.left!=null||(p.left==null&&q.left==null)){
                if(p.left.equals(q.left)){
                    flag=true;
                } else
                    return false;
            }
            if(p.right!=null&&q.right!=null||(p.right==null&&q.right==null)){
                if (p.right.equals(q.right)){
                    flag=true;
                } else
                    return false;
            }

        }
 return flag;
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