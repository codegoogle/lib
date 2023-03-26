package com.squareup.moshi.adapters;

import com.p7700g.p99005.wo1;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
    public final T[] constants;
    public final Class<T> enumType;
    @Nullable
    public final T fallbackValue;
    public final String[] nameStrings;
    public final JsonReader.Options options;
    public final boolean useFallbackValue;

    public EnumJsonAdapter(Class<T> cls, @Nullable T t, boolean z) {
        this.enumType = cls;
        this.fallbackValue = t;
        this.useFallbackValue = z;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.constants = enumConstants;
            this.nameStrings = new String[enumConstants.length];
            int i = 0;
            while (true) {
                T[] tArr = this.constants;
                if (i < tArr.length) {
                    String name = tArr[i].name();
                    Json json = (Json) cls.getField(name).getAnnotation(Json.class);
                    if (json != null) {
                        name = json.name();
                    }
                    this.nameStrings[i] = name;
                    i++;
                } else {
                    this.options = JsonReader.Options.of(this.nameStrings);
                    return;
                }
            }
        } catch (NoSuchFieldException e) {
            StringBuilder G = wo1.G("Missing field in ");
            G.append(cls.getName());
            throw new AssertionError(G.toString(), e);
        }
    }

    public static <T extends Enum<T>> EnumJsonAdapter<T> create(Class<T> cls) {
        return new EnumJsonAdapter<>(cls, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
        toJson(jsonWriter, (JsonWriter) ((Enum) obj));
    }

    public String toString() {
        StringBuilder G = wo1.G("EnumJsonAdapter(");
        G.append(this.enumType.getName());
        G.append(")");
        return G.toString();
    }

    public EnumJsonAdapter<T> withUnknownFallback(@Nullable T t) {
        return new EnumJsonAdapter<>(this.enumType, t, true);
    }

    @Override // com.squareup.moshi.JsonAdapter
    @Nullable
    public T fromJson(JsonReader jsonReader) throws IOException {
        int selectString = jsonReader.selectString(this.options);
        if (selectString != -1) {
            return this.constants[selectString];
        }
        String path = jsonReader.getPath();
        if (this.useFallbackValue) {
            if (jsonReader.peek() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                return this.fallbackValue;
            }
            StringBuilder G = wo1.G("Expected a string but was ");
            G.append(jsonReader.peek());
            G.append(" at path ");
            G.append(path);
            throw new JsonDataException(G.toString());
        }
        String nextString = jsonReader.nextString();
        StringBuilder G2 = wo1.G("Expected one of ");
        G2.append(Arrays.asList(this.nameStrings));
        G2.append(" but was ");
        G2.append(nextString);
        G2.append(" at path ");
        G2.append(path);
        throw new JsonDataException(G2.toString());
    }

    public void toJson(JsonWriter jsonWriter, T t) throws IOException {
        Objects.requireNonNull(t, "value was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.value(this.nameStrings[t.ordinal()]);
    }
}