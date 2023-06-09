package com.squareup.moshi.adapters;

import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class PolymorphicJsonAdapterFactory<T> implements JsonAdapter.Factory {
    public final Class<T> baseType;
    @Nullable
    public final JsonAdapter<Object> fallbackJsonAdapter;
    public final String labelKey;
    public final List<String> labels;
    public final List<Type> subtypes;

    /* loaded from: classes3.dex */
    public static final class PolymorphicJsonAdapter extends JsonAdapter<Object> {
        @Nullable
        public final JsonAdapter<Object> fallbackJsonAdapter;
        public final List<JsonAdapter<Object>> jsonAdapters;
        public final String labelKey;
        public final JsonReader.Options labelKeyOptions;
        public final JsonReader.Options labelOptions;
        public final List<String> labels;
        public final List<Type> subtypes;

        public PolymorphicJsonAdapter(String str, List<String> list, List<Type> list2, List<JsonAdapter<Object>> list3, @Nullable JsonAdapter<Object> jsonAdapter) {
            this.labelKey = str;
            this.labels = list;
            this.subtypes = list2;
            this.jsonAdapters = list3;
            this.fallbackJsonAdapter = jsonAdapter;
            this.labelKeyOptions = JsonReader.Options.of(str);
            this.labelOptions = JsonReader.Options.of((String[]) list.toArray(new String[0]));
        }

        private int labelIndex(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.selectName(this.labelKeyOptions) == -1) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    int selectString = jsonReader.selectString(this.labelOptions);
                    if (selectString == -1 && this.fallbackJsonAdapter == null) {
                        StringBuilder G = wo1.G("Expected one of ");
                        G.append(this.labels);
                        G.append(" for key '");
                        G.append(this.labelKey);
                        G.append("' but found '");
                        G.append(jsonReader.nextString());
                        G.append("'. Register a subtype for this label.");
                        throw new JsonDataException(G.toString());
                    }
                    return selectString;
                }
            }
            StringBuilder G2 = wo1.G("Missing label for ");
            G2.append(this.labelKey);
            throw new JsonDataException(G2.toString());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) throws IOException {
            JsonReader peekJson = jsonReader.peekJson();
            peekJson.setFailOnUnknown(false);
            try {
                int labelIndex = labelIndex(peekJson);
                peekJson.close();
                if (labelIndex == -1) {
                    return this.fallbackJsonAdapter.fromJson(jsonReader);
                }
                return this.jsonAdapters.get(labelIndex).fromJson(jsonReader);
            } catch (Throwable th) {
                peekJson.close();
                throw th;
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
            JsonAdapter<Object> jsonAdapter;
            int indexOf = this.subtypes.indexOf(obj.getClass());
            if (indexOf == -1) {
                jsonAdapter = this.fallbackJsonAdapter;
                if (jsonAdapter == null) {
                    StringBuilder G = wo1.G("Expected one of ");
                    G.append(this.subtypes);
                    G.append(" but found ");
                    G.append(obj);
                    G.append(", a ");
                    G.append(obj.getClass());
                    G.append(". Register this subtype.");
                    throw new IllegalArgumentException(G.toString());
                }
            } else {
                jsonAdapter = this.jsonAdapters.get(indexOf);
            }
            jsonWriter.beginObject();
            if (jsonAdapter != this.fallbackJsonAdapter) {
                jsonWriter.name(this.labelKey).value(this.labels.get(indexOf));
            }
            int beginFlatten = jsonWriter.beginFlatten();
            jsonAdapter.toJson(jsonWriter, (JsonWriter) obj);
            jsonWriter.endFlatten(beginFlatten);
            jsonWriter.endObject();
        }

        public String toString() {
            return wo1.C(wo1.G("PolymorphicJsonAdapter("), this.labelKey, ")");
        }
    }

    public PolymorphicJsonAdapterFactory(Class<T> cls, String str, List<String> list, List<Type> list2, @Nullable JsonAdapter<Object> jsonAdapter) {
        this.baseType = cls;
        this.labelKey = str;
        this.labels = list;
        this.subtypes = list2;
        this.fallbackJsonAdapter = jsonAdapter;
    }

    private JsonAdapter<Object> buildFallbackJsonAdapter(final T t) {
        return new JsonAdapter<Object>() { // from class: com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory.1
            @Override // com.squareup.moshi.JsonAdapter
            @Nullable
            public Object fromJson(JsonReader jsonReader) throws IOException {
                jsonReader.skipValue();
                return t;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
                StringBuilder G = wo1.G("Expected one of ");
                G.append(PolymorphicJsonAdapterFactory.this.subtypes);
                G.append(" but found ");
                G.append(obj);
                G.append(", a ");
                G.append(obj.getClass());
                G.append(". Register this subtype.");
                throw new IllegalArgumentException(G.toString());
            }
        };
    }

    @CheckReturnValue
    public static <T> PolymorphicJsonAdapterFactory<T> of(Class<T> cls, String str) {
        Objects.requireNonNull(cls, "baseType == null");
        Objects.requireNonNull(str, "labelKey == null");
        return new PolymorphicJsonAdapterFactory<>(cls, str, Collections.emptyList(), Collections.emptyList(), null);
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
        if (Types.getRawType(type) == this.baseType && set.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.subtypes.size());
            int size = this.subtypes.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(moshi.adapter(this.subtypes.get(i)));
            }
            return new PolymorphicJsonAdapter(this.labelKey, this.labels, this.subtypes, arrayList, this.fallbackJsonAdapter).nullSafe();
        }
        return null;
    }

    public PolymorphicJsonAdapterFactory<T> withDefaultValue(@Nullable T t) {
        return withFallbackJsonAdapter(buildFallbackJsonAdapter(t));
    }

    public PolymorphicJsonAdapterFactory<T> withFallbackJsonAdapter(@Nullable JsonAdapter<Object> jsonAdapter) {
        return new PolymorphicJsonAdapterFactory<>(this.baseType, this.labelKey, this.labels, this.subtypes, jsonAdapter);
    }

    public PolymorphicJsonAdapterFactory<T> withSubtype(Class<? extends T> cls, String str) {
        Objects.requireNonNull(cls, "subtype == null");
        Objects.requireNonNull(str, "label == null");
        if (!this.labels.contains(str)) {
            ArrayList arrayList = new ArrayList(this.labels);
            arrayList.add(str);
            ArrayList arrayList2 = new ArrayList(this.subtypes);
            arrayList2.add(cls);
            return new PolymorphicJsonAdapterFactory<>(this.baseType, this.labelKey, arrayList, arrayList2, this.fallbackJsonAdapter);
        }
        throw new IllegalArgumentException("Labels must be unique.");
    }
}