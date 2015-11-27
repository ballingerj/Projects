/*************************************
* Jake Ballinger
* CMPSC 250: Analysis of Algorithms
* Prof. Wenskovitch
* Spring 2015
* 
* EightQueens.java
* --> Solves the n-queens problem using a recursive backtracking algorithm.
*
* Compile: javac EightQueens.java
* Run: java EightQueens [n] [number of solutions (-1 gives all)]
*************************************/


public class EightQueens {
    // Global variable dictionary
    public static int numRows; // number of rows
    public static int numCols; // number of columns
    public static boolean board[][]; // the board
    public static int solCount; // total of solutions to find
    public static int counter; // for allQueensPlaced()
    public static int solCounter = 0; // tracks current sol #
    //*********************************************************
    // main: Main method. Calls placeQueen(0);
    //*********************************************************
    public static void main (String[] args) {
	   // Make sure the command line is working
	   if (args.length > 0) {
           try {
               EightQueens.numRows = Integer.parseInt(args[0]); // The first argument
               EightQueens.numCols = EightQueens.numRows; // Rows = Columns
               EightQueens.board = new boolean[EightQueens.numRows][EightQueens.numCols]; // Create the board
               EightQueens.solCount = Integer.parseInt(args[1]); // The number of solutions to show
           } catch (NumberFormatException e) { // In case things go poorly
               System.err.println("Arguments \"" + args[0] + "\" and \"" + args[1] + "\" must be integers."); // Display the usage of the program
               System.err.println("Usage: java EightQueens [n] [number of solutions (-1 gives all solutions)] "); 
               System.exit(1); // Exit
           } // try-catch
       } else { // If no command line arguments
           System.out.println("Usage: java EightQueens [n] [number of solutions (-1 gives all solutions)] "); 
       } // else
        placeQueen(0);
    } // main

    //*********************************************************
    // addQueen(row, col): Adds a queen to the space
    //*********************************************************
    public static void addQueen(int row, int col) {
	   EightQueens.board[row][col] = true;
    } //addQueen()

    //*********************************************************
    // allQueensPlaced(): Checks if there are n queens
    //*********************************************************
    public static boolean allQueensPlaced() {
	for (int i = 0; i < numRows; i++) {
	    for (int j = 0; j < numRows; j++) {
		if (EightQueens.board[i][j]) {
		    EightQueens.counter++;
		} // if
	    } // for
	} // for
	if (EightQueens.counter != EightQueens.numRows) {
	    return false;
	} //if
	return true;
    } // allQueensPlaced

    //*********************************************************
    // isLegalPlacement(row, col): Checks placement legality
    //*********************************************************
    public static boolean isLegalPlacement(boolean board[][], int row, int col) {
	int i, j; // iterators
	// check the current space
	if (EightQueens.board[row][col] == true) {
	    return false;
	} // if

	// check the column
	for (int k = 0; k < EightQueens.numCols; k++) {
	    if (EightQueens.board[k][col] == true) {
		return false;
	    } // if
	} // for

	// Check upper left diagonal
	for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (EightQueens.board[i][j] == true) {
                return false;
	    } // if
    	} // for
 
	// Check lower left diagonal
	for (i = row, j = col; j >= 0 && i < EightQueens.numRows; i++, j--) {
	    if (EightQueens.board[i][j] == true) {
            	return false;
	    } // if
	} // for

	// Check upper right diagonal
	for (i = row, j = col; i >= 0 && j < EightQueens.numRows; i--, j++) {
	    if (EightQueens.board[i][j] == true) {
		return false;
	    } // if
	} // for

	// Check lower right diagonal
	for (i = row, j = col; i < EightQueens.numRows && j < EightQueens.numRows; i++, j++) {
	    if (EightQueens.board[i][j] == true) {
		return false;
	    } // if
	} // for
	return true;
    } //isLegalPlacement()

    //********************************************************
    // placeQueen(int row): Recursive backtracking algorithm 
    //********************************************************
    public static boolean placeQueen(int row) {
	for (int col = 0; col < EightQueens.numCols; col++) {
	    if (isLegalPlacement(EightQueens.board, row, col)) {
		addQueen(row, col);
		if (row+1 == EightQueens.numRows) {
		    printSolution();
		    if (EightQueens.solCounter == EightQueens.solCount) {
			return true;
		    } // if
		} else {
		    placeQueen(row+1);
		} //if-else
		removeQueen(row, col);
	    } // if
	} // for
	return(allQueensPlaced());
    } // placeQueen()

    //**********************************************************
    // printSolution(): Prints the board.
    //**********************************************************
    public static void printSolution() {
	solCounter++;
	System.out.println("Solution #" + solCounter);
	for (int i = 0; i < EightQueens.numRows; i++) {
	    for (int j = 0; j < EightQueens.numCols; j++) {
		if (EightQueens.board[i][j]) {
		    System.out.print("Q");
		} else {
		    System.out.print("*");
		} // if-else
	    } // for
	System.out.print("\n");
	} // for
	System.out.println();
    } // printSolution()

    //**********************************************************
    // removeQueen(row, i)
    //**********************************************************
    public static void removeQueen(int row, int col) {
	EightQueens.board[row][col] = false;
    } //removeQueen()
} // EightQueens.java
