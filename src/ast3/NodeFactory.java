package ast3;

/**
 * Node building factory.
 */
public class NodeFactory implements INodeFactory {
    private int numNumericLiterals;
    private int numStringLiterals;
    private int numAssignments;
    private int numDeclaratives;
    private int numVarExps;
    private int numPlusExps;
    private int numSequences;

    /**
     * Constructor for initializing this {@Code NodeFactory} object.
     */
    public NodeFactory() {
        this.numNumericLiterals = 0;
        this.numStringLiterals = 0;
        this.numAssignments = 0;
        this.numDeclaratives = 0;
        this.numVarExps = 0;
        this.numPlusExps = 0;
        this.numSequences = 0;
    }

    /**
     * Factory methods for constructing nodes.
     *
     * @return the specified node
     */

    public NumericLiteral makeNumericLiteral(Integer i) {
        this.numNumericLiterals++;
        return new NumericLiteral(i);
    }

    public StringLiteral makeStringLiteral(String s) {
        this.numStringLiterals++;
        return new StringLiteral(s);
    }

    public Assignment makeAssignment(String s, Exp e) {
        this.numAssignments++;
        return new Assignment(s, e);
    }

    public Assignment makeAssignment(VarExp v, Exp e) {
        this.numAssignments++;
        return new Assignment(v, e);
    }

    public DeclStmt makeDeclarative(String s) {
        this.numDeclaratives++;
        return new DeclStmt(s);
    }

    public VarExp makeVarExp(String s) {
        this.numVarExps++;
        return new VarExp(s);
    }

    public PlusExp makePlusExp(Exp e1, Exp e2) {
        this.numPlusExps++;
        return new PlusExp(e1, e2);
    }

    public Sequence makeSequence(ASTNode a1, ASTNode a2) {
        this.numSequences++;
        return new Sequence(a1, a2);
    }

    /**
     * Prints  the number of instances of each type of Node that has been created
     *
     * @return String listing the counts for each node type
     */
    public String report() {
        return "# Numerical Literals: " + numNumericLiterals + "\n" + "# String Literals: " + numStringLiterals + "\n"
                + "# Assignments: " + numAssignments + "\n" + "# Declaratives: " + numDeclaratives + "\n"
                + "# Variable Expressions: " + numVarExps + "\n" + "# Plus Expressions: " + numPlusExps + "\n"
                + "# Sequences: " + numSequences;

    }

}
