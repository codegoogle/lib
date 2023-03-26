package com.greedygame.core.models.core;

import com.anythink.basead.b.a;
import com.anythink.expressad.foundation.d.l;
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
public final class AppJsonAdapter extends JsonAdapter<App> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<Integer> c;
    @NotNull
    private final JsonAdapter<String> d;
    @Nullable
    private volatile Constructor<App> e;

    public AppJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("ver", l.d, a.C0020a.A, "eng", "theme");
        c25.o(of, "of(\"ver\", \"num\", \"pkg\", \"eng\",\n      \"theme\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "ver", "moshi.adapter(String::class.java, emptySet(),\n      \"ver\")");
        this.c = wo1.d(moshi, Integer.TYPE, l.d, "moshi.adapter(Int::class.java, emptySet(), \"num\")");
        this.d = wo1.d(moshi, String.class, "theme", "moshi.adapter(String::class.java,\n      emptySet(), \"theme\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public App fromJson(@NotNull JsonReader jsonReader) {
        String str;
        Class<String> cls = String.class;
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            Class<String> cls2 = cls;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str2 = this.b.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("ver", "ver", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"ver\", \"ver\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 1) {
                num = this.c.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException unexpectedNull2 = Util.unexpectedNull(l.d, l.d, jsonReader);
                    c25.o(unexpectedNull2, "unexpectedNull(\"num\", \"num\", reader)");
                    throw unexpectedNull2;
                }
            } else if (selectName == 2) {
                str3 = this.b.fromJson(jsonReader);
                if (str3 == null) {
                    JsonDataException unexpectedNull3 = Util.unexpectedNull("bundle", a.C0020a.A, jsonReader);
                    c25.o(unexpectedNull3, "unexpectedNull(\"bundle\", \"pkg\",\n            reader)");
                    throw unexpectedNull3;
                }
            } else if (selectName == 3) {
                str4 = this.b.fromJson(jsonReader);
                if (str4 == null) {
                    JsonDataException unexpectedNull4 = Util.unexpectedNull("engine", "eng", jsonReader);
                    c25.o(unexpectedNull4, "unexpectedNull(\"engine\", \"eng\",\n            reader)");
                    throw unexpectedNull4;
                }
            } else if (selectName == 4) {
                str5 = this.d.fromJson(jsonReader);
                i &= -17;
            }
            cls = cls2;
        }
        Class<String> cls3 = cls;
        jsonReader.endObject();
        if (i == -17) {
            if (str2 == null) {
                JsonDataException missingProperty = Util.missingProperty("ver", "ver", jsonReader);
                c25.o(missingProperty, "missingProperty(\"ver\", \"ver\", reader)");
                throw missingProperty;
            } else if (num != null) {
                int intValue = num.intValue();
                if (str3 == null) {
                    JsonDataException missingProperty2 = Util.missingProperty("bundle", a.C0020a.A, jsonReader);
                    c25.o(missingProperty2, "missingProperty(\"bundle\", \"pkg\", reader)");
                    throw missingProperty2;
                } else if (str4 != null) {
                    return new App(str2, intValue, str3, str4, str5);
                } else {
                    JsonDataException missingProperty3 = Util.missingProperty("engine", "eng", jsonReader);
                    c25.o(missingProperty3, "missingProperty(\"engine\", \"eng\", reader)");
                    throw missingProperty3;
                }
            } else {
                JsonDataException missingProperty4 = Util.missingProperty(l.d, l.d, jsonReader);
                c25.o(missingProperty4, "missingProperty(\"num\", \"num\", reader)");
                throw missingProperty4;
            }
        }
        Constructor<App> constructor = this.e;
        if (constructor == null) {
            str = "missingProperty(\"bundle\", \"pkg\", reader)";
            Class cls4 = Integer.TYPE;
            constructor = App.class.getDeclaredConstructor(cls3, cls4, cls3, cls3, cls3, cls4, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.e = constructor;
            c25.o(constructor, "App::class.java.getDeclaredConstructor(String::class.java, Int::class.javaPrimitiveType,\n          String::class.java, String::class.java, String::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        } else {
            str = "missingProperty(\"bundle\", \"pkg\", reader)";
        }
        Object[] objArr = new Object[7];
        if (str2 == null) {
            JsonDataException missingProperty5 = Util.missingProperty("ver", "ver", jsonReader);
            c25.o(missingProperty5, "missingProperty(\"ver\", \"ver\", reader)");
            throw missingProperty5;
        }
        objArr[0] = str2;
        if (num != null) {
            objArr[1] = Integer.valueOf(num.intValue());
            if (str3 == null) {
                JsonDataException missingProperty6 = Util.missingProperty("bundle", a.C0020a.A, jsonReader);
                c25.o(missingProperty6, str);
                throw missingProperty6;
            }
            objArr[2] = str3;
            if (str4 == null) {
                JsonDataException missingProperty7 = Util.missingProperty("engine", "eng", jsonReader);
                c25.o(missingProperty7, "missingProperty(\"engine\", \"eng\", reader)");
                throw missingProperty7;
            }
            objArr[3] = str4;
            objArr[4] = str5;
            objArr[5] = Integer.valueOf(i);
            objArr[6] = null;
            App newInstance = constructor.newInstance(objArr);
            c25.o(newInstance, "localConstructor.newInstance(\n          ver ?: throw Util.missingProperty(\"ver\", \"ver\", reader),\n          num ?: throw Util.missingProperty(\"num\", \"num\", reader),\n          bundle ?: throw Util.missingProperty(\"bundle\", \"pkg\", reader),\n          engine ?: throw Util.missingProperty(\"engine\", \"eng\", reader),\n          theme,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
            return newInstance;
        }
        JsonDataException missingProperty8 = Util.missingProperty(l.d, l.d, jsonReader);
        c25.o(missingProperty8, "missingProperty(\"num\", \"num\", reader)");
        throw missingProperty8;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable App app) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(app, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("ver");
        this.b.toJson(jsonWriter, (JsonWriter) app.e());
        jsonWriter.name(l.d);
        this.c.toJson(jsonWriter, (JsonWriter) Integer.valueOf(app.c()));
        jsonWriter.name(a.C0020a.A);
        this.b.toJson(jsonWriter, (JsonWriter) app.a());
        jsonWriter.name("eng");
        this.b.toJson(jsonWriter, (JsonWriter) app.b());
        jsonWriter.name("theme");
        this.d.toJson(jsonWriter, (JsonWriter) app.d());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(App)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(App)";
    }
}