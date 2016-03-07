import java.util.ArrayList;
import java.util.List;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月7日下午12:07:02
*/
public class PrintMetrixClockwise {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;
        int column = 0;
        ArrayList<Integer> result = new ArrayList<>();
        if (row != 0){
        	column = matrix[0].length;
        }
        else{
        	return null;
        }
        int rowf = 0, rowb = column - 1;
        int columnf = 0, columnb = row - 1;
        while (rowb - rowf >= 0 && columnb - columnf >= 0){
        	for (int i = rowf; i <= rowb; i++){
        		result.add(matrix[columnf][i]);
        	}
        	columnf++;
        	for (int i = columnf; i <= columnb; i++){
        		result.add(matrix[i][rowb]);
        	}
        	rowb--;
        	if (columnb - columnf < 0)break;
        	for (int i = rowb; i >= rowf; i--){
        		result.add(matrix[columnb][i]);
        	}
        	columnb--;
        	if (rowb - rowf < 0)break;
        	for (int i = columnb; i >= columnf; i--){
        		result.add(matrix[i][rowf]);
        	}
        	rowf++;
        }
        return result;
    }
    public static void main(String[] args){
    	int[][] m = {{1,2},{3,4}};
    	ArrayList<Integer> result = new PrintMetrixClockwise().printMatrix(m);
    	for (int i = 0; i < result.size(); i++){
    		System.out.println(result.get(i));
    	}
    }
}
