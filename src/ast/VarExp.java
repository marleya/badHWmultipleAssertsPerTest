package ast;

/**
 * Class that represents a variable expression. It allows these variable nodes to represent themselves and
 * their subtrees as strings.
 */
public class VarExp extends Exp {
    private String variable;

    /**
     * Constructor for initializing this {@Code VarExp} object.
     */
    public VarExp(String s) {
        this.variable = s;
    }

    /**
     * Computes a string that reflects the entire subtree rooted
     * at that node.
     *
     * @return string reflecting subtree rooted at this node.
     */
    public String text() {
        return this.variable;
    }

}
