package logger.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Log strategy.
 *
 * @author Scott Smith 2018-09-07 18:18
 */
public abstract class LogStrategy {
    private List<LogAdapter> adapters = new ArrayList<>();

    public void addAdapter(LogAdapter adapter) {
        adapters.add(adapter);
    }

    public void log(String tag, String msg) {
        for (LogAdapter adapter : adapters) {
            adapter.log(tag, msg);
        }
    }
}
