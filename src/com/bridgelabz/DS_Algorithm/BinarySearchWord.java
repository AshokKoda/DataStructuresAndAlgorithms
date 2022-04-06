package com.bridgelabz.DS_Algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BinarySearchWord {

	public static void main(String[] args) throws Exception {
		BinarySearchTree<String> wordsList = new BinarySearchTree<>();
		try {
			FileReader reader = new FileReader("Bst.txt");

			BufferedReader buffer = new BufferedReader(reader);
			String str;
			StringBuffer strBuffer = new StringBuffer();
			while ((str = buffer.readLine()) != null) {
				strBuffer.append(str);
			}

			System.out.println(strBuffer);
			String[] words = strBuffer.toString().split(" ");

			for (String s : words) {
				if (!s.isEmpty()) {
					wordsList.add(s.trim().toLowerCase());
				}
			}

			buffer.close();
			reader.close();
		} catch (Exception e) {
			System.out.println("File has not found.");
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word for search : ");
		String searchStr = sc.nextLine();
		sc.close();

		if (wordsList.search(searchStr.toLowerCase())) {
			System.out.println(searchStr + " is found in the file");
		} else {
			System.out.println(searchStr + " is not found in the file");
		}
	}
}
