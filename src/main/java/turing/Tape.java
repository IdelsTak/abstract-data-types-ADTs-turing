package turing;

/**
 * Represents Turing machine tapes.
 *
 * <p>It is analogous to a doubly-linked list where each cell has a pointer to the previous cell (to
 * its left) and to the next cell (to its right). The pointers will allow the machine to advance
 * from one cell to the next cell on the left or to the next cell on the right.
 *
 * <p>The class has an instance variable of type {@link Cell} that points to the current cell.
 */
public class Tape {

  private Cell curr;
  /**
   * Creates a {@code Tape} instance that initially consists of a single cell.
   *
   * <p>The cell contains a blank space, and the current cell pointer points to it.
   */
  public Tape() {
    curr = new Cell();
    curr.content = ' ';
  }
  /** @return the pointer that points to the current cell. */
  public Cell getCurrentCell() {
    return curr;
  }
  /** @return the {@code char} from the current cell. */
  public char getContent() {
    return curr.content;
  }
  /**
   * Changes the {@code char} in the current cell to the specified value.
   *
   * @param charAt the {@code char} to be set in the current cell.
   */
  public void setContent(char charAt) {
    curr.content = charAt;
  }
  /**
   * Moves the current cell one position to the left along the tape.
   *
   * <p>If the current cell is the leftmost cell that exists, then a new cell is created and added
   * to the tape at the left of the current cell, and then the current cell pointer is moved to
   * point to the new cell. The content of the new cell is a blank space.
   */
  public void moveLeft() {
    if (curr.prev == null) {
      Cell temp = new Cell();
      temp.content = ' ';

      curr.prev = temp;
      temp.next = curr;

      curr = temp;
    } else {
      curr = curr.prev;
    }
  }

  /**
   * Moves the current cell one position to the right along the tape.
   *
   * <p>If the current cell is the rightmost cell that exists, then a new cell is created and added
   * to the tape at the right of the current cell, and then the current cell pointer is moved to
   * point to the new cell. The content of the new cell is a blank space.
   */
  public void moveRight() {
    if (curr.next == null) {
      Cell temp = new Cell();
      temp.content = ' ';

      curr.next = temp;
      temp.prev = curr;

      curr = temp;
    } else {
      curr = curr.next;
    }
  }

  /**
   * The current cell pointer is not moved by this method; it points to the same cell after the
   * method is called as it did before.
   *
   * <p>A different pointer is created to move along the tape and to get the full contents.
   *
   * @return a {@code String} consisting of the {@code char} values from all the cells on the tape,
   *     read from left to right, except that leading or trailing blank characters are discarded.
   */
  public String getTapeContents() {
    String contents = "";
    Cell pointer = curr;
    Cell first = null;

    while (pointer != null) {
      first = pointer;
      pointer = pointer.prev;
    }

    pointer = first;

    while (pointer != null) {
      contents = contents + pointer.content;
      pointer = pointer.next;
    }

    return contents;
  }
}
