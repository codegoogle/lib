package com.squareup.moshi;

import com.p7700g.p99005.aw5;
import com.p7700g.p99005.jw5;
import com.p7700g.p99005.sv5;
import com.p7700g.p99005.tv5;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class JsonValueWriter extends JsonWriter {
    @Nullable
    private String deferredName;
    public Object[] stack = new Object[32];

    public JsonValueWriter() {
        pushScope(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JsonValueWriter add(@Nullable Object obj) {
        String str;
        Object put;
        int peekScope = peekScope();
        int i = this.stackSize;
        if (i == 1) {
            if (peekScope == 6) {
                this.scopes[i - 1] = 7;
                this.stack[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (peekScope != 3 || (str = this.deferredName) == null) {
            if (peekScope != 1) {
                if (peekScope == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.stack[i - 1]).add(obj);
        } else if ((obj == null && !this.serializeNulls) || (put = ((Map) this.stack[i - 1]).put(str, obj)) == null) {
            this.deferredName = null;
        } else {
            StringBuilder G = wo1.G("Map key '");
            G.append(this.deferredName);
            G.append("' has multiple values at path ");
            G.append(getPath());
            G.append(": ");
            G.append(put);
            G.append(" and ");
            G.append(obj);
            throw new IllegalArgumentException(G.toString());
        }
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginArray() throws IOException {
        if (!this.promoteValueToName) {
            int i = this.stackSize;
            int i2 = this.flattenStackSize;
            if (i == i2 && this.scopes[i - 1] == 1) {
                this.flattenStackSize = ~i2;
                return this;
            }
            checkStack();
            ArrayList arrayList = new ArrayList();
            add(arrayList);
            Object[] objArr = this.stack;
            int i3 = this.stackSize;
            objArr[i3] = arrayList;
            this.pathIndices[i3] = 0;
            pushScope(1);
            return this;
        }
        StringBuilder G = wo1.G("Array cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginObject() throws IOException {
        if (!this.promoteValueToName) {
            int i = this.stackSize;
            int i2 = this.flattenStackSize;
            if (i == i2 && this.scopes[i - 1] == 3) {
                this.flattenStackSize = ~i2;
                return this;
            }
            checkStack();
            LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
            add(linkedHashTreeMap);
            this.stack[this.stackSize] = linkedHashTreeMap;
            pushScope(3);
            return this;
        }
        StringBuilder G = wo1.G("Object cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.stackSize;
        if (i <= 1 && (i != 1 || this.scopes[i - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (peekScope() == 1) {
            int i = this.stackSize;
            int i2 = this.flattenStackSize;
            if (i == (~i2)) {
                this.flattenStackSize = ~i2;
                return this;
            }
            int i3 = i - 1;
            this.stackSize = i3;
            this.stack[i3] = null;
            int[] iArr = this.pathIndices;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (peekScope() == 3) {
            if (this.deferredName == null) {
                int i = this.stackSize;
                int i2 = this.flattenStackSize;
                if (i == (~i2)) {
                    this.flattenStackSize = ~i2;
                    return this;
                }
                this.promoteValueToName = false;
                int i3 = i - 1;
                this.stackSize = i3;
                this.stack[i3] = null;
                this.pathNames[i3] = null;
                int[] iArr = this.pathIndices;
                int i4 = i3 - 1;
                iArr[i4] = iArr[i4] + 1;
                return this;
            }
            StringBuilder G = wo1.G("Dangling name: ");
            G.append(this.deferredName);
            throw new IllegalStateException(G.toString());
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.stackSize != 0) {
            if (peekScope() == 3 && this.deferredName == null && !this.promoteValueToName) {
                this.deferredName = str;
                this.pathNames[this.stackSize - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter nullValue() throws IOException {
        if (!this.promoteValueToName) {
            add(null);
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder G = wo1.G("null cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    public Object root() {
        int i = this.stackSize;
        if (i <= 1 && (i != 1 || this.scopes[i - 1] == 7)) {
            return this.stack[0];
        }
        throw new IllegalStateException("Incomplete document");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(@Nullable String str) throws IOException {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(str);
        }
        add(str);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public tv5 valueSink() {
        if (!this.promoteValueToName) {
            if (peekScope() != 9) {
                pushScope(9);
                final sv5 sv5Var = new sv5();
                return jw5.c(new aw5(sv5Var) { // from class: com.squareup.moshi.JsonValueWriter.1
                    @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        if (JsonValueWriter.this.peekScope() == 9) {
                            JsonValueWriter jsonValueWriter = JsonValueWriter.this;
                            Object[] objArr = jsonValueWriter.stack;
                            int i = jsonValueWriter.stackSize;
                            if (objArr[i] == null) {
                                jsonValueWriter.stackSize = i - 1;
                                Object readJsonValue = JsonReader.of(sv5Var).readJsonValue();
                                JsonValueWriter jsonValueWriter2 = JsonValueWriter.this;
                                boolean z = jsonValueWriter2.serializeNulls;
                                jsonValueWriter2.serializeNulls = true;
                                try {
                                    jsonValueWriter2.add(readJsonValue);
                                    JsonValueWriter jsonValueWriter3 = JsonValueWriter.this;
                                    jsonValueWriter3.serializeNulls = z;
                                    int[] iArr = jsonValueWriter3.pathIndices;
                                    int i2 = jsonValueWriter3.stackSize - 1;
                                    iArr[i2] = iArr[i2] + 1;
                                    return;
                                } catch (Throwable th) {
                                    JsonValueWriter.this.serializeNulls = z;
                                    throw th;
                                }
                            }
                        }
                        throw new AssertionError();
                    }
                });
            }
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        StringBuilder G = wo1.G("BufferedSink cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        if (!this.promoteValueToName) {
            add(Boolean.valueOf(z));
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder G = wo1.G("Boolean cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(@Nullable Boolean bool) throws IOException {
        if (!this.promoteValueToName) {
            add(bool);
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder G = wo1.G("Boolean cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(double d) throws IOException {
        if (!this.lenient && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(Double.toString(d));
        } else {
            add(Double.valueOf(d));
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(long j) throws IOException {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(Long.toString(j));
        }
        add(Long.valueOf(j));
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(@Nullable Number number) throws IOException {
        if (!(number instanceof Byte) && !(number instanceof Short) && !(number instanceof Integer) && !(number instanceof Long)) {
            if ((number instanceof Float) || (number instanceof Double)) {
                return value(number.doubleValue());
            }
            if (number == null) {
                return nullValue();
            }
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.promoteValueToName) {
                this.promoteValueToName = false;
                return name(bigDecimal.toString());
            }
            add(bigDecimal);
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        return value(number.longValue());
    }
}