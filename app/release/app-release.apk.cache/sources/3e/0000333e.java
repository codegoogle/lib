package com.greedygame.mystique.models;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.jz2;
import com.p7700g.p99005.kz2;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AlignmentJsonAdapter extends JsonAdapter<Alignment> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<jz2> b;
    @NotNull
    private final JsonAdapter<kz2> c;
    @Nullable
    private volatile Constructor<Alignment> d;

    public AlignmentJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("x", "y");
        c25.o(of, "of(\"x\", \"y\")");
        this.a = of;
        this.b = wo1.d(moshi, jz2.class, "x", "moshi.adapter(XAlignment::class.java, emptySet(), \"x\")");
        this.c = wo1.d(moshi, kz2.class, "y", "moshi.adapter(YAlignment::class.java, emptySet(), \"y\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Alignment fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        jz2 jz2Var = null;
        kz2 kz2Var = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                jz2Var = this.b.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                kz2Var = this.c.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new Alignment(jz2Var, kz2Var);
        }
        Constructor<Alignment> constructor = this.d;
        if (constructor == null) {
            constructor = Alignment.class.getDeclaredConstructor(jz2.class, kz2.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.d = constructor;
            c25.o(constructor, "Alignment::class.java.getDeclaredConstructor(XAlignment::class.java,\n          YAlignment::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        Alignment newInstance = constructor.newInstance(jz2Var, kz2Var, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          x,\n          y,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Alignment alignment) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(alignment, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("x");
        this.b.toJson(jsonWriter, (JsonWriter) alignment.a());
        jsonWriter.name("y");
        this.c.toJson(jsonWriter, (JsonWriter) alignment.b());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Alignment)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Alignment)";
    }
}