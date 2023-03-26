package com.greedygame.mystique.models;

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
public final class OperationJsonAdapter extends JsonAdapter<Operation> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<Object> c;
    @NotNull
    private final JsonAdapter<Float> d;
    @NotNull
    private final JsonAdapter<Integer> e;
    @Nullable
    private volatile Constructor<Operation> f;

    public OperationJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("name", "argument", "opacity", "distance", "angle", "width", "color");
        c25.o(of, "of(\"name\", \"argument\", \"opacity\",\n      \"distance\", \"angle\", \"width\", \"color\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "name", "moshi.adapter(String::class.java,\n      emptySet(), \"name\")");
        this.c = wo1.d(moshi, Object.class, "argument", "moshi.adapter(Any::class.java, emptySet(),\n      \"argument\")");
        this.d = wo1.d(moshi, Float.class, "opacity", "moshi.adapter(Float::class.javaObjectType,\n      emptySet(), \"opacity\")");
        this.e = wo1.d(moshi, Integer.class, "distance", "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"distance\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Operation fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        Object obj = null;
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        Float f2 = null;
        String str2 = null;
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
                    obj = this.c.fromJson(jsonReader);
                    break;
                case 2:
                    f = this.d.fromJson(jsonReader);
                    break;
                case 3:
                    num = this.e.fromJson(jsonReader);
                    break;
                case 4:
                    num2 = this.e.fromJson(jsonReader);
                    break;
                case 5:
                    f2 = this.d.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str2 = this.b.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -98) {
            return new Operation(str, obj, f, num, num2, f2, str2);
        }
        Constructor<Operation> constructor = this.f;
        if (constructor == null) {
            constructor = Operation.class.getDeclaredConstructor(String.class, Object.class, Float.class, Integer.class, Integer.class, Float.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f = constructor;
            c25.o(constructor, "Operation::class.java.getDeclaredConstructor(String::class.java, Any::class.java,\n          Float::class.javaObjectType, Int::class.javaObjectType, Int::class.javaObjectType,\n          Float::class.javaObjectType, String::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        Operation newInstance = constructor.newInstance(str, obj, f, num, num2, f2, str2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          name,\n          argument,\n          opacity,\n          distance,\n          angle,\n          width,\n          color,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Operation operation) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(operation, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.b.toJson(jsonWriter, (JsonWriter) operation.l());
        jsonWriter.name("argument");
        this.c.toJson(jsonWriter, (JsonWriter) operation.i());
        jsonWriter.name("opacity");
        this.d.toJson(jsonWriter, (JsonWriter) operation.m());
        jsonWriter.name("distance");
        this.e.toJson(jsonWriter, (JsonWriter) operation.k());
        jsonWriter.name("angle");
        this.e.toJson(jsonWriter, (JsonWriter) operation.h());
        jsonWriter.name("width");
        this.d.toJson(jsonWriter, (JsonWriter) operation.n());
        jsonWriter.name("color");
        this.b.toJson(jsonWriter, (JsonWriter) operation.j());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Operation)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Operation)";
    }
}