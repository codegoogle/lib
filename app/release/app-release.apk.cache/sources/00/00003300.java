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
public final class ScreenJsonAdapter extends JsonAdapter<Screen> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Integer> b;
    @NotNull
    private final JsonAdapter<Float> c;
    @NotNull
    private final JsonAdapter<Float> d;
    @Nullable
    private volatile Constructor<Screen> e;

    public ScreenJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("h", "w", "d", "di");
        c25.o(of, "of(\"h\", \"w\", \"d\", \"di\")");
        this.a = of;
        this.b = wo1.d(moshi, Integer.TYPE, "h", "moshi.adapter(Int::class.java, emptySet(), \"h\")");
        this.c = wo1.d(moshi, Float.TYPE, "d", "moshi.adapter(Float::class.java, emptySet(), \"d\")");
        this.d = wo1.d(moshi, Float.class, "di", "moshi.adapter(Float::class.javaObjectType,\n      emptySet(), \"di\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Screen fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        Integer num = null;
        Integer num2 = null;
        Float f = null;
        Float f2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.b.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("h", "h", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"h\", \"h\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 1) {
                num2 = this.b.fromJson(jsonReader);
                if (num2 == null) {
                    JsonDataException unexpectedNull2 = Util.unexpectedNull("w", "w", jsonReader);
                    c25.o(unexpectedNull2, "unexpectedNull(\"w\", \"w\", reader)");
                    throw unexpectedNull2;
                }
            } else if (selectName == 2) {
                f = this.c.fromJson(jsonReader);
                if (f == null) {
                    JsonDataException unexpectedNull3 = Util.unexpectedNull("d", "d", jsonReader);
                    c25.o(unexpectedNull3, "unexpectedNull(\"d\", \"d\", reader)");
                    throw unexpectedNull3;
                }
            } else if (selectName == 3) {
                f2 = this.d.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (f != null) {
                        return new Screen(intValue, intValue2, f.floatValue(), f2);
                    }
                    JsonDataException missingProperty = Util.missingProperty("d", "d", jsonReader);
                    c25.o(missingProperty, "missingProperty(\"d\", \"d\", reader)");
                    throw missingProperty;
                }
                JsonDataException missingProperty2 = Util.missingProperty("w", "w", jsonReader);
                c25.o(missingProperty2, "missingProperty(\"w\", \"w\", reader)");
                throw missingProperty2;
            }
            JsonDataException missingProperty3 = Util.missingProperty("h", "h", jsonReader);
            c25.o(missingProperty3, "missingProperty(\"h\", \"h\", reader)");
            throw missingProperty3;
        }
        Constructor<Screen> constructor = this.e;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Screen.class.getDeclaredConstructor(cls, cls, Float.TYPE, Float.class, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.e = constructor;
            c25.o(constructor, "Screen::class.java.getDeclaredConstructor(Int::class.javaPrimitiveType,\n          Int::class.javaPrimitiveType, Float::class.javaPrimitiveType, Float::class.javaObjectType,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (num != null) {
            objArr[0] = Integer.valueOf(num.intValue());
            if (num2 != null) {
                objArr[1] = Integer.valueOf(num2.intValue());
                if (f == null) {
                    JsonDataException missingProperty4 = Util.missingProperty("d", "d", jsonReader);
                    c25.o(missingProperty4, "missingProperty(\"d\", \"d\", reader)");
                    throw missingProperty4;
                }
                objArr[2] = Float.valueOf(f.floatValue());
                objArr[3] = f2;
                objArr[4] = Integer.valueOf(i);
                objArr[5] = null;
                Screen newInstance = constructor.newInstance(objArr);
                c25.o(newInstance, "localConstructor.newInstance(\n          h ?: throw Util.missingProperty(\"h\", \"h\", reader),\n          w ?: throw Util.missingProperty(\"w\", \"w\", reader),\n          d ?: throw Util.missingProperty(\"d\", \"d\", reader),\n          di,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
                return newInstance;
            }
            JsonDataException missingProperty5 = Util.missingProperty("w", "w", jsonReader);
            c25.o(missingProperty5, "missingProperty(\"w\", \"w\", reader)");
            throw missingProperty5;
        }
        JsonDataException missingProperty6 = Util.missingProperty("h", "h", jsonReader);
        c25.o(missingProperty6, "missingProperty(\"h\", \"h\", reader)");
        throw missingProperty6;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Screen screen) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(screen, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("h");
        this.b.toJson(jsonWriter, (JsonWriter) Integer.valueOf(screen.c()));
        jsonWriter.name("w");
        this.b.toJson(jsonWriter, (JsonWriter) Integer.valueOf(screen.d()));
        jsonWriter.name("d");
        this.c.toJson(jsonWriter, (JsonWriter) Float.valueOf(screen.a()));
        jsonWriter.name("di");
        this.d.toJson(jsonWriter, (JsonWriter) screen.b());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Screen)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Screen)";
    }
}