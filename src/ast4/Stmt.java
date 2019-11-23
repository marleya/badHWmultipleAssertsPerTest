package ast4;

/**
 * Abstract class that represents a generalized statement. It allows these statement nodes to represent themselves and
 * their subtrees as strings.
 */

public abstract class Stmt implements ASTNode {

    /**
     * Computes a string that reflects the entire subtree rooted
     * at that node.
     *
     * @return string reflecting subtree rooted at this node.
     */
    public abstract String text();

}
