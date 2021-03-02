package com.myjava.tree;

import com.myjava.common.TreeNode;
import org.omg.CORBA.PUBLIC_MEMBER;

public class LowestCommonAncestor {
    /**
     *
     *  ancestor 祖先
     *
     *
     *  235. 二叉搜索树的最近公共祖先
     *
     *  给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     *
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     *
     *
     * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
     * 输出: 6
     * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
     *
     * 说明:
     *
     * 所有节点的值都是唯一的。
     * p、q 为不同节点且均存在于给定的二叉搜索树中。
     *  这题让求二叉搜索树的最近公共祖先，而二叉搜索树的特点就是 左子树的所有节点都小于当前节点，
     *  右子树的所有节点都大于当前节点，并且每棵子树都具有上述特点，从更节点开始遍历
     *
     * 如果两个节点值都小于根节点，说明他们都在根节点的左子树上，我们往左子树上找
     * 如果两个节点值都大于根节点，说明他们都在根节点的右子树上，我们往右子树上找
     * 如果一个节点值大于根节点，一个节点值小于根节点，
     * 说明他们他们一个在根节点的左子树上一个在根节点的右子树上，那么根节点就是他们的最近公共祖先节点。
     *
     *    while ((root.val - p.val) * (root.val - q.val) > 0)
     *    root = p.val < root.val ? root.left : root.right;
     *
     */

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 如果根节点和p,q的差相乘是正数，说明这两个差值要么都是正数要么都是负数，也就是说
        // 他们肯定都位于根节点的同一侧，就继续往下找
        // 如果相乘的结果是负数，说明p和q位于根节点的两侧，
        // 如果等于0，说明至少有一个就是根节点  这个节点就是公共祖先节点
        if ((root.val - p.val)*(root.val - q.val) <= 0){
            return root;
        }
        //否则，p和q位于root的同一侧，就继续往下找
        // 一样
        //return this.lowestCommonAncestor(q.val < root.val ? root.left : root.right,p,q );
        return this.lowestCommonAncestor(p.val < root.val ? root.left : root.right,p,q );
    }
}
