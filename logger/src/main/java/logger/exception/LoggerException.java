package logger.exception;

import android.util.AndroidRuntimeException;

/**
 * Logger exception wrapper.
 *
 * @author Scott Smith 2018-09-07 18:38
 */
public class LoggerException extends AndroidRuntimeException {

    public LoggerException() {
    }

    public LoggerException(String name) {
        super(name);
    }

    public LoggerException(String name, Throwable cause) {
        super(name, cause);
    }

    public LoggerException(Exception cause) {
        super(cause);
    }
}
