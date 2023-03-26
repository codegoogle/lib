package com.greedygame.core.signals;

import com.anythink.basead.b.a;
import com.anythink.expressad.videocommon.e.b;
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
public final class InstallReferrerSignalJsonAdapter extends JsonAdapter<InstallReferrerSignal> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<Long> c;
    @NotNull
    private final JsonAdapter<Boolean> d;
    @Nullable
    private volatile Constructor<InstallReferrerSignal> e;

    public InstallReferrerSignalJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("app_id", a.C0020a.A, "ref_url", "ref_clk_time", "install_time", "instant_exp", "advid", "ts");
        c25.o(of, "of(\"app_id\", \"pkg\", \"ref_url\",\n      \"ref_clk_time\", \"install_time\", \"instant_exp\", \"advid\", \"ts\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, b.u, "moshi.adapter(String::class.java, emptySet(),\n      \"appId\")");
        this.c = wo1.d(moshi, Long.TYPE, "referrerClickTime", "moshi.adapter(Long::class.java, emptySet(),\n      \"referrerClickTime\")");
        this.d = wo1.d(moshi, Boolean.TYPE, "instantExperienceLaunched", "moshi.adapter(Boolean::class.java, emptySet(),\n      \"instantExperienceLaunched\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public InstallReferrerSignal fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Long l = 0L;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Long l2 = l;
        Boolean bool2 = bool;
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l3 = l2;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.b.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException unexpectedNull = Util.unexpectedNull(b.u, "app_id", jsonReader);
                        c25.o(unexpectedNull, "unexpectedNull(\"appId\", \"app_id\",\n              reader)");
                        throw unexpectedNull;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = this.b.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException unexpectedNull2 = Util.unexpectedNull("appPackage", a.C0020a.A, jsonReader);
                        c25.o(unexpectedNull2, "unexpectedNull(\"appPackage\",\n              \"pkg\", reader)");
                        throw unexpectedNull2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = this.b.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException unexpectedNull3 = Util.unexpectedNull("referrerUrl", "ref_url", jsonReader);
                        c25.o(unexpectedNull3, "unexpectedNull(\"referrerUrl\",\n              \"ref_url\", reader)");
                        throw unexpectedNull3;
                    }
                    i &= -5;
                    break;
                case 3:
                    l = this.c.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException unexpectedNull4 = Util.unexpectedNull("referrerClickTime", "ref_clk_time", jsonReader);
                        c25.o(unexpectedNull4, "unexpectedNull(\"referrerClickTime\", \"ref_clk_time\", reader)");
                        throw unexpectedNull4;
                    }
                    i &= -9;
                    break;
                case 4:
                    l3 = this.c.fromJson(jsonReader);
                    if (l3 == null) {
                        JsonDataException unexpectedNull5 = Util.unexpectedNull("appInstallTime", "install_time", jsonReader);
                        c25.o(unexpectedNull5, "unexpectedNull(\"appInstallTime\", \"install_time\", reader)");
                        throw unexpectedNull5;
                    }
                    i &= -17;
                    break;
                case 5:
                    bool2 = this.d.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException unexpectedNull6 = Util.unexpectedNull("instantExperienceLaunched", "instant_exp", jsonReader);
                        c25.o(unexpectedNull6, "unexpectedNull(\"instantExperienceLaunched\", \"instant_exp\", reader)");
                        throw unexpectedNull6;
                    }
                    i &= -33;
                    break;
                case 6:
                    str4 = this.b.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException unexpectedNull7 = Util.unexpectedNull("advId", "advid", jsonReader);
                        c25.o(unexpectedNull7, "unexpectedNull(\"advId\", \"advid\",\n              reader)");
                        throw unexpectedNull7;
                    }
                    i &= -65;
                    break;
                case 7:
                    l2 = this.c.fromJson(jsonReader);
                    if (l2 == null) {
                        JsonDataException unexpectedNull8 = Util.unexpectedNull("ts", "ts", jsonReader);
                        c25.o(unexpectedNull8, "unexpectedNull(\"ts\", \"ts\", reader)");
                        throw unexpectedNull8;
                    }
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -256) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            long longValue = l.longValue();
            long longValue2 = l3.longValue();
            boolean booleanValue = bool2.booleanValue();
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            return new InstallReferrerSignal(str, str2, str3, longValue, longValue2, booleanValue, str4, l2.longValue());
        }
        String str5 = str4;
        Constructor<InstallReferrerSignal> constructor = this.e;
        if (constructor == null) {
            Class cls = Long.TYPE;
            constructor = InstallReferrerSignal.class.getDeclaredConstructor(String.class, String.class, String.class, cls, cls, Boolean.TYPE, String.class, cls, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.e = constructor;
            c25.o(constructor, "InstallReferrerSignal::class.java.getDeclaredConstructor(String::class.java,\n          String::class.java, String::class.java, Long::class.javaPrimitiveType,\n          Long::class.javaPrimitiveType, Boolean::class.javaPrimitiveType, String::class.java,\n          Long::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        InstallReferrerSignal newInstance = constructor.newInstance(str, str2, str3, l, l3, bool2, str5, l2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          appId,\n          appPackage,\n          referrerUrl,\n          referrerClickTime,\n          appInstallTime,\n          instantExperienceLaunched,\n          advId,\n          ts,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable InstallReferrerSignal installReferrerSignal) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(installReferrerSignal, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("app_id");
        this.b.toJson(jsonWriter, (JsonWriter) installReferrerSignal.c());
        jsonWriter.name(a.C0020a.A);
        this.b.toJson(jsonWriter, (JsonWriter) installReferrerSignal.e());
        jsonWriter.name("ref_url");
        this.b.toJson(jsonWriter, (JsonWriter) installReferrerSignal.h());
        jsonWriter.name("ref_clk_time");
        this.c.toJson(jsonWriter, (JsonWriter) Long.valueOf(installReferrerSignal.g()));
        jsonWriter.name("install_time");
        this.c.toJson(jsonWriter, (JsonWriter) Long.valueOf(installReferrerSignal.d()));
        jsonWriter.name("instant_exp");
        this.d.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(installReferrerSignal.f()));
        jsonWriter.name("advid");
        this.b.toJson(jsonWriter, (JsonWriter) installReferrerSignal.b());
        jsonWriter.name("ts");
        this.c.toJson(jsonWriter, (JsonWriter) Long.valueOf(installReferrerSignal.i()));
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(InstallReferrerSignal)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(InstallReferrerSignal)";
    }
}