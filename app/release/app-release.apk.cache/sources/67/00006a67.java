package com.squareup.moshi;

import com.p7700g.p99005.pg1;
import com.p7700g.p99005.sv5;
import com.p7700g.p99005.uv5;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class JsonValueReader extends JsonReader {
    private static final Object JSON_READER_CLOSED = new Object();
    private Object[] stack;

    /* loaded from: classes3.dex */
    public static final class JsonIterator implements Iterator<Object>, Cloneable {
        public final Object[] array;
        public final JsonReader.Token endToken;
        public int next;

        public JsonIterator(JsonReader.Token token, Object[] objArr, int i) {
            this.endToken = token;
            this.array = objArr;
            this.next = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next < this.array.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.array;
            int i = this.next;
            this.next = i + 1;
            return objArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: clone */
        public JsonIterator m4clone() {
            return new JsonIterator(this.endToken, this.array, this.next);
        }
    }

    public JsonValueReader(Object obj) {
        int[] iArr = this.scopes;
        int i = this.stackSize;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.stack = objArr;
        this.stackSize = i + 1;
        objArr[i] = obj;
    }

    private void push(Object obj) {
        int i = this.stackSize;
        if (i == this.stack.length) {
            if (i != 256) {
                int[] iArr = this.scopes;
                this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.pathNames;
                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.pathIndices;
                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
                Object[] objArr = this.stack;
                this.stack = Arrays.copyOf(objArr, objArr.length * 2);
            } else {
                StringBuilder G = wo1.G("Nesting too deep at ");
                G.append(getPath());
                throw new JsonDataException(G.toString());
            }
        }
        Object[] objArr2 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        objArr2[i2] = obj;
    }

    private void remove() {
        int i = this.stackSize - 1;
        this.stackSize = i;
        Object[] objArr = this.stack;
        objArr[i] = null;
        this.scopes[i] = 0;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            Object obj = objArr[i - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    push(it.next());
                }
            }
        }
    }

    @Nullable
    private <T> T require(Class<T> cls, JsonReader.Token token) throws IOException {
        int i = this.stackSize;
        Object obj = i != 0 ? this.stack[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj == JSON_READER_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw typeMismatch(obj, token);
    }

    private String stringKey(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw typeMismatch(key, JsonReader.Token.NAME);
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginArray() throws IOException {
        List list = (List) require(List.class, JsonReader.Token.BEGIN_ARRAY);
        JsonIterator jsonIterator = new JsonIterator(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.stack;
        int i = this.stackSize;
        objArr[i - 1] = jsonIterator;
        this.scopes[i - 1] = 1;
        this.pathIndices[i - 1] = 0;
        if (jsonIterator.hasNext()) {
            push(jsonIterator.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginObject() throws IOException {
        Map map = (Map) require(Map.class, JsonReader.Token.BEGIN_OBJECT);
        JsonIterator jsonIterator = new JsonIterator(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.stack;
        int i = this.stackSize;
        objArr[i - 1] = jsonIterator;
        this.scopes[i - 1] = 3;
        if (jsonIterator.hasNext()) {
            push(jsonIterator.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Arrays.fill(this.stack, 0, this.stackSize, (Object) null);
        this.stack[0] = JSON_READER_CLOSED;
        this.scopes[0] = 8;
        this.stackSize = 1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void endArray() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        JsonIterator jsonIterator = (JsonIterator) require(JsonIterator.class, token);
        if (jsonIterator.endToken == token && !jsonIterator.hasNext()) {
            remove();
            return;
        }
        throw typeMismatch(jsonIterator, token);
    }

    @Override // com.squareup.moshi.JsonReader
    public void endObject() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        JsonIterator jsonIterator = (JsonIterator) require(JsonIterator.class, token);
        if (jsonIterator.endToken == token && !jsonIterator.hasNext()) {
            this.pathNames[this.stackSize - 1] = null;
            remove();
            return;
        }
        throw typeMismatch(jsonIterator, token);
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int i = this.stackSize;
        if (i == 0) {
            return false;
        }
        Object obj = this.stack[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        remove();
        return ((Boolean) require(Boolean.class, JsonReader.Token.BOOLEAN)).booleanValue();
    }

    @Override // com.squareup.moshi.JsonReader
    public double nextDouble() throws IOException {
        double parseDouble;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object require = require(Object.class, token);
        if (require instanceof Number) {
            parseDouble = ((Number) require).doubleValue();
        } else if (require instanceof String) {
            try {
                parseDouble = Double.parseDouble((String) require);
            } catch (NumberFormatException unused) {
                throw typeMismatch(require, JsonReader.Token.NUMBER);
            }
        } else {
            throw typeMismatch(require, token);
        }
        if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        }
        remove();
        return parseDouble;
    }

    @Override // com.squareup.moshi.JsonReader
    public int nextInt() throws IOException {
        int intValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object require = require(Object.class, token);
        if (require instanceof Number) {
            intValueExact = ((Number) require).intValue();
        } else if (require instanceof String) {
            try {
                try {
                    intValueExact = Integer.parseInt((String) require);
                } catch (NumberFormatException unused) {
                    intValueExact = new BigDecimal((String) require).intValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw typeMismatch(require, JsonReader.Token.NUMBER);
            }
        } else {
            throw typeMismatch(require, token);
        }
        remove();
        return intValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public long nextLong() throws IOException {
        long longValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object require = require(Object.class, token);
        if (require instanceof Number) {
            longValueExact = ((Number) require).longValue();
        } else if (require instanceof String) {
            try {
                try {
                    longValueExact = Long.parseLong((String) require);
                } catch (NumberFormatException unused) {
                    longValueExact = new BigDecimal((String) require).longValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw typeMismatch(require, JsonReader.Token.NUMBER);
            }
        } else {
            throw typeMismatch(require, token);
        }
        remove();
        return longValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextName() throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) require(Map.Entry.class, JsonReader.Token.NAME);
        String stringKey = stringKey(entry);
        this.stack[this.stackSize - 1] = entry.getValue();
        this.pathNames[this.stackSize - 2] = stringKey;
        return stringKey;
    }

    @Override // com.squareup.moshi.JsonReader
    @Nullable
    public <T> T nextNull() throws IOException {
        require(Void.class, JsonReader.Token.NULL);
        remove();
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public uv5 nextSource() throws IOException {
        Object readJsonValue = readJsonValue();
        sv5 sv5Var = new sv5();
        JsonWriter of = JsonWriter.of(sv5Var);
        try {
            of.jsonValue(readJsonValue);
            of.close();
            return sv5Var;
        } catch (Throwable th) {
            if (of != null) {
                try {
                    of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextString() throws IOException {
        int i = this.stackSize;
        String str = i != 0 ? this.stack[i - 1] : null;
        if (str instanceof String) {
            remove();
            return str;
        } else if (str instanceof Number) {
            remove();
            return str.toString();
        } else if (str == JSON_READER_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        } else {
            throw typeMismatch(str, JsonReader.Token.STRING);
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int i = this.stackSize;
        if (i == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.stack[i - 1];
        if (obj instanceof JsonIterator) {
            return ((JsonIterator) obj).endToken;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj == JSON_READER_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw typeMismatch(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader peekJson() {
        return new JsonValueReader(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public void promoteNameToValue() throws IOException {
        if (hasNext()) {
            push(nextName());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectName(JsonReader.Options options) throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) require(Map.Entry.class, JsonReader.Token.NAME);
        String stringKey = stringKey(entry);
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (options.strings[i].equals(stringKey)) {
                this.stack[this.stackSize - 1] = entry.getValue();
                this.pathNames[this.stackSize - 2] = stringKey;
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[]] */
    @Override // com.squareup.moshi.JsonReader
    public int selectString(JsonReader.Options options) throws IOException {
        int i = this.stackSize;
        String str = i != 0 ? this.stack[i - 1] : null;
        if (!(str instanceof String)) {
            if (str != JSON_READER_CLOSED) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str2 = str;
        int length = options.strings.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (options.strings[i2].equals(str2)) {
                remove();
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipName() throws IOException {
        if (!this.failOnUnknown) {
            this.stack[this.stackSize - 1] = ((Map.Entry) require(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.pathNames[this.stackSize - 2] = pg1.d;
            return;
        }
        JsonReader.Token peek = peek();
        nextName();
        throw new JsonDataException("Cannot skip unexpected " + peek + " at " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipValue() throws IOException {
        if (!this.failOnUnknown) {
            int i = this.stackSize;
            if (i > 1) {
                this.pathNames[i - 2] = pg1.d;
            }
            Object obj = i != 0 ? this.stack[i - 1] : null;
            if (!(obj instanceof JsonIterator)) {
                if (obj instanceof Map.Entry) {
                    Object[] objArr = this.stack;
                    objArr[i - 1] = ((Map.Entry) objArr[i - 1]).getValue();
                    return;
                } else if (i > 0) {
                    remove();
                    return;
                } else {
                    StringBuilder G = wo1.G("Expected a value but was ");
                    G.append(peek());
                    G.append(" at path ");
                    G.append(getPath());
                    throw new JsonDataException(G.toString());
                }
            }
            StringBuilder G2 = wo1.G("Expected a value but was ");
            G2.append(peek());
            G2.append(" at path ");
            G2.append(getPath());
            throw new JsonDataException(G2.toString());
        }
        StringBuilder G3 = wo1.G("Cannot skip unexpected ");
        G3.append(peek());
        G3.append(" at ");
        G3.append(getPath());
        throw new JsonDataException(G3.toString());
    }

    public JsonValueReader(JsonValueReader jsonValueReader) {
        super(jsonValueReader);
        this.stack = (Object[]) jsonValueReader.stack.clone();
        for (int i = 0; i < this.stackSize; i++) {
            Object[] objArr = this.stack;
            if (objArr[i] instanceof JsonIterator) {
                objArr[i] = ((JsonIterator) objArr[i]).m4clone();
            }
        }
    }
}