package ast2;

/**
 * Abstract class that represents a generalized literal. It allows these literal nodes to represent themselves and
 * their subtrees as strings.
 */
public abstract class Literal extends Exp {

    /**
     * Computes a string that reflects the entire subtree rooted
     * at that node.
     *
     * @return string reflecting subtree rooted at this node.
     */
    public abstract String text();

}
