package logger.initializer;

import logger.adapter.FormatAdapter;
import logger.strategy.DisplayStrategy;
import logger.strategy.LogStrategy;

/**
 * Initialize wrapper for simplify to initialize logger.
 *
 * @author Scott Smith 2018-09-07 18:30
 */
public class InitWrapper {
    private FormatAdapter formatAdapter;
    private DisplayStrategy displayStrategy;
    private LogStrategy logStrategy;

    private InitWrapper() {}

    public FormatAdapter getFormatAdapter() {
        return formatAdapter;
    }

    public void setFormatAdapter(FormatAdapter formatAdapter) {
        this.formatAdapter = formatAdapter;
    }

    public DisplayStrategy getDisplayStrategy() {
        return displayStrategy;
    }

    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public LogStrategy getLogStrategy() {
        return logStrategy;
    }

    public void setLogStrategy(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    public static class Builder {
        private FormatAdapter formatAdapter;
        private DisplayStrategy displayStrategy;
        private LogStrategy logStrategy;

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder formatAdapter(FormatAdapter adapter) {
            formatAdapter = adapter;
            return this;
        }

        public Builder displayStrategy(DisplayStrategy strategy) {
            displayStrategy = strategy;
            return this;
        }

        public Builder logStrategy(LogStrategy strategy) {
            logStrategy = strategy;
            return this;
        }

        public InitWrapper build() {
            InitWrapper initWrapper = new InitWrapper();
            initWrapper.setDisplayStrategy(displayStrategy);
            initWrapper.setFormatAdapter(formatAdapter);
            initWrapper.setLogStrategy(logStrategy);

            return initWrapper;
        }
    }
}
