package tests2;

import ast2.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the methods in the ASTNode classes, Homework2 part2.
 */
public class AST2Tests {
    private NodeFactory factory = new NodeFactory();

    private NumericLiteral one = factory.makeNumericLiteral(1);
    private NumericLiteral three = factory.makeNumericLiteral(3);
    private NumericLiteral four = factory.makeNumericLiteral(4);
    private NumericLiteral negFour = factory.makeNumericLiteral(-4);
    private StringLiteral hello = factory.makeStringLiteral("hello");
    private VarExp y = factory.makeVarExp("y");
    private VarExp d = factory.makeVarExp("d");
    private DeclStmt z = factory.makeDeclarative("z");
    private Assignment assign1 = factory.makeAssignment("a", hello);
    private Assignment assign2 = factory.makeAssignment(d, negFour);
    private PlusExp plusexp = factory.makePlusExp(one, three);
    private PlusExp plusexp2 = factory.makePlusExp(plusexp, one);
    private PlusExp plusexp3 = factory.makePlusExp(three, plusexp2);
    private Sequence seq1 = factory.makeSequence(z, plusexp2);
    private Sequence seq2 = factory.makeSequence(seq1, y);
    private Sequence seq3 = factory.makeSequence(seq1, seq2);

    /**
     * Tests the {@link NumericLiteral} .text() method.
     */
    @Test
    public void testNumericLiteralText() {
        assertEquals("4", four.text());
    }

    /**
     * Tests the {@link NumericLiteral} .text() method.
     */
    @Test
    public void testNegNumericLiteralText() {
        assertEquals("-4", negFour.text());
    }

    /**
     * Tests the {@link StringLiteral} .text() method.
     */
    @Test
    public void testStringLiteralText() {
        assertEquals("hello", hello.text());
    }

    /**
     * Tests the {@link VarExp} .text() method.
     */
    @Test
    public void testVarExpText() {
        assertEquals("y", y.text());
    }

    /**
     * Tests the {@link DeclStmt} .text() method.
     */
    @Test
    public void testDeclStmtText() {
        assertEquals("var z", z.text());
    }

    /**
     * Tests the {@link Assignment} .text() method for the normal Assignment constructor.
     */
    @Test
    public void testAssignment0() {
        assertEquals("a = hello", assign1.text());
    }

    /**
     * Tests the {@link Assignment} .text() method for the overloaded Assignment constructor.
     */
    @Test
    public void testAssignment1() {
        assertEquals("d = -4", assign2.text());
    }

    /**
     * Tests the {@link PlusExp} .text() method for a PlusExp with multiple PlusExps within it.
     */
    @Test
    public void multiPartPlusExp (){
        assertEquals(plusexp3.text(), "3 + 1 + 3 + 1");
    }

    /**
     * Tests the {@link Sequence} .text() method for a test a statement with multiple statements in it.
     */
    @Test
    public void multiPartSeq () {
        assertEquals("var z; 1 + 3 + 1; var z; 1 + 3 + 1; y",   seq3.text());
    }

    /**
     * Given test method. Tests numeric literals, a plus exp with only two components, a declarative statement, an
     * assignment, and a sequence with only two components
     */
    @Test
    public void test1(){
        PlusExp exp = factory.makePlusExp(one, three);
        Stmt decl = factory.makeDeclarative("x");
        Assignment assign = factory.makeAssignment("x", exp);
        Stmt seq = factory.makeSequence(decl, assign);
        assertEquals(seq.text(), "var x; x = 1 + 3");
    }
}
