package com.microsoft.appcenter.analytics.ingestion.models;

import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.microsoft.appcenter.ingestion.models.json.JSONUtils;
import com.microsoft.appcenter.ingestion.models.properties.TypedProperty;
import com.microsoft.appcenter.ingestion.models.properties.TypedPropertyUtils;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class EventLog extends LogWithNameAndProperties {
    public static final String TYPE = "event";
    private UUID id;
    private List<TypedProperty> typedProperties;

    @Override // com.microsoft.appcenter.analytics.ingestion.models.LogWithNameAndProperties, com.microsoft.appcenter.ingestion.models.LogWithProperties, com.microsoft.appcenter.ingestion.models.AbstractLog
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            EventLog eventLog = (EventLog) obj;
            UUID uuid = this.id;
            if (uuid == null ? eventLog.id == null : uuid.equals(eventLog.id)) {
                List<TypedProperty> list = this.typedProperties;
                List<TypedProperty> list2 = eventLog.typedProperties;
                return list != null ? list.equals(list2) : list2 == null;
            }
            return false;
        }
        return false;
    }

    public UUID getId() {
        return this.id;
    }

    @Override // com.microsoft.appcenter.ingestion.models.Log
    public String getType() {
        return "event";
    }

    public List<TypedProperty> getTypedProperties() {
        return this.typedProperties;
    }

    @Override // com.microsoft.appcenter.analytics.ingestion.models.LogWithNameAndProperties, com.microsoft.appcenter.ingestion.models.LogWithProperties, com.microsoft.appcenter.ingestion.models.AbstractLog
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        UUID uuid = this.id;
        int hashCode2 = (hashCode + (uuid != null ? uuid.hashCode() : 0)) * 31;
        List<TypedProperty> list = this.typedProperties;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.microsoft.appcenter.analytics.ingestion.models.LogWithNameAndProperties, com.microsoft.appcenter.ingestion.models.LogWithProperties, com.microsoft.appcenter.ingestion.models.AbstractLog, com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) throws JSONException {
        super.read(jSONObject);
        setId(UUID.fromString(jSONObject.getString("id")));
        setTypedProperties(TypedPropertyUtils.read(jSONObject));
    }

    public void setId(UUID uuid) {
        this.id = uuid;
    }

    public void setTypedProperties(List<TypedProperty> list) {
        this.typedProperties = list;
    }

    @Override // com.microsoft.appcenter.analytics.ingestion.models.LogWithNameAndProperties, com.microsoft.appcenter.ingestion.models.LogWithProperties, com.microsoft.appcenter.ingestion.models.AbstractLog, com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        super.write(jSONStringer);
        jSONStringer.key("id").value(getId());
        JSONUtils.writeArray(jSONStringer, CommonProperties.TYPED_PROPERTIES, getTypedProperties());
    }
}