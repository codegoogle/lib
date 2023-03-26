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
public final class CarrierJsonAdapter extends JsonAdapter<Carrier> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @Nullable
    private volatile Constructor<Carrier> c;

    public CarrierJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("name", "cr");
        c25.o(of, "of(\"name\", \"cr\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "name", "moshi.adapter(String::class.java,\n      emptySet(), \"name\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Carrier fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        int i = -1;
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
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new Carrier(str, str2);
        }
        Constructor<Carrier> constructor = this.c;
        if (constructor == null) {
            constructor = Carrier.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.c = constructor;
            c25.o(constructor, "Carrier::class.java.getDeclaredConstructor(String::class.java, String::class.java,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        Carrier newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          name,\n          cr,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Carrier carrier) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(carrier, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.b.toJson(jsonWriter, (JsonWriter) carrier.b());
        jsonWriter.name("cr");
        this.b.toJson(jsonWriter, (JsonWriter) carrier.a());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Carrier)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Carrier)";
    }
}