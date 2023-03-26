package com.google.gson;

import com.p7700g.p99005.ex2;
import com.p7700g.p99005.fx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.uv2;
import com.p7700g.p99005.vv2;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes3.dex */
public abstract class TypeAdapter<T> {
    public final T fromJson(Reader reader) throws IOException {
        return read(new nx2(reader));
    }

    public final T fromJsonTree(uv2 uv2Var) {
        try {
            return read(new ex2(uv2Var));
        } catch (IOException e) {
            throw new vv2(e);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public T read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return (T) TypeAdapter.this.read(nx2Var);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(qx2 qx2Var, T t) throws IOException {
                if (t == null) {
                    qx2Var.w();
                } else {
                    TypeAdapter.this.write(qx2Var, t);
                }
            }
        };
    }

    public abstract T read(nx2 nx2Var) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
        write(new qx2(writer), t);
    }

    public final uv2 toJsonTree(T t) {
        try {
            fx2 fx2Var = new fx2();
            write(fx2Var, t);
            return fx2Var.K1();
        } catch (IOException e) {
            throw new vv2(e);
        }
    }

    public abstract void write(qx2 qx2Var, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}