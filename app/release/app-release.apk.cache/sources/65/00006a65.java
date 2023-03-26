package com.squareup.moshi;

import com.p7700g.p99005.f14;
import com.p7700g.p99005.jw5;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.sv5;
import com.p7700g.p99005.tv5;
import com.p7700g.p99005.vw5;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zw5;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class JsonUtf8Writer extends JsonWriter {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private String deferredName;
    private String separator = ":";
    private final tv5 sink;

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public JsonUtf8Writer(tv5 tv5Var) {
        Objects.requireNonNull(tv5Var, "sink == null");
        this.sink = tv5Var;
        pushScope(6);
    }

    private void beforeName() throws IOException {
        int peekScope = peekScope();
        if (peekScope == 5) {
            this.sink.g0(44);
        } else if (peekScope != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int peekScope = peekScope();
        int i = 7;
        if (peekScope != 1) {
            if (peekScope == 2) {
                this.sink.g0(44);
            } else {
                if (peekScope == 4) {
                    i = 5;
                    this.sink.K0(this.separator);
                } else if (peekScope == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else {
                    if (peekScope != 6) {
                        if (peekScope == 7) {
                            if (!this.lenient) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                }
                replaceTop(i);
            }
        }
        newline();
        i = 2;
        replaceTop(i);
    }

    private JsonWriter close(int i, int i2, char c) throws IOException {
        int peekScope = peekScope();
        if (peekScope != i2 && peekScope != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName == null) {
            int i3 = this.stackSize;
            int i4 = this.flattenStackSize;
            if (i3 == (~i4)) {
                this.flattenStackSize = ~i4;
                return this;
            }
            int i5 = i3 - 1;
            this.stackSize = i5;
            this.pathNames[i5] = null;
            int[] iArr = this.pathIndices;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (peekScope == i2) {
                newline();
            }
            this.sink.g0(c);
            return this;
        }
        StringBuilder G = wo1.G("Dangling name: ");
        G.append(this.deferredName);
        throw new IllegalStateException(G.toString());
    }

    private void newline() throws IOException {
        if (this.indent == null) {
            return;
        }
        this.sink.g0(10);
        int i = this.stackSize;
        for (int i2 = 1; i2 < i; i2++) {
            this.sink.K0(this.indent);
        }
    }

    private JsonWriter open(int i, int i2, char c) throws IOException {
        int i3 = this.stackSize;
        int i4 = this.flattenStackSize;
        if (i3 == i4) {
            int[] iArr = this.scopes;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.flattenStackSize = ~i4;
                return this;
            }
        }
        beforeValue();
        checkStack();
        pushScope(i);
        this.pathIndices[this.stackSize - 1] = 0;
        this.sink.g0(c);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void string(tv5 tv5Var, String str) throws IOException {
        int i;
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        tv5Var.g0(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    tv5Var.a1(str, i2, i);
                }
                tv5Var.K0(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                tv5Var.K0(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            tv5Var.a1(str, i2, length);
        }
        tv5Var.g0(34);
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.sink, this.deferredName);
            this.deferredName = null;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginArray() throws IOException {
        if (!this.promoteValueToName) {
            writeDeferredName();
            return open(1, 2, f14.u);
        }
        StringBuilder G = wo1.G("Array cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginObject() throws IOException {
        if (!this.promoteValueToName) {
            writeDeferredName();
            return open(3, 5, '{');
        }
        StringBuilder G = wo1.G("Object cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endArray() throws IOException {
        return close(1, 2, f14.v);
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endObject() throws IOException {
        this.promoteValueToName = false;
        return close(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.stackSize != 0) {
            this.sink.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.stackSize != 0) {
            int peekScope = peekScope();
            if ((peekScope == 3 || peekScope == 5) && this.deferredName == null && !this.promoteValueToName) {
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
            if (this.deferredName != null) {
                if (this.serializeNulls) {
                    writeDeferredName();
                } else {
                    this.deferredName = null;
                    return this;
                }
            }
            beforeValue();
            this.sink.K0(pg1.d);
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder G = wo1.G("null cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // com.squareup.moshi.JsonWriter
    public void setIndent(String str) {
        super.setIndent(str);
        this.separator = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(str);
        }
        writeDeferredName();
        beforeValue();
        string(this.sink, str);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public tv5 valueSink() throws IOException {
        if (!this.promoteValueToName) {
            writeDeferredName();
            beforeValue();
            pushScope(9);
            return jw5.c(new vw5() { // from class: com.squareup.moshi.JsonUtf8Writer.1
                @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    if (JsonUtf8Writer.this.peekScope() == 9) {
                        JsonUtf8Writer jsonUtf8Writer = JsonUtf8Writer.this;
                        int i = jsonUtf8Writer.stackSize - 1;
                        jsonUtf8Writer.stackSize = i;
                        int[] iArr = jsonUtf8Writer.pathIndices;
                        int i2 = i - 1;
                        iArr[i2] = iArr[i2] + 1;
                        return;
                    }
                    throw new AssertionError();
                }

                @Override // com.p7700g.p99005.vw5, java.io.Flushable
                public void flush() throws IOException {
                    JsonUtf8Writer.this.sink.flush();
                }

                @Override // com.p7700g.p99005.vw5
                public zw5 timeout() {
                    return zw5.a;
                }

                @Override // com.p7700g.p99005.vw5
                public void write(sv5 sv5Var, long j) throws IOException {
                    JsonUtf8Writer.this.sink.write(sv5Var, j);
                }
            });
        }
        StringBuilder G = wo1.G("BufferedSink cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        if (!this.promoteValueToName) {
            writeDeferredName();
            beforeValue();
            this.sink.K0(z ? "true" : "false");
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder G = wo1.G("Boolean cannot be used as a map key in JSON at path ");
        G.append(getPath());
        throw new IllegalStateException(G.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.sink.close();
        int i = this.stackSize;
        if (i <= 1 && (i != 1 || this.scopes[i - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        return value(bool.booleanValue());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(double d) throws IOException {
        if (!this.lenient && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(Double.toString(d));
        } else {
            writeDeferredName();
            beforeValue();
            this.sink.K0(Double.toString(d));
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
        writeDeferredName();
        beforeValue();
        this.sink.K0(Long.toString(j));
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(@Nullable Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        String obj = number.toString();
        if (!this.lenient && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(obj);
        } else {
            writeDeferredName();
            beforeValue();
            this.sink.K0(obj);
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }
}