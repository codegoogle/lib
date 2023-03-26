package com.greedygame.core.network.model.responses;

import com.anythink.expressad.foundation.d.c;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.yt4;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class TrackingJsonAdapter extends JsonAdapter<Tracking> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<List<String>> b;
    @NotNull
    private final JsonAdapter<List<String>> c;

    public TrackingJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(c.bY, c.bQ, "error");
        c25.o(of, "of(\"click\", \"impression\", \"error\")");
        this.a = of;
        JsonAdapter<List<String>> adapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), yt4.k(), c.bY);
        c25.o(adapter, "moshi.adapter(Types.newParameterizedType(List::class.java, String::class.java), emptySet(),\n      \"click\")");
        this.b = adapter;
        JsonAdapter<List<String>> adapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yt4.k(), "error");
        c25.o(adapter2, "moshi.adapter(Types.newParameterizedType(List::class.java, String::class.java), emptySet(),\n      \"error\")");
        this.c = adapter2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Tracking fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        List<String> list = null;
        List<String> list2 = null;
        List<String> list3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.b.fromJson(jsonReader);
            } else if (selectName == 1) {
                list2 = this.b.fromJson(jsonReader);
            } else if (selectName == 2) {
                list3 = this.c.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new Tracking(list, list2, list3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Tracking tracking) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(tracking, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name(c.bY);
        this.b.toJson(jsonWriter, (JsonWriter) tracking.c());
        jsonWriter.name(c.bQ);
        this.b.toJson(jsonWriter, (JsonWriter) tracking.e());
        jsonWriter.name("error");
        this.c.toJson(jsonWriter, (JsonWriter) tracking.d());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Tracking)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Tracking)";
    }
}