package ast3;

/**
 * Class that represents a numeric literal. It allows these number nodes to represent themselves and
 * their subtrees as strings.
 */
public class NumericLiteral extends Literal {
    private Integer data;

    /**
     * Constructor for initializing this {@Code NumericLiteral} object.
     */
    NumericLiteral(Integer i) {
        this.data = i;
    }

    /**
     * Computes a string that reflects this node.
     *
     * @return string reflecting this node.
     */
    public String text() {
        return this.data.toString();
    }

}
