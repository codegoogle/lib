package com.greedygame.mystique2.models;

import com.anythink.expressad.foundation.d.c;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.ck3;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.yt4;
import com.squareup.moshi.JsonAdapter;
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
public final class TemplateJsonAdapter extends JsonAdapter<Template> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<List<ViewLayer>> b;
    @NotNull
    private final JsonAdapter<Float> c;
    @NotNull
    private final JsonAdapter<String> d;
    @NotNull
    private final JsonAdapter<Boolean> e;
    @NotNull
    private final JsonAdapter<List<Style>> f;
    @Nullable
    private volatile Constructor<Template> g;

    public TemplateJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("views", "ratio", "height", "width", c.bQ, ck3.b);
        c25.o(of, "of(\"views\", \"ratio\", \"height\",\n      \"width\", \"impression\", \"styles\")");
        this.a = of;
        JsonAdapter<List<ViewLayer>> adapter = moshi.adapter(Types.newParameterizedType(List.class, ViewLayer.class), yt4.k(), "views");
        c25.o(adapter, "moshi.adapter(Types.newParameterizedType(List::class.java, ViewLayer::class.java), emptySet(),\n      \"views\")");
        this.b = adapter;
        this.c = wo1.d(moshi, Float.class, "ratio", "moshi.adapter(Float::class.javaObjectType,\n      emptySet(), \"ratio\")");
        this.d = wo1.d(moshi, String.class, "height", "moshi.adapter(String::class.java,\n      emptySet(), \"height\")");
        this.e = wo1.d(moshi, Boolean.class, c.bQ, "moshi.adapter(Boolean::class.javaObjectType, emptySet(), \"impression\")");
        JsonAdapter<List<Style>> adapter2 = moshi.adapter(Types.newParameterizedType(List.class, Style.class), yt4.k(), ck3.b);
        c25.o(adapter2, "moshi.adapter(Types.newParameterizedType(List::class.java, Style::class.java), emptySet(),\n      \"styles\")");
        this.f = adapter2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Template fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        List<ViewLayer> list = null;
        Float f = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        List<Style> list2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.b.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    f = this.c.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str = this.d.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str2 = this.d.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    bool = this.e.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    list2 = this.f.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -64) {
            return new Template(list, f, str, str2, bool, list2);
        }
        Constructor<Template> constructor = this.g;
        if (constructor == null) {
            constructor = Template.class.getDeclaredConstructor(List.class, Float.class, String.class, String.class, Boolean.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.g = constructor;
            c25.o(constructor, "Template::class.java.getDeclaredConstructor(List::class.java, Float::class.javaObjectType,\n          String::class.java, String::class.java, Boolean::class.javaObjectType, List::class.java,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        Template newInstance = constructor.newInstance(list, f, str, str2, bool, list2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          views,\n          ratio,\n          height,\n          width,\n          impression,\n          styles,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Template template) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(template, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("views");
        this.b.toJson(jsonWriter, (JsonWriter) template.getViews());
        jsonWriter.name("ratio");
        this.c.toJson(jsonWriter, (JsonWriter) template.getRatio());
        jsonWriter.name("height");
        this.d.toJson(jsonWriter, (JsonWriter) template.getHeight());
        jsonWriter.name("width");
        this.d.toJson(jsonWriter, (JsonWriter) template.getWidth());
        jsonWriter.name(c.bQ);
        this.e.toJson(jsonWriter, (JsonWriter) template.getImpression());
        jsonWriter.name(ck3.b);
        this.f.toJson(jsonWriter, (JsonWriter) template.getStyles());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Template)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Template)";
    }
}