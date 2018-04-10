import static org.junit.jupiter.api.Assertions.*;

class RecTest {

    @org.junit.jupiter.api.Test
    void recBase0() {
        assertEquals(1, Rec.rec(0));
    }

    @org.junit.jupiter.api.Test
    void recBase1() {
        assertEquals(1, Rec.rec(1));
    }
    @org.junit.jupiter.api.Test
    void rec() {
        assertEquals(10, Rec.rec(4));
    }
}