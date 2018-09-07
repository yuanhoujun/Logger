package logger.strategy;

import java.io.FileWriter;
import java.io.IOException;

/**
 * File log adapter.
 *
 * @author Scott Smith 2018-09-07 18:29
 */
public class FileLogAdapter extends LogAdapter {
    private int threadCount;
    private int numberOfCommitOneTime;
    private int maxFileSize;
    private String filePath;
    private FileWriter fileWriter;

    private FileLogAdapter() {}

    private void prepare() {
        try {
            fileWriter = new FileWriter(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(String tag, String msg) {

    }

    public int getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(int threadCount) {
        this.threadCount = threadCount;
    }

    public int getNumberOfCommitOneTime() {
        return numberOfCommitOneTime;
    }

    public void setNumberOfCommitOneTime(int numberOfCommitOneTime) {
        this.numberOfCommitOneTime = numberOfCommitOneTime;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public static class Builder {
        public int threadCount;
        public int numberOfCommitOneTime = 4;
        public int maxFileSize;
        public String filePath;

        public static Builder newBuilder() {
            return new Builder();
        }

        public FileLogAdapter build() {
            FileLogAdapter fileLogAdapter = new FileLogAdapter();
            fileLogAdapter.setThreadCount(threadCount);
            fileLogAdapter.setNumberOfCommitOneTime(numberOfCommitOneTime);
            fileLogAdapter.setMaxFileSize(maxFileSize);
            fileLogAdapter.setFilePath(filePath);
            fileLogAdapter.prepare();

            return fileLogAdapter;
        }
    }
}
