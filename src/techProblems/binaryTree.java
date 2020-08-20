package techProblems;

import java.util.ArrayList;

// problem 2
    // -----------------------------------
    // given a sorted array list of integers, please create a balanced binary tree.
    // note that you can use the following helper class if you would like. You
    // should return the root of the tree as your result.

    // input: [1,2,3,4,5,6,7]
    // output: 4
    // / \
    // 2 6
    // / \ / \
    // 1 3 5 7
    // (you would return the node with a value of 4)

//helper class   
class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int v, Node l, Node r) {
        this.value = v;
        this.left = l;
        this.right = r;
    }
}

public class binaryTree {

    // //method to implement
    public static Node balancedTree(int[] inputList) {
        return helper(inputList, 0, inputList.length - 1);
    }

    private static Node helper(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = low + (high - low) / 2;
        // center val of sorted array as the root of the bst
        Node head = new Node(nums[mid], null, null);

        // left of the mid value should go to the left of this root node to satisfy bst
        head.left = helper(nums, low, mid - 1);
        // right of the mid value should go to the right of this root node to satisfy
        // bst
        head.right = helper(nums, mid + 1, high);
        return head;

    }

    public static void main(String[] args) {
        ArrayList<Integer> startInts = new ArrayList<>();
        startInts.add(1);
        startInts.add(2);
        startInts.add(3);
        startInts.add(4);
        startInts.add(5);
        startInts.add(6);
        startInts.add(7);
        int[] test = startInts.stream().mapToInt(i -> i).toArray();
        System.out.println("BST: " + balancedTree(test).value);
    }

}