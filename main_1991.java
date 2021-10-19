package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_1991 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static char[][] tree;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int node = Integer.parseInt(br.readLine());
		tree = new char[node][2];

		for (int i = 0; i < node; i++) {
			st = new StringTokenizer(br.readLine());
			char index = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);

			tree[index - 65][0] = left;
			tree[index - 65][1] = right;

		}

		preorder(0);
		System.out.println();
		inorder(0);
		System.out.println();
		postorder(0);
	}

	// Root -> Left -> Right
	public static void preorder(int x) {
		System.out.print((char) (x + 65));

		if (tree[x][0] != '.') {
			preorder(tree[x][0] - 65);
		}
		if (tree[x][1] != '.') {
			preorder(tree[x][1] - 65);
		}
	}

	// left -> root -> right
	public static void inorder(int x) {

		if (tree[x][0] != '.') {
			inorder(tree[x][0] - 65);
		}
		System.out.print((char) (x + 65));
		if (tree[x][1] != '.') {
			inorder(tree[x][1] - 65);
		}
	}

	public static void postorder(int x) {

		if (tree[x][0] != '.') {
			postorder(tree[x][0] - 65);
		}

		if (tree[x][1] != '.') {
			postorder(tree[x][1] - 65);
		}
		System.out.print((char) (x + 65));
	}

}
