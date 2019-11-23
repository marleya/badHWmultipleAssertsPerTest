package ast3;

/**
 * Class that represents an additive expression. It allows these addition nodes to represent themselves and
 * their subtrees as strings.
 */
public class PlusExp extends Exp {
    private Exp e1;
    private Exp e2;

    /**
     * Constructor for initializing this {@Code PlusExp} object.
     */
    PlusExp(Exp a, Exp b) {
        this.e1 = a;
        this.e2 = b;
    }

    /**
     * Computes a string that reflects the entire subtree rooted
     * at that node.
     *
     * @return string reflecting subtree rooted at this node.
     */
    public String text() {
        return this.e1.text() + " + " + this.e2.text();
    }

}
