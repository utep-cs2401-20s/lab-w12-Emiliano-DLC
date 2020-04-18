import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTest {
    //Take a symbol '?' as inValue and uses the first constructor.
    @Test
    void  myBinarySearchTreeNode1(){
        myBinarySearchTreeNode test = new myBinarySearchTreeNode('?');
        test.print();
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode('?');
        assertEquals(expected.myValue,test.myValue);
        //return -1 because 1 is not on the tree
        assertEquals(-1,test.depth(1));
        assertEquals(1, test.height());
        assertEquals(expected.size(),test.size());
    }

    @Test
    //Test the second constructor which takes an array on the constructor.
    void  myBinarySearchTreeNode2(){
        int [] arr = {5,2,9};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(arr);
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(arr);
        test.print();
        expected.print();
        assertEquals(2,test.left);
        assertEquals(1,test.depth(9));
        assertEquals(1, test.height());
        assertEquals(3,test.size());
    }

    @Test
    //Test a longer Tree
    void  myBinarySearchTreeNode3(){
        int [] arr = {4,5,7,9,1,3,6,2,8};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(arr);
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(arr);
        test.print();
        expected.print();
        assertEquals(expected.myValue, test.myValue);
        //The size is expected to be 9
        assertEquals(expected.size(),test.size());
        //The expected height is 5
        assertEquals(expected.height(),test.height());
        //The expected depth of the binary tree should be 3
        assertEquals(expected.depth(9),test.depth(9));
    }

    @Test
    void  myBinarySearchTreeNode4() {
        //Test a tree which only go to the right.
        int[] arr = {1, 2, 3, 4, 5, 6};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(arr);
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(arr);
        test.print();
        expected.print();
        //The height of the tree is 6 because only go to the right and has 6 elements
        assertEquals(expected.height(),test.height());
        //The depth of 4 should be 3
        assertEquals(expected.depth(4),test.depth(4));
        //The expected size should be 6.
        assertEquals(expected.size(),test.size());
    }

    @Test
    //Test a tree which uses characters, negative numbers and positive numbers
    void  myBinarySearchTreeNode5(){
        int[] arr = {6,'a','b',1,5,-3,8,-9,'Z','z'};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(arr);
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(arr);
        test.print();
        expected.print();
        //Height of the tree is 4
        assertEquals(expected.height(),test.height());
        //Depth should be 3
        assertEquals(expected.depth(8),test.depth(8));
        //The test should be size 10
        assertEquals(expected.size(),test.size());
    }

}