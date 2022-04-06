package com.bridgelabz.DS_Algorithm;

public class Node<K> {

	K key;
	public Node<K> leftNode;
	public Node<K> rightNode;

	public Node(K key) {
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}

	@Override
	public String toString() {

		return "{" + " Left Node = " + leftNode + ", Root = " + key + ", Right Node = " + rightNode + '}';
	}
}
