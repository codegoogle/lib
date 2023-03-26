package com.greedygame.mystique.models;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class PaddingJsonAdapter extends JsonAdapter<Padding> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Float> b;
    @Nullable
    private volatile Constructor<Padding> c;

    public PaddingJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("left", "right", "top", "bottom");
        c25.o(of, "of(\"left\", \"right\", \"top\", \"bottom\")");
        this.a = of;
        this.b = wo1.d(moshi, Float.TYPE, "left", "moshi.adapter(Float::class.java, emptySet(),\n      \"left\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Padding fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Float valueOf = Float.valueOf(0.0f);
        jsonReader.beginObject();
        Float f = valueOf;
        Float f2 = f;
        Float f3 = f2;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                valueOf = this.b.fromJson(jsonReader);
                if (valueOf == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("left", "left", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"left\", \"left\", reader)");
                    throw unexpectedNull;
                }
                i &= -2;
            } else if (selectName == 1) {
                f = this.b.fromJson(jsonReader);
                if (f == null) {
                    JsonDataException unexpectedNull2 = Util.unexpectedNull("right", "right", jsonReader);
                    c25.o(unexpectedNull2, "unexpectedNull(\"right\", \"right\",\n              reader)");
                    throw unexpectedNull2;
                }
                i &= -3;
            } else if (selectName == 2) {
                f2 = this.b.fromJson(jsonReader);
                if (f2 == null) {
                    JsonDataException unexpectedNull3 = Util.unexpectedNull("top", "top", jsonReader);
                    c25.o(unexpectedNull3, "unexpectedNull(\"top\", \"top\", reader)");
                    throw unexpectedNull3;
                }
                i &= -5;
            } else if (selectName == 3) {
                f3 = this.b.fromJson(jsonReader);
                if (f3 == null) {
                    JsonDataException unexpectedNull4 = Util.unexpectedNull("bottom", "bottom", jsonReader);
                    c25.o(unexpectedNull4, "unexpectedNull(\"bottom\", \"bottom\",\n              reader)");
                    throw unexpectedNull4;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new Padding(valueOf.floatValue(), f.floatValue(), f2.floatValue(), f3.floatValue());
        }
        Constructor<Padding> constructor = this.c;
        if (constructor == null) {
            Class cls = Float.TYPE;
            constructor = Padding.class.getDeclaredConstructor(cls, cls, cls, cls, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.c = constructor;
            c25.o(constructor, "Padding::class.java.getDeclaredConstructor(Float::class.javaPrimitiveType,\n          Float::class.javaPrimitiveType, Float::class.javaPrimitiveType,\n          Float::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        Padding newInstance = constructor.newInstance(valueOf, f, f2, f3, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          left,\n          right,\n          top,\n          bottom,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Padding padding) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(padding, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("left");
        this.b.toJson(jsonWriter, (JsonWriter) Float.valueOf(padding.b()));
        jsonWriter.name("right");
        this.b.toJson(jsonWriter, (JsonWriter) Float.valueOf(padding.c()));
        jsonWriter.name("top");
        this.b.toJson(jsonWriter, (JsonWriter) Float.valueOf(padding.d()));
        jsonWriter.name("bottom");
        this.b.toJson(jsonWriter, (JsonWriter) Float.valueOf(padding.a()));
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Padding)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Padding)";
    }
}