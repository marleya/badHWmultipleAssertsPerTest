package ast;

/**
 * Class that represents a sequence. It allows these sequence nodes to represent themselves and
 * their subtrees as strings.
 */
public class Sequence extends Stmt {
    private ASTNode part1;
    private ASTNode part2;

    /**
     * Constructor for initializing this {@Code Sequence} object.
     */
    public Sequence(ASTNode s1, ASTNode s2) {
        this.part1 = s1;
        this.part2 = s2;
    }

    /**
     * Computes a string that reflects the entire subtree rooted
     * at that node.
     *
     * @return string reflecting subtree rooted at this node.
     */
    public String text() {
        return this.part1.text() + "; " + this.part2.text();
    }

}
