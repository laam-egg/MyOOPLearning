# Luật viết code Java trên OASIS

Last update: Thursday, September 21, 2023

1. Tất cả các class và method cần viết documentation (javadoc).

    a. Documentation cần được viết ngay trước khai báo của class hoặc method,
    có dạng:

    ```java
    /**
     * <javadoc viết ở đây...>
     */
    class AnyClass { /*...*/ }
    ```

    b. Đối với cả class và method: bắt buộc viết một câu mô tả chung trên dòng
    đầu tiên, có dấu chấm. Ví dụ:

    ```java
    /**
     * This class holds the main entry point of the program.
     */
    class Main { /*...*/ }
    ```

    c. Riêng đối với method, bắt buộc viết mô tả cho các đối số và giá trị trả về
    của hàm. Đối với kiểu trả về void thì không cần viết mô tả cho giá trị trả về
    (nhưng vẫn viết mô tả cho các đối số nếu có). Ví dụ:

    ```java
    /**
     * Calculate the nth Fibonacci number.
     * F0 = 0 ; F1 = 1 ; ...
     *
     * @param n - The ordinal of the number in Fibonacci series.
     * @return The nth Fibonacci number.
     */
    public static long fibonacci(long n) { /*...*/ }
    ```

    d. Nên có một dòng trống giữa mô tả chung và mô tả đối số/giá trị trả về (`@param`
    và `@return`). Xem ví dụ ở điểm c.

2. Khai báo các class và method cách nhau một dòng. Ví dụ:

    ```java
    /**
     * Calculates the sum of two integers.
     *
     * @param n1 – The first integer.
     * @param n2 – The second integer.
     * @return The sum of the two integers specified.
     */
    public int getSumOf(n1, n2) {
        return n1 + n2;
    }

    /**
     * Prints Hello World to the screen.
     */
    public void printHello() {
        System.out.println("Hello World");
    }
    ```

3. Luôn luôn viết khối code đầy đủ kể cả trong trường hợp có thể rút gọn chỉ bằng một
lệnh. Ví dụ, không được viết:

    ```java
    if (x == 5) return 1;
    while (t--) sum += t;
    ```

    mà phải viết:

    ```java
    if (x == 5) {
        return 1;
    }

    while (t--) {
        sum += t;
    }
    ```

4. Tên biến, nếu bắt đầu bằng 2 chữ cái, thì 2 chữ cái đó buộc phải là chữ cái thường.

5. Khi ép kiểu phải có một dấu cách giữa bộ ngoặc (kiểu) và biến/giá trị cần ép kiểu.
Ví dụ:

    ```java
    long n = 100000000000;
    int i = (int) n;
    ```

6. Một dòng (javadoc hoặc code) không được phép vượt quá **100 ký tự**.

7. Trong code, nếu một biểu thức được viết trên nhiều dòng và có dấu phép tính (toán tử)
nối giữa các phần của biểu thức, thì các dấu này phải được viết ở đầu dòng. Ví dụ, không
được viết:

    ```java
    this.numerator = (
        this.numerator * a +
        other.numerator * b
    );

    return (
        this.numerator == other.numerator &&
        this.denominator == other.denominator
    );
    ```

    mà phải viết:

    ```java
    this.numerator = (
        this.numerator * a
        + other.numerator * b
    );

    return (
        this.numerator == other.numerator
        && this.denominator == other.denominator
    );
    ```
