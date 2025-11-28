package Tries;
public class NodeCreation{
static class Node{
    Node children[]=new Node[26];
    boolean EOW =false;

    Node(){
        for(int i=0;i<26;i++){
            children[i]=null;
        }
    }
}
public static Node root=new Node();
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};

    
}
}