package com.squareup.moshi.internal;

import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class NonNullJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NonNullJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    public JsonAdapter<T> delegate() {
        return this.delegate;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @Nullable
    public T fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonReader.Token.NULL) {
            return this.delegate.fromJson(jsonReader);
        }
        StringBuilder G = wo1.G("Unexpected null at ");
        G.append(jsonReader.getPath());
        throw new JsonDataException(G.toString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, @Nullable T t) throws IOException {
        if (t != null) {
            this.delegate.toJson(jsonWriter, (JsonWriter) t);
            return;
        }
        StringBuilder G = wo1.G("Unexpected null at ");
        G.append(jsonWriter.getPath());
        throw new JsonDataException(G.toString());
    }

    public String toString() {
        return this.delegate + ".nonNull()";
    }
}