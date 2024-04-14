// package LeetCode;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.Arrays;

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
 
//     TreeNode() {
//     }
 
//     TreeNode(int val) {
//         this.val = val;
//     }
 
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// class Solution {
//     public static void main(String[] args){
//         Solution solution = new Solution();
//         Integer[] res = {3,9,20,null,null,15,7};
//         TreeNode tree = treeNodeBuild(res);
//         System.out.println(tree);
//         var result = solution.levelOrder(tree);
//         System.out.println(result);
//     }
//     public static TreeNode treeNodeBuild(Integer[] res) {
//         LinkedList<TreeNode> nodes = new LinkedList<>();
//         LinkedList<TreeNode> children = new LinkedList<>();
//         TreeNode treeNode = new TreeNode();
//         if (res.length == 1) {
//             treeNode.val = res[0];
//             return treeNode;
//         }
//         for (int i = 0; i < res.length; i++) {
//             if (res[i] == null) {
//                 nodes.add(null);
//             } else {
//                 nodes.add(new TreeNode(res[i]));
//             }
//         }
//         while (nodes.size() != 0) {
//             if (children.size() == 0) {
//                 treeNode = nodes.poll();
//                 TreeNode child1 = nodes.poll();
//                 TreeNode child2 = nodes.poll();
    
    
//                 treeNode.left = child1;
//                 treeNode.right = child2;
    
//                 children.add(child1);
//                 children.add(child2);
//             } else {
//                 TreeNode n = children.poll();
    
//                 TreeNode left = nodes.poll();
//                 TreeNode right = nodes.poll();
    
//                 n.left = left;
//                 n.right = right;
    
//                 children.add(left);
//                 children.add(right);
//             }
//         }
    
//         return treeNode;
//     }

//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         LinkedList<TreeNode> queue = new LinkedList<>();
//         if (root == null) return result;
//         queue.offer(root);
//         while(!queue.isEmpty()){
//             TreeNode[] newroot = new TreeNode[queue.size()];
//             List<Integer> temp = new ArrayList<>();
//             for(int i= 0; i<queue.size(); i++){
//                 newroot[i] = queue.poll();
//                 temp.add(newroot[i].val);
//             }
//             result.add(temp);
//             // int n = queue.size();
//             // while(n>0){
//             //     TreeNode newroot = queue.poll();
//             //     temp.add(newroot.val);
//             //     if(newroot.left != null){
//             //         queue.offer(newroot.left);
//             //     }
//             //     if(newroot.right != null){
//             //         queue.offer(newroot.right);
//             //     }
//             //     n--;
//             // }
//             for(int j= 0; j<newroot.length; j++){
//                 if(newroot[j].left != null){
//                     queue.offer(newroot[j].left);
//                 }
//                 if(newroot[j].right != null){
//                     queue.offer(newroot[j].right);
//                 }
//             }

//         }
//         return result;
//     }
// }
