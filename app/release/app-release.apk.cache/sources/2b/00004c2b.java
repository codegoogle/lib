package com.p7700g.p99005;

import android.annotation.SuppressLint;
import com.p7700g.p99005.i2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Data.java */
/* loaded from: classes.dex */
public final class kb0 {
    private static final String a = tb0.f("Data");
    public static final kb0 b = new a().a();
    @SuppressLint({"MinMaxConstant"})
    public static final int c = 10240;
    public Map<String, Object> d;

    /* compiled from: Data.java */
    /* loaded from: classes.dex */
    public static final class a {
        private Map<String, Object> a = new HashMap();

        @x1
        public kb0 a() {
            kb0 kb0Var = new kb0(this.a);
            kb0.F(kb0Var);
            return kb0Var;
        }

        @i2({i2.a.LIBRARY_GROUP})
        @x1
        public a b(@x1 String key, @z1 Object value) {
            if (value == null) {
                this.a.put(key, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    if (cls == boolean[].class) {
                        this.a.put(key, kb0.a((boolean[]) value));
                    } else if (cls == byte[].class) {
                        this.a.put(key, kb0.b((byte[]) value));
                    } else if (cls == int[].class) {
                        this.a.put(key, kb0.e((int[]) value));
                    } else if (cls == long[].class) {
                        this.a.put(key, kb0.f((long[]) value));
                    } else if (cls == float[].class) {
                        this.a.put(key, kb0.d((float[]) value));
                    } else if (cls == double[].class) {
                        this.a.put(key, kb0.c((double[]) value));
                    } else {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                    }
                } else {
                    this.a.put(key, value);
                }
            }
            return this;
        }

        @x1
        public a c(@x1 kb0 data) {
            d(data.d);
            return this;
        }

        @x1
        public a d(@x1 Map<String, Object> values) {
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @x1
        public a e(@x1 String key, boolean value) {
            this.a.put(key, Boolean.valueOf(value));
            return this;
        }

        @x1
        public a f(@x1 String key, @x1 boolean[] value) {
            this.a.put(key, kb0.a(value));
            return this;
        }

        @x1
        public a g(@x1 String key, byte value) {
            this.a.put(key, Byte.valueOf(value));
            return this;
        }

        @x1
        public a h(@x1 String key, @x1 byte[] value) {
            this.a.put(key, kb0.b(value));
            return this;
        }

        @x1
        public a i(@x1 String key, double value) {
            this.a.put(key, Double.valueOf(value));
            return this;
        }

        @x1
        public a j(@x1 String key, @x1 double[] value) {
            this.a.put(key, kb0.c(value));
            return this;
        }

        @x1
        public a k(@x1 String key, float value) {
            this.a.put(key, Float.valueOf(value));
            return this;
        }

        @x1
        public a l(@x1 String key, @x1 float[] value) {
            this.a.put(key, kb0.d(value));
            return this;
        }

        @x1
        public a m(@x1 String key, int value) {
            this.a.put(key, Integer.valueOf(value));
            return this;
        }

        @x1
        public a n(@x1 String key, @x1 int[] value) {
            this.a.put(key, kb0.e(value));
            return this;
        }

        @x1
        public a o(@x1 String key, long value) {
            this.a.put(key, Long.valueOf(value));
            return this;
        }

        @x1
        public a p(@x1 String key, @x1 long[] value) {
            this.a.put(key, kb0.f(value));
            return this;
        }

        @x1
        public a q(@x1 String key, @z1 String value) {
            this.a.put(key, value);
            return this;
        }

        @x1
        public a r(@x1 String key, @x1 String[] value) {
            this.a.put(key, value);
            return this;
        }
    }

    public kb0() {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    @p50
    public static byte[] F(@x1 kb0 data) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.D());
                    for (Map.Entry<String, Object> entry : data.d.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException unused3) {
                    objectOutputStream = objectOutputStream2;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused7) {
                    }
                    throw th;
                }
            } catch (IOException unused8) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static Boolean[] a(@x1 boolean[] value) {
        Boolean[] boolArr = new Boolean[value.length];
        for (int i = 0; i < value.length; i++) {
            boolArr[i] = Boolean.valueOf(value[i]);
        }
        return boolArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static Byte[] b(@x1 byte[] value) {
        Byte[] bArr = new Byte[value.length];
        for (int i = 0; i < value.length; i++) {
            bArr[i] = Byte.valueOf(value[i]);
        }
        return bArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static Double[] c(@x1 double[] value) {
        Double[] dArr = new Double[value.length];
        for (int i = 0; i < value.length; i++) {
            dArr[i] = Double.valueOf(value[i]);
        }
        return dArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static Float[] d(@x1 float[] value) {
        Float[] fArr = new Float[value.length];
        for (int i = 0; i < value.length; i++) {
            fArr[i] = Float.valueOf(value[i]);
        }
        return fArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static Integer[] e(@x1 int[] value) {
        Integer[] numArr = new Integer[value.length];
        for (int i = 0; i < value.length; i++) {
            numArr[i] = Integer.valueOf(value[i]);
        }
        return numArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static Long[] f(@x1 long[] value) {
        Long[] lArr = new Long[value.length];
        for (int i = 0; i < value.length; i++) {
            lArr[i] = Long.valueOf(value[i]);
        }
        return lArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static byte[] g(@x1 Byte[] array) {
        byte[] bArr = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            bArr[i] = array[i].byteValue();
        }
        return bArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static double[] h(@x1 Double[] array) {
        double[] dArr = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            dArr[i] = array[i].doubleValue();
        }
        return dArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static float[] i(@x1 Float[] array) {
        float[] fArr = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            fArr[i] = array[i].floatValue();
        }
        return fArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static int[] j(@x1 Integer[] array) {
        int[] iArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            iArr[i] = array[i].intValue();
        }
        return iArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static long[] k(@x1 Long[] array) {
        long[] jArr = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            jArr[i] = array[i].longValue();
        }
        return jArr;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static boolean[] l(@x1 Boolean[] array) {
        boolean[] zArr = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            zArr[i] = array[i].booleanValue();
        }
        return zArr;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x002c -> B:33:0x002c). Please submit an issue!!! */
    @x1
    @p50
    public static kb0 m(@x1 byte[] bytes) {
        ObjectInputStream objectInputStream;
        Throwable th;
        if (bytes.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException | ClassNotFoundException unused) {
                } catch (Throwable th2) {
                    objectInputStream = null;
                    th = th2;
                }
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    objectInputStream.close();
                } catch (IOException | ClassNotFoundException unused2) {
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th = th3;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused4) {
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException unused6) {
                return new kb0(hashMap);
            }
        } else {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
    }

    @z1
    public String A(@x1 String key) {
        Object obj = this.d.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @z1
    public String[] B(@x1 String key) {
        Object obj = this.d.get(key);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean C(@x1 String key, @x1 Class<T> klass) {
        Object obj = this.d.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    @i2({i2.a.LIBRARY_GROUP})
    @r2
    public int D() {
        return this.d.size();
    }

    @x1
    public byte[] E() {
        return F(this);
    }

    public boolean equals(Object o) {
        boolean z;
        if (this == o) {
            return true;
        }
        if (o == null || kb0.class != o.getClass()) {
            return false;
        }
        kb0 kb0Var = (kb0) o;
        Set<String> keySet = this.d.keySet();
        if (keySet.equals(kb0Var.d.keySet())) {
            for (String str : keySet) {
                Object obj = this.d.get(str);
                Object obj2 = kb0Var.d.get(str);
                if (obj == null || obj2 == null) {
                    if (obj == obj2) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
                    continue;
                } else {
                    z = obj.equals(obj2);
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode() * 31;
    }

    public boolean n(@x1 String key, boolean defaultValue) {
        Object obj = this.d.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    @z1
    public boolean[] o(@x1 String key) {
        Object obj = this.d.get(key);
        if (obj instanceof Boolean[]) {
            return l((Boolean[]) obj);
        }
        return null;
    }

    public byte p(@x1 String key, byte defaultValue) {
        Object obj = this.d.get(key);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : defaultValue;
    }

    @z1
    public byte[] q(@x1 String key) {
        Object obj = this.d.get(key);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public double r(@x1 String key, double defaultValue) {
        Object obj = this.d.get(key);
        return obj instanceof Double ? ((Double) obj).doubleValue() : defaultValue;
    }

    @z1
    public double[] s(@x1 String key) {
        Object obj = this.d.get(key);
        if (obj instanceof Double[]) {
            return h((Double[]) obj);
        }
        return null;
    }

    public float t(@x1 String key, float defaultValue) {
        Object obj = this.d.get(key);
        return obj instanceof Float ? ((Float) obj).floatValue() : defaultValue;
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.d.isEmpty()) {
            for (String str : this.d.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.d.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @z1
    public float[] u(@x1 String key) {
        Object obj = this.d.get(key);
        if (obj instanceof Float[]) {
            return i((Float[]) obj);
        }
        return null;
    }

    public int v(@x1 String key, int defaultValue) {
        Object obj = this.d.get(key);
        return obj instanceof Integer ? ((Integer) obj).intValue() : defaultValue;
    }

    @z1
    public int[] w(@x1 String key) {
        Object obj = this.d.get(key);
        if (obj instanceof Integer[]) {
            return j((Integer[]) obj);
        }
        return null;
    }

    @x1
    public Map<String, Object> x() {
        return Collections.unmodifiableMap(this.d);
    }

    public long y(@x1 String key, long defaultValue) {
        Object obj = this.d.get(key);
        return obj instanceof Long ? ((Long) obj).longValue() : defaultValue;
    }

    @z1
    public long[] z(@x1 String key) {
        Object obj = this.d.get(key);
        if (obj instanceof Long[]) {
            return k((Long[]) obj);
        }
        return null;
    }

    public kb0(@x1 kb0 other) {
        this.d = new HashMap(other.d);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public kb0(@x1 Map<String, ?> values) {
        this.d = new HashMap(values);
    }
}