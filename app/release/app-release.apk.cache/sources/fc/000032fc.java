package com.greedygame.core.models.core;

import com.anythink.expressad.foundation.d.l;
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
public final class OsJsonAdapter extends JsonAdapter<Os> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<Integer> c;
    @Nullable
    private volatile Constructor<Os> d;

    public OsJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("pltfrm", "ver", l.d, "apilvl");
        c25.o(of, "of(\"pltfrm\", \"ver\", \"num\", \"apilvl\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "platform", "moshi.adapter(String::class.java,\n      emptySet(), \"platform\")");
        this.c = wo1.d(moshi, Integer.class, "apiLevel", "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"apiLevel\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Os fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.b.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                str2 = this.b.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                str3 = this.b.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                num = this.c.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new Os(str, str2, str3, num);
        }
        Constructor<Os> constructor = this.d;
        if (constructor == null) {
            constructor = Os.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.d = constructor;
            c25.o(constructor, "Os::class.java.getDeclaredConstructor(String::class.java, String::class.java,\n          String::class.java, Int::class.javaObjectType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        Os newInstance = constructor.newInstance(str, str2, str3, num, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          platform,\n          version,\n          num,\n          apiLevel,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Os os) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(os, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("pltfrm");
        this.b.toJson(jsonWriter, (JsonWriter) os.c());
        jsonWriter.name("ver");
        this.b.toJson(jsonWriter, (JsonWriter) os.d());
        jsonWriter.name(l.d);
        this.b.toJson(jsonWriter, (JsonWriter) os.b());
        jsonWriter.name("apilvl");
        this.c.toJson(jsonWriter, (JsonWriter) os.a());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Os)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Os)";
    }
}