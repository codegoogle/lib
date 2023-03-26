package com.p7700g.p99005;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes3.dex */
public final class hq2 implements vp2, xp2 {
    private hq2 a = null;
    private boolean b = true;
    private final JsonWriter c;
    private final Map<Class<?>, up2<?>> d;
    private final Map<Class<?>, wp2<?>> e;
    private final up2<Object> f;
    private final boolean g;

    public hq2(@x1 Writer writer, @x1 Map<Class<?>, up2<?>> map, @x1 Map<Class<?>, wp2<?>> map2, up2<Object> up2Var, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = up2Var;
        this.g = z;
    }

    private boolean n(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private hq2 q(@x1 String str, @z1 Object obj) throws IOException, sp2 {
        s();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        return e(obj, false);
    }

    private hq2 r(@x1 String str, @z1 Object obj) throws IOException, sp2 {
        if (obj == null) {
            return this;
        }
        s();
        this.c.name(str);
        return e(obj, false);
    }

    private void s() throws IOException {
        if (this.b) {
            hq2 hq2Var = this.a;
            if (hq2Var != null) {
                hq2Var.s();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    /* renamed from: a */
    public hq2 add(double d) throws IOException {
        s();
        this.c.value(d);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    /* renamed from: b */
    public hq2 add(float f) throws IOException {
        s();
        this.c.value(f);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    /* renamed from: c */
    public hq2 add(int i) throws IOException {
        s();
        this.c.value(i);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    /* renamed from: d */
    public hq2 add(long j) throws IOException {
        s();
        this.c.value(j);
        return this;
    }

    @x1
    public hq2 e(@z1 Object obj, boolean z) throws IOException {
        int[] iArr;
        int i = 0;
        if (z && n(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new sp2(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    add(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    e(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    e(obj2, false);
                }
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.c.beginArray();
            for (Object obj3 : (Collection) obj) {
                e(obj3, false);
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    add((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new sp2(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.c.endObject();
            return this;
        } else {
            up2<?> up2Var = this.d.get(obj.getClass());
            if (up2Var != null) {
                return p(up2Var, obj, z);
            }
            wp2<?> wp2Var = this.e.get(obj.getClass());
            if (wp2Var != null) {
                wp2Var.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                add(((Enum) obj).name());
                return this;
            } else {
                return p(this.f, obj, z);
            }
        }
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    /* renamed from: f */
    public hq2 add(@z1 String str) throws IOException {
        s();
        this.c.value(str);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    /* renamed from: g */
    public hq2 add(@x1 String str, double d) throws IOException {
        s();
        this.c.name(str);
        return add(d);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    /* renamed from: h */
    public hq2 add(@x1 String str, int i) throws IOException {
        s();
        this.c.name(str);
        return add(i);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    /* renamed from: i */
    public hq2 add(@x1 String str, long j) throws IOException {
        s();
        this.c.name(str);
        return add(j);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 inline(@z1 Object obj) throws IOException {
        return e(obj, true);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    /* renamed from: j */
    public hq2 add(@x1 String str, @z1 Object obj) throws IOException {
        if (this.g) {
            return r(str, obj);
        }
        return q(str, obj);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    /* renamed from: k */
    public hq2 add(@x1 String str, boolean z) throws IOException {
        s();
        this.c.name(str);
        return add(z);
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    /* renamed from: l */
    public hq2 add(boolean z) throws IOException {
        s();
        this.c.value(z);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    /* renamed from: m */
    public hq2 add(@z1 byte[] bArr) throws IOException {
        s();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 nested(@x1 String str) throws IOException {
        s();
        this.a = new hq2(this);
        this.c.name(str);
        this.c.beginObject();
        return this.a;
    }

    public void o() throws IOException {
        s();
        this.c.flush();
    }

    public hq2 p(up2<Object> up2Var, Object obj, boolean z) throws IOException {
        if (!z) {
            this.c.beginObject();
        }
        up2Var.encode(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 nested(@x1 tp2 tp2Var) throws IOException {
        return nested(tp2Var.b());
    }

    private hq2(hq2 hq2Var) {
        this.c = hq2Var.c;
        this.d = hq2Var.d;
        this.e = hq2Var.e;
        this.f = hq2Var.f;
        this.g = hq2Var.g;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 add(@x1 tp2 tp2Var, @z1 Object obj) throws IOException {
        return add(tp2Var.b(), obj);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 add(@x1 tp2 tp2Var, float f) throws IOException {
        return add(tp2Var.b(), f);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 add(@x1 tp2 tp2Var, double d) throws IOException {
        return add(tp2Var.b(), d);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 add(@x1 tp2 tp2Var, int i) throws IOException {
        return add(tp2Var.b(), i);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 add(@x1 tp2 tp2Var, long j) throws IOException {
        return add(tp2Var.b(), j);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public vp2 add(@x1 tp2 tp2Var, boolean z) throws IOException {
        return add(tp2Var.b(), z);
    }
}