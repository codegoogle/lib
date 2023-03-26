package com.greedygame.core.network.model.responses;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class UiiConfigurationJsonAdapter extends JsonAdapter<UiiConfiguration> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;

    public UiiConfigurationJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("type");
        c25.o(of, "of(\"type\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "type", "moshi.adapter(String::class.java,\n      emptySet(), \"type\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public UiiConfiguration fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.b.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new UiiConfiguration(str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable UiiConfiguration uiiConfiguration) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(uiiConfiguration, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.b.toJson(jsonWriter, (JsonWriter) uiiConfiguration.e());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(UiiConfiguration)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(UiiConfiguration)";
    }
}