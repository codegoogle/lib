package com.greedygame.core.signals;

import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
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
public final class MediationLoadedSignalJsonAdapter extends JsonAdapter<MediationLoadedSignal> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Long> b;
    @NotNull
    private final JsonAdapter<String> c;
    @NotNull
    private final JsonAdapter<Ad> d;
    @NotNull
    private final JsonAdapter<Partner> e;
    @NotNull
    private final JsonAdapter<String> f;
    @Nullable
    private volatile Constructor<MediationLoadedSignal> g;

    public MediationLoadedSignalJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("ts", "session_id", "status", "advid", "ad", "partner", "campaign_id");
        c25.o(of, "of(\"ts\", \"session_id\", \"status\",\n      \"advid\", \"ad\", \"partner\", \"campaign_id\")");
        this.a = of;
        this.b = wo1.d(moshi, Long.TYPE, "ts", "moshi.adapter(Long::class.java, emptySet(), \"ts\")");
        this.c = wo1.d(moshi, String.class, "currentSessionId", "moshi.adapter(String::class.java, emptySet(),\n      \"currentSessionId\")");
        this.d = wo1.d(moshi, Ad.class, "currentAd", "moshi.adapter(Ad::class.java, emptySet(), \"currentAd\")");
        this.e = wo1.d(moshi, Partner.class, "partner", "moshi.adapter(Partner::class.java,\n      emptySet(), \"partner\")");
        this.f = wo1.d(moshi, String.class, "campaignId", "moshi.adapter(String::class.java,\n      emptySet(), \"campaignId\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public MediationLoadedSignal fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Long l = 0L;
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Ad ad = null;
        Partner partner = null;
        String str4 = null;
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
                    ad = this.d.fromJson(jsonReader);
                    if (ad == null) {
                        JsonDataException unexpectedNull5 = Util.unexpectedNull("currentAd", "ad", jsonReader);
                        c25.o(unexpectedNull5, "unexpectedNull(\"currentAd\", \"ad\",\n              reader)");
                        throw unexpectedNull5;
                    }
                    i &= -17;
                    break;
                case 5:
                    partner = this.e.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str4 = this.f.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -128) {
            long longValue = l.longValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(ad, "null cannot be cast to non-null type com.greedygame.core.network.model.responses.Ad");
            return new MediationLoadedSignal(longValue, str, str2, str3, ad, partner, str4);
        }
        Constructor<MediationLoadedSignal> constructor = this.g;
        if (constructor == null) {
            constructor = MediationLoadedSignal.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, String.class, Ad.class, Partner.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.g = constructor;
            c25.o(constructor, "MediationLoadedSignal::class.java.getDeclaredConstructor(Long::class.javaPrimitiveType,\n          String::class.java, String::class.java, String::class.java, Ad::class.java,\n          Partner::class.java, String::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        MediationLoadedSignal newInstance = constructor.newInstance(l, str, str2, str3, ad, partner, str4, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          ts,\n          currentSessionId,\n          status,\n          advId,\n          currentAd,\n          partner,\n          campaignId,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable MediationLoadedSignal mediationLoadedSignal) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(mediationLoadedSignal, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("ts");
        this.b.toJson(jsonWriter, (JsonWriter) Long.valueOf(mediationLoadedSignal.h()));
        jsonWriter.name("session_id");
        this.c.toJson(jsonWriter, (JsonWriter) mediationLoadedSignal.e());
        jsonWriter.name("status");
        this.c.toJson(jsonWriter, (JsonWriter) mediationLoadedSignal.g());
        jsonWriter.name("advid");
        this.c.toJson(jsonWriter, (JsonWriter) mediationLoadedSignal.b());
        jsonWriter.name("ad");
        this.d.toJson(jsonWriter, (JsonWriter) mediationLoadedSignal.d());
        jsonWriter.name("partner");
        this.e.toJson(jsonWriter, (JsonWriter) mediationLoadedSignal.f());
        jsonWriter.name("campaign_id");
        this.f.toJson(jsonWriter, (JsonWriter) mediationLoadedSignal.c());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(MediationLoadedSignal)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(MediationLoadedSignal)";
    }
}