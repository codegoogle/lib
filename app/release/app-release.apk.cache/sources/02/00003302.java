package com.greedygame.core.models.core;

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
public final class SdkJsonAdapter extends JsonAdapter<Sdk> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Integer> b;
    @NotNull
    private final JsonAdapter<String> c;
    @NotNull
    private final JsonAdapter<Admob> d;
    @NotNull
    private final JsonAdapter<Mopub> e;
    @NotNull
    private final JsonAdapter<Fb> f;
    @NotNull
    private final JsonAdapter<Play> g;
    @Nullable
    private volatile Constructor<Sdk> h;

    public SdkJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(l.d, "ver", "admob", "mopub", l.f, "play");
        c25.o(of, "of(\"num\", \"ver\", \"admob\", \"mopub\",\n      \"fb\", \"play\")");
        this.a = of;
        this.b = wo1.d(moshi, Integer.TYPE, l.d, "moshi.adapter(Int::class.java, emptySet(), \"num\")");
        this.c = wo1.d(moshi, String.class, "ver", "moshi.adapter(String::class.java, emptySet(),\n      \"ver\")");
        this.d = wo1.d(moshi, Admob.class, "admob", "moshi.adapter(Admob::class.java,\n      emptySet(), \"admob\")");
        this.e = wo1.d(moshi, Mopub.class, "mopub", "moshi.adapter(Mopub::class.java,\n      emptySet(), \"mopub\")");
        this.f = wo1.d(moshi, Fb.class, l.f, "moshi.adapter(Fb::class.java, emptySet(), \"fb\")");
        this.g = wo1.d(moshi, Play.class, "play", "moshi.adapter(Play::class.java, emptySet(),\n      \"play\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Sdk fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        Integer num = null;
        String str = null;
        Admob admob = null;
        Mopub mopub = null;
        Fb fb = null;
        Play play = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = this.b.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException unexpectedNull = Util.unexpectedNull(l.d, l.d, jsonReader);
                        c25.o(unexpectedNull, "unexpectedNull(\"num\", \"num\", reader)");
                        throw unexpectedNull;
                    }
                    break;
                case 1:
                    str = this.c.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException unexpectedNull2 = Util.unexpectedNull("ver", "ver", jsonReader);
                        c25.o(unexpectedNull2, "unexpectedNull(\"ver\", \"ver\", reader)");
                        throw unexpectedNull2;
                    }
                    break;
                case 2:
                    admob = this.d.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    mopub = this.e.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    fb = this.f.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    play = this.g.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -61) {
            if (num != null) {
                int intValue = num.intValue();
                if (str != null) {
                    return new Sdk(intValue, str, admob, mopub, fb, play);
                }
                JsonDataException missingProperty = Util.missingProperty("ver", "ver", jsonReader);
                c25.o(missingProperty, "missingProperty(\"ver\", \"ver\", reader)");
                throw missingProperty;
            }
            JsonDataException missingProperty2 = Util.missingProperty(l.d, l.d, jsonReader);
            c25.o(missingProperty2, "missingProperty(\"num\", \"num\", reader)");
            throw missingProperty2;
        }
        Constructor<Sdk> constructor = this.h;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Sdk.class.getDeclaredConstructor(cls, String.class, Admob.class, Mopub.class, Fb.class, Play.class, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.h = constructor;
            c25.o(constructor, "Sdk::class.java.getDeclaredConstructor(Int::class.javaPrimitiveType, String::class.java,\n          Admob::class.java, Mopub::class.java, Fb::class.java, Play::class.java,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        if (num != null) {
            objArr[0] = Integer.valueOf(num.intValue());
            if (str == null) {
                JsonDataException missingProperty3 = Util.missingProperty("ver", "ver", jsonReader);
                c25.o(missingProperty3, "missingProperty(\"ver\", \"ver\", reader)");
                throw missingProperty3;
            }
            objArr[1] = str;
            objArr[2] = admob;
            objArr[3] = mopub;
            objArr[4] = fb;
            objArr[5] = play;
            objArr[6] = Integer.valueOf(i);
            objArr[7] = null;
            Sdk newInstance = constructor.newInstance(objArr);
            c25.o(newInstance, "localConstructor.newInstance(\n          num ?: throw Util.missingProperty(\"num\", \"num\", reader),\n          ver ?: throw Util.missingProperty(\"ver\", \"ver\", reader),\n          admob,\n          mopub,\n          fb,\n          play,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
            return newInstance;
        }
        JsonDataException missingProperty4 = Util.missingProperty(l.d, l.d, jsonReader);
        c25.o(missingProperty4, "missingProperty(\"num\", \"num\", reader)");
        throw missingProperty4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Sdk sdk) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(sdk, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name(l.d);
        this.b.toJson(jsonWriter, (JsonWriter) Integer.valueOf(sdk.d()));
        jsonWriter.name("ver");
        this.c.toJson(jsonWriter, (JsonWriter) sdk.f());
        jsonWriter.name("admob");
        this.d.toJson(jsonWriter, (JsonWriter) sdk.a());
        jsonWriter.name("mopub");
        this.e.toJson(jsonWriter, (JsonWriter) sdk.c());
        jsonWriter.name(l.f);
        this.f.toJson(jsonWriter, (JsonWriter) sdk.b());
        jsonWriter.name("play");
        this.g.toJson(jsonWriter, (JsonWriter) sdk.e());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Sdk)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Sdk)";
    }
}