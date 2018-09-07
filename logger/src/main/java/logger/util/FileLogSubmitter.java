package logger.util;

import java.util.ArrayList;
import java.util.List;

import logger.model.LogEntity;

/**
 * File writer.
 *
 * @author Scott Smith 2018-09-07 20:37
 */
public class FileLogSubmitter {
    private String filePath;

    public void write(LogEntity log) {

    }

    public static class Editor {
        private List<LogEntity> logs = new ArrayList<>();

        public void commit() {

        }
    }
}
