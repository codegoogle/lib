package com.microsoft.appcenter.ingestion;

import com.microsoft.appcenter.Constants;
import com.microsoft.appcenter.http.AbstractAppCallTemplate;
import com.microsoft.appcenter.http.HttpClient;
import com.microsoft.appcenter.http.ServiceCall;
import com.microsoft.appcenter.http.ServiceCallback;
import com.microsoft.appcenter.ingestion.models.LogContainer;
import com.microsoft.appcenter.ingestion.models.json.LogSerializer;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.x1;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class AppCenterIngestion extends AbstractAppCenterIngestion {
    @r2
    public static final String API_PATH = "/logs?api-version=1.0.0";
    public static final String DEFAULT_LOG_URL = "https://in.appcenter.ms";
    @r2
    public static final String INSTALL_ID = "Install-ID";
    private final LogSerializer mLogSerializer;

    /* loaded from: classes3.dex */
    public static class IngestionCallTemplate extends AbstractAppCallTemplate {
        private final LogContainer mLogContainer;
        private final LogSerializer mLogSerializer;

        public IngestionCallTemplate(LogSerializer logSerializer, LogContainer logContainer) {
            this.mLogSerializer = logSerializer;
            this.mLogContainer = logContainer;
        }

        @Override // com.microsoft.appcenter.http.HttpClient.CallTemplate
        public String buildRequestBody() throws JSONException {
            return this.mLogSerializer.serializeContainer(this.mLogContainer);
        }
    }

    public AppCenterIngestion(@x1 HttpClient httpClient, @x1 LogSerializer logSerializer) {
        super(httpClient, DEFAULT_LOG_URL);
        this.mLogSerializer = logSerializer;
    }

    @Override // com.microsoft.appcenter.ingestion.AbstractAppCenterIngestion, com.microsoft.appcenter.ingestion.Ingestion
    public ServiceCall sendAsync(String str, UUID uuid, LogContainer logContainer, ServiceCallback serviceCallback) throws IllegalArgumentException {
        super.sendAsync(str, uuid, logContainer, serviceCallback);
        HashMap hashMap = new HashMap();
        hashMap.put(INSTALL_ID, uuid.toString());
        hashMap.put(Constants.APP_SECRET, str);
        HttpClient.CallTemplate ingestionCallTemplate = new IngestionCallTemplate(this.mLogSerializer, logContainer);
        return getServiceCall(getLogUrl() + API_PATH, "POST", hashMap, ingestionCallTemplate, serviceCallback);
    }
}