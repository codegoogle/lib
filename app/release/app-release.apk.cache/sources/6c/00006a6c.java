package com.squareup.moshi;

import com.p7700g.p99005.tv5;
import com.p7700g.p99005.uv5;
import com.p7700g.p99005.wo1;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class JsonWriter implements Closeable, Flushable {
    public String indent;
    public boolean lenient;
    public boolean promoteValueToName;
    public boolean serializeNulls;
    private Map<Class<?>, Object> tags;
    public int stackSize = 0;
    public int[] scopes = new int[32];
    public String[] pathNames = new String[32];
    public int[] pathIndices = new int[32];
    public int flattenStackSize = -1;

    @CheckReturnValue
    public static JsonWriter of(tv5 tv5Var) {
        return new JsonUtf8Writer(tv5Var);
    }

    public abstract JsonWriter beginArray() throws IOException;

    @CheckReturnValue
    public final int beginFlatten() {
        int peekScope = peekScope();
        if (peekScope != 5 && peekScope != 3 && peekScope != 2 && peekScope != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.flattenStackSize;
        this.flattenStackSize = this.stackSize;
        return i;
    }

    public abstract JsonWriter beginObject() throws IOException;

    public final boolean checkStack() {
        int i = this.stackSize;
        int[] iArr = this.scopes;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (this instanceof JsonValueWriter) {
                JsonValueWriter jsonValueWriter = (JsonValueWriter) this;
                Object[] objArr = jsonValueWriter.stack;
                jsonValueWriter.stack = Arrays.copyOf(objArr, objArr.length * 2);
                return true;
            }
            return true;
        }
        StringBuilder G = wo1.G("Nesting too deep at ");
        G.append(getPath());
        G.append(": circular reference?");
        throw new JsonDataException(G.toString());
    }

    public abstract JsonWriter endArray() throws IOException;

    public final void endFlatten(int i) {
        this.flattenStackSize = i;
    }

    public abstract JsonWriter endObject() throws IOException;

    @CheckReturnValue
    public final String getIndent() {
        String str = this.indent;
        return str != null ? str : "";
    }

    @CheckReturnValue
    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    @CheckReturnValue
    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    @CheckReturnValue
    public final boolean isLenient() {
        return this.lenient;
    }

    public final JsonWriter jsonValue(@Nullable Object obj) throws IOException {
        String sb;
        if (obj instanceof Map) {
            beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    if (key == null) {
                        sb = "Map keys must be non-null";
                    } else {
                        StringBuilder G = wo1.G("Map keys must be of type String: ");
                        G.append(key.getClass().getName());
                        sb = G.toString();
                    }
                    throw new IllegalArgumentException(sb);
                }
                name((String) key);
                jsonValue(entry.getValue());
            }
            endObject();
        } else if (obj instanceof List) {
            beginArray();
            for (Object obj2 : (List) obj) {
                jsonValue(obj2);
            }
            endArray();
        } else if (obj instanceof String) {
            value((String) obj);
        } else if (obj instanceof Boolean) {
            value(((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            value(((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            value(((Long) obj).longValue());
        } else if (obj instanceof Number) {
            value((Number) obj);
        } else if (obj == null) {
            nullValue();
        } else {
            StringBuilder G2 = wo1.G("Unsupported type: ");
            G2.append(obj.getClass().getName());
            throw new IllegalArgumentException(G2.toString());
        }
        return this;
    }

    public abstract JsonWriter name(String str) throws IOException;

    public abstract JsonWriter nullValue() throws IOException;

    public final int peekScope() {
        int i = this.stackSize;
        if (i != 0) {
            return this.scopes[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void promoteValueToName() throws IOException {
        int peekScope = peekScope();
        if (peekScope != 5 && peekScope != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.promoteValueToName = true;
    }

    public final void pushScope(int i) {
        int[] iArr = this.scopes;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        iArr[i2] = i;
    }

    public final void replaceTop(int i) {
        this.scopes[this.stackSize - 1] = i;
    }

    public void setIndent(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.indent = str;
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public final void setSerializeNulls(boolean z) {
        this.serializeNulls = z;
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

    @CheckReturnValue
    @Nullable
    public final <T> T tag(Class<T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    public abstract JsonWriter value(double d) throws IOException;

    public abstract JsonWriter value(long j) throws IOException;

    public final JsonWriter value(uv5 uv5Var) throws IOException {
        if (!this.promoteValueToName) {
            tv5 valueSink = valueSink();
            try {
                uv5Var.F1(valueSink);
                if (valueSink != null) {
                    valueSink.close();
                }
                return this;
            } catch (Throwable th) {
                if (valueSink != null) {
                    try {
                        valueSink.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        StringBuilder G = wo1.G("BufferedSource cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    public abstract JsonWriter value(@Nullable Boolean bool) throws IOException;

    public abstract JsonWriter value(@Nullable Number number) throws IOException;

    public abstract JsonWriter value(@Nullable String str) throws IOException;

    public abstract JsonWriter value(boolean z) throws IOException;

    @CheckReturnValue
    public abstract tv5 valueSink() throws IOException;
}