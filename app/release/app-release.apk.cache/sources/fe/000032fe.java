package com.greedygame.core.models.core;

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
public final class PlayJsonAdapter extends JsonAdapter<Play> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @Nullable
    private volatile Constructor<Play> c;

    public PlayJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("ver");
        c25.o(of, "of(\"ver\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "ver", "moshi.adapter(String::class.java, emptySet(),\n      \"ver\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Play fromJson(@NotNull JsonReader jsonReader) {
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
                if (str == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("ver", "ver", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"ver\", \"ver\", reader)");
                    throw unexpectedNull;
                }
                i &= -2;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new Play(str);
        }
        Constructor<Play> constructor = this.c;
        if (constructor == null) {
            constructor = Play.class.getDeclaredConstructor(String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.c = constructor;
            c25.o(constructor, "Play::class.java.getDeclaredConstructor(String::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        Play newInstance = constructor.newInstance(str, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          ver,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Play play) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(play, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("ver");
        this.b.toJson(jsonWriter, (JsonWriter) play.a());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Play)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Play)";
    }
}