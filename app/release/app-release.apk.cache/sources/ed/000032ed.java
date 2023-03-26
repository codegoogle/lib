package com.greedygame.core.models.core;

import com.microsoft.appcenter.ingestion.models.AbstractLog;
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
public final class BidModelJsonAdapter extends JsonAdapter<BidModel> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<User> b;
    @NotNull
    private final JsonAdapter<App> c;
    @NotNull
    private final JsonAdapter<Sdk> d;
    @NotNull
    private final JsonAdapter<Geo> e;
    @NotNull
    private final JsonAdapter<Device> f;
    @NotNull
    private final JsonAdapter<String> g;
    @Nullable
    private volatile Constructor<BidModel> h;

    public BidModelJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("usr", "app", "sdk", "geo", "dvc", "session_id");
        c25.o(of, "of(\"usr\", \"app\", \"sdk\", \"geo\", \"dvc\",\n      \"session_id\")");
        this.a = of;
        this.b = wo1.d(moshi, User.class, "user", "moshi.adapter(User::class.java, emptySet(), \"user\")");
        this.c = wo1.d(moshi, App.class, "app", "moshi.adapter(App::class.java, emptySet(), \"app\")");
        this.d = wo1.d(moshi, Sdk.class, "sdk", "moshi.adapter(Sdk::class.java, emptySet(), \"sdk\")");
        this.e = wo1.d(moshi, Geo.class, "geo", "moshi.adapter(Geo::class.java, emptySet(),\n      \"geo\")");
        this.f = wo1.d(moshi, Device.class, AbstractLog.DEVICE, "moshi.adapter(Device::class.java, emptySet(),\n      \"device\")");
        this.g = wo1.d(moshi, String.class, "sessionId", "moshi.adapter(String::class.java,\n      emptySet(), \"sessionId\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public BidModel fromJson(@NotNull JsonReader jsonReader) {
        String str;
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        User user = null;
        App app = null;
        Sdk sdk = null;
        Geo geo = null;
        Device device = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    user = this.b.fromJson(jsonReader);
                    if (user == null) {
                        JsonDataException unexpectedNull = Util.unexpectedNull("user", "usr", jsonReader);
                        c25.o(unexpectedNull, "unexpectedNull(\"user\", \"usr\", reader)");
                        throw unexpectedNull;
                    }
                    break;
                case 1:
                    app = this.c.fromJson(jsonReader);
                    if (app == null) {
                        JsonDataException unexpectedNull2 = Util.unexpectedNull("app", "app", jsonReader);
                        c25.o(unexpectedNull2, "unexpectedNull(\"app\", \"app\", reader)");
                        throw unexpectedNull2;
                    }
                    break;
                case 2:
                    sdk = this.d.fromJson(jsonReader);
                    if (sdk == null) {
                        JsonDataException unexpectedNull3 = Util.unexpectedNull("sdk", "sdk", jsonReader);
                        c25.o(unexpectedNull3, "unexpectedNull(\"sdk\", \"sdk\", reader)");
                        throw unexpectedNull3;
                    }
                    break;
                case 3:
                    geo = this.e.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    device = this.f.fromJson(jsonReader);
                    if (device == null) {
                        JsonDataException unexpectedNull4 = Util.unexpectedNull(AbstractLog.DEVICE, "dvc", jsonReader);
                        c25.o(unexpectedNull4, "unexpectedNull(\"device\", \"dvc\",\n            reader)");
                        throw unexpectedNull4;
                    }
                    break;
                case 5:
                    str2 = this.g.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -41) {
            if (user == null) {
                JsonDataException missingProperty = Util.missingProperty("user", "usr", jsonReader);
                c25.o(missingProperty, "missingProperty(\"user\", \"usr\", reader)");
                throw missingProperty;
            } else if (app == null) {
                JsonDataException missingProperty2 = Util.missingProperty("app", "app", jsonReader);
                c25.o(missingProperty2, "missingProperty(\"app\", \"app\", reader)");
                throw missingProperty2;
            } else if (sdk == null) {
                JsonDataException missingProperty3 = Util.missingProperty("sdk", "sdk", jsonReader);
                c25.o(missingProperty3, "missingProperty(\"sdk\", \"sdk\", reader)");
                throw missingProperty3;
            } else if (device != null) {
                return new BidModel(user, app, sdk, geo, device, str2);
            } else {
                JsonDataException missingProperty4 = Util.missingProperty(AbstractLog.DEVICE, "dvc", jsonReader);
                c25.o(missingProperty4, "missingProperty(\"device\", \"dvc\", reader)");
                throw missingProperty4;
            }
        }
        Constructor<BidModel> constructor = this.h;
        if (constructor == null) {
            str = "missingProperty(\"sdk\", \"sdk\", reader)";
            constructor = BidModel.class.getDeclaredConstructor(User.class, App.class, Sdk.class, Geo.class, Device.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.h = constructor;
            c25.o(constructor, "BidModel::class.java.getDeclaredConstructor(User::class.java, App::class.java,\n          Sdk::class.java, Geo::class.java, Device::class.java, String::class.java,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        } else {
            str = "missingProperty(\"sdk\", \"sdk\", reader)";
        }
        Object[] objArr = new Object[8];
        if (user == null) {
            JsonDataException missingProperty5 = Util.missingProperty("user", "usr", jsonReader);
            c25.o(missingProperty5, "missingProperty(\"user\", \"usr\", reader)");
            throw missingProperty5;
        }
        objArr[0] = user;
        if (app == null) {
            JsonDataException missingProperty6 = Util.missingProperty("app", "app", jsonReader);
            c25.o(missingProperty6, "missingProperty(\"app\", \"app\", reader)");
            throw missingProperty6;
        }
        objArr[1] = app;
        if (sdk == null) {
            JsonDataException missingProperty7 = Util.missingProperty("sdk", "sdk", jsonReader);
            c25.o(missingProperty7, str);
            throw missingProperty7;
        }
        objArr[2] = sdk;
        objArr[3] = geo;
        if (device == null) {
            JsonDataException missingProperty8 = Util.missingProperty(AbstractLog.DEVICE, "dvc", jsonReader);
            c25.o(missingProperty8, "missingProperty(\"device\", \"dvc\", reader)");
            throw missingProperty8;
        }
        objArr[4] = device;
        objArr[5] = str2;
        objArr[6] = Integer.valueOf(i);
        objArr[7] = null;
        BidModel newInstance = constructor.newInstance(objArr);
        c25.o(newInstance, "localConstructor.newInstance(\n          user ?: throw Util.missingProperty(\"user\", \"usr\", reader),\n          app ?: throw Util.missingProperty(\"app\", \"app\", reader),\n          sdk ?: throw Util.missingProperty(\"sdk\", \"sdk\", reader),\n          geo,\n          device ?: throw Util.missingProperty(\"device\", \"dvc\", reader),\n          sessionId,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable BidModel bidModel) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(bidModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("usr");
        this.b.toJson(jsonWriter, (JsonWriter) bidModel.h());
        jsonWriter.name("app");
        this.c.toJson(jsonWriter, (JsonWriter) bidModel.a());
        jsonWriter.name("sdk");
        this.d.toJson(jsonWriter, (JsonWriter) bidModel.e());
        jsonWriter.name("geo");
        this.e.toJson(jsonWriter, (JsonWriter) bidModel.d());
        jsonWriter.name("dvc");
        this.f.toJson(jsonWriter, (JsonWriter) bidModel.c());
        jsonWriter.name("session_id");
        this.g.toJson(jsonWriter, (JsonWriter) bidModel.f());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(BidModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(BidModel)";
    }
}