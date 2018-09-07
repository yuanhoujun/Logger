package logger.adapter;

/**
 * Format adapter.
 *
 * @author Scott Smith 2018-09-07 17:39
 */
public abstract class FormatAdapter {

    public abstract String format(int priority, String tag, String msg);
}
