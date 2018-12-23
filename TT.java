import java.util.LinkedList;
//这是一个Trie树
public class TT {
    private class node {
        char con;
        boolean isE;
        int count;
        LinkedList<node> son;

        public node(char ch){
            son = new LinkedList<node>();
            isE = false;
            con = ch;
            count = 0;
        }

        public node position(char ch) {
            if (son != null) {
                for (node each : son){
                    if (each.con == ch) {
                        return each;
                    }
                }
            }
            return null;
        }
    }

    private node root;

    TT() {
        root = new node(' ');
    }

    public void add(String name) {
        if (ex(name)) return;
        node now = root;
        for (int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            node ason = now.position(ch);
            if (ason != null) {
                now = ason;
            }else {
                now.son.add(new node(ch));
                now = now.position(ch);
            }
            now.count ++;
        }
        now.isE = true;
    }

    public boolean ex(String name) {
        node now = root;
        for (int i = 0; i < name.length(); i ++) {
            char ch = name.charAt(i);
            if (now.position(ch) == null) {
                return false;
            }else {
                now = now.position(ch);
            }
        }
        return now.isE;
    }
}
