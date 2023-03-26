package com.greedygame.core.models.core;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AdmobJsonAdapter extends JsonAdapter<Admob> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;

    public AdmobJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("ver");
        c25.o(of, "of(\"ver\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "ver", "moshi.adapter(String::class.java, emptySet(),\n      \"ver\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Admob fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (str = this.b.fromJson(jsonReader)) == null) {
                JsonDataException unexpectedNull = Util.unexpectedNull("ver", "ver", jsonReader);
                c25.o(unexpectedNull, "unexpectedNull(\"ver\", \"ver\", reader)");
                throw unexpectedNull;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new Admob(str);
        }
        JsonDataException missingProperty = Util.missingProperty("ver", "ver", jsonReader);
        c25.o(missingProperty, "missingProperty(\"ver\", \"ver\", reader)");
        throw missingProperty;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Admob admob) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(admob, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("ver");
        this.b.toJson(jsonWriter, (JsonWriter) admob.a());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Admob)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Admob)";
    }
}