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
public final class UserJsonAdapter extends JsonAdapter<User> {
    @NotNull
    private final JsonReader.Options a;
    @NotNull
    private final JsonAdapter<String> b;
    @NotNull
    private final JsonAdapter<Integer> c;
    @Nullable
    private volatile Constructor<User> d;

    public UserJsonAdapter(@NotNull Moshi moshi) {
        c25.p(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("advid", "ai5", "dnt", "consent", "coppa", "ccpa");
        c25.o(of, "of(\"advid\", \"ai5\", \"dnt\", \"consent\",\n      \"coppa\", \"ccpa\")");
        this.a = of;
        this.b = wo1.d(moshi, String.class, "advid", "moshi.adapter(String::class.java,\n      emptySet(), \"advid\")");
        this.c = wo1.d(moshi, Integer.class, "optout", "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"optout\")");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* renamed from: a */
    public User fromJson(@NotNull JsonReader jsonReader) {
        c25.p(jsonReader, "reader");
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
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
                    num = this.c.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    num2 = this.c.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    num3 = this.c.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    num4 = this.c.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -64) {
            return new User(str, str2, num, num2, num3, num4);
        }
        Constructor<User> constructor = this.d;
        if (constructor == null) {
            constructor = User.class.getDeclaredConstructor(String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.d = constructor;
            c25.o(constructor, "User::class.java.getDeclaredConstructor(String::class.java, String::class.java,\n          Int::class.javaObjectType, Int::class.javaObjectType, Int::class.javaObjectType,\n          Int::class.javaObjectType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        User newInstance = constructor.newInstance(str, str2, num, num2, num3, num4, Integer.valueOf(i), null);
        c25.o(newInstance, "localConstructor.newInstance(\n          advid,\n          ai5,\n          optout,\n          consent,\n          coppa,\n          ccpa,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b */
    public void toJson(@NotNull JsonWriter jsonWriter, @Nullable User user) {
        c25.p(jsonWriter, "writer");
        Objects.requireNonNull(user, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        jsonWriter.beginObject();
        jsonWriter.name("advid");
        this.b.toJson(jsonWriter, (JsonWriter) user.a());
        jsonWriter.name("ai5");
        this.b.toJson(jsonWriter, (JsonWriter) user.b());
        jsonWriter.name("dnt");
        this.c.toJson(jsonWriter, (JsonWriter) user.f());
        jsonWriter.name("consent");
        this.c.toJson(jsonWriter, (JsonWriter) user.d());
        jsonWriter.name("coppa");
        this.c.toJson(jsonWriter, (JsonWriter) user.e());
        jsonWriter.name("ccpa");
        this.c.toJson(jsonWriter, (JsonWriter) user.c());
        jsonWriter.endObject();
    }

    @NotNull
    public String toString() {
        c25.o("GeneratedJsonAdapter(User)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(User)";
    }
}