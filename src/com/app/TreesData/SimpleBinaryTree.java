/**
 * 
 */
package com.app.TreesData;

/**
 * @author deepa
 *
 */
class SimpleBinaryTree {

	  public static class Node{
	     int value;
	     Node leftNode;
	     Node rightNode;
	    public Node(int value){
	      this.value=value;
	    }
	  }

	  public static void main(String[] args) {
	    System.out.println("generate and print binary tree !");
	    Node rn = fnGenerateBinaryTree();
	    System.out.println("--------");
	    System.out.println("--fnPrintBinaryTree-----");
	    // Binary treee printing
	    fnPrintBinaryTree(rn);
	    System.out.println("--------");
	    System.out.println("---fnPrintInorderBinaryTree----");
	    // in order traversal Binary tree
	    fnPrintInorderBinaryTree(rn);
	    System.out.println("--------");
	    System.out.println("---fnPrintPreOrderBinaryTree----");
	    // Pre- order traversal Binary tree
	    fnPrintPreOrderBinaryTree(rn);
	    System.out.println("--------");
	    System.out.println("----fnPrintPostOrderBinaryTree----");
	    // Post -order traversal Binary Tree
	    fnPrintPostOrderBinaryTree(rn);
	   }


	  public static Node fnGenerateBinaryTree(){
	      System.out.println("generating binary tree nodes and leaf!");
	      Node rootNode = new Node(1);
	      Node leftNode1= new Node(4);
	      Node rightNode1 = new Node(2);
	      Node leftNode2 = new Node(5);
	      Node rightNode2 = new Node(3);
	      Node leftNode3 = new Node(7);

	      rootNode.leftNode=leftNode1;
	      rootNode.rightNode=rightNode1;
	      leftNode1.leftNode=leftNode2;
	      rightNode1.rightNode=rightNode2;
	      leftNode2.leftNode=leftNode3;

	      return rootNode;
	}

	public static void fnPrintBinaryTree(Node node){
	  if(node==null){
	    //System.out.println(" no binary tree found !");
	  }
	  if(null != node){
	    System.out.println(" "+node.value );
	    System.out.println("       |      ");
	    fnPrintBinaryTree(node.leftNode);
	    fnPrintBinaryTree(node.rightNode);
	  }
	}
	
	
	/*
	 * in order Binary tress is (Left , Root, Right )
	 */
	public static void fnPrintInorderBinaryTree(Node node){
		  if(node==null){
		    return;
		  }
		  if(null != node){
		    fnPrintBinaryTree(node.leftNode);
		    System.out.println(" > "+node.value );
		    fnPrintBinaryTree(node.rightNode);
		  }
		}
	
	/*
	 *    Pre-Order traversal Binary tress is (Root , Left, Right )
	 */
	public static void fnPrintPreOrderBinaryTree(Node node){
		  if(node==null){
		    return;
		  }
		  if(null != node){
		    fnPrintBinaryTree(node.leftNode);
		    System.out.println(" > "+node.value );
		    fnPrintBinaryTree(node.rightNode);
		  }
		}
	
	
	/*
	 *    Post-Order traversal Binary tress is (Left , Right, Root )
	 */
	public static void fnPrintPostOrderBinaryTree(Node node){
		  if(node==null){
		    return;
		  }
		  if(null != node){
		    fnPrintBinaryTree(node.leftNode);
		    fnPrintBinaryTree(node.rightNode);
		    System.out.println(" > "+node.value );
		  }
		}

	}
