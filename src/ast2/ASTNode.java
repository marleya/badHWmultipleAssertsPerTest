package ast2;

/**
 * Interface that represents an abstract syntax tree (AST) node. This interface allows representation of nodes and
 * their subtrees as strings.
 */
public interface ASTNode {

    /**
     * Computes a string that reflects the entire subtree rooted
     * at that node.
     *
     * @return string reflecting subtree rooted at this node.
     */
    public String text();

}
