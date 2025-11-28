package Tries;
import java.util.*;

public class InsertInTrie {

    static class Node {
        Node[] children = new Node[26];
        boolean EOW = false; // End Of Word flag

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.EOW = true;
    }

    // Search for a word in the Trie
    public static boolean Search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false; // Word not found
            }
            curr = curr.children[idx];
        }
        return curr.EOW; // True if end of word is reached
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};

        // Insert all words into the Trie
        for (String word : words) {
            insert(word);
        }

        // Search for words
        System.out.println(Search("thee"));  // Output: true
        System.out.println(Search("thor"));  // Output: false
    }
}
