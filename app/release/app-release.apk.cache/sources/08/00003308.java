package com.greedygame.core.network.model.responses;

import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.c25;
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
public final class AdJsonAdapter extends JsonAdapter<Ad> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<String> c;
    @NotNull
    private final JsonAdapter<Partner> d;
    @NotNull
    private final JsonAdapter<Boolean> e;
    @NotNull
    private final JsonAdapter<TemplateMeta> f;
    @NotNull
    private final JsonAdapter<UiiConfiguration> g;
    @NotNull
    private final JsonAdapter<NativeMediatedAsset> h;
    @NotNull
    private final JsonAdapter<List<String>> i;
    @Nullable
    private volatile Constructor<Ad> j;

    public AdJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("campaign_id", "session_id", "screen_time", "redirect", "partner", "engagement_url", "external", "template", "uii", "config", "uii_click", "unit_click", "impressions", "clickable");
        c25.o(of, "of(\"campaign_id\", \"session_id\",\n      \"screen_time\", \"redirect\", \"partner\", \"engagement_url\", \"external\", \"template\", \"uii\",\n      \"config\", \"uii_click\", \"unit_click\", \"impressions\", \"clickable\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "campaignId", "moshi.adapter(String::class.java,\n      emptySet(), \"campaignId\")");
        this.c = wo1.d(moshi, String.class, "rScreenTime", "moshi.adapter(String::class.java, emptySet(),\n      \"rScreenTime\")");
        this.d = wo1.d(moshi, Partner.class, "partner", "moshi.adapter(Partner::class.java,\n      emptySet(), \"partner\")");
        this.e = wo1.d(moshi, Boolean.TYPE, "external", "moshi.adapter(Boolean::class.java, emptySet(),\n      \"external\")");
        this.f = wo1.d(moshi, TemplateMeta.class, "templateMeta", "moshi.adapter(TemplateMeta::class.java, emptySet(), \"templateMeta\")");
        this.g = wo1.d(moshi, UiiConfiguration.class, "uiiConfig", "moshi.adapter(UiiConfiguration::class.java, emptySet(), \"uiiConfig\")");
        this.h = wo1.d(moshi, NativeMediatedAsset.class, "nativeMediatedAsset", "moshi.adapter(NativeMediatedAsset::class.java, emptySet(), \"nativeMediatedAsset\")");
        JsonAdapter<List<String>> adapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), yt4.k(), "uiiClick");
        c25.o(adapter, "moshi.adapter(Types.newParameterizedType(List::class.java, String::class.java), emptySet(),\n      \"uiiClick\")");
        this.i = adapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Ad fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Partner partner = null;
        String str5 = null;
        NativeMediatedAsset nativeMediatedAsset = null;
        TemplateMeta templateMeta = null;
        UiiConfiguration uiiConfiguration = null;
        List<String> list = null;
        List<String> list2 = null;
        List<String> list3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.b.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.b.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.c.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException unexpectedNull = Util.unexpectedNull("rScreenTime", "screen_time", jsonReader);
                        c25.o(unexpectedNull, "unexpectedNull(\"rScreenTime\",\n              \"screen_time\", reader)");
                        throw unexpectedNull;
                    }
                    i &= -5;
                    break;
                case 3:
                    str4 = this.b.fromJson(jsonReader);
                    break;
                case 4:
                    partner = this.d.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.b.fromJson(jsonReader);
                    break;
                case 6:
                    bool = this.e.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException unexpectedNull2 = Util.unexpectedNull("external_", "external", jsonReader);
                        c25.o(unexpectedNull2, "unexpectedNull(\"external_\",\n              \"external\", reader)");
                        throw unexpectedNull2;
                    }
                    i &= -65;
                    break;
                case 7:
                    templateMeta = this.f.fromJson(jsonReader);
                    if (templateMeta == null) {
                        JsonDataException unexpectedNull3 = Util.unexpectedNull("templateMeta", "template", jsonReader);
                        c25.o(unexpectedNull3, "unexpectedNull(\"templateMeta\", \"template\", reader)");
                        throw unexpectedNull3;
                    }
                    i &= -129;
                    break;
                case 8:
                    uiiConfiguration = this.g.fromJson(jsonReader);
                    break;
                case 9:
                    nativeMediatedAsset = this.h.fromJson(jsonReader);
                    if (nativeMediatedAsset == null) {
                        JsonDataException unexpectedNull4 = Util.unexpectedNull("nativeMediatedAsset", "config", jsonReader);
                        c25.o(unexpectedNull4, "unexpectedNull(\"nativeMediatedAsset\", \"config\", reader)");
                        throw unexpectedNull4;
                    }
                    i &= -513;
                    break;
                case 10:
                    list = this.i.fromJson(jsonReader);
                    break;
                case 11:
                    list2 = this.i.fromJson(jsonReader);
                    break;
                case 12:
                    list3 = this.i.fromJson(jsonReader);
                    break;
                case 13:
                    bool2 = this.e.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException unexpectedNull5 = Util.unexpectedNull("isClickable", "clickable", jsonReader);
                        c25.o(unexpectedNull5, "unexpectedNull(\"isClickable\",\n              \"clickable\", reader)");
                        throw unexpectedNull5;
                    }
                    i &= -8193;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -8901) {
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(templateMeta, "null cannot be cast to non-null type com.greedygame.core.network.model.responses.TemplateMeta");
            Objects.requireNonNull(nativeMediatedAsset, "null cannot be cast to non-null type com.greedygame.core.models.core.NativeMediatedAsset");
            return new Ad(str, str2, str3, str4, partner, str5, booleanValue, templateMeta, uiiConfiguration, nativeMediatedAsset, list, list2, list3, bool2.booleanValue());
        }
        NativeMediatedAsset nativeMediatedAsset2 = nativeMediatedAsset;
        Constructor<Ad> constructor = this.j;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = Ad.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Partner.class, String.class, cls, TemplateMeta.class, UiiConfiguration.class, NativeMediatedAsset.class, List.class, List.class, List.class, cls, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.j = constructor;
            c25.o(constructor, "Ad::class.java.getDeclaredConstructor(String::class.java, String::class.java,\n          String::class.java, String::class.java, Partner::class.java, String::class.java,\n          Boolean::class.javaPrimitiveType, TemplateMeta::class.java, UiiConfiguration::class.java,\n          NativeMediatedAsset::class.java, List::class.java, List::class.java, List::class.java,\n          Boolean::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        Ad newInstance = constructor.newInstance(str, str2, str3, str4, partner, str5, bool, templateMeta, uiiConfiguration, nativeMediatedAsset2, list, list2, list3, bool2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          campaignId,\n          sessionId,\n          rScreenTime,\n          redirect,\n          partner,\n          engagementUrl,\n          external_,\n          templateMeta,\n          uiiConfig,\n          nativeMediatedAsset,\n          uiiClick,\n          unitClick,\n          impressions,\n          isClickable,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Ad ad) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(ad, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("campaign_id");
        this.b.toJson(jsonWriter, (JsonWriter) ad.r());
        jsonWriter.name("session_id");
        this.b.toJson(jsonWriter, (JsonWriter) ad.B());
        jsonWriter.name("screen_time");
        this.c.toJson(jsonWriter, (JsonWriter) ad.x());
        jsonWriter.name("redirect");
        this.b.toJson(jsonWriter, (JsonWriter) ad.y());
        jsonWriter.name("partner");
        this.d.toJson(jsonWriter, (JsonWriter) ad.w());
        jsonWriter.name("engagement_url");
        this.b.toJson(jsonWriter, (JsonWriter) ad.s());
        jsonWriter.name("external");
        this.e.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(ad.t()));
        jsonWriter.name("template");
        this.f.toJson(jsonWriter, (JsonWriter) ad.C());
        jsonWriter.name("uii");
        this.g.toJson(jsonWriter, (JsonWriter) ad.F());
        jsonWriter.name("config");
        this.h.toJson(jsonWriter, (JsonWriter) ad.v());
        jsonWriter.name("uii_click");
        this.i.toJson(jsonWriter, (JsonWriter) ad.D());
        jsonWriter.name("unit_click");
        this.i.toJson(jsonWriter, (JsonWriter) ad.G());
        jsonWriter.name("impressions");
        this.i.toJson(jsonWriter, (JsonWriter) ad.u());
        jsonWriter.name("clickable");
        this.e.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(ad.H()));
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Ad)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Ad)";
    }
}