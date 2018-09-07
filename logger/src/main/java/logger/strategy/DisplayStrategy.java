package logger.strategy;

/**
 * Display strategy.
 *
 * @author Scott Smith 2018-09-07 17:41
 */
public abstract class DisplayStrategy {

    protected boolean needDisplay(int priority, String tag, String msg) {
        return true;
    }
}
