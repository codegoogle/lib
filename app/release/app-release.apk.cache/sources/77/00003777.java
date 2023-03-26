package com.microsoft.appcenter.ingestion.models.properties;

import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TypedPropertyUtils {
    public static TypedProperty create(@x1 String str) throws JSONException {
        if ("boolean".equals(str)) {
            return new BooleanTypedProperty();
        }
        if (DateTimeTypedProperty.TYPE.equals(str)) {
            return new DateTimeTypedProperty();
        }
        if (DoubleTypedProperty.TYPE.equals(str)) {
            return new DoubleTypedProperty();
        }
        if (LongTypedProperty.TYPE.equals(str)) {
            return new LongTypedProperty();
        }
        if ("string".equals(str)) {
            return new StringTypedProperty();
        }
        throw new JSONException(wo1.t("Unsupported type: ", str));
    }

    public static List<TypedProperty> read(JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(CommonProperties.TYPED_PROPERTIES);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                TypedProperty create = create(jSONObject2.getString("type"));
                create.read(jSONObject2);
                arrayList.add(create);
            }
            return arrayList;
        }
        return null;
    }
}