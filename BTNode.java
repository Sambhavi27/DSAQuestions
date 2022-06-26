package dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BTNode {

	int data;
	BTNode left;
	BTNode right;
	
	BTNode(int d){
		
		this.data=d;
		this.left=null;
		this.right=null;
		
	}
	static BTNode buildTree(BTNode root) {
		System.out.println("Enter data");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		root=new BTNode(data);
		if(data==-1) {
			return null;
		}
		System.out.println("Enter data for left of "+data);
		root.left=buildTree(root.left);
		System.out.println("Enter data for right of "+data);
		root.right=buildTree(root.right);
		return root;
	}
	private static void levelOrderTraversal(BTNode root) {
		Queue<BTNode> q=new LinkedList<BTNode>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			BTNode temp=q.poll();
			if(temp==null) {
				System.out.println();
				if(!q.isEmpty()) {
					q.add(null);
				}
			}
			else {
			System.out.print(temp.data+" ");
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
			}
		}
		
	}
	private static BTNode buildFromLevelOrderTraversal(BTNode root) {
		Queue<BTNode> q=new LinkedList<BTNode>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data for root");
		int data=sc.nextInt();
		root=new BTNode(data);
		q.add(root);
		
		while(!q.isEmpty()) {
			BTNode temp=q.poll();
			System.out.println("Enter left node data for "+temp.data);
			int leftVal=sc.nextInt();
			if(leftVal!=-1) {
					temp.left=new BTNode(leftVal);
					q.add(temp.left);
				}
			System.out.println("Enter right node data for "+temp.data);
			int rightVal=sc.nextInt();
			if(rightVal!=-1) {
					temp.right=new BTNode(rightVal);
					q.add(temp.right);
				}
			
		}
		return root;
	}
	public static void main(String[] args) {
		BTNode root=null;
		root=buildTree(root);
		//1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
		System.out.println("BUILDING TREE FROM LEVEL ORDER TRAVERSAL...........");
		BTNode r=buildFromLevelOrderTraversal(root);
		System.out.println("LEVEL ORDER TRAVERSAL");
		levelOrderTraversal(r);
		System.out.println("INORDER TRAVERSAL");
		inOrderTraversal(root);
		System.out.println();
		System.out.println("PREORDER TRAVERSAL");
		preOrderTraversal(root);
		System.out.println();
		System.out.println("POSTORDER TRAVERSAL");
		postOrderTraversal(root);
	}
	private static void inOrderTraversal(BTNode root) {
		if(root==null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}
	private static void preOrderTraversal(BTNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	private static void postOrderTraversal(BTNode root) {
		if(root==null) {
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}

}
