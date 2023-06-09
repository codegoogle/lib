package com.microsoft.appcenter.ingestion.models.one;

import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.microsoft.appcenter.ingestion.models.json.JSONDateUtils;
import com.microsoft.appcenter.ingestion.models.json.JSONUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public abstract class CommonSchemaLog extends AbstractLog {
    private static final String CV = "cV";
    private static final String DATA = "data";
    private static final String EXT = "ext";
    private static final String FLAGS = "flags";
    private static final String IKEY = "iKey";
    private static final String NAME = "name";
    private static final String POP_SAMPLE = "popSample";
    private static final String TIME = "time";
    private static final String VER = "ver";
    private String cV;
    private Data data;
    private Extensions ext;
    private Long flags;
    private String iKey;
    private String name;
    private Double popSample;
    private String ver;

    @Override // com.microsoft.appcenter.ingestion.models.AbstractLog
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            CommonSchemaLog commonSchemaLog = (CommonSchemaLog) obj;
            String str = this.ver;
            if (str == null ? commonSchemaLog.ver == null : str.equals(commonSchemaLog.ver)) {
                String str2 = this.name;
                if (str2 == null ? commonSchemaLog.name == null : str2.equals(commonSchemaLog.name)) {
                    Double d = this.popSample;
                    if (d == null ? commonSchemaLog.popSample == null : d.equals(commonSchemaLog.popSample)) {
                        String str3 = this.iKey;
                        if (str3 == null ? commonSchemaLog.iKey == null : str3.equals(commonSchemaLog.iKey)) {
                            Long l = this.flags;
                            if (l == null ? commonSchemaLog.flags == null : l.equals(commonSchemaLog.flags)) {
                                String str4 = this.cV;
                                if (str4 == null ? commonSchemaLog.cV == null : str4.equals(commonSchemaLog.cV)) {
                                    Extensions extensions = this.ext;
                                    if (extensions == null ? commonSchemaLog.ext == null : extensions.equals(commonSchemaLog.ext)) {
                                        Data data = this.data;
                                        Data data2 = commonSchemaLog.data;
                                        return data != null ? data.equals(data2) : data2 == null;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public String getCV() {
        return this.cV;
    }

    public Data getData() {
        return this.data;
    }

    public Extensions getExt() {
        return this.ext;
    }

    public Long getFlags() {
        return this.flags;
    }

    public String getIKey() {
        return this.iKey;
    }

    public String getName() {
        return this.name;
    }

    public Double getPopSample() {
        return this.popSample;
    }

    public String getVer() {
        return this.ver;
    }

    @Override // com.microsoft.appcenter.ingestion.models.AbstractLog
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.ver;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Double d = this.popSample;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        String str3 = this.iKey;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l = this.flags;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        String str4 = this.cV;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Extensions extensions = this.ext;
        int hashCode8 = (hashCode7 + (extensions != null ? extensions.hashCode() : 0)) * 31;
        Data data = this.data;
        return hashCode8 + (data != null ? data.hashCode() : 0);
    }

    @Override // com.microsoft.appcenter.ingestion.models.AbstractLog, com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) throws JSONException {
        setVer(jSONObject.getString(VER));
        setName(jSONObject.getString("name"));
        setTimestamp(JSONDateUtils.toDate(jSONObject.getString("time")));
        if (jSONObject.has(POP_SAMPLE)) {
            setPopSample(Double.valueOf(jSONObject.getDouble(POP_SAMPLE)));
        }
        setIKey(jSONObject.optString(IKEY, null));
        setFlags(JSONUtils.readLong(jSONObject, FLAGS));
        setCV(jSONObject.optString(CV, null));
        if (jSONObject.has(EXT)) {
            Extensions extensions = new Extensions();
            extensions.read(jSONObject.getJSONObject(EXT));
            setExt(extensions);
        }
        if (jSONObject.has("data")) {
            Data data = new Data();
            data.read(jSONObject.getJSONObject("data"));
            setData(data);
        }
    }

    public void setCV(String str) {
        this.cV = str;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setExt(Extensions extensions) {
        this.ext = extensions;
    }

    public void setFlags(Long l) {
        this.flags = l;
    }

    public void setIKey(String str) {
        this.iKey = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPopSample(Double d) {
        this.popSample = d;
    }

    public void setVer(String str) {
        this.ver = str;
    }

    @Override // com.microsoft.appcenter.ingestion.models.AbstractLog, com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        jSONStringer.key(VER).value(getVer());
        jSONStringer.key("name").value(getName());
        jSONStringer.key("time").value(JSONDateUtils.toString(getTimestamp()));
        JSONUtils.write(jSONStringer, POP_SAMPLE, getPopSample());
        JSONUtils.write(jSONStringer, IKEY, getIKey());
        JSONUtils.write(jSONStringer, FLAGS, getFlags());
        JSONUtils.write(jSONStringer, CV, getCV());
        if (getExt() != null) {
            jSONStringer.key(EXT).object();
            getExt().write(jSONStringer);
            jSONStringer.endObject();
        }
        if (getData() != null) {
            jSONStringer.key("data").object();
            getData().write(jSONStringer);
            jSONStringer.endObject();
        }
    }
}