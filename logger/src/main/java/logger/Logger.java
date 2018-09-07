package logger;

import logger.initializer.InitWrapper;

/**
 * Logger.
 *
 * @author Scott Smith 2018-09-07 17:16
 */
public class Logger {

    private static InitWrapper mInitWrapper;

    public static void init(InitWrapper initWrapper) {
        mInitWrapper = initWrapper;
    }
}
