
public class Chess {

    public String findEndPosition(String startPosition, int rows, int columns) {
	
		int startRow = Integer.parseInt(startPosition.substring(0,1));
		char startCol=startPosition.charAt(1);

		int endRow = (startRow + rows) % 8;
        if (endRow == 0){
			endRow = 8;
		} 
        
        int endColumnIndex = ((startCol - 'a') + columns) % 8;
        char endColumn = (char) ('a' + endColumnIndex);
        
		String endPosition = endRow + String.valueOf(endColumn);
        System.out.println("The end position to return is: " + endPosition);
		return endPosition;
	}

    public static void main(String[] args){
        Chess obj = new Chess();
        String startPosition = "2b";
        int rows = 3;
        int columns = 2;
        
        String endPosition = obj.findEndPosition(startPosition, rows, columns);
        System.out.println("The end position is: " + endPosition);
    }

}
