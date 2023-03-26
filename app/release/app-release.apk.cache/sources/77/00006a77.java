package com.squareup.moshi;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, V>> {
    public static final JsonAdapter.Factory FACTORY = new JsonAdapter.Factory() { // from class: com.squareup.moshi.MapJsonAdapter.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        @Nullable
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
            Class<?> rawType;
            if (set.isEmpty() && (rawType = Types.getRawType(type)) == Map.class) {
                Type[] mapKeyAndValueTypes = Types.mapKeyAndValueTypes(type, rawType);
                return new MapJsonAdapter(moshi, mapKeyAndValueTypes[0], mapKeyAndValueTypes[1]).nullSafe();
            }
            return null;
        }
    };
    private final JsonAdapter<K> keyAdapter;
    private final JsonAdapter<V> valueAdapter;

    public MapJsonAdapter(Moshi moshi, Type type, Type type2) {
        this.keyAdapter = moshi.adapter(type);
        this.valueAdapter = moshi.adapter(type2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
        toJson(jsonWriter, (Map) ((Map) obj));
    }

    public String toString() {
        StringBuilder G = wo1.G("JsonAdapter(");
        G.append(this.keyAdapter);
        G.append(AppCenter.KEY_VALUE_DELIMITER);
        G.append(this.valueAdapter);
        G.append(")");
        return G.toString();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Map<K, V> fromJson(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            jsonReader.promoteNameToValue();
            K fromJson = this.keyAdapter.fromJson(jsonReader);
            V fromJson2 = this.valueAdapter.fromJson(jsonReader);
            Object put = linkedHashTreeMap.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + jsonReader.getPath() + ": " + put + " and " + fromJson2);
            }
        }
        jsonReader.endObject();
        return linkedHashTreeMap;
    }

    public void toJson(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                jsonWriter.promoteValueToName();
                this.keyAdapter.toJson(jsonWriter, (JsonWriter) entry.getKey());
                this.valueAdapter.toJson(jsonWriter, (JsonWriter) entry.getValue());
            } else {
                StringBuilder G = wo1.G("Map key is null at ");
                G.append(jsonWriter.getPath());
                throw new JsonDataException(G.toString());
            }
        }
        jsonWriter.endObject();
    }
}