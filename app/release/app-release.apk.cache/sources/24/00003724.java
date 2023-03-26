package com.microsoft.appcenter.crashes.ingestion.models;

import com.microsoft.appcenter.crashes.ingestion.models.json.StackFrameFactory;
import com.microsoft.appcenter.ingestion.models.Model;
import com.microsoft.appcenter.ingestion.models.json.JSONUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class Thread implements Model {
    private List<StackFrame> frames;
    private long id;
    private String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Thread thread = (Thread) obj;
        if (this.id != thread.id) {
            return false;
        }
        String str = this.name;
        if (str == null ? thread.name == null : str.equals(thread.name)) {
            List<StackFrame> list = this.frames;
            List<StackFrame> list2 = thread.frames;
            return list != null ? list.equals(list2) : list2 == null;
        }
        return false;
    }

    public List<StackFrame> getFrames() {
        return this.frames;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<StackFrame> list = this.frames;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) throws JSONException {
        setId(jSONObject.getLong("id"));
        setName(jSONObject.optString("name", null));
        setFrames(JSONUtils.readArray(jSONObject, "frames", StackFrameFactory.getInstance()));
    }

    public void setFrames(List<StackFrame> list) {
        this.frames = list;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        JSONUtils.write(jSONStringer, "id", Long.valueOf(getId()));
        JSONUtils.write(jSONStringer, "name", getName());
        JSONUtils.writeArray(jSONStringer, "frames", getFrames());
    }
}