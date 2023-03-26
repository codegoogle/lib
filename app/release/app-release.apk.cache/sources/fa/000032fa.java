package com.greedygame.core.models.core;

import com.anythink.basead.b.a;
import com.anythink.expressad.foundation.d.c;
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
public final class NativeMediatedAssetJsonAdapter extends JsonAdapter<NativeMediatedAsset> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<Double> c;
    @Nullable
    private volatile Constructor<NativeMediatedAsset> d;

    public NativeMediatedAssetJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(a.C0020a.k, "desc", "icon", "image", "title", "star_rating", "store", "price", "advertiser", "adm", "privacyIconUrl", "redirect");
        c25.o(of, "of(\"cta\", \"desc\", \"icon\", \"image\",\n      \"title\", \"star_rating\", \"store\", \"price\", \"advertiser\", \"adm\", \"privacyIconUrl\", \"redirect\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, a.C0020a.k, "moshi.adapter(String::class.java,\n      emptySet(), \"cta\")");
        this.c = wo1.d(moshi, Double.class, c.X, "moshi.adapter(Double::class.javaObjectType, emptySet(), \"rating\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public NativeMediatedAsset fromJson(@NotNull JsonReader jsonReader) {
        NativeMediatedAsset nativeMediatedAsset;
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Double d = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z = false;
        String str10 = null;
        boolean z2 = false;
        String str11 = null;
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
                    str2 = this.b.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.b.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str4 = this.b.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str5 = this.b.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    d = this.c.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str6 = this.b.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    str7 = this.b.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    str8 = this.b.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    str9 = this.b.fromJson(jsonReader);
                    i &= -513;
                    break;
                case 10:
                    str10 = this.b.fromJson(jsonReader);
                    z = true;
                    break;
                case 11:
                    str11 = this.b.fromJson(jsonReader);
                    z2 = true;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -1024) {
            nativeMediatedAsset = new NativeMediatedAsset(str, str2, str3, str4, str5, d, str6, str7, str8, str9);
        } else {
            Constructor<NativeMediatedAsset> constructor = this.d;
            if (constructor == null) {
                constructor = NativeMediatedAsset.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Double.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                this.d = constructor;
                c25.o(constructor, "NativeMediatedAsset::class.java.getDeclaredConstructor(String::class.java,\n          String::class.java, String::class.java, String::class.java, String::class.java,\n          Double::class.javaObjectType, String::class.java, String::class.java, String::class.java,\n          String::class.java, Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
            }
            NativeMediatedAsset newInstance = constructor.newInstance(str, str2, str3, str4, str5, d, str6, str7, str8, str9, Integer.valueOf(i), null);
            c25.o(newInstance, "localConstructor.newInstance(\n          cta,\n          desc,\n          icon,\n          image,\n          title,\n          rating,\n          store,\n          price,\n          advertiser,\n          adm,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
            nativeMediatedAsset = newInstance;
        }
        if (!z) {
            str10 = nativeMediatedAsset.m();
        }
        nativeMediatedAsset.z(str10);
        if (!z2) {
            str11 = nativeMediatedAsset.o();
        }
        nativeMediatedAsset.C(str11);
        return nativeMediatedAsset;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable NativeMediatedAsset nativeMediatedAsset) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(nativeMediatedAsset, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name(a.C0020a.k);
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.e());
        jsonWriter.name("desc");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.g());
        jsonWriter.name("icon");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.i());
        jsonWriter.name("image");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.j());
        jsonWriter.name("title");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.q());
        jsonWriter.name("star_rating");
        this.c.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.n());
        jsonWriter.name("store");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.p());
        jsonWriter.name("price");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.l());
        jsonWriter.name("advertiser");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.d());
        jsonWriter.name("adm");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.c());
        jsonWriter.name("privacyIconUrl");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.m());
        jsonWriter.name("redirect");
        this.b.toJson(jsonWriter, (JsonWriter) nativeMediatedAsset.o());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(NativeMediatedAsset)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(NativeMediatedAsset)";
    }
}