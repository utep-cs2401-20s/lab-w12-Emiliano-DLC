class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){
    // created a new node with empty child pointers
    this.myValue = inValue;
    this.right = null;
    this.left = null;
  }
  
  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A[0]);
    for (int i = 1; i < A.length; i++) {
      tree.insert(A[i]);
    }
  }
  
  public void insert(int inValue) {
    // This method takes a new integer as input and decides
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.
    if (inValue > this.myValue) {
      if (right == null) {
        right = new myBinarySearchTreeNode(inValue);
      }
      else{ right.insert(inValue);}
    }
    if (inValue < this.myValue) {
      if (left == null) {
        left = new myBinarySearchTreeNode(inValue);
      }
      else{ left.insert(inValue);}
    }
    else
      System.out.println("Duplicates are not allowed");
  }
  
  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time
    int leftH = 0;
    int rightH = 0;
    if(left != null){
      leftH = 1+ left.height();
    }
    if(right != null){
      rightH = 1 + right.height();
    }
    if(leftH >= rightH){
      return leftH+1;
    }
    else return rightH+1;
  }
  
  public int depth(int search) {
    // This method recursively calculates the depth of a given search value.
    // If the given value is not in the tree, this method returns -1.
    // Note that if the tree is a proper BST, this method should complete in O(log n) time.
    // Additionally, remember that the depth is the number of nodes on the path from a node to the root
    // (i.e. the number of the recursive calls).
    if (search < this.myValue) {
      if (left == null) {
        return -1;
      }
      else return left.depth(search) + 1;
    }
    if (search > this.myValue) {
      if (right == null) {
        return -1;
      }
      else return right.depth(search) + 1;
    }
    return 0;
  }

  public int size() {
    int sum = 0;
    if (left != null) {
      return sum+1 + left.size();
    }
    if (right != null) {
      return sum+1 + right.size();
    }
    else return sum;
  }
  
  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 
