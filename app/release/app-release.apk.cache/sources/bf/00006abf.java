package okhttp3.internal.publicsuffix;

import com.anythink.basead.d.g;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.au5;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.c95;
import com.p7700g.p99005.ew5;
import com.p7700g.p99005.is4;
import com.p7700g.p99005.js4;
import com.p7700g.p99005.jw5;
import com.p7700g.p99005.o75;
import com.p7700g.p99005.rs4;
import com.p7700g.p99005.sr5;
import com.p7700g.p99005.tm4;
import com.p7700g.p99005.uv5;
import com.p7700g.p99005.ux4;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.yq4;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PublicSuffixDatabase.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\fJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "i", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "d", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p7700g/p99005/yq4;", g.i, "()V", "f", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "h", "([B[B)V", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "j", "[B", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "<init>", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    @NotNull
    public static final String a = "publicsuffixes.gz";
    private static final char d = '!';
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final CountDownLatch h = new CountDownLatch(1);
    private byte[] i;
    private byte[] j;
    public static final a f = new a(null);
    private static final byte[] b = {(byte) 42};
    private static final List<String> c = is4.l(tm4.g);
    private static final PublicSuffixDatabase e = new PublicSuffixDatabase();

    /* compiled from: PublicSuffixDatabase.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"okhttp3/internal/publicsuffix/PublicSuffixDatabase$a", "", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int b;
            int b2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != ((byte) 10)) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        b = 46;
                        z = false;
                    } else {
                        z = z2;
                        b = sr5.b(bArr2[i8][i9], 255);
                    }
                    b2 = b - sr5.b(bArr[i5 + i10], 255);
                    if (b2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else if (i8 == bArr2.length - 1) {
                        break;
                    } else {
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (b2 >= 0) {
                    if (b2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                c25.o(charset, "UTF_8");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ byte[] b(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.i;
        if (bArr == null) {
            c25.S("publicSuffixListBytes");
        }
        return bArr;
    }

    private final List<String> d(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> F;
        List<String> F2;
        if (!this.g.get() && this.g.compareAndSet(false, true)) {
            g();
        } else {
            try {
                this.h.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.i != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                String str4 = list.get(i);
                Charset charset = StandardCharsets.UTF_8;
                c25.o(charset, "UTF_8");
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str4.getBytes(charset);
                c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                str = null;
                if (i2 >= size) {
                    str2 = null;
                    break;
                }
                a aVar = f;
                byte[] bArr2 = this.i;
                if (bArr2 == null) {
                    c25.S("publicSuffixListBytes");
                }
                str2 = aVar.b(bArr2, bArr, i2);
                if (str2 != null) {
                    break;
                }
                i2++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    bArr3[i3] = b;
                    a aVar2 = f;
                    byte[] bArr4 = this.i;
                    if (bArr4 == null) {
                        c25.S("publicSuffixListBytes");
                    }
                    String b2 = aVar2.b(bArr4, bArr3, i3);
                    if (b2 != null) {
                        str3 = b2;
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    a aVar3 = f;
                    byte[] bArr5 = this.j;
                    if (bArr5 == null) {
                        c25.S("publicSuffixExceptionListBytes");
                    }
                    String b3 = aVar3.b(bArr5, bArr, i5);
                    if (b3 != null) {
                        str = b3;
                        break;
                    }
                    i5++;
                }
            }
            if (str != null) {
                return c95.S4(d + str, new char[]{'.'}, false, 0, 6, null);
            } else if (str2 == null && str3 == null) {
                return c;
            } else {
                if (str2 == null || (F = c95.S4(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
                    F = js4.F();
                }
                if (str3 == null || (F2 = c95.S4(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
                    F2 = js4.F();
                }
                return F.size() > F2.size() ? F : F2;
            }
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    private final void f() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(a);
        if (resourceAsStream == null) {
            return;
        }
        uv5 d2 = jw5.d(new ew5(jw5.s(resourceAsStream)));
        try {
            byte[] r1 = d2.r1(d2.readInt());
            byte[] r12 = d2.r1(d2.readInt());
            yq4 yq4Var = yq4.a;
            ux4.a(d2, null);
            synchronized (this) {
                c25.m(r1);
                this.i = r1;
                c25.m(r12);
                this.j = r12;
            }
            this.h.countDown();
        } finally {
        }
    }

    private final void g() {
        boolean z = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    au5.e.g().m("Failed to read public suffix list", 5, e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> i(String str) {
        List<String> S4 = c95.S4(str, new char[]{'.'}, false, 0, 6, null);
        return c25.g((String) rs4.k3(S4), "") ? rs4.Y1(S4, 1) : S4;
    }

    @Nullable
    public final String e(@NotNull String str) {
        int size;
        int size2;
        c25.p(str, "domain");
        String unicode = IDN.toUnicode(str);
        c25.o(unicode, "unicodeDomain");
        List<String> i = i(unicode);
        List<String> d2 = d(i);
        if (i.size() != d2.size() || d2.get(0).charAt(0) == '!') {
            if (d2.get(0).charAt(0) == '!') {
                size = i.size();
                size2 = d2.size();
            } else {
                size = i.size();
                size2 = d2.size() + 1;
            }
            return o75.e1(o75.k0(rs4.v1(i(str)), size - size2), CryptoConstants.ALIAS_SEPARATOR, null, null, 0, null, null, 62, null);
        }
        return null;
    }

    public final void h(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        c25.p(bArr, "publicSuffixListBytes");
        c25.p(bArr2, "publicSuffixExceptionListBytes");
        this.i = bArr;
        this.j = bArr2;
        this.g.set(true);
        this.h.countDown();
    }
}