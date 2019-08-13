public class Main {
    public static void main(String[] args) {

        MatrixImplement mdi = new MatrixImplement();
        // Defines matrix' variables
        MatrixVariables mv = new MatrixVariables(10, " * ");
        // Creates a quadratic matrix 4x4
        String[][] m = new String[mv.getN()][mv.getN()];
        // 1) ========================> Calling method to fulfill a matrix
        m = mdi.fulfillMatrix(mv);
        // Displays this fulfilled matrix
        mdi.fromMemoDisplay(m);
        // 2) ========================> Creates another matrix in memory and fills it in specific places
        String[][] arrayBi = {{"*", "*", "*", "*"}, {"*", "*", "*"}, {"*", "*"}, {"*"}};
        // Displays this bidimensional array only where it was filled with a String. Discards null places.
        //================== comento outputArray
        //mdi.outputArray(arrayBi);
        // Jumps one line
        System.out.println("\n");
        // 3) ========================> Changes elements on the left upper triangular
       // MatrixVariables mv1 = new MatrixVariables(4, " * ");
       // String [][] m1 = new String[mv1.n][mv1.n];
        m = mdi.fulfillMatrix(mv);
        mdi.changeElementsLeftUpperTriangular(m, " a ");
        mdi.fromMemoDisplay(m);
        // 4) ========================> Changes elements on the right lower triangular
        m = mdi.fulfillMatrix(mv);
        mdi.changeElementsRightLowerTriangular(m, " B ");
        mdi.fromMemoDisplay(m);
        // 5) ========================> Changes elements on the main diagonal
        m = mdi.fulfillMatrix(mv);
        mdi.changeElementsInMainDiagonal(m, " X ");
        mdi.fromMemoDisplay(m);
        // 6) ========================> Changes elements on the secondary diagonal
        m = mdi.fulfillMatrix(mv);
        mdi.changeElementsInSecondaryDiagonal(m, " Y ");
        mdi.fromMemoDisplay(m);
        // 7) ========================> Fulfilling randomly a matrix
        int i = 5;
        Integer[][] mInt = new Integer[i][i];
        mInt = mdi.fulfillingRandomlyWithInt(5);
        // display
        // 8) =======================> Archive txt
        MatrixVariables mv1 = new MatrixVariables(5, " $ ");
        mdi.writeMatrixInTextFile(m,"/home/cristiane/Documents/testmatrix4.txt");
        // 9) =======================> Matrix in txt
        mdi.writeMatrixInTextFile1(mv1, "/home/cristiane/Documents/testmatrix5.txt" );
        // 10) ======================> Reading from txt file
        mdi.readMatrixFromTextFile("/home/cristiane/Documents/testmatrix3.txt");
        //"/home/cristiane/Documents/testmatrix.txt"
        //"/home/cristiane/Documents/testmatrix1.txt"
        mdi.readMatrixFromTextFile("/home/cristiane/Documents/testmatrix1.txt");
        //11) ======================> Choose display
        MatrixVariables mv2 = new MatrixVariables(15, " S2 ");
        String[][] m1 = new String[mv2.getN()][mv2.getN()];
        //m1 = mdi.fulfillMatrix(mv2);
        mdi.writeMatrixInTextFile(m1,"/home/cristiane/Documents/testmatrix8.txt" );
        mdi.writeMatrixInTextFile1(mv2,"/home/cristiane/Documents/testmatrix9.txt" );

        //mdi.fromTextDisplay("/home/cristiane/Documents/testmatrix9.txt");

    }
}