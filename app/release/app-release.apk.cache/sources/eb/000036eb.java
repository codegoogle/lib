package com.microsoft.appcenter.analytics.ingestion.models;

/* loaded from: classes3.dex */
public class PageLog extends LogWithNameAndProperties {
    public static final String TYPE = "page";

    @Override // com.microsoft.appcenter.ingestion.models.Log
    public String getType() {
        return TYPE;
    }
}