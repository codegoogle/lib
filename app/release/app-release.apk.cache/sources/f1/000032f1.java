package com.greedygame.core.models.core;

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
public final class DeviceJsonAdapter extends JsonAdapter<Device> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<Os> b;
    @NotNull
    private final JsonAdapter<String> c;
    @NotNull
    private final JsonAdapter<Screen> d;
    @NotNull
    private final JsonAdapter<Integer> e;
    @Nullable
    private volatile Constructor<Device> f;

    public DeviceJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("os", "maker", "model", "scrn", "locale", "hni");
        c25.o(of, "of(\"os\", \"maker\", \"model\", \"scrn\",\n      \"locale\", \"hni\")");
        this.a = of;
        this.b = wo1.d(moshi, Os.class, "os", "moshi.adapter(Os::class.java, emptySet(), \"os\")");
        this.c = wo1.d(moshi, String.class, "maker", "moshi.adapter(String::class.java,\n      emptySet(), \"maker\")");
        this.d = wo1.d(moshi, Screen.class, "screen", "moshi.adapter(Screen::class.java,\n      emptySet(), \"screen\")");
        this.e = wo1.d(moshi, Integer.class, "hni", "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"hni\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public Device fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        Os os = null;
        String str = null;
        String str2 = null;
        Screen screen = null;
        String str3 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.a)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    os = this.b.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    str = this.c.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.c.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    screen = this.d.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str3 = this.c.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    num = this.e.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -64) {
            return new Device(os, str, str2, screen, str3, num);
        }
        Constructor<Device> constructor = this.f;
        if (constructor == null) {
            constructor = Device.class.getDeclaredConstructor(Os.class, String.class, String.class, Screen.class, String.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f = constructor;
            c25.o(constructor, "Device::class.java.getDeclaredConstructor(Os::class.java, String::class.java,\n          String::class.java, Screen::class.java, String::class.java, Int::class.javaObjectType,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        Device newInstance = constructor.newInstance(os, str, str2, screen, str3, num, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          os,\n          maker,\n          model,\n          screen,\n          locale,\n          hni,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable Device device) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(device, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("os");
        this.b.toJson(jsonWriter, (JsonWriter) device.e());
        jsonWriter.name("maker");
        this.c.toJson(jsonWriter, (JsonWriter) device.c());
        jsonWriter.name("model");
        this.c.toJson(jsonWriter, (JsonWriter) device.d());
        jsonWriter.name("scrn");
        this.d.toJson(jsonWriter, (JsonWriter) device.f());
        jsonWriter.name("locale");
        this.c.toJson(jsonWriter, (JsonWriter) device.b());
        jsonWriter.name("hni");
        this.e.toJson(jsonWriter, (JsonWriter) device.a());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(Device)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Device)";
    }
}