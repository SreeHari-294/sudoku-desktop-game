package solver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sudoku.model.exceptions.FillingBoardSudokuException;
import sudoku.model.models.SudokuBoard;
import sudoku.model.solver.BacktrackingSudokuSolver;

import static org.junit.jupiter.api.Assertions.*;

public class BacktrackingSudokuSolverTest {

    private BacktrackingSudokuSolver solver;
    private SudokuBoard board;

    @BeforeEach
    public void setUp() {
        // Initialize a fresh solver and board before every test
        solver = new BacktrackingSudokuSolver();
        board = new SudokuBoard(solver);
    }

    @Test
    public void testSolveSuccessfullyFillsEmptyBoard() {
        assertDoesNotThrow(() -> {
            solver.solve(board);
        }, "The solver should be able to fill an empty board without throwing an exception.");

        assertTrue(board.checkEndGame(), "The board should be fully filled and valid according to Sudoku rules.");
    }

}