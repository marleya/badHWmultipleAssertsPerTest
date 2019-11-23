package ast4;

/**
 * Node building factory.
 */
public class NodeFactory implements INodeFactory {
    private static NodeFactory factory = null;
    private int numNumericLiterals;
    private int numStringLiterals;
    private int numAssignments;
    private int numDeclaratives;
    private int numVarExps;
    private int numPlusExps;
    private int numSequences;

    /**
     * Private constructor for initializing this {@Code NodeFactory}. Private to force use of Singleton-pattern
     * makeNodeFactory method.
     */
    private NodeFactory() {
        this.numNumericLiterals = 0;
        this.numStringLiterals = 0;
        this.numAssignments = 0;
        this.numDeclaratives = 0;
        this.numVarExps = 0;
        this.numPlusExps = 0;
        this.numSequences = 0;
    }

    /**
     * Public creation method, enforcing singleton pattern.
     */
    public static NodeFactory makeNodeFactory() {
        if (factory==null) {
            factory = new NodeFactory();
        }
        return factory;
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

    /**
     * Resets the factory's node-creation counters (sorry ik adding methods for testing is a no-no but this is what I
     * was advised to do by the instructor). Not including this in the node factory interface because I wouldn't want
     * external actors resetting the factory and corrupting the report() functionality.
     */

    public void resetReport() {
        factory.numNumericLiterals = 0;
        factory.numStringLiterals = 0;
        factory.numAssignments = 0;
        factory.numDeclaratives = 0;
        factory.numVarExps = 0;
        factory.numPlusExps = 0;
        factory.numSequences = 0;
    }

}
