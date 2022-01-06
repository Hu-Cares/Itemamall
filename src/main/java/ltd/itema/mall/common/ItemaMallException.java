
package ltd.itema.mall.common;

public class ItemaMallException extends RuntimeException {

    public ItemaMallException() {
    }

    public ItemaMallException(String message) {
        super(message);
    }

    /**
     * 丢出一个异常
     *
     * @param message
     */
    public static void fail(String message) {
        throw new ItemaMallException(message);
    }

}
