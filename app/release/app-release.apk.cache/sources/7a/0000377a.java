package com.microsoft.appcenter.persistence;

import com.microsoft.appcenter.ingestion.models.Log;
import com.microsoft.appcenter.ingestion.models.json.LogSerializer;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.Closeable;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class Persistence implements Closeable {
    private LogSerializer mLogSerializer;

    /* loaded from: classes3.dex */
    public static class PersistenceException extends Exception {
        public PersistenceException(String str, Throwable th) {
            super(str, th);
        }

        public PersistenceException(String str) {
            super(str);
        }
    }

    public abstract void clearPendingLogState();

    public abstract int countLogs(@x1 String str);

    public abstract void deleteLogs(String str);

    public abstract void deleteLogs(@x1 String str, @x1 String str2);

    public LogSerializer getLogSerializer() {
        LogSerializer logSerializer = this.mLogSerializer;
        if (logSerializer != null) {
            return logSerializer;
        }
        throw new IllegalStateException("logSerializer not configured");
    }

    @z1
    public abstract String getLogs(@x1 String str, @x1 Collection<String> collection, @p1(from = 0) int i, @x1 List<Log> list);

    public abstract long putLog(@x1 Log log, @x1 String str, @p1(from = 1, to = 2) int i) throws PersistenceException;

    public void setLogSerializer(@x1 LogSerializer logSerializer) {
        this.mLogSerializer = logSerializer;
    }

    public abstract boolean setMaxStorageSize(long j);
}