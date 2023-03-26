package com.microsoft.appcenter.ingestion.models.json;

import com.microsoft.appcenter.ingestion.models.Log;
import com.microsoft.appcenter.ingestion.models.LogContainer;
import com.microsoft.appcenter.ingestion.models.one.CommonSchemaLog;
import com.p7700g.p99005.x1;
import java.util.Collection;
import org.json.JSONException;

/* loaded from: classes3.dex */
public interface LogSerializer {
    void addLogFactory(@x1 String str, @x1 LogFactory logFactory);

    @x1
    LogContainer deserializeContainer(@x1 String str, String str2) throws JSONException;

    @x1
    Log deserializeLog(@x1 String str, String str2) throws JSONException;

    @x1
    String serializeContainer(@x1 LogContainer logContainer) throws JSONException;

    @x1
    String serializeLog(@x1 Log log) throws JSONException;

    Collection<CommonSchemaLog> toCommonSchemaLog(@x1 Log log);
}