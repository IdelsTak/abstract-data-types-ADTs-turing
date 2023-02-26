package turing;

/** Represents one cell on a Turing Machine tape. */
public class Cell {
  /** The character in this cell. */
  public char content;
  /** Pointer to the cell to the right of this one. */
  public Cell next;
  /** Pointer to the cell to the left of this one. */
  public Cell prev;
}
