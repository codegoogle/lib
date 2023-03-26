package com.greedygame.core.network.model.responses;

import com.anythink.core.common.c.j;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.k13;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class PartnerJsonAdapter extends JsonAdapter<Partner> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<k13> c;
    @NotNull
    private final JsonAdapter<Integer> d;

    public PartnerJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("name", "type", j.a.c, "app_id", "banner_type");
        c25.o(of, "of(\"name\", \"type\", \"placement_id\",\n      \"app_id\", \"banner_type\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "name", "moshi.adapter(String::class.java,\n      emptySet(), \"name\")");
        this.c = wo1.d(moshi, k13.class, "fillType", "moshi.adapter(FillType::class.java,\n      emptySet(), \"fillType\")");
        this.d = wo1.d(moshi, Integer.class, "bannerType", "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"bannerType\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Partner fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        String str = null;
        k13 k13Var = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.b.fromJson(jsonReader);
            } else if (selectName == 1) {
                k13Var = this.c.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.b.fromJson(jsonReader);
            } else if (selectName == 3) {
                str3 = this.b.fromJson(jsonReader);
            } else if (selectName == 4) {
                num = this.d.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new Partner(str, k13Var, str2, str3, num);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Partner partner) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(partner, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.b.toJson(jsonWriter, (JsonWriter) partner.g());
        jsonWriter.name("type");
        this.c.toJson(jsonWriter, (JsonWriter) partner.e());
        jsonWriter.name(j.a.c);
        this.b.toJson(jsonWriter, (JsonWriter) partner.j());
        jsonWriter.name("app_id");
        this.b.toJson(jsonWriter, (JsonWriter) partner.c());
        jsonWriter.name("banner_type");
        this.d.toJson(jsonWriter, (JsonWriter) partner.d());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Partner)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Partner)";
    }
}