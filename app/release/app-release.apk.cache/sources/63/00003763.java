package com.microsoft.appcenter.ingestion.models.one;

import com.microsoft.appcenter.ingestion.models.Model;
import com.microsoft.appcenter.ingestion.models.json.JSONUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class AppExtension implements Model {
    private static final String ID = "id";
    private static final String LOCALE = "locale";
    private static final String NAME = "name";
    private static final String USER_ID = "userId";
    private static final String VER = "ver";
    private String id;
    private String locale;
    private String name;
    private String userId;
    private String ver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppExtension appExtension = (AppExtension) obj;
        String str = this.id;
        if (str == null ? appExtension.id == null : str.equals(appExtension.id)) {
            String str2 = this.ver;
            if (str2 == null ? appExtension.ver == null : str2.equals(appExtension.ver)) {
                String str3 = this.name;
                if (str3 == null ? appExtension.name == null : str3.equals(appExtension.name)) {
                    String str4 = this.locale;
                    if (str4 == null ? appExtension.locale == null : str4.equals(appExtension.locale)) {
                        String str5 = this.userId;
                        String str6 = appExtension.userId;
                        return str5 != null ? str5.equals(str6) : str6 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getName() {
        return this.name;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getVer() {
        return this.ver;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ver;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.locale;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.userId;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) {
        setId(jSONObject.optString("id", null));
        setVer(jSONObject.optString(VER, null));
        setName(jSONObject.optString("name", null));
        setLocale(jSONObject.optString(LOCALE, null));
        setUserId(jSONObject.optString("userId", null));
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVer(String str) {
        this.ver = str;
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        JSONUtils.write(jSONStringer, "id", getId());
        JSONUtils.write(jSONStringer, VER, getVer());
        JSONUtils.write(jSONStringer, "name", getName());
        JSONUtils.write(jSONStringer, LOCALE, getLocale());
        JSONUtils.write(jSONStringer, "userId", getUserId());
    }
}