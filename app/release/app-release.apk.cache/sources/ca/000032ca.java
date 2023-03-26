package com.greedygame.core.ad.models;

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
public final class AdUnitMeasurementsJsonAdapter extends JsonAdapter<AdUnitMeasurements> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Integer> b;
    @NotNull
    private final JsonAdapter<Long> c;
    @NotNull
    private final JsonAdapter<Boolean> d;
    @NotNull
    private final JsonAdapter<Double> e;
    @Nullable
    private volatile Constructor<AdUnitMeasurements> f;

    public AdUnitMeasurementsJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("h", "w", "render_t", "inflate_t", "dflt_tmplt", "imp_t", "d");
        c25.o(of, "of(\"h\", \"w\", \"render_t\", \"inflate_t\",\n      \"dflt_tmplt\", \"imp_t\", \"d\")");
        this.a = of;
        this.b = wo1.d(moshi, Integer.class, "adViewHeight", "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"adViewHeight\")");
        this.c = wo1.d(moshi, Long.class, "totalTimeForAdRender", "moshi.adapter(Long::class.javaObjectType,\n      emptySet(), \"totalTimeForAdRender\")");
        this.d = wo1.d(moshi, Boolean.class, "isDefaultTemplate", "moshi.adapter(Boolean::class.javaObjectType, emptySet(), \"isDefaultTemplate\")");
        this.e = wo1.d(moshi, Double.class, "screeDensity", "moshi.adapter(Double::class.javaObjectType, emptySet(), \"screeDensity\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public AdUnitMeasurements fromJson(@NotNull JsonReader jsonReader) {
        AdUnitMeasurements adUnitMeasurements;
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        Long l3 = null;
        boolean z = false;
        Double d = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = this.b.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    num2 = this.b.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    l = this.c.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    l2 = this.c.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    bool = this.d.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    l3 = this.c.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    d = this.e.fromJson(jsonReader);
                    z = true;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -64) {
            adUnitMeasurements = new AdUnitMeasurements(num, num2, l, l2, bool, l3);
        } else {
            Constructor<AdUnitMeasurements> constructor = this.f;
            if (constructor == null) {
                constructor = AdUnitMeasurements.class.getDeclaredConstructor(Integer.class, Integer.class, Long.class, Long.class, Boolean.class, Long.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                this.f = constructor;
                c25.o(constructor, "AdUnitMeasurements::class.java.getDeclaredConstructor(Int::class.javaObjectType,\n          Int::class.javaObjectType, Long::class.javaObjectType, Long::class.javaObjectType,\n          Boolean::class.javaObjectType, Long::class.javaObjectType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
            }
            AdUnitMeasurements newInstance = constructor.newInstance(num, num2, l, l2, bool, l3, Integer.valueOf(i), null);
            c25.o(newInstance, "localConstructor.newInstance(\n          adViewHeight,\n          adViewWidth,\n          totalTimeForAdRender,\n          layoutInflationTime,\n          isDefaultTemplate,\n          timeForImpressionSinceInit,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
            adUnitMeasurements = newInstance;
        }
        if (!z) {
            d = adUnitMeasurements.d();
        }
        adUnitMeasurements.m(d);
        return adUnitMeasurements;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable AdUnitMeasurements adUnitMeasurements) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(adUnitMeasurements, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("h");
        this.b.toJson(jsonWriter, (JsonWriter) adUnitMeasurements.a());
        jsonWriter.name("w");
        this.b.toJson(jsonWriter, (JsonWriter) adUnitMeasurements.b());
        jsonWriter.name("render_t");
        this.c.toJson(jsonWriter, (JsonWriter) adUnitMeasurements.f());
        jsonWriter.name("inflate_t");
        this.c.toJson(jsonWriter, (JsonWriter) adUnitMeasurements.c());
        jsonWriter.name("dflt_tmplt");
        this.d.toJson(jsonWriter, (JsonWriter) adUnitMeasurements.g());
        jsonWriter.name("imp_t");
        this.c.toJson(jsonWriter, (JsonWriter) adUnitMeasurements.e());
        jsonWriter.name("d");
        this.e.toJson(jsonWriter, (JsonWriter) adUnitMeasurements.d());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(AdUnitMeasurements)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AdUnitMeasurements)";
    }
}