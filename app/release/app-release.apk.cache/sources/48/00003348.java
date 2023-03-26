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
public final class PlacementJsonAdapter extends JsonAdapter<Placement> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Position> b;
    @NotNull
    private final JsonAdapter<Padding> c;
    @NotNull
    private final JsonAdapter<Alignment> d;
    @Nullable
    private volatile Constructor<Placement> e;

    public PlacementJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("position", "padding", "alignment");
        c25.o(of, "of(\"position\", \"padding\",\n      \"alignment\")");
        this.a = of;
        this.b = wo1.d(moshi, Position.class, "position", "moshi.adapter(Position::class.java,\n      emptySet(), \"position\")");
        this.c = wo1.d(moshi, Padding.class, "padding", "moshi.adapter(Padding::class.java, emptySet(),\n      \"padding\")");
        this.d = wo1.d(moshi, Alignment.class, "alignment", "moshi.adapter(Alignment::class.java, emptySet(), \"alignment\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Placement fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        Position position = null;
        Padding padding = null;
        Alignment alignment = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                position = this.b.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                padding = this.c.fromJson(jsonReader);
                if (padding == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("padding", "padding", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"padding\",\n              \"padding\", reader)");
                    throw unexpectedNull;
                }
                i &= -3;
            } else if (selectName == 2) {
                alignment = this.d.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            Objects.requireNonNull(padding, "null cannot be cast to non-null type com.greedygame.mystique.models.Padding");
            return new Placement(position, padding, alignment);
        }
        Constructor<Placement> constructor = this.e;
        if (constructor == null) {
            constructor = Placement.class.getDeclaredConstructor(Position.class, Padding.class, Alignment.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.e = constructor;
            c25.o(constructor, "Placement::class.java.getDeclaredConstructor(Position::class.java, Padding::class.java,\n          Alignment::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        Placement newInstance = constructor.newInstance(position, padding, alignment, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          position,\n          padding,\n          alignment,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Placement placement) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(placement, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("position");
        this.b.toJson(jsonWriter, (JsonWriter) placement.c());
        jsonWriter.name("padding");
        this.c.toJson(jsonWriter, (JsonWriter) placement.b());
        jsonWriter.name("alignment");
        this.d.toJson(jsonWriter, (JsonWriter) placement.a());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Placement)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Placement)";
    }
}