package ast4;

/**
 * Abstract class that represents a generalized expression. It allows these expression nodes to represent themselves and
 * their subtrees as strings.
 */
public abstract class Exp implements ASTNode {

    /**
     * Computes a string that reflects the entire subtree rooted
     * at that node.
     *
     * @return string reflecting subtree rooted at this node.
     */
    public abstract String text();

}
