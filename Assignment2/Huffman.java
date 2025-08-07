class Node {
    int freq;
    char ch;
    Node left;
    Node right;

    Node(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }

    Node(int freq, char ch, Node left, Node right) {
        this.freq = freq;
        this.ch = ch;
        this.left = left;
        this.right = right;
    }
}

public class Huffman {
    static void print(Node root, String ch) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + ch);
            return;
        }

        print(root.left, ch + "0");
        print(root.right, ch + "1");
    }

    static int min(Node[] arr, boolean[] use) {
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && !use[i] && (minIndex == -1 || arr[i].freq < arr[minIndex].freq)) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String args[]) {
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] freq = { 5, 9, 12, 13, 16, 45 };
        int n = chars.length;

        Node[] arr = new Node[2 * n - 1];
        boolean[] Use = new boolean[2 * n - 1];

        for (int i = 0; i < n; i++) {
            arr[i] = new Node(freq[i], chars[i]);
        }

        int size = n;

        for (int i = 0; i < n - 1; i++) {
            int min1 = min(arr, Use);
            Use[min1] = true;
            int min2 = min(arr, Use);
            Use[min2] = true;
            arr[size] = new Node(arr[min1].freq + arr[min2].freq, '.', arr[min1], arr[min2]);
            size++;
        }

        Node root = arr[size - 1];
        System.out.println("Huffman code");
        print(root, "");
    }
}
