package com.greedygame.mystique.models;

import com.p7700g.p99005.c25;
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
public final class TemplateModelJsonAdapter extends JsonAdapter<TemplateModel> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<List<Layer>> b;
    @Nullable
    private volatile Constructor<TemplateModel> c;

    public TemplateModelJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("layers", "fallback_layers");
        c25.o(of, "of(\"layers\", \"fallback_layers\")");
        this.a = of;
        JsonAdapter<List<Layer>> adapter = moshi.adapter(Types.newParameterizedType(List.class, Layer.class), yt4.k(), "layers");
        c25.o(adapter, "moshi.adapter(Types.newParameterizedType(List::class.java, Layer::class.java), emptySet(),\n      \"layers\")");
        this.b = adapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public TemplateModel fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        List<Layer> list = null;
        List<Layer> list2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.b.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                list2 = this.b.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new TemplateModel(list, list2);
        }
        Constructor<TemplateModel> constructor = this.c;
        if (constructor == null) {
            constructor = TemplateModel.class.getDeclaredConstructor(List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.c = constructor;
            c25.o(constructor, "TemplateModel::class.java.getDeclaredConstructor(List::class.java, List::class.java,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        TemplateModel newInstance = constructor.newInstance(list, list2, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          layers,\n          fallbackLayers,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable TemplateModel templateModel) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(templateModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("layers");
        this.b.toJson(jsonWriter, (JsonWriter) templateModel.f());
        jsonWriter.name("fallback_layers");
        this.b.toJson(jsonWriter, (JsonWriter) templateModel.e());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(TemplateModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(TemplateModel)";
    }
}