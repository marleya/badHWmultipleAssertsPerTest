package ast3;

/**
 * Interface that represents a node building factory.
 */
public interface INodeFactory {

    /**
     * Factory methods for constructing nodes.
     *
     * @return the specified node type
     */
    ASTNode makeNumericLiteral(Integer i);

    ASTNode makeStringLiteral(String s);

    ASTNode makeAssignment(String s, Exp e);

    ASTNode makeAssignment(VarExp v, Exp e);

    ASTNode makeDeclarative(String s);

    ASTNode makeVarExp(String s);

    ASTNode makePlusExp(Exp e1, Exp e2);

    ASTNode makeSequence(ASTNode a1, ASTNode a2);

    /**
     * Prints  the number of instances of each type of Node that has been created
     *
     * @return String listing the counts for each node type
     */
    public String report();
}
