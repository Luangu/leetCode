package com.myjava.utils;

import com.myjava.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public  class TreeUtil {
    public TreeNode listToTree(String src){
        src = src.substring(1,src.length()-1);
        String[] strList = src.split(",");

        TreeNode root  ;
        TreeNode result = null;
        Queue<TreeNode> queue = new LinkedList<>();
        for (int i =0 ; i< strList.length ; i++){
            if (i == 0){
                root = new TreeNode(Integer.parseInt(strList[i]));
                result = root;
                queue.add(root);
            }
            if (!queue.isEmpty()){
                root = queue.poll();
            }else {
                break;
            }
            if ( i+1 < strList.length  && !strList[i+1].equals( "null")){
                root.left = new TreeNode(Integer.parseInt(strList[i +1]));
                queue.add(root.left);
            }
            if ( i + 2 < strList.length && !strList[i+2].equals( "null")){
                root.right = new TreeNode(Integer.parseInt(strList[i +2]));
                queue.add(root.right);
            }
            i = i +1;
        }
        return result;
    }


}
