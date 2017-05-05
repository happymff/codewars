/**
 * Created by mengfeifei on 2017/5/5.
 */
public class ArrayToTree {
        static TreeNode arrayToTree(int[] array) {
            TreeNode treeNode =null;
            int count =0;
            if (array.length <= 0) {
                return null; // TODO: implementation
            } else {
               while (true){
                   if (array.length<2){
                       treeNode=new TreeNode(array[0],null,null);
                       break;
                   }else if (array.length<3){
                       treeNode= new TreeNode(array[0],new TreeNode(array[1],null,null),null);
                       break;
                   }else {
                       for (int i=0; i <array.length; i++) {
                           treeNode= new TreeNode(array[i],null,null);
                           count ++;
                       }
                       if (count == array.length){
                           break;
                       }
                   }
               }
            }
            //return null; // TODO: implementation
            return treeNode;
        }

//    private static TreeNode getArrary(int[] array) {
//        return  new TreeNode(array[array.length-2],new TreeNode(array[array.length-1],null,null),null);
//
//    }
}
