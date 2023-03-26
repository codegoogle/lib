package com.greedygame.mystique.models;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.la1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.yt4;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class LayerJsonAdapter extends JsonAdapter<Layer> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<String> c;
    @NotNull
    private final JsonAdapter<Placement> d;
    @NotNull
    private final JsonAdapter<List<Operation>> e;
    @NotNull
    private final JsonAdapter<Boolean> f;
    @NotNull
    private final JsonAdapter<Float> g;
    @NotNull
    private final JsonAdapter<Integer> h;
    @NotNull
    private final JsonAdapter<Integer> i;
    @Nullable
    private volatile Constructor<Layer> j;

    public LayerJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("type", la1.k, "placement", Layer.b, Layer.c, Layer.d, Layer.e, "id");
        c25.o(of, "of(\"type\", \"path\", \"placement\",\n      \"operations\", \"ellipsize\", \"min_font_size\", \"fallback_id\", \"id\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "type", "moshi.adapter(String::class.java,\n      emptySet(), \"type\")");
        this.c = wo1.d(moshi, String.class, la1.k, "moshi.adapter(String::class.java, emptySet(),\n      \"path\")");
        this.d = wo1.d(moshi, Placement.class, "placement", "moshi.adapter(Placement::class.java,\n      emptySet(), \"placement\")");
        JsonAdapter<List<Operation>> adapter = moshi.adapter(Types.newParameterizedType(List.class, Operation.class), yt4.k(), Layer.b);
        c25.o(adapter, "moshi.adapter(Types.newParameterizedType(List::class.java, Operation::class.java), emptySet(),\n      \"operations\")");
        this.e = adapter;
        this.f = wo1.d(moshi, Boolean.TYPE, "isEllipsize", "moshi.adapter(Boolean::class.java, emptySet(),\n      \"isEllipsize\")");
        this.g = wo1.d(moshi, Float.TYPE, "minFontSize", "moshi.adapter(Float::class.java, emptySet(),\n      \"minFontSize\")");
        this.h = wo1.d(moshi, Integer.TYPE, "fallbackId", "moshi.adapter(Int::class.java, emptySet(),\n      \"fallbackId\")");
        this.i = wo1.d(moshi, Integer.class, "id", "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"id\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Layer fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        Float valueOf = Float.valueOf(0.0f);
        Integer num = 0;
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        Placement placement = null;
        List<Operation> list = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.b.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    str2 = this.c.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException unexpectedNull = Util.unexpectedNull(la1.k, la1.k, jsonReader);
                        c25.o(unexpectedNull, "unexpectedNull(\"path\", \"path\", reader)");
                        throw unexpectedNull;
                    }
                    i &= -3;
                    break;
                case 2:
                    placement = this.d.fromJson(jsonReader);
                    if (placement == null) {
                        JsonDataException unexpectedNull2 = Util.unexpectedNull("placement", "placement", jsonReader);
                        c25.o(unexpectedNull2, "unexpectedNull(\"placement\",\n              \"placement\", reader)");
                        throw unexpectedNull2;
                    }
                    i &= -5;
                    break;
                case 3:
                    list = this.e.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    bool = this.f.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException unexpectedNull3 = Util.unexpectedNull("isEllipsize", Layer.c, jsonReader);
                        c25.o(unexpectedNull3, "unexpectedNull(\"isEllipsize\",\n              \"ellipsize\", reader)");
                        throw unexpectedNull3;
                    }
                    i &= -17;
                    break;
                case 5:
                    valueOf = this.g.fromJson(jsonReader);
                    if (valueOf == null) {
                        JsonDataException unexpectedNull4 = Util.unexpectedNull("minFontSize", Layer.d, jsonReader);
                        c25.o(unexpectedNull4, "unexpectedNull(\"minFontSize\",\n              \"min_font_size\", reader)");
                        throw unexpectedNull4;
                    }
                    i &= -33;
                    break;
                case 6:
                    num = this.h.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException unexpectedNull5 = Util.unexpectedNull("fallbackId", Layer.e, jsonReader);
                        c25.o(unexpectedNull5, "unexpectedNull(\"fallbackId\",\n              \"fallback_id\", reader)");
                        throw unexpectedNull5;
                    }
                    i &= -65;
                    break;
                case 7:
                    num2 = this.i.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -128) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(placement, "null cannot be cast to non-null type com.greedygame.mystique.models.Placement");
            return new Layer(str, str2, placement, list, bool.booleanValue(), valueOf.floatValue(), num.intValue(), num2);
        }
        Constructor<Layer> constructor = this.j;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Layer.class.getDeclaredConstructor(String.class, String.class, Placement.class, List.class, Boolean.TYPE, Float.TYPE, cls, Integer.class, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.j = constructor;
            c25.o(constructor, "Layer::class.java.getDeclaredConstructor(String::class.java, String::class.java,\n          Placement::class.java, List::class.java, Boolean::class.javaPrimitiveType,\n          Float::class.javaPrimitiveType, Int::class.javaPrimitiveType, Int::class.javaObjectType,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        Layer newInstance = constructor.newInstance(str, str2, placement, list, bool, valueOf, num, num2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          type,\n          path,\n          placement,\n          operations,\n          isEllipsize,\n          minFontSize,\n          fallbackId,\n          id,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Layer layer) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(layer, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.b.toJson(jsonWriter, (JsonWriter) layer.p());
        jsonWriter.name(la1.k);
        this.c.toJson(jsonWriter, (JsonWriter) layer.n());
        jsonWriter.name("placement");
        this.d.toJson(jsonWriter, (JsonWriter) layer.o());
        jsonWriter.name(Layer.b);
        this.e.toJson(jsonWriter, (JsonWriter) layer.m());
        jsonWriter.name(Layer.c);
        this.f.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(layer.r()));
        jsonWriter.name(Layer.d);
        this.g.toJson(jsonWriter, (JsonWriter) Float.valueOf(layer.l()));
        jsonWriter.name(Layer.e);
        this.h.toJson(jsonWriter, (JsonWriter) Integer.valueOf(layer.j()));
        jsonWriter.name("id");
        this.i.toJson(jsonWriter, (JsonWriter) layer.k());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Layer)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Layer)";
    }
}