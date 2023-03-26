package com.microsoft.appcenter.crashes.ingestion.models;

import com.microsoft.appcenter.crashes.ingestion.models.json.ThreadFactory;
import com.microsoft.appcenter.ingestion.models.json.JSONUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class ManagedErrorLog extends AbstractErrorLog {
    private static final String EXCEPTION = "exception";
    private static final String THREADS = "threads";
    public static final String TYPE = "managedError";
    private Exception exception;
    private List<Thread> threads;

    @Override // com.microsoft.appcenter.crashes.ingestion.models.AbstractErrorLog, com.microsoft.appcenter.ingestion.models.AbstractLog
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            ManagedErrorLog managedErrorLog = (ManagedErrorLog) obj;
            Exception exception = this.exception;
            if (exception == null ? managedErrorLog.exception == null : exception.equals(managedErrorLog.exception)) {
                List<Thread> list = this.threads;
                List<Thread> list2 = managedErrorLog.threads;
                return list != null ? list.equals(list2) : list2 == null;
            }
            return false;
        }
        return false;
    }

    public Exception getException() {
        return this.exception;
    }

    public List<Thread> getThreads() {
        return this.threads;
    }

    @Override // com.microsoft.appcenter.ingestion.models.Log
    public String getType() {
        return TYPE;
    }

    @Override // com.microsoft.appcenter.crashes.ingestion.models.AbstractErrorLog, com.microsoft.appcenter.ingestion.models.AbstractLog
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Exception exception = this.exception;
        int hashCode2 = (hashCode + (exception != null ? exception.hashCode() : 0)) * 31;
        List<Thread> list = this.threads;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.microsoft.appcenter.crashes.ingestion.models.AbstractErrorLog, com.microsoft.appcenter.ingestion.models.AbstractLog, com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) throws JSONException {
        super.read(jSONObject);
        if (jSONObject.has("exception")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("exception");
            Exception exception = new Exception();
            exception.read(jSONObject2);
            setException(exception);
        }
        setThreads(JSONUtils.readArray(jSONObject, THREADS, ThreadFactory.getInstance()));
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public void setThreads(List<Thread> list) {
        this.threads = list;
    }

    @Override // com.microsoft.appcenter.crashes.ingestion.models.AbstractErrorLog, com.microsoft.appcenter.ingestion.models.AbstractLog, com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        super.write(jSONStringer);
        if (getException() != null) {
            jSONStringer.key("exception").object();
            this.exception.write(jSONStringer);
            jSONStringer.endObject();
        }
        JSONUtils.writeArray(jSONStringer, THREADS, getThreads());
    }
}