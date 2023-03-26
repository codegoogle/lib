package com.greedygame.mystique2.models;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.ck3;
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
public final class ViewLayerJsonAdapter extends JsonAdapter<ViewLayer> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<List<Style>> c;
    @NotNull
    private final JsonAdapter<Boolean> d;
    @Nullable
    private volatile Constructor<ViewLayer> e;

    public ViewLayerJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("native_ad_view", "type", ck3.b, "id", "use", "fallback", "clickable", "on_click");
        c25.o(of, "of(\"native_ad_view\", \"type\",\n      \"styles\", \"id\", \"use\", \"fallback\", \"clickable\", \"on_click\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "nativeAdView", "moshi.adapter(String::class.java,\n      emptySet(), \"nativeAdView\")");
        JsonAdapter<List<Style>> adapter = moshi.adapter(Types.newParameterizedType(List.class, Style.class), yt4.k(), ck3.b);
        c25.o(adapter, "moshi.adapter(Types.newParameterizedType(List::class.java, Style::class.java), emptySet(),\n      \"styles\")");
        this.c = adapter;
        this.d = wo1.d(moshi, Boolean.TYPE, "clickable", "moshi.adapter(Boolean::class.java, emptySet(),\n      \"clickable\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public ViewLayer fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        List<Style> list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    list = this.c.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str3 = this.b.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.b.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str5 = this.b.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    bool = this.d.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException unexpectedNull = Util.unexpectedNull("clickable", "clickable", jsonReader);
                        c25.o(unexpectedNull, "unexpectedNull(\"clickable\",\n              \"clickable\", reader)");
                        throw unexpectedNull;
                    }
                    i &= -65;
                    break;
                case 7:
                    str6 = this.b.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -256) {
            return new ViewLayer(str, str2, list, str3, str4, str5, bool.booleanValue(), str6, null, 256, null);
        }
        Constructor<ViewLayer> constructor = this.e;
        if (constructor == null) {
            constructor = ViewLayer.class.getDeclaredConstructor(String.class, String.class, List.class, String.class, String.class, String.class, Boolean.TYPE, String.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.e = constructor;
            c25.o(constructor, "ViewLayer::class.java.getDeclaredConstructor(String::class.java, String::class.java,\n          List::class.java, String::class.java, String::class.java, String::class.java,\n          Boolean::class.javaPrimitiveType, String::class.java, Int::class.javaObjectType,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        ViewLayer newInstance = constructor.newInstance(str, str2, list, str3, str4, str5, bool, str6, null, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          nativeAdView,\n          type,\n          styles,\n          id,\n          use,\n          fallback,\n          clickable,\n          onClick,\n          /* viewId */ null,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable ViewLayer viewLayer) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(viewLayer, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("native_ad_view");
        this.b.toJson(jsonWriter, (JsonWriter) viewLayer.getNativeAdView());
        jsonWriter.name("type");
        this.b.toJson(jsonWriter, (JsonWriter) viewLayer.getType());
        jsonWriter.name(ck3.b);
        this.c.toJson(jsonWriter, (JsonWriter) viewLayer.getStyles());
        jsonWriter.name("id");
        this.b.toJson(jsonWriter, (JsonWriter) viewLayer.getId());
        jsonWriter.name("use");
        this.b.toJson(jsonWriter, (JsonWriter) viewLayer.getUse());
        jsonWriter.name("fallback");
        this.b.toJson(jsonWriter, (JsonWriter) viewLayer.getFallback());
        jsonWriter.name("clickable");
        this.d.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(viewLayer.getClickable()));
        jsonWriter.name("on_click");
        this.b.toJson(jsonWriter, (JsonWriter) viewLayer.getOnClick());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(ViewLayer)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ViewLayer)";
    }
}