public class Trie {
    static class node {
        node[] children;
        boolean eow;
        public node() {
            children = new node[26];
            for(int i = 0; i < 26; i++) children[i] = null;
            eow = false;
        }
    }

    public static void insert(String word) {
        node curr = root;
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) curr.children[idx] = new node();
            if(i == word.length() - 1) curr.children[idx].eow = true;
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        node curr = root;
        for(int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i);
            if(curr.children[idx] == null) return false;
            if(i == key.length() - 1 && curr.children[idx].eow == false) 
                return false;
            curr = curr.children[idx];
        }
        return true;
    }

    static node root = new node();

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for(String s : words) insert(s);
        System.out.println(search("the"));
        System.out.println(search("an"));
    }
}