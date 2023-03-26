package com.microsoft.appcenter.ingestion.models.one;

import com.microsoft.appcenter.ingestion.models.json.JSONDateUtils;
import com.microsoft.appcenter.ingestion.models.properties.BooleanTypedProperty;
import com.microsoft.appcenter.ingestion.models.properties.DateTimeTypedProperty;
import com.microsoft.appcenter.ingestion.models.properties.DoubleTypedProperty;
import com.microsoft.appcenter.ingestion.models.properties.LongTypedProperty;
import com.microsoft.appcenter.ingestion.models.properties.StringTypedProperty;
import com.microsoft.appcenter.ingestion.models.properties.TypedProperty;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CommonSchemaDataUtils {
    @r2
    public static final int DATA_TYPE_DATETIME = 9;
    @r2
    public static final int DATA_TYPE_DOUBLE = 6;
    @r2
    public static final int DATA_TYPE_INT64 = 4;
    @r2
    public static final String METADATA_FIELDS = "f";

    public static void addCommonSchemaData(List<TypedProperty> list, CommonSchemaLog commonSchemaLog) {
        Iterator<TypedProperty> it;
        if (list == null) {
            return;
        }
        try {
            Data data = new Data();
            commonSchemaLog.setData(data);
            MetadataExtension metadataExtension = new MetadataExtension();
            Iterator<TypedProperty> it2 = list.iterator();
            while (it2.hasNext()) {
                TypedProperty next = it2.next();
                try {
                    Object validateProperty = validateProperty(next);
                    Integer metadataType = getMetadataType(next);
                    String[] split = next.getName().split("\\.", -1);
                    int length = split.length - 1;
                    JSONObject properties = data.getProperties();
                    JSONObject metadata = metadataExtension.getMetadata();
                    int i = 0;
                    while (i < length) {
                        Iterator<TypedProperty> it3 = it2;
                        String str = split[i];
                        JSONObject optJSONObject = properties.optJSONObject(str);
                        if (optJSONObject == null) {
                            if (properties.has(str)) {
                                AppCenterLog.warn("AppCenter", "Property key '" + str + "' already has a value, the old value will be overridden.");
                            }
                            JSONObject jSONObject = new JSONObject();
                            properties.put(str, jSONObject);
                            properties = jSONObject;
                        } else {
                            properties = optJSONObject;
                        }
                        metadata = addIntermediateMetadata(metadata, str);
                        i++;
                        it2 = it3;
                    }
                    it = it2;
                    String str2 = split[length];
                    if (properties.has(str2)) {
                        AppCenterLog.warn("AppCenter", "Property key '" + str2 + "' already has a value, the old value will be overridden.");
                    }
                    properties.put(str2, validateProperty);
                    addLeafMetadata(metadataType, metadata, str2);
                } catch (IllegalArgumentException e) {
                    it = it2;
                    AppCenterLog.warn("AppCenter", e.getMessage());
                }
                it2 = it;
            }
            JSONObject properties2 = data.getProperties();
            String optString = properties2.optString(Data.BASE_TYPE, null);
            JSONObject optJSONObject2 = properties2.optJSONObject(Data.BASE_DATA);
            if (optString == null && optJSONObject2 != null) {
                AppCenterLog.warn("AppCenter", "baseData was set but baseType is missing.");
                properties2.remove(Data.BASE_DATA);
                metadataExtension.getMetadata().optJSONObject("f").remove(Data.BASE_DATA);
            }
            if (optString != null && optJSONObject2 == null) {
                AppCenterLog.warn("AppCenter", "baseType was set but baseData is missing.");
                properties2.remove(Data.BASE_TYPE);
            }
            if (cleanUpEmptyObjectsInMetadata(metadataExtension.getMetadata())) {
                return;
            }
            if (commonSchemaLog.getExt() == null) {
                commonSchemaLog.setExt(new Extensions());
            }
            commonSchemaLog.getExt().setMetadata(metadataExtension);
        } catch (JSONException unused) {
        }
    }

    private static JSONObject addIntermediateMetadata(JSONObject jSONObject, String str) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("f");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            jSONObject.put("f", optJSONObject);
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        if (optJSONObject2 == null) {
            JSONObject jSONObject2 = new JSONObject();
            optJSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
        return optJSONObject2;
    }

    private static void addLeafMetadata(Integer num, JSONObject jSONObject, String str) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("f");
        if (num == null) {
            if (optJSONObject != null) {
                optJSONObject.remove(str);
                return;
            }
            return;
        }
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            jSONObject.put("f", optJSONObject);
        }
        optJSONObject.put(str, num);
    }

    private static boolean cleanUpEmptyObjectsInMetadata(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
            if (optJSONObject != null && cleanUpEmptyObjectsInMetadata(optJSONObject)) {
                keys.remove();
            }
        }
        return jSONObject.length() == 0;
    }

    private static Integer getMetadataType(TypedProperty typedProperty) {
        if (typedProperty instanceof LongTypedProperty) {
            return 4;
        }
        if (typedProperty instanceof DoubleTypedProperty) {
            return 6;
        }
        return typedProperty instanceof DateTimeTypedProperty ? 9 : null;
    }

    private static Object validateProperty(TypedProperty typedProperty) throws IllegalArgumentException, JSONException {
        Object valueOf;
        String name = typedProperty.getName();
        if (name != null) {
            if (name.equals(Data.BASE_TYPE) && !(typedProperty instanceof StringTypedProperty)) {
                throw new IllegalArgumentException("baseType must be a string.");
            }
            if (!name.startsWith("baseType.")) {
                if (!name.equals(Data.BASE_DATA)) {
                    if (typedProperty instanceof StringTypedProperty) {
                        valueOf = ((StringTypedProperty) typedProperty).getValue();
                    } else if (typedProperty instanceof LongTypedProperty) {
                        valueOf = Long.valueOf(((LongTypedProperty) typedProperty).getValue());
                    } else if (typedProperty instanceof DoubleTypedProperty) {
                        valueOf = Double.valueOf(((DoubleTypedProperty) typedProperty).getValue());
                    } else if (typedProperty instanceof DateTimeTypedProperty) {
                        valueOf = JSONDateUtils.toString(((DateTimeTypedProperty) typedProperty).getValue());
                    } else if (typedProperty instanceof BooleanTypedProperty) {
                        valueOf = Boolean.valueOf(((BooleanTypedProperty) typedProperty).getValue());
                    } else {
                        StringBuilder G = wo1.G("Unsupported property type: ");
                        G.append(typedProperty.getType());
                        throw new IllegalArgumentException(G.toString());
                    }
                    if (valueOf != null) {
                        return valueOf;
                    }
                    throw new IllegalArgumentException(wo1.u("Value of property with key '", name, "' cannot be null."));
                }
                throw new IllegalArgumentException("baseData must be an object.");
            }
            throw new IllegalArgumentException("baseType must be a string.");
        }
        throw new IllegalArgumentException("Property key cannot be null.");
    }
}