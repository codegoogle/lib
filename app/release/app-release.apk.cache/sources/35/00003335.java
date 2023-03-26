package com.greedygame.core.signals;

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
public final class UnitClickSignalJsonAdapter extends JsonAdapter<UnitClickSignal> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Long> b;
    @NotNull
    private final JsonAdapter<String> c;
    @NotNull
    private final JsonAdapter<String> d;
    @NotNull
    private final JsonAdapter<Boolean> e;
    @NotNull
    private final JsonAdapter<Long> f;
    @Nullable
    private volatile Constructor<UnitClickSignal> g;

    public UnitClickSignalJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("ts", "session_id", "status", "advid", "campaign_id", "partner", "ext", "unit_t");
        c25.o(of, "of(\"ts\", \"session_id\", \"status\",\n      \"advid\", \"campaign_id\", \"partner\", \"ext\", \"unit_t\")");
        this.a = of;
        this.b = wo1.d(moshi, Long.TYPE, "ts", "moshi.adapter(Long::class.java, emptySet(), \"ts\")");
        this.c = wo1.d(moshi, String.class, "currentSessionId", "moshi.adapter(String::class.java, emptySet(),\n      \"currentSessionId\")");
        this.d = wo1.d(moshi, String.class, "campaignId", "moshi.adapter(String::class.java,\n      emptySet(), \"campaignId\")");
        this.e = wo1.d(moshi, Boolean.class, "external", "moshi.adapter(Boolean::class.javaObjectType, emptySet(), \"external\")");
        this.f = wo1.d(moshi, Long.class, "timeForUnitClickSinceInit", "moshi.adapter(Long::class.javaObjectType,\n      emptySet(), \"timeForUnitClickSinceInit\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public UnitClickSignal fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Long l = 0L;
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Long l2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l = this.b.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException unexpectedNull = Util.unexpectedNull("ts", "ts", jsonReader);
                        c25.o(unexpectedNull, "unexpectedNull(\"ts\", \"ts\", reader)");
                        throw unexpectedNull;
                    }
                    i &= -2;
                    break;
                case 1:
                    str = this.c.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException unexpectedNull2 = Util.unexpectedNull("currentSessionId", "session_id", jsonReader);
                        c25.o(unexpectedNull2, "unexpectedNull(\"currentSessionId\", \"session_id\", reader)");
                        throw unexpectedNull2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str2 = this.c.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException unexpectedNull3 = Util.unexpectedNull("status", "status", jsonReader);
                        c25.o(unexpectedNull3, "unexpectedNull(\"status\", \"status\",\n              reader)");
                        throw unexpectedNull3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str3 = this.c.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException unexpectedNull4 = Util.unexpectedNull("advId", "advid", jsonReader);
                        c25.o(unexpectedNull4, "unexpectedNull(\"advId\", \"advid\",\n              reader)");
                        throw unexpectedNull4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str4 = this.d.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str5 = this.d.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    bool = this.e.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    l2 = this.f.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -256) {
            long longValue = l.longValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            return new UnitClickSignal(longValue, str, str2, str3, str4, str5, bool, l2);
        }
        Constructor<UnitClickSignal> constructor = this.g;
        if (constructor == null) {
            constructor = UnitClickSignal.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, String.class, String.class, String.class, Boolean.class, Long.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.g = constructor;
            c25.o(constructor, "UnitClickSignal::class.java.getDeclaredConstructor(Long::class.javaPrimitiveType,\n          String::class.java, String::class.java, String::class.java, String::class.java,\n          String::class.java, Boolean::class.javaObjectType, Long::class.javaObjectType,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        UnitClickSignal newInstance = constructor.newInstance(l, str, str2, str3, str4, str5, bool, l2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          ts,\n          currentSessionId,\n          status,\n          advId,\n          campaignId,\n          partner,\n          external_,\n          timeForUnitClickSinceInit,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable UnitClickSignal unitClickSignal) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(unitClickSignal, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("ts");
        this.b.toJson(jsonWriter, (JsonWriter) Long.valueOf(unitClickSignal.i()));
        jsonWriter.name("session_id");
        this.c.toJson(jsonWriter, (JsonWriter) unitClickSignal.d());
        jsonWriter.name("status");
        this.c.toJson(jsonWriter, (JsonWriter) unitClickSignal.g());
        jsonWriter.name("advid");
        this.c.toJson(jsonWriter, (JsonWriter) unitClickSignal.b());
        jsonWriter.name("campaign_id");
        this.d.toJson(jsonWriter, (JsonWriter) unitClickSignal.c());
        jsonWriter.name("partner");
        this.d.toJson(jsonWriter, (JsonWriter) unitClickSignal.f());
        jsonWriter.name("ext");
        this.e.toJson(jsonWriter, (JsonWriter) unitClickSignal.e());
        jsonWriter.name("unit_t");
        this.f.toJson(jsonWriter, (JsonWriter) unitClickSignal.h());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(UnitClickSignal)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(UnitClickSignal)";
    }
}