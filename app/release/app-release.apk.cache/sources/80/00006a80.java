package com.squareup.moshi;

import com.p7700g.p99005.h95;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class StandardJsonAdapters {
    private static final String ERROR_FORMAT = "Expected %s but was %s at path %s";
    public static final JsonAdapter.Factory FACTORY = new JsonAdapter.Factory() { // from class: com.squareup.moshi.StandardJsonAdapters.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
            if (set.isEmpty()) {
                if (type == Boolean.TYPE) {
                    return StandardJsonAdapters.BOOLEAN_JSON_ADAPTER;
                }
                if (type == Byte.TYPE) {
                    return StandardJsonAdapters.BYTE_JSON_ADAPTER;
                }
                if (type == Character.TYPE) {
                    return StandardJsonAdapters.CHARACTER_JSON_ADAPTER;
                }
                if (type == Double.TYPE) {
                    return StandardJsonAdapters.DOUBLE_JSON_ADAPTER;
                }
                if (type == Float.TYPE) {
                    return StandardJsonAdapters.FLOAT_JSON_ADAPTER;
                }
                if (type == Integer.TYPE) {
                    return StandardJsonAdapters.INTEGER_JSON_ADAPTER;
                }
                if (type == Long.TYPE) {
                    return StandardJsonAdapters.LONG_JSON_ADAPTER;
                }
                if (type == Short.TYPE) {
                    return StandardJsonAdapters.SHORT_JSON_ADAPTER;
                }
                if (type == Boolean.class) {
                    return StandardJsonAdapters.BOOLEAN_JSON_ADAPTER.nullSafe();
                }
                if (type == Byte.class) {
                    return StandardJsonAdapters.BYTE_JSON_ADAPTER.nullSafe();
                }
                if (type == Character.class) {
                    return StandardJsonAdapters.CHARACTER_JSON_ADAPTER.nullSafe();
                }
                if (type == Double.class) {
                    return StandardJsonAdapters.DOUBLE_JSON_ADAPTER.nullSafe();
                }
                if (type == Float.class) {
                    return StandardJsonAdapters.FLOAT_JSON_ADAPTER.nullSafe();
                }
                if (type == Integer.class) {
                    return StandardJsonAdapters.INTEGER_JSON_ADAPTER.nullSafe();
                }
                if (type == Long.class) {
                    return StandardJsonAdapters.LONG_JSON_ADAPTER.nullSafe();
                }
                if (type == Short.class) {
                    return StandardJsonAdapters.SHORT_JSON_ADAPTER.nullSafe();
                }
                if (type == String.class) {
                    return StandardJsonAdapters.STRING_JSON_ADAPTER.nullSafe();
                }
                if (type == Object.class) {
                    return new ObjectJsonAdapter(moshi).nullSafe();
                }
                Class<?> rawType = Types.getRawType(type);
                JsonAdapter<?> generatedAdapter = Util.generatedAdapter(moshi, type, rawType);
                if (generatedAdapter != null) {
                    return generatedAdapter;
                }
                if (rawType.isEnum()) {
                    return new EnumJsonAdapter(rawType).nullSafe();
                }
                return null;
            }
            return null;
        }
    };
    public static final JsonAdapter<Boolean> BOOLEAN_JSON_ADAPTER = new JsonAdapter<Boolean>() { // from class: com.squareup.moshi.StandardJsonAdapters.2
        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Boolean fromJson(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool.booleanValue());
        }
    };
    public static final JsonAdapter<Byte> BYTE_JSON_ADAPTER = new JsonAdapter<Byte>() { // from class: com.squareup.moshi.StandardJsonAdapters.3
        public String toString() {
            return "JsonAdapter(Byte)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Byte fromJson(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) StandardJsonAdapters.rangeCheckNextInt(jsonReader, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Byte b) throws IOException {
            jsonWriter.value(b.intValue() & 255);
        }
    };
    public static final JsonAdapter<Character> CHARACTER_JSON_ADAPTER = new JsonAdapter<Character>() { // from class: com.squareup.moshi.StandardJsonAdapters.4
        public String toString() {
            return "JsonAdapter(Character)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Character fromJson(JsonReader jsonReader) throws IOException {
            String nextString = jsonReader.nextString();
            if (nextString.length() <= 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonDataException(String.format(StandardJsonAdapters.ERROR_FORMAT, "a char", h95.b + nextString + h95.b, jsonReader.getPath()));
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Character ch) throws IOException {
            jsonWriter.value(ch.toString());
        }
    };
    public static final JsonAdapter<Double> DOUBLE_JSON_ADAPTER = new JsonAdapter<Double>() { // from class: com.squareup.moshi.StandardJsonAdapters.5
        public String toString() {
            return "JsonAdapter(Double)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Double fromJson(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Double d) throws IOException {
            jsonWriter.value(d.doubleValue());
        }
    };
    public static final JsonAdapter<Float> FLOAT_JSON_ADAPTER = new JsonAdapter<Float>() { // from class: com.squareup.moshi.StandardJsonAdapters.6
        public String toString() {
            return "JsonAdapter(Float)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Float fromJson(JsonReader jsonReader) throws IOException {
            float nextDouble = (float) jsonReader.nextDouble();
            if (!jsonReader.isLenient() && Float.isInfinite(nextDouble)) {
                throw new JsonDataException("JSON forbids NaN and infinities: " + nextDouble + " at path " + jsonReader.getPath());
            }
            return Float.valueOf(nextDouble);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Float f) throws IOException {
            Objects.requireNonNull(f);
            jsonWriter.value(f);
        }
    };
    public static final JsonAdapter<Integer> INTEGER_JSON_ADAPTER = new JsonAdapter<Integer>() { // from class: com.squareup.moshi.StandardJsonAdapters.7
        public String toString() {
            return "JsonAdapter(Integer)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Integer fromJson(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.nextInt());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Integer num) throws IOException {
            jsonWriter.value(num.intValue());
        }
    };
    public static final JsonAdapter<Long> LONG_JSON_ADAPTER = new JsonAdapter<Long>() { // from class: com.squareup.moshi.StandardJsonAdapters.8
        public String toString() {
            return "JsonAdapter(Long)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Long fromJson(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.nextLong());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Long l) throws IOException {
            jsonWriter.value(l.longValue());
        }
    };
    public static final JsonAdapter<Short> SHORT_JSON_ADAPTER = new JsonAdapter<Short>() { // from class: com.squareup.moshi.StandardJsonAdapters.9
        public String toString() {
            return "JsonAdapter(Short)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Short fromJson(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) StandardJsonAdapters.rangeCheckNextInt(jsonReader, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Short sh) throws IOException {
            jsonWriter.value(sh.intValue());
        }
    };
    public static final JsonAdapter<String> STRING_JSON_ADAPTER = new JsonAdapter<String>() { // from class: com.squareup.moshi.StandardJsonAdapters.10
        public String toString() {
            return "JsonAdapter(String)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public String fromJson(JsonReader jsonReader) throws IOException {
            return jsonReader.nextString();
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    };

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$11  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass11 {
        public static final /* synthetic */ int[] $SwitchMap$com$squareup$moshi$JsonReader$Token;

        static {
            JsonReader.Token.values();
            int[] iArr = new int[10];
            $SwitchMap$com$squareup$moshi$JsonReader$Token = iArr;
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[JsonReader.Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
        private final T[] constants;
        private final Class<T> enumType;
        private final String[] nameStrings;
        private final JsonReader.Options options;

        public EnumJsonAdapter(Class<T> cls) {
            this.enumType = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.constants = enumConstants;
                this.nameStrings = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.constants;
                    if (i < tArr.length) {
                        T t = tArr[i];
                        Json json = (Json) cls.getField(t.name()).getAnnotation(Json.class);
                        this.nameStrings[i] = json != null ? json.name() : t.name();
                        i++;
                    } else {
                        this.options = JsonReader.Options.of(this.nameStrings);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                StringBuilder G = wo1.G("Missing field in ");
                G.append(cls.getName());
                throw new AssertionError(G.toString(), e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.JsonAdapter
        public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
            toJson(jsonWriter, (JsonWriter) ((Enum) obj));
        }

        public String toString() {
            StringBuilder G = wo1.G("JsonAdapter(");
            G.append(this.enumType.getName());
            G.append(")");
            return G.toString();
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader jsonReader) throws IOException {
            int selectString = jsonReader.selectString(this.options);
            if (selectString != -1) {
                return this.constants[selectString];
            }
            String path = jsonReader.getPath();
            String nextString = jsonReader.nextString();
            StringBuilder G = wo1.G("Expected one of ");
            G.append(Arrays.asList(this.nameStrings));
            G.append(" but was ");
            G.append(nextString);
            G.append(" at path ");
            G.append(path);
            throw new JsonDataException(G.toString());
        }

        public void toJson(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(this.nameStrings[t.ordinal()]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ObjectJsonAdapter extends JsonAdapter<Object> {
        private final JsonAdapter<Boolean> booleanAdapter;
        private final JsonAdapter<Double> doubleAdapter;
        private final JsonAdapter<List> listJsonAdapter;
        private final JsonAdapter<Map> mapAdapter;
        private final Moshi moshi;
        private final JsonAdapter<String> stringAdapter;

        public ObjectJsonAdapter(Moshi moshi) {
            this.moshi = moshi;
            this.listJsonAdapter = moshi.adapter(List.class);
            this.mapAdapter = moshi.adapter(Map.class);
            this.stringAdapter = moshi.adapter(String.class);
            this.doubleAdapter = moshi.adapter(Double.class);
            this.booleanAdapter = moshi.adapter(Boolean.class);
        }

        private Class<?> toJsonType(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) throws IOException {
            int ordinal = jsonReader.peek().ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            if (ordinal != 7) {
                                if (ordinal == 8) {
                                    return jsonReader.nextNull();
                                }
                                StringBuilder G = wo1.G("Expected a value but was ");
                                G.append(jsonReader.peek());
                                G.append(" at path ");
                                G.append(jsonReader.getPath());
                                throw new IllegalStateException(G.toString());
                            }
                            return this.booleanAdapter.fromJson(jsonReader);
                        }
                        return this.doubleAdapter.fromJson(jsonReader);
                    }
                    return this.stringAdapter.fromJson(jsonReader);
                }
                return this.mapAdapter.fromJson(jsonReader);
            }
            return this.listJsonAdapter.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                jsonWriter.beginObject();
                jsonWriter.endObject();
                return;
            }
            this.moshi.adapter(toJsonType(cls), Util.NO_ANNOTATIONS).toJson(jsonWriter, (JsonWriter) obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    private StandardJsonAdapters() {
    }

    public static int rangeCheckNextInt(JsonReader jsonReader, String str, int i, int i2) throws IOException {
        int nextInt = jsonReader.nextInt();
        if (nextInt < i || nextInt > i2) {
            throw new JsonDataException(String.format(ERROR_FORMAT, str, Integer.valueOf(nextInt), jsonReader.getPath()));
        }
        return nextInt;
    }
}