package tests;

import ast.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the methods in the ASTNode classes, Homework2 part1.
 */
public class ASTTests {
    private Exp one = new NumericLiteral(1);
    private Exp three = new NumericLiteral(3);
    private Exp four = new NumericLiteral(4);
    private Exp negFour = new NumericLiteral(-4);
    private Exp hello = new StringLiteral("hello");
    private Exp y = new VarExp("y");
    private VarExp d = new VarExp("d");
    private Stmt z = new DeclStmt("z");
    private Stmt assign1 = new Assignment("a", hello);
    private Stmt assign2 = new Assignment(d, negFour);
    private Exp plusexp = new PlusExp(one, three);
    private Exp plusexp2 = new PlusExp(plusexp, one);
    private Exp plusexp3 = new PlusExp(three, plusexp2);
    private Sequence seq1 = new Sequence (z, plusexp2);
    private Sequence seq2 = new Sequence (seq1, y);
    private Sequence seq3 = new Sequence (seq1, seq2);

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
        Exp one = new NumericLiteral(1);
        Exp three = new NumericLiteral(3);
        Exp exp = new PlusExp(one, three);
        Stmt decl = new DeclStmt("x");
        Stmt assign = new Assignment("x", exp);
        Stmt seq = new Sequence(decl, assign);
        assertEquals(seq.text(), "var x; x = 1 + 3");
    }
}
