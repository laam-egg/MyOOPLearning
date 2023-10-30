import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;

public class Week8Task2 {
    /**
     * Throws a NullPointerException.
     */
    public void nullPointerEx() {
        throw new NullPointerException("Lỗi Null Pointer");
    }

    /**
     * Calls nullPointerEx() and catches NullPointerException.
     *
     * @return the error message.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return e.getMessage();
        }
    }

    /**
     * Throws an ArrayIndexOutOfBoundsException.
     */
    public void arrayIndexOutOfBoundsEx() {
        throw new ArrayIndexOutOfBoundsException("Lỗi Array Index Out of Bounds");
    }

    /**
     * Calls arrayIndexOutOfBoundsEx() and catches ArrayIndexOutOfBoundsException.
     *
     * @return the error message.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
    }

    /**
     * Throws an ArithmeticException.
     */
    public void arithmeticEx() {
        throw new ArithmeticException("Lỗi Arithmetic");
    }

    /**
     * Calls arithmeticEx() and catches ArithmeticException.
     *
     * @return the error message.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
    }

    /**
     * Throws a FileNotFoundException.
     *
     * @throws FileNotFoundException - always.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException("Lỗi File Not Found");
    }

    /**
     * Calls fileNotFoundEx() and catches FileNotFoundException.
     *
     * @return the error message.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
    }

    /**
     * Throws an IOException.
     *
     * @throws IOException - always.
     */
    public void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }

    /**
     * Calls ioEx() and catches IOException.
     *
     * @return the error message.
     */
    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
