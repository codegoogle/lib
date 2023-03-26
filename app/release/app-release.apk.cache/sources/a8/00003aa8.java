package com.p7700g.p99005;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ColorResourcesTableCreator.java */
/* loaded from: classes3.dex */
public final class bc2 {
    private static final short a = 2;
    private static final short b = 1;
    private static final short c = 512;
    private static final short d = 513;
    private static final short e = 514;
    private static final byte f = 1;
    private static final byte g = Byte.MAX_VALUE;
    private static final String h = "color";
    private static byte i;
    private static final d j = new d(1, pt0.a);
    private static final Comparator<b> k = new a();

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.c - bVar2.c;
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class b {
        private final byte a;
        private final byte b;
        private final short c;
        private final String d;
        @w0
        private final int e;

        public b(int i, String str, int i2) {
            this.d = str;
            this.e = i2;
            this.c = (short) (65535 & i);
            this.b = (byte) ((i >> 16) & 255);
            this.a = (byte) ((i >> 24) & 255);
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class c {
        private static final short a = 288;
        private static final int b = 128;
        private final e c;
        private final d d;
        private final h e = new h(false, "?1", "?2", "?3", "?4", "?5", "color");
        private final h f;
        private final k g;

        public c(d dVar, List<b> list) {
            this.d = dVar;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).d;
            }
            this.f = new h(true, strArr);
            this.g = new k(list);
            this.c = new e(bc2.c, a, a());
        }

        public int a() {
            return this.g.b() + this.f.a() + this.e.a() + com.anythink.expressad.foundation.g.a.aW;
        }

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.c.a(byteArrayOutputStream);
            byteArrayOutputStream.write(bc2.j(this.d.a));
            char[] charArray = this.d.b.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(bc2.h(charArray[i]));
                } else {
                    byteArrayOutputStream.write(bc2.h((char) 0));
                }
            }
            byteArrayOutputStream.write(bc2.j(com.anythink.expressad.foundation.g.a.aW));
            byteArrayOutputStream.write(bc2.j(0));
            byteArrayOutputStream.write(bc2.j(this.e.a() + com.anythink.expressad.foundation.g.a.aW));
            byteArrayOutputStream.write(bc2.j(0));
            byteArrayOutputStream.write(bc2.j(0));
            this.e.c(byteArrayOutputStream);
            this.f.c(byteArrayOutputStream);
            this.g.c(byteArrayOutputStream);
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class d {
        private final int a;
        private final String b;

        public d(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class e {
        private final short a;
        private final short b;
        private final int c;

        public e(short s, short s2, int i) {
            this.a = s;
            this.b = s2;
            this.c = i;
        }

        public void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(bc2.k(this.a));
            byteArrayOutputStream.write(bc2.k(this.b));
            byteArrayOutputStream.write(bc2.j(this.c));
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class f {
        private static final short a = 8;
        private static final short b = 2;
        private static final short c = 8;
        private static final byte d = 28;
        private static final int e = 16;
        private final int f;
        private final int g;

        public f(int i, @w0 int i2) {
            this.f = i;
            this.g = i2;
        }

        public void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(bc2.k((short) 8));
            byteArrayOutputStream.write(bc2.k((short) 2));
            byteArrayOutputStream.write(bc2.j(this.f));
            byteArrayOutputStream.write(bc2.k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, d});
            byteArrayOutputStream.write(bc2.j(this.g));
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class g {
        private static final short a = 12;
        private final e b;
        private final int c;
        private final List<c> e = new ArrayList();
        private final h d = new h(new String[0]);

        public g(Map<d, List<b>> map) {
            this.c = map.size();
            for (Map.Entry<d, List<b>> entry : map.entrySet()) {
                List<b> value = entry.getValue();
                Collections.sort(value, bc2.k);
                this.e.add(new c(entry.getKey(), value));
            }
            this.b = new e((short) 2, (short) 12, a());
        }

        private int a() {
            int i = 0;
            for (c cVar : this.e) {
                i += cVar.a();
            }
            return this.d.a() + 12 + i;
        }

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.b.a(byteArrayOutputStream);
            byteArrayOutputStream.write(bc2.j(this.c));
            this.d.c(byteArrayOutputStream);
            for (c cVar : this.e) {
                cVar.b(byteArrayOutputStream);
            }
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class h {
        private static final short a = 28;
        private static final int b = 256;
        private static final int c = -1;
        private final e d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final List<Integer> i;
        private final List<Integer> j;
        private final List<byte[]> k;
        private final List<List<i>> l;
        private final boolean m;
        private final int n;
        private final int o;

        public h(String... strArr) {
            this(false, strArr);
        }

        private Pair<byte[], List<i>> b(String str) {
            return new Pair<>(this.m ? bc2.m(str) : bc2.l(str), Collections.emptyList());
        }

        public int a() {
            return this.o;
        }

        public void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.d.a(byteArrayOutputStream);
            byteArrayOutputStream.write(bc2.j(this.e));
            byteArrayOutputStream.write(bc2.j(this.f));
            byteArrayOutputStream.write(bc2.j(this.m ? 256 : 0));
            byteArrayOutputStream.write(bc2.j(this.g));
            byteArrayOutputStream.write(bc2.j(this.h));
            for (Integer num : this.i) {
                byteArrayOutputStream.write(bc2.j(num.intValue()));
            }
            for (Integer num2 : this.j) {
                byteArrayOutputStream.write(bc2.j(num2.intValue()));
            }
            for (byte[] bArr : this.k) {
                byteArrayOutputStream.write(bArr);
            }
            int i = this.n;
            if (i > 0) {
                byteArrayOutputStream.write(new byte[i]);
            }
            for (List<i> list : this.l) {
                for (i iVar : list) {
                    iVar.b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(bc2.j(-1));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(boolean z, String... strArr) {
            this.i = new ArrayList();
            this.j = new ArrayList();
            this.k = new ArrayList();
            this.l = new ArrayList();
            this.m = z;
            int i = 0;
            for (String str : strArr) {
                Pair<byte[], List<i>> b2 = b(str);
                this.i.add(Integer.valueOf(i));
                Object obj = b2.first;
                i += ((byte[]) obj).length;
                this.k.add(obj);
                this.l.add(b2.second);
            }
            int i2 = 0;
            for (List<i> list : this.l) {
                for (i iVar : list) {
                    this.i.add(Integer.valueOf(i));
                    i += iVar.a.length;
                    this.k.add(iVar.a);
                }
                this.j.add(Integer.valueOf(i2));
                i2 += (list.size() * 12) + 4;
            }
            int i3 = i % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.n = i4;
            int size = this.k.size();
            this.e = size;
            this.f = this.k.size() - strArr.length;
            boolean z2 = this.k.size() - strArr.length > 0;
            if (!z2) {
                this.j.clear();
                this.l.clear();
            }
            int size2 = (this.j.size() * 4) + (size * 4) + 28;
            this.g = size2;
            int i5 = i + i4;
            this.h = z2 ? size2 + i5 : 0;
            int i6 = size2 + i5 + (z2 ? i2 : 0);
            this.o = i6;
            this.d = new e((short) 1, a, i6);
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class i {
        private byte[] a;
        private int b;
        private int c;
        private int d;

        private i() {
        }

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(bc2.j(this.b));
            byteArrayOutputStream.write(bc2.j(this.c));
            byteArrayOutputStream.write(bc2.j(this.d));
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class j {
        private static final int a = -1;
        private static final short b = 84;
        private static final byte c = 64;
        private final e d;
        private final int e;
        private final byte[] f;
        private final int[] g;
        private final f[] h;

        public j(List<b> list, Set<Short> set, int i) {
            byte[] bArr = new byte[64];
            this.f = bArr;
            this.e = i;
            bArr[0] = c;
            this.h = new f[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.h[i2] = new f(i2, list.get(i2).e);
            }
            this.g = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.g[s] = i3;
                    i3 += 16;
                } else {
                    this.g[s] = -1;
                }
            }
            this.d = new e(bc2.d, b, a());
        }

        private int b() {
            return c() + 84;
        }

        private int c() {
            return this.g.length * 4;
        }

        public int a() {
            return (this.h.length * 16) + b();
        }

        public void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.d.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{bc2.i, 0, 0, 0});
            byteArrayOutputStream.write(bc2.j(this.e));
            byteArrayOutputStream.write(bc2.j(b()));
            byteArrayOutputStream.write(this.f);
            for (int i : this.g) {
                byteArrayOutputStream.write(bc2.j(i));
            }
            for (f fVar : this.h) {
                fVar.a(byteArrayOutputStream);
            }
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* loaded from: classes3.dex */
    public static class k {
        private static final short a = 16;
        private static final int b = 1073741824;
        private final e c;
        private final int d;
        private final int[] e;
        private final j f;

        public k(List<b> list) {
            this.d = list.get(list.size() - 1).c + 1;
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                hashSet.add(Short.valueOf(bVar.c));
            }
            this.e = new int[this.d];
            for (short s = 0; s < this.d; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.e[s] = 1073741824;
                }
            }
            this.c = new e(bc2.e, (short) 16, a());
            this.f = new j(list, hashSet, this.d);
        }

        private int a() {
            return (this.d * 4) + 16;
        }

        public int b() {
            return this.f.a() + a();
        }

        public void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.c.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{bc2.i, 0, 0, 0});
            byteArrayOutputStream.write(bc2.j(this.d));
            for (int i : this.e) {
                byteArrayOutputStream.write(bc2.j(i));
            }
            this.f.d(byteArrayOutputStream);
        }
    }

    private bc2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] h(char c2) {
        return new byte[]{(byte) (c2 & 255), (byte) ((c2 >> '\b') & 255)};
    }

    public static byte[] i(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (!map.entrySet().isEmpty()) {
            d dVar2 = new d(127, context.getPackageName());
            HashMap hashMap = new HashMap();
            b bVar = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                b bVar2 = new b(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
                if (context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                    if (bVar2.a != 1) {
                        if (bVar2.a != Byte.MAX_VALUE) {
                            StringBuilder G = wo1.G("Not supported with unknown package id: ");
                            G.append((int) bVar2.a);
                            throw new IllegalArgumentException(G.toString());
                        }
                        dVar = dVar2;
                    } else {
                        dVar = j;
                    }
                    if (!hashMap.containsKey(dVar)) {
                        hashMap.put(dVar, new ArrayList());
                    }
                    ((List) hashMap.get(dVar)).add(bVar2);
                    bVar = bVar2;
                } else {
                    StringBuilder G2 = wo1.G("Non color resource found: name=");
                    G2.append(bVar2.d);
                    G2.append(", typeId=");
                    G2.append(Integer.toHexString(bVar2.b & 255));
                    throw new IllegalArgumentException(G2.toString());
                }
            }
            byte b2 = bVar.b;
            i = b2;
            if (b2 != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new g(hashMap).b(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] j(int i2) {
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] k(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] l(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] k2 = k((short) charArray.length);
        bArr[0] = k2[0];
        bArr[1] = k2[1];
        for (int i2 = 0; i2 < charArray.length; i2++) {
            byte[] h2 = h(charArray[i2]);
            int i3 = i2 * 2;
            bArr[i3 + 2] = h2[0];
            bArr[i3 + 3] = h2[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}