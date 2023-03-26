package com.greedygame.core.network.model.responses;

import com.p7700g.p99005.c25;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SignalResponseJsonAdapter extends JsonAdapter<SignalResponse> {
    @NotNull
    private final JsonReader.Options a;

    public SignalResponseJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[0]);
        c25.o(of, "of()");
        this.a = of;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public SignalResponse fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(this.a) == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new SignalResponse();
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable SignalResponse signalResponse) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(signalResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(SignalResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(SignalResponse)";
    }
}