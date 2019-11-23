package ast2;

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
}
