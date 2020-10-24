package pertemuan82;

/**
 * PegawaiException
 */
public class PegawaiException extends Exception {

    private String message;

    public PegawaiException() {
        super();
    }

    public PegawaiException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

}
