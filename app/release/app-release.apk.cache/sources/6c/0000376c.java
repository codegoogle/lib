package com.microsoft.appcenter.ingestion.models.one;

import com.microsoft.appcenter.ingestion.models.Model;
import com.microsoft.appcenter.ingestion.models.json.JSONUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class OsExtension implements Model {
    private static final String NAME = "name";
    private static final String VER = "ver";
    private String name;
    private String ver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OsExtension osExtension = (OsExtension) obj;
        String str = this.name;
        if (str == null ? osExtension.name == null : str.equals(osExtension.name)) {
            String str2 = this.ver;
            String str3 = osExtension.ver;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String getVer() {
        return this.ver;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ver;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) {
        setName(jSONObject.optString("name", null));
        setVer(jSONObject.optString(VER, null));
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setVer(String str) {
        this.ver = str;
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        JSONUtils.write(jSONStringer, "name", getName());
        JSONUtils.write(jSONStringer, VER, getVer());
    }
}