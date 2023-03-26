package com.microsoft.appcenter.ingestion.models.properties;

import com.microsoft.appcenter.ingestion.models.Model;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public abstract class TypedProperty implements Model {
    private String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.name;
        String str2 = ((TypedProperty) obj).name;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getType();

    public int hashCode() {
        String str = this.name;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getString("type").equals(getType())) {
            setName(jSONObject.getString("name"));
            return;
        }
        throw new JSONException("Invalid type");
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        jSONStringer.key("type").value(getType());
        jSONStringer.key("name").value(getName());
    }
}