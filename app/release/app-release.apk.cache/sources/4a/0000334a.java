package com.greedygame.mystique.models;

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
public final class PositionJsonAdapter extends JsonAdapter<Position> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Float> b;

    public PositionJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("x", "y", "width", "height");
        c25.o(of, "of(\"x\", \"y\", \"width\", \"height\")");
        this.a = of;
        this.b = wo1.d(moshi, Float.TYPE, "mx", "moshi.adapter(Float::class.java, emptySet(), \"mx\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Position fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                f = this.b.fromJson(jsonReader);
                if (f == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("mx", "x", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"mx\", \"x\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 1) {
                f2 = this.b.fromJson(jsonReader);
                if (f2 == null) {
                    JsonDataException unexpectedNull2 = Util.unexpectedNull("my", "y", jsonReader);
                    c25.o(unexpectedNull2, "unexpectedNull(\"my\", \"y\", reader)");
                    throw unexpectedNull2;
                }
            } else if (selectName == 2) {
                f3 = this.b.fromJson(jsonReader);
                if (f3 == null) {
                    JsonDataException unexpectedNull3 = Util.unexpectedNull("mwidth", "width", jsonReader);
                    c25.o(unexpectedNull3, "unexpectedNull(\"mwidth\", \"width\",\n            reader)");
                    throw unexpectedNull3;
                }
            } else if (selectName == 3 && (f4 = this.b.fromJson(jsonReader)) == null) {
                JsonDataException unexpectedNull4 = Util.unexpectedNull("mheight", "height", jsonReader);
                c25.o(unexpectedNull4, "unexpectedNull(\"mheight\",\n            \"height\", reader)");
                throw unexpectedNull4;
            }
        }
        jsonReader.endObject();
        if (f != null) {
            float floatValue = f.floatValue();
            if (f2 != null) {
                float floatValue2 = f2.floatValue();
                if (f3 != null) {
                    float floatValue3 = f3.floatValue();
                    if (f4 != null) {
                        return new Position(floatValue, floatValue2, floatValue3, f4.floatValue());
                    }
                    JsonDataException missingProperty = Util.missingProperty("mheight", "height", jsonReader);
                    c25.o(missingProperty, "missingProperty(\"mheight\", \"height\", reader)");
                    throw missingProperty;
                }
                JsonDataException missingProperty2 = Util.missingProperty("mwidth", "width", jsonReader);
                c25.o(missingProperty2, "missingProperty(\"mwidth\", \"width\", reader)");
                throw missingProperty2;
            }
            JsonDataException missingProperty3 = Util.missingProperty("my", "y", jsonReader);
            c25.o(missingProperty3, "missingProperty(\"my\", \"y\", reader)");
            throw missingProperty3;
        }
        JsonDataException missingProperty4 = Util.missingProperty("mx", "x", jsonReader);
        c25.o(missingProperty4, "missingProperty(\"mx\", \"x\", reader)");
        throw missingProperty4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Position position) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(position, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("x");
        this.b.toJson(jsonWriter, (JsonWriter) Float.valueOf(position.d()));
        jsonWriter.name("y");
        this.b.toJson(jsonWriter, (JsonWriter) Float.valueOf(position.e()));
        jsonWriter.name("width");
        this.b.toJson(jsonWriter, (JsonWriter) Float.valueOf(position.c()));
        jsonWriter.name("height");
        this.b.toJson(jsonWriter, (JsonWriter) Float.valueOf(position.b()));
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Position)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Position)";
    }
}