import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MatrixImplement {

    public void outputArray (String[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++)
                System.out.printf("%s ", matrix[row][column]);
            System.out.println();
        }
    }
    // Value is the element we want to insert into the matrix and n is its dimension.
    public String[][] fulfillMatrix(MatrixVariables matrixVar) {
        System.out.println("Dimension matrix " + matrixVar.getN() + " filled: ");
        String[][] array = new String[matrixVar.getN()][matrixVar.getN()];
        for (int i = 0; i < matrixVar.getN(); i++) {
            for (int j = 0; j < matrixVar.getN(); j++) {
                array[i][j] = matrixVar.getElem();
            }
        }
        System.out.println();
        return array;
    }

    public Integer[][] fulfillingRandomlyWithInt(Integer n){
        System.out.println("Dimension matrix " + n + " filled randomly: ");
        Integer[][] array = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random ()*10);
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println();
        return array;
    }

    public void fromMemoDisplay(String[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void changeElementsLeftUpperTriangular(String m[][], String elem){
        System.out.println("Fulfilling Left Upper Triangular with: " + elem);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (j < (m.length - i)) {
                    m[i][j] = elem;
                }
            }
            System.out.println();
        }

    }

    public void changeElementsRightLowerTriangular(String m[][], String elem){
        System.out.println("Fulfilling Right Lower Triangular with: " + elem);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if ((m.length - j) <= i) {
                    m[i][j] = elem;
                }
            }
            System.out.println();
        }
    }

    public void changeElementsInMainDiagonal(String m[][], String elem) {
        System.out.println("Changing Elements In Main Diagonal with: " + elem);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j) {
                    m[i][j] = elem;
                }
            }
        }
        System.out.println();
    }

    public void changeElementsInSecondaryDiagonal(String m[][], String elem){
        System.out.println("Changing Elements In Secondary Diagonal with: " + elem);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if ((i + j) == m.length-1) {
                    m[i][j] = elem;
                }
            }
        }
        System.out.println();
    }

    public void writeMatrixInTextFile(String[][] matrix, String path){
        File f = new File(path);
        try{
            if(!f.exists())
                f.createNewFile();
            //int[][] array = {{0,1,0,0,1,0,1,0},{0,1,0,0,1,0,0,0},{0,1,0,1,1,1,0,1}};
            FileWriter out = new FileWriter(f);
            for(int i= 0; i< matrix.length;i++){
                for(int j = 0;j<matrix[i].length;j++)
                    out.append(String.valueOf(matrix[i][j]));
                out.append("\n");
            }
            out.close();
        }
        catch(Throwable e){
            e.printStackTrace();
        }
    }

    public void writeMatrixInTextFile1 (MatrixVariables matrixVar, String path) {
        File f = new File(path);
        try{
            if(!f.exists())
                f.createNewFile();
            String[][] matrix = fulfillMatrix(matrixVar);
            FileWriter out = new FileWriter(f);
            for(int i= 0; i< matrix.length;i++){
                for(int j = 0;j<matrix[i].length;j++)
                    out.append(String.valueOf(matrix[i][j]));
                out.append("\n");
            }
            out.close();
        }
        catch(Throwable e){
            e.printStackTrace();
        }
    }

    public void readMatrixFromTextFile (String path) {
        System.out.println("Reading from file txt: ");
        File f = new File(path);
        try{
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        }
        catch(Throwable e){
            e.printStackTrace();
        }
    }

    public void fromTextDisplay (String path) {
        readMatrixFromTextFile(path);
    }
}


