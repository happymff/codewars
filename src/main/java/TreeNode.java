/**
 * Created by mengfeifei on 2017/5/5.
 */
class TreeNode {

    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    TreeNode(int value) {
        this(value, null, null);
    }

//    @Override
//    public boolean equals(Object other) {
//        //... // Already implemented for you and used in test cases
//    }
//    // ...
}