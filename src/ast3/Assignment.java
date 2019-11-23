package ast3;

/**
 * Class that represents an assignment statement. It allows these assignment nodes to represent themselves and
 * their subtrees as strings.
 */
public class Assignment extends Stmt {
    private VarExp var;
    private Exp exp;

    /**
     * Constructor for initializing this {@Code Assignment} object.
     */
    Assignment(String v, Exp e) {
        this.var = new VarExp(v);
        this.exp = e;
    }

    /**
     * Overloaded constructor for initializing this {@Code Assignment} object.
     */
    public Assignment(VarExp v, Exp e) {
        this.var = v;
        this.exp = e;
    }

    /**
     * Computes a string that reflects this node.
     *
     * @return string reflecting this node.
     */
    public String text() {
        return this.var.text() + " = " + this.exp.text();
    }

}
