package com.microsoft.appcenter.ingestion.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public interface Model {
    void read(JSONObject jSONObject) throws JSONException;

    void write(JSONStringer jSONStringer) throws JSONException;
}