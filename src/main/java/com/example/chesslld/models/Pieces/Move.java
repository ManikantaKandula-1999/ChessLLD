package com.example.chesslld.models.Pieces;

import com.example.chesslld.models.Board.Cell;

public class Move {
    private final Cell sourceCell;
    private final Cell destinationCell;

    public Move(Cell sourceCell, Cell destinationCell) {
        this.sourceCell = sourceCell;
        this.destinationCell = destinationCell;
    }

    public Cell getSourceCell() {
        return this.sourceCell;
    }

    public Cell getDestinationCell() {
        return this.destinationCell;
    }
}
