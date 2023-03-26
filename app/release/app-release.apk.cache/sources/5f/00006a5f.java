package com.squareup.moshi;

import com.p7700g.p99005.mw5;
import com.p7700g.p99005.sv5;
import com.p7700g.p99005.uv5;
import com.p7700g.p99005.vv5;
import com.p7700g.p99005.wo1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class JsonReader implements Closeable {
    public boolean failOnUnknown;
    public boolean lenient;
    public int[] pathIndices;
    public String[] pathNames;
    public int[] scopes;
    public int stackSize;
    private Map<Class<?>, Object> tags;

    /* renamed from: com.squareup.moshi.JsonReader$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$squareup$moshi$JsonReader$Token;

        static {
            Token.values();
            int[] iArr = new int[10];
            $SwitchMap$com$squareup$moshi$JsonReader$Token = iArr;
            try {
                iArr[Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class Options {
        public final mw5 doubleQuoteSuffix;
        public final String[] strings;

        private Options(String[] strArr, mw5 mw5Var) {
            this.strings = strArr;
            this.doubleQuoteSuffix = mw5Var;
        }

        @CheckReturnValue
        public static Options of(String... strArr) {
            try {
                vv5[] vv5VarArr = new vv5[strArr.length];
                sv5 sv5Var = new sv5();
                for (int i = 0; i < strArr.length; i++) {
                    JsonUtf8Writer.string(sv5Var, strArr[i]);
                    sv5Var.readByte();
                    vv5VarArr[i] = sv5Var.f1();
                }
                return new Options((String[]) strArr.clone(), mw5.m(vv5VarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public List<String> strings() {
            return Collections.unmodifiableList(Arrays.asList(this.strings));
        }
    }

    /* loaded from: classes3.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public JsonReader() {
        this.scopes = new int[32];
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
    }

    @CheckReturnValue
    public static JsonReader of(uv5 uv5Var) {
        return new JsonUtf8Reader(uv5Var);
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    @CheckReturnValue
    public final boolean failOnUnknown() {
        return this.failOnUnknown;
    }

    @CheckReturnValue
    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    @CheckReturnValue
    public abstract boolean hasNext() throws IOException;

    @CheckReturnValue
    public final boolean isLenient() {
        return this.lenient;
    }

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract long nextLong() throws IOException;

    @CheckReturnValue
    public abstract String nextName() throws IOException;

    @Nullable
    public abstract <T> T nextNull() throws IOException;

    public abstract uv5 nextSource() throws IOException;

    public abstract String nextString() throws IOException;

    @CheckReturnValue
    public abstract Token peek() throws IOException;

    @CheckReturnValue
    public abstract JsonReader peekJson();

    public abstract void promoteNameToValue() throws IOException;

    public final void pushScope(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.scopes;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.pathNames;
                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.pathIndices;
                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder G = wo1.G("Nesting too deep at ");
                G.append(getPath());
                throw new JsonDataException(G.toString());
            }
        }
        int[] iArr3 = this.scopes;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    @Nullable
    public final Object readJsonValue() throws IOException {
        int ordinal = peek().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            beginArray();
            while (hasNext()) {
                arrayList.add(readJsonValue());
            }
            endArray();
            return arrayList;
        } else if (ordinal != 2) {
            if (ordinal != 5) {
                if (ordinal != 6) {
                    if (ordinal != 7) {
                        if (ordinal == 8) {
                            return nextNull();
                        }
                        StringBuilder G = wo1.G("Expected a value but was ");
                        G.append(peek());
                        G.append(" at path ");
                        G.append(getPath());
                        throw new IllegalStateException(G.toString());
                    }
                    return Boolean.valueOf(nextBoolean());
                }
                return Double.valueOf(nextDouble());
            }
            return nextString();
        } else {
            LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
            beginObject();
            while (hasNext()) {
                String nextName = nextName();
                Object readJsonValue = readJsonValue();
                Object put = linkedHashTreeMap.put(nextName, readJsonValue);
                if (put != null) {
                    StringBuilder M = wo1.M("Map key '", nextName, "' has multiple values at path ");
                    M.append(getPath());
                    M.append(": ");
                    M.append(put);
                    M.append(" and ");
                    M.append(readJsonValue);
                    throw new JsonDataException(M.toString());
                }
            }
            endObject();
            return linkedHashTreeMap;
        }
    }

    @CheckReturnValue
    public abstract int selectName(Options options) throws IOException;

    @CheckReturnValue
    public abstract int selectString(Options options) throws IOException;

    public final void setFailOnUnknown(boolean z) {
        this.failOnUnknown = z;
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public final <T> void setTag(Class<T> cls, T t) {
        if (cls.isAssignableFrom(t.getClass())) {
            if (this.tags == null) {
                this.tags = new LinkedHashMap();
            }
            this.tags.put(cls, t);
            return;
        }
        StringBuilder G = wo1.G("Tag value must be of type ");
        G.append(cls.getName());
        throw new IllegalArgumentException(G.toString());
    }

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;

    public final JsonEncodingException syntaxError(String str) throws JsonEncodingException {
        StringBuilder L = wo1.L(str, " at path ");
        L.append(getPath());
        throw new JsonEncodingException(L.toString());
    }

    @CheckReturnValue
    @Nullable
    public final <T> T tag(Class<T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    public final JsonDataException typeMismatch(@Nullable Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public JsonReader(JsonReader jsonReader) {
        this.stackSize = jsonReader.stackSize;
        this.scopes = (int[]) jsonReader.scopes.clone();
        this.pathNames = (String[]) jsonReader.pathNames.clone();
        this.pathIndices = (int[]) jsonReader.pathIndices.clone();
        this.lenient = jsonReader.lenient;
        this.failOnUnknown = jsonReader.failOnUnknown;
    }
}