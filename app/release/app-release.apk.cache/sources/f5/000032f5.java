package com.greedygame.core.models.core;

import com.anythink.expressad.foundation.g.a;
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
public final class GeoJsonAdapter extends JsonAdapter<Geo> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Float> b;
    @Nullable
    private volatile Constructor<Geo> c;

    public GeoJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("lat", a.ae, "lla", "llf");
        c25.o(of, "of(\"lat\", \"lng\", \"lla\", \"llf\")");
        this.a = of;
        this.b = wo1.d(moshi, Float.class, "lat", "moshi.adapter(Float::class.javaObjectType,\n      emptySet(), \"lat\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Geo fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
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
                i &= -2;
            } else if (selectName == 1) {
                f2 = this.b.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                f3 = this.b.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                f4 = this.b.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new Geo(f, f2, f3, f4);
        }
        Constructor<Geo> constructor = this.c;
        if (constructor == null) {
            constructor = Geo.class.getDeclaredConstructor(Float.class, Float.class, Float.class, Float.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.c = constructor;
            c25.o(constructor, "Geo::class.java.getDeclaredConstructor(Float::class.javaObjectType,\n          Float::class.javaObjectType, Float::class.javaObjectType, Float::class.javaObjectType,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        Geo newInstance = constructor.newInstance(f, f2, f3, f4, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          lat,\n          lng,\n          lla,\n          llf,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Geo geo) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(geo, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("lat");
        this.b.toJson(jsonWriter, (JsonWriter) geo.a());
        jsonWriter.name(a.ae);
        this.b.toJson(jsonWriter, (JsonWriter) geo.d());
        jsonWriter.name("lla");
        this.b.toJson(jsonWriter, (JsonWriter) geo.b());
        jsonWriter.name("llf");
        this.b.toJson(jsonWriter, (JsonWriter) geo.c());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Geo)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Geo)";
    }
}