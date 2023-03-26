package com.greedygame.core.models.core;

import com.p7700g.p99005.c25;
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
public final class MopubJsonAdapter extends JsonAdapter<Mopub> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @Nullable
    private volatile Constructor<Mopub> c;

    public MopubJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("ver");
        c25.o(of, "of(\"ver\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "ver", "moshi.adapter(String::class.java,\n      emptySet(), \"ver\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Mopub fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.b.fromJson(jsonReader);
                i &= -2;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new Mopub(str);
        }
        Constructor<Mopub> constructor = this.c;
        if (constructor == null) {
            constructor = Mopub.class.getDeclaredConstructor(String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.c = constructor;
            c25.o(constructor, "Mopub::class.java.getDeclaredConstructor(String::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        Mopub newInstance = constructor.newInstance(str, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          ver,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Mopub mopub) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(mopub, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("ver");
        this.b.toJson(jsonWriter, (JsonWriter) mopub.a());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Mopub)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Mopub)";
    }
}