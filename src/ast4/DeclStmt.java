package ast4;

/**
 * Class that represents a declarative statement. It allows these declarative nodes to represent themselves and
 * their subtrees as strings.
 */
public class DeclStmt extends Stmt {
    private String var;
    /**
     * Constructor for initializing this {@Code DeclStmt} object.
     */
    DeclStmt(String s) {
        this.var = s;
    }

    /**
     * Computes a string that reflects this node.
     *
     * @return string reflecting this node.
     */
    public String text() {
        return "var " + this.var;
    }

}
