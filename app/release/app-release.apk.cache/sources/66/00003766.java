package com.microsoft.appcenter.ingestion.models.one;

import com.microsoft.appcenter.ingestion.models.Model;
import com.microsoft.appcenter.ingestion.models.json.JSONUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class Data implements Model {
    public static final String BASE_DATA = "baseData";
    public static final String BASE_TYPE = "baseType";
    private final JSONObject mProperties = new JSONObject();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mProperties.toString().equals(((Data) obj).mProperties.toString());
    }

    public JSONObject getProperties() {
        return this.mProperties;
    }

    public int hashCode() {
        return this.mProperties.toString().hashCode();
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) throws JSONException {
        JSONArray names = jSONObject.names();
        if (names != null) {
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                this.mProperties.put(string, jSONObject.get(string));
            }
        }
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        JSONUtils.write(jSONStringer, BASE_TYPE, this.mProperties.optString(BASE_TYPE, null));
        JSONUtils.write(jSONStringer, BASE_DATA, this.mProperties.optJSONObject(BASE_DATA));
        JSONArray names = this.mProperties.names();
        if (names != null) {
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                if (!string.equals(BASE_TYPE) && !string.equals(BASE_DATA)) {
                    jSONStringer.key(string).value(this.mProperties.get(string));
                }
            }
        }
    }
}