package com.greedygame.core.network.model.responses;

import com.anythink.expressad.foundation.d.d;
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
public final class BidResponseJsonAdapter extends JsonAdapter<BidResponse> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<List<Ad>> b;
    @NotNull
    private final JsonAdapter<Boolean> c;
    @Nullable
    private volatile Constructor<BidResponse> d;

    public BidResponseJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(d.h, "manual_refresh");
        c25.o(of, "of(\"ads\", \"manual_refresh\")");
        this.a = of;
        JsonAdapter<List<Ad>> adapter = moshi.adapter(Types.newParameterizedType(List.class, Ad.class), yt4.k(), d.h);
        c25.o(adapter, "moshi.adapter(Types.newParameterizedType(List::class.java, Ad::class.java), emptySet(), \"ads\")");
        this.b = adapter;
        this.c = wo1.d(moshi, Boolean.TYPE, "manualRefresh", "moshi.adapter(Boolean::class.java, emptySet(),\n      \"manualRefresh\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public BidResponse fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        List<Ad> list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.a);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.b.fromJson(jsonReader);
            } else if (selectName == 1) {
                bool = this.c.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException unexpectedNull = Util.unexpectedNull("manualRefresh", "manual_refresh", jsonReader);
                    c25.o(unexpectedNull, "unexpectedNull(\"manualRefresh\", \"manual_refresh\", reader)");
                    throw unexpectedNull;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            return new BidResponse(list, bool.booleanValue());
        }
        Constructor<BidResponse> constructor = this.d;
        if (constructor == null) {
            constructor = BidResponse.class.getDeclaredConstructor(List.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.d = constructor;
            c25.o(constructor, "BidResponse::class.java.getDeclaredConstructor(List::class.java,\n          Boolean::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        BidResponse newInstance = constructor.newInstance(list, bool, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          ads,\n          manualRefresh,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable BidResponse bidResponse) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(bidResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name(d.h);
        this.b.toJson(jsonWriter, (JsonWriter) bidResponse.a());
        jsonWriter.name("manual_refresh");
        this.c.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(bidResponse.b()));
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(BidResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(BidResponse)";
    }
}