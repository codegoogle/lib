package com.microsoft.appcenter.ingestion.models.json;

import com.microsoft.appcenter.ingestion.models.Log;
import com.microsoft.appcenter.ingestion.models.LogContainer;
import com.microsoft.appcenter.ingestion.models.one.CommonSchemaLog;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class DefaultLogSerializer implements LogSerializer {
    private static final String LOGS = "logs";
    private final Map<String, LogFactory> mLogFactories = new HashMap();

    @x1
    private Log readLog(JSONObject jSONObject, String str) throws JSONException {
        if (str == null) {
            str = jSONObject.getString("type");
        }
        LogFactory logFactory = this.mLogFactories.get(str);
        if (logFactory != null) {
            Log create = logFactory.create();
            create.read(jSONObject);
            return create;
        }
        throw new JSONException(wo1.t("Unknown log type: ", str));
    }

    @x1
    private JSONStringer writeLog(JSONStringer jSONStringer, Log log) throws JSONException {
        jSONStringer.object();
        log.write(jSONStringer);
        jSONStringer.endObject();
        return jSONStringer;
    }

    @Override // com.microsoft.appcenter.ingestion.models.json.LogSerializer
    public void addLogFactory(@x1 String str, @x1 LogFactory logFactory) {
        this.mLogFactories.put(str, logFactory);
    }

    @Override // com.microsoft.appcenter.ingestion.models.json.LogSerializer
    @x1
    public LogContainer deserializeContainer(@x1 String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        LogContainer logContainer = new LogContainer();
        JSONArray jSONArray = jSONObject.getJSONArray("logs");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(readLog(jSONArray.getJSONObject(i), str2));
        }
        logContainer.setLogs(arrayList);
        return logContainer;
    }

    @Override // com.microsoft.appcenter.ingestion.models.json.LogSerializer
    @x1
    public Log deserializeLog(@x1 String str, String str2) throws JSONException {
        return readLog(new JSONObject(str), str2);
    }

    @Override // com.microsoft.appcenter.ingestion.models.json.LogSerializer
    @x1
    public String serializeContainer(@x1 LogContainer logContainer) throws JSONException {
        JSONStringer jSONStringer = new JSONStringer();
        jSONStringer.object();
        jSONStringer.key("logs").array();
        for (Log log : logContainer.getLogs()) {
            writeLog(jSONStringer, log);
        }
        jSONStringer.endArray();
        jSONStringer.endObject();
        return jSONStringer.toString();
    }

    @Override // com.microsoft.appcenter.ingestion.models.json.LogSerializer
    @x1
    public String serializeLog(@x1 Log log) throws JSONException {
        return writeLog(new JSONStringer(), log).toString();
    }

    @Override // com.microsoft.appcenter.ingestion.models.json.LogSerializer
    public Collection<CommonSchemaLog> toCommonSchemaLog(@x1 Log log) {
        return this.mLogFactories.get(log.getType()).toCommonSchemaLogs(log);
    }
}