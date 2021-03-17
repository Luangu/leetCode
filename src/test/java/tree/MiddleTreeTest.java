package tree;

import com.myjava.common.TreeNode;
import com.myjava.tree.middle.*;
import com.myjava.utils.TreeUtil;
import org.junit.Test;

import java.util.List;

public class MiddleTreeTest {


    @Test
    public void test94(){
        String treeStr = "[1,null,2,3]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        List<Integer> integers = new InorderTraversal().inorderTraversal(root);
        System.out.println(integers);

        List<Integer> integers2 = new InorderTraversal().inorderTraversal2(root);
        System.out.println(integers2);

    }



    @Test
    public void test95(){
        int num = 3;
        List<TreeNode> treeNodes = new GenerateTrees().generateTrees(num);
        for (int i = 0; i < treeNodes.size(); i++) {
            new TreeUtil().printTreeContainBlank(treeNodes.get(i));
        }
    }

    @Test
    public void test96(){
        int num = 5;
        int i = new NumTrees().numTrees(num);
        System.out.println(i);


    }

    @Test
    public void test98(){
        String treeStr = "[1,null,2,3]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        boolean validBST = new IsValidBST().isValidBST(root);
        System.out.println(validBST);

    }


    @Test
    public void test102(){
        String treeStr = "[3,9,20,null,null,15,7]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        List<List<Integer>> lists = new LevelOrder().levelOrder(root);
        System.out.println(lists);

    }

    @Test
    public void test103(){
        String treeStr = "[3,9,20,null,null,15,7]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        List<List<Integer>> lists = new ZigzagLevelOrder().zigzagLevelOrder(root);
        System.out.println(lists);

    }





    @Test
    public void test107(){
        String treeStr = "[3,9,20,null,null,15,7]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        List<List<Integer>> lists = new LevelOrderBottom().levelOrderBottom(root);
        System.out.println(lists);

    }


    @Test
    public void test113(){
        String treeStr = "[5,4,8,11,null,13,4,7,2,null,null,5,1]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        List<List<Integer>> lists = new PathSum().pathSum(root,22);
        System.out.println(lists);


    }


    @Test
    public void test114(){
        String treeStr = "[1,2,5,3,4,null,6]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        new Flatten().flatten(root);


    }


    @Test
    public void test116(){
        String treeStr = "[1,2,3,4,5,6,7]";

    }
    @Test
    public void test117(){
        String treeStr = "[1,2,3,4,5,6,7]";

    }

    @Test
    public void test123(){
        String treeStr = "[1,2,3]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        int i = new SumNumbers().sumNumbers(root);
        System.out.println(i);
    }

    @Test
    public void test144(){
        String treeStr = "[1,null,2,3]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        List<Integer> integers = new PreorderTraversal().preorderTraversal(root);
        System.out.println(integers);
    }

    @Test
    public void test145(){
        String treeStr = "[1,null,2,3]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        List<Integer> integers = new PostorderTraversal().postorderTraversal(root);
        System.out.println(integers);
    }



    @Test
    public void test173(){
        //  ["BSTIterator","next","next","hasNext","next","hasNext","next","hasNext","next","hasNext"]
        //String treeStr = "[[[7,3,15,null,null,9,20]],[],[],[],[],[],[],[],[],[]]";
        String treeStr = "[1,null,2,3]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        BSTIterator bstIterator = new BSTIterator(root);
        while (bstIterator.hasNext()){
            System.out.println(bstIterator.next());
        }
    }


    @Test
    public void test199(){
        //  ["BSTIterator","next","next","hasNext","next","hasNext","next","hasNext","next","hasNext"]
        //String treeStr = "[[[7,3,15,null,null,9,20]],[],[],[],[],[],[],[],[],[]]";
        String treeStr = "[1,2,3,null,5,null,4]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        List<Integer> integers = new RightSideView().rightSideView(root);
        System.out.println(integers);
    }

    @Test
    public void test222(){
        String treeStr = "[1,2,3,4,5,6]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        int i = new CountNodes().countNodes(root);
        System.out.println(i);
    }

    @Test
    public void test230(){
        String treeStr = "[3,1,4,null,2]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        int i = new KthSmallest().kthSmallest(root, 1);
        System.out.println(i);
    }

    @Test
    public void test236(){
        String treeStr = "[3,5,1,6,2,0,8,null,null,7,4]";
        TreeNode root = new TreeUtil().listToTree(treeStr);
        TreeNode treeNode = new LowestCommonAncestor().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1));
        new TreeUtil().printTree(treeNode);
    }


    @Test
    public void test105(){
        int[] tree = new int[]{3,9,20,15,7};
        int[] tree2 = new int[]{9,3,15,20,7};
        TreeNode treeNode = new BuildTree().buildTree(tree, tree2);
    }



}
