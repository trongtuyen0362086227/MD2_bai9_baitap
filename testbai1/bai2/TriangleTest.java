package bai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangleNameTest1() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 2;
        String expected = "Day la tam giac deu";
        String result = Triangle.TriangleName(edge1, edge2, edge3);
        assertEquals(expected, result);
    }

    @Test
    void triangleNameTest2() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "day la tam giac can";
        String result = Triangle.TriangleName(edge1, edge2, edge3);
        assertEquals(expected, result);
    }

    @Test
    void triangleNameTest3() {
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        String expected = "Day la tam giac vuong";
        String result = Triangle.TriangleName(edge1, edge2, edge3);
        assertEquals(expected, result);
    }

    @Test
    void triangleNameTest4() {
        int edge1 = 2;
        int edge2 = 6;
        int edge3 = 3;
        String expected = "day khong phai la tam giac";
        String result = Triangle.TriangleName(edge1, edge2, edge3);
        assertEquals(expected, result);
    }

    @Test
    void triangleNameTest5() {
        int edge1 = 2;
        int edge2 = 4;
        int edge3 = 3;
        String expected = "day la tam giac thuong";
        String result = Triangle.TriangleName(edge1, edge2, edge3);
        assertEquals(expected, result);
    }
}