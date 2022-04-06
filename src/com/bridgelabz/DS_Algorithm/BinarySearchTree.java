package com.bridgelabz.DS_Algorithm;

public class BinarySearchTree<K extends Comparable<K>> {

	Node<K> root;

	public void add(K key) {
		this.root = addRecursively(root, key);
	}

	private Node<K> addRecursively(Node<K> current, K key) {
		if (current == null) {
			current = new Node<K>(key);
		}
		int compareResult = current.key.compareTo(key);
		if (compareResult == 0)
			return current;
		if (compareResult > 0) {
			current.leftNode = this.addRecursively(current.leftNode, key);
		} else {
			current.rightNode = this.addRecursively(current.rightNode, key);
		}
		return current;
	}

	public boolean search(K key) {
		boolean isContain = searchRecursively(this.root, key);
		return isContain;
	}

	private boolean searchRecursively(Node<K> current, K key) {
		if (current == null) {
			return false;
		}
		int compareResult = current.key.compareTo(key);
		if (compareResult == 0) {
			return true;
		}
		if (compareResult > 0) {
			return searchRecursively(current.leftNode, key);
		} else {
			return searchRecursively(current.rightNode, key);
		}
	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append(root);
//		Node<K> current = root;
//		while (current != null) {
//			current = current.leftNode;
//			builder.insert(0, current + "<--");
//		}
//		current = root;
//		while (current != null) {
//			current = current.rightNode;
//			builder.append("-->" + current);
//		}
//		return builder.toString();
//	}
}