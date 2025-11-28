package Tries;

public class Q1 {
    
    static class Node {
        Node[] children = new Node[26];
        boolean EOW = false; // End Of Word flag

       public Node() {
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
        return curr.EOW==true; // True if end of word is reached
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
           if(Search(key.substring(0, i))&&
          wordBreak(  key.substring(i))){
            return true;
          }
        }return false;
    }

    public static void main(String[] args) {
        String[] arr = {"i", "like", "sam", "samsung", "mobile", "ice"};

        // Insert all words into the Trie
        for (int i=0;i<arr.length;i++) {
            insert(arr[i]);
        }
       String key= "ilikesamsung";
        // Search for words
     System.out.println(wordBreak(key));
    }
}


