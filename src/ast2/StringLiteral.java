package ast2;

/**
 * Class that represents a string literal. It allows these string nodes to represent themselves and
 * their subtrees as strings.
 */
public class StringLiteral extends Literal {
    private String data;

    /**
     * Constructor for initializing this {@Code StringLiteral} object.
     */
    StringLiteral(String s) {
        this.data = s;
    }

    /**
     * Computes a string that reflects this node.
     *
     * @return string reflecting this node.
     */
    public String text() {
        return this.data;
    }

}
