package com.greedygame.core.network.model.responses;

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
public final class TemplateMetaJsonAdapter extends JsonAdapter<TemplateMeta> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @Nullable
    private volatile Constructor<TemplateMeta> c;

    public TemplateMetaJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("url", "ver");
        c25.o(of, "of(\"url\", \"ver\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "url", "moshi.adapter(String::class.java, emptySet(),\n      \"url\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public TemplateMeta fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.b.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("url", "url", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"url\", \"url\", reader)");
                    throw unexpectedNull;
                }
                i &= -2;
            } else if (selectName == 1) {
                str2 = this.b.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException unexpectedNull2 = Util.unexpectedNull("rVersion", "ver", jsonReader);
                    c25.o(unexpectedNull2, "unexpectedNull(\"rVersion\", \"ver\",\n              reader)");
                    throw unexpectedNull2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            return new TemplateMeta(str, str2);
        }
        Constructor<TemplateMeta> constructor = this.c;
        if (constructor == null) {
            constructor = TemplateMeta.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.c = constructor;
            c25.o(constructor, "TemplateMeta::class.java.getDeclaredConstructor(String::class.java, String::class.java,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        TemplateMeta newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          url,\n          rVersion,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable TemplateMeta templateMeta) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(templateMeta, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("url");
        this.b.toJson(jsonWriter, (JsonWriter) templateMeta.e());
        jsonWriter.name("ver");
        this.b.toJson(jsonWriter, (JsonWriter) templateMeta.d());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(TemplateMeta)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(TemplateMeta)";
    }
}