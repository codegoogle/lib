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
public final class AdAvailableSignalJsonAdapter extends JsonAdapter<AdAvailableSignal> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Long> b;
    @NotNull
    private final JsonAdapter<String> c;
    @Nullable
    private volatile Constructor<AdAvailableSignal> d;

    public AdAvailableSignalJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("ts", "session_id", "status", "advid", "campaign_id");
        c25.o(of, "of(\"ts\", \"session_id\", \"status\",\n      \"advid\", \"campaign_id\")");
        this.a = of;
        this.b = wo1.d(moshi, Long.TYPE, "ts", "moshi.adapter(Long::class.java, emptySet(), \"ts\")");
        this.c = wo1.d(moshi, String.class, "currentSessionId", "moshi.adapter(String::class.java, emptySet(),\n      \"currentSessionId\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public AdAvailableSignal fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Long l = 0L;
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.b.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("ts", "ts", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"ts\", \"ts\", reader)");
                    throw unexpectedNull;
                }
                i &= -2;
            } else if (selectName == 1) {
                str = this.c.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException unexpectedNull2 = Util.unexpectedNull("currentSessionId", "session_id", jsonReader);
                    c25.o(unexpectedNull2, "unexpectedNull(\"currentSessionId\", \"session_id\", reader)");
                    throw unexpectedNull2;
                }
                i &= -3;
            } else if (selectName == 2) {
                str2 = this.c.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException unexpectedNull3 = Util.unexpectedNull("status", "status", jsonReader);
                    c25.o(unexpectedNull3, "unexpectedNull(\"status\", \"status\",\n              reader)");
                    throw unexpectedNull3;
                }
                i &= -5;
            } else if (selectName == 3) {
                str3 = this.c.fromJson(jsonReader);
                if (str3 == null) {
                    JsonDataException unexpectedNull4 = Util.unexpectedNull("advId", "advid", jsonReader);
                    c25.o(unexpectedNull4, "unexpectedNull(\"advId\", \"advid\",\n              reader)");
                    throw unexpectedNull4;
                }
                i &= -9;
            } else if (selectName == 4 && (str4 = this.c.fromJson(jsonReader)) == null) {
                JsonDataException unexpectedNull5 = Util.unexpectedNull("campaignId", "campaign_id", jsonReader);
                c25.o(unexpectedNull5, "unexpectedNull(\"campaignId\",\n            \"campaign_id\", reader)");
                throw unexpectedNull5;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            long longValue = l.longValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            if (str4 != null) {
                return new AdAvailableSignal(longValue, str, str2, str3, str4);
            }
            JsonDataException missingProperty = Util.missingProperty("campaignId", "campaign_id", jsonReader);
            c25.o(missingProperty, "missingProperty(\"campaignId\", \"campaign_id\", reader)");
            throw missingProperty;
        }
        Constructor<AdAvailableSignal> constructor = this.d;
        if (constructor == null) {
            constructor = AdAvailableSignal.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.d = constructor;
            c25.o(constructor, "AdAvailableSignal::class.java.getDeclaredConstructor(Long::class.javaPrimitiveType,\n          String::class.java, String::class.java, String::class.java, String::class.java,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        objArr[0] = l;
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = str3;
        if (str4 == null) {
            JsonDataException missingProperty2 = Util.missingProperty("campaignId", "campaign_id", jsonReader);
            c25.o(missingProperty2, "missingProperty(\"campaignId\", \"campaign_id\", reader)");
            throw missingProperty2;
        }
        objArr[4] = str4;
        objArr[5] = Integer.valueOf(i);
        objArr[6] = null;
        AdAvailableSignal newInstance = constructor.newInstance(objArr);
        c25.o(newInstance, "localConstructor.newInstance(\n          ts,\n          currentSessionId,\n          status,\n          advId,\n          campaignId ?: throw Util.missingProperty(\"campaignId\", \"campaign_id\", reader),\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable AdAvailableSignal adAvailableSignal) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(adAvailableSignal, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("ts");
        this.b.toJson(jsonWriter, (JsonWriter) Long.valueOf(adAvailableSignal.f()));
        jsonWriter.name("session_id");
        this.c.toJson(jsonWriter, (JsonWriter) adAvailableSignal.d());
        jsonWriter.name("status");
        this.c.toJson(jsonWriter, (JsonWriter) adAvailableSignal.e());
        jsonWriter.name("advid");
        this.c.toJson(jsonWriter, (JsonWriter) adAvailableSignal.b());
        jsonWriter.name("campaign_id");
        this.c.toJson(jsonWriter, (JsonWriter) adAvailableSignal.c());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(AdAvailableSignal)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AdAvailableSignal)";
    }
}