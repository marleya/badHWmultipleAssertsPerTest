package ast2;
/**
 * Node building factory.
 */
public class NodeFactory implements INodeFactory{

    //@TODO I want to make ONE method that determines which node based on input but string could be a string literal or
    // a varexp or a declstmt and so I can't do that and if I have the input specify which type then I have an ugly
    // switch statement

    // should I have an abstract factory which is implemented in multiple ways for a literal factory and a exp factory etc?

    //@TODO, if I don't make the return types ASTNodes then the INodeFactory's coupled with concrete node implementations
    //which is bad, but if I do make it ASTNode then my constructors that take in other specific ASTNode types don't
    //know if they're ingesting the correct type
    /**
     * Factory methods for constructing nodes.
     *
     * @return the specified node
     */

    public NumericLiteral makeNumericLiteral(Integer i) {
        return new NumericLiteral(i);
    }

    public StringLiteral makeStringLiteral(String s) {
        return new StringLiteral(s);
    }

    public Assignment makeAssignment(String s, Exp e) {
        return new Assignment(s, e);
    }

    public Assignment makeAssignment(VarExp v, Exp e) {
        return new Assignment(v, e);
    }

    public DeclStmt makeDeclarative(String s) {
        return new DeclStmt(s);
    }

    public VarExp makeVarExp(String s) {
        return new VarExp(s);
    }

    public PlusExp makePlusExp(Exp e1, Exp e2) {
        return new PlusExp(e1, e2);
    }

    public Sequence makeSequence(ASTNode a1, ASTNode a2) {
        return new Sequence(a1, a2);
    }

}
