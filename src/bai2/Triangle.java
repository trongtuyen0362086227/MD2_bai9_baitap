package bai2;

public class Triangle {
    public static void main(String[] args) {

    }

    public static String TriangleName(int edge1, int edge2, int edge3) {
        String trianglename = "";
        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
            if (edge1 * edge1 == edge2 * edge2 + edge3 * edge3 || edge2 * edge2 == edge1 * edge1 + edge3 * edge3 || edge3 * edge3 == edge1 * edge1 + edge2 * edge2) {
                trianglename = "Day la tam giac vuong";
            } else if (edge1 == edge2 && edge2 == edge3) {
                trianglename = "Day la tam giac deu";
            } else if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3) {
               trianglename = "day la tam giac can";
            } else {
                trianglename = "day la tam giac thuong";
            }
        } else {
            trianglename = "day khong phai la tam giac";
        }
        return trianglename;
    }
}
