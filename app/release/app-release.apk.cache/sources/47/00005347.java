package com.p7700g.p99005;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: JsonReader.java */
/* loaded from: classes3.dex */
public class nx2 implements Closeable {
    private static final int A = 7;
    private static final int B = 8;
    private static final int C = 9;
    private static final int D = 10;
    private static final int E = 11;
    private static final int F = 12;
    private static final int G = 13;
    private static final int H = 14;
    private static final int I = 15;
    private static final int J = 16;
    private static final int K = 17;
    private static final int L = 0;
    private static final int M = 1;
    private static final int N = 2;
    private static final int O = 3;
    private static final int P = 4;
    private static final int Q = 5;
    private static final int R = 6;
    private static final int S = 7;
    public static final int T = 1024;
    private static final long s = -922337203685477580L;
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 5;
    private static final int z = 6;
    private int A0;
    private String[] B0;
    private int[] C0;
    private final Reader U;
    private boolean V = false;
    private final char[] W = new char[1024];
    private int X = 0;
    private int Y = 0;
    private int Z = 0;
    private int u0 = 0;
    public int v0 = 0;
    private long w0;
    private int x0;
    private String y0;
    private int[] z0;

    /* compiled from: JsonReader.java */
    /* loaded from: classes3.dex */
    public class a extends vw2 {
        @Override // com.p7700g.p99005.vw2
        public void a(nx2 nx2Var) throws IOException {
            if (nx2Var instanceof ex2) {
                ((ex2) nx2Var).e2();
                return;
            }
            int i = nx2Var.v0;
            if (i == 0) {
                i = nx2Var.f();
            }
            if (i == 13) {
                nx2Var.v0 = 9;
            } else if (i == 12) {
                nx2Var.v0 = 8;
            } else if (i == 14) {
                nx2Var.v0 = 10;
            } else {
                StringBuilder G = wo1.G("Expected a name but was ");
                G.append(nx2Var.Y());
                G.append(nx2Var.v());
                throw new IllegalStateException(G.toString());
            }
        }
    }

    static {
        vw2.a = new a();
    }

    public nx2(Reader reader) {
        int[] iArr = new int[32];
        this.z0 = iArr;
        this.A0 = 0;
        this.A0 = 0 + 1;
        iArr[0] = 6;
        this.B0 = new String[32];
        this.C0 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.U = reader;
    }

    private void D1(char c) throws IOException {
        char[] cArr = this.W;
        do {
            int i = this.X;
            int i2 = this.Y;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.X = i3;
                    return;
                } else if (c2 == '\\') {
                    this.X = i3;
                    c1();
                    i = this.X;
                    i2 = this.Y;
                } else {
                    if (c2 == '\n') {
                        this.Z++;
                        this.u0 = i3;
                    }
                    i = i3;
                }
            }
            this.X = i;
        } while (k(1));
        throw Z1("Unterminated string");
    }

    private boolean J1(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.X + length > this.Y && !k(length)) {
                return false;
            }
            char[] cArr = this.W;
            int i = this.X;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.W[this.X + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.Z++;
            this.u0 = i + 1;
            this.X++;
        }
    }

    private int K(boolean z2) throws IOException {
        char[] cArr = this.W;
        int i = this.X;
        int i2 = this.Y;
        while (true) {
            if (i == i2) {
                this.X = i;
                if (!k(1)) {
                    if (z2) {
                        StringBuilder G2 = wo1.G("End of input");
                        G2.append(v());
                        throw new EOFException(G2.toString());
                    }
                    return -1;
                }
                i = this.X;
                i2 = this.Y;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.Z++;
                this.u0 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.X = i3;
                    if (i3 == i2) {
                        this.X = i3 - 1;
                        boolean k = k(2);
                        this.X++;
                        if (!k) {
                            return c;
                        }
                    }
                    d();
                    int i4 = this.X;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.X = i4 + 1;
                        if (J1("*/")) {
                            i = this.X + 2;
                            i2 = this.Y;
                        } else {
                            throw Z1("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.X = i4 + 1;
                        K1();
                        i = this.X;
                        i2 = this.Y;
                    }
                } else if (c == '#') {
                    this.X = i3;
                    d();
                    K1();
                    i = this.X;
                    i2 = this.Y;
                } else {
                    this.X = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private void K1() throws IOException {
        char c;
        do {
            if (this.X >= this.Y && !k(1)) {
                return;
            }
            char[] cArr = this.W;
            int i = this.X;
            int i2 = i + 1;
            this.X = i2;
            c = cArr[i];
            if (c == '\n') {
                this.Z++;
                this.u0 = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void T1() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.X;
                if (i2 + i < this.Y) {
                    char c = this.W[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.X = i2 + i;
                }
            }
            this.X += i;
            return;
        } while (k(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.X = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String U(char c) throws IOException {
        char[] cArr = this.W;
        StringBuilder sb = null;
        do {
            int i = this.X;
            int i2 = this.Y;
            while (true) {
                int i3 = i2;
                int i4 = i;
                while (i < i3) {
                    int i5 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.X = i5;
                        int i6 = (i5 - i4) - 1;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.X = i5;
                        int i7 = (i5 - i4) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i7 + 1) * 2, 16));
                        }
                        sb.append(cArr, i4, i7);
                        sb.append(c1());
                        i = this.X;
                        i2 = this.Y;
                    } else {
                        if (c2 == '\n') {
                            this.Z++;
                            this.u0 = i5;
                        }
                        i = i5;
                    }
                }
                break;
            }
        } while (k(1));
        throw Z1("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        d();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String X() throws IOException {
        String sb;
        int i = 0;
        StringBuilder sb2 = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.X;
                if (i3 + i2 < this.Y) {
                    char c = this.W[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 < this.W.length) {
                    if (k(i2 + 1)) {
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(this.W, this.X, i2);
                    this.X += i2;
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new String(this.W, this.X, i);
            } else {
                sb2.append(this.W, this.X, i);
                sb = sb2.toString();
            }
            this.X += i;
            return sb;
        } while (k(1));
        if (sb2 != null) {
        }
        this.X += i;
        return sb;
    }

    private void X0(int i) {
        int i2 = this.A0;
        int[] iArr = this.z0;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.z0 = Arrays.copyOf(iArr, i3);
            this.C0 = Arrays.copyOf(this.C0, i3);
            this.B0 = (String[]) Arrays.copyOf(this.B0, i3);
        }
        int[] iArr2 = this.z0;
        int i4 = this.A0;
        this.A0 = i4 + 1;
        iArr2[i4] = i;
    }

    private int Z() throws IOException {
        int i;
        String str;
        String str2;
        char c = this.W[this.X];
        if (c == 't' || c == 'T') {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str = pg1.d;
            str2 = "NULL";
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.X + i2 >= this.Y && !k(i2 + 1)) {
                return 0;
            }
            char c2 = this.W[this.X + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.X + length < this.Y || k(length + 1)) && s(this.W[this.X + length])) {
            return 0;
        }
        this.X += length;
        this.v0 = i;
        return i;
    }

    private IOException Z1(String str) throws IOException {
        StringBuilder G2 = wo1.G(str);
        G2.append(v());
        throw new rx2(G2.toString());
    }

    private char c1() throws IOException {
        int i;
        int i2;
        if (this.X == this.Y && !k(1)) {
            throw Z1("Unterminated escape sequence");
        }
        char[] cArr = this.W;
        int i3 = this.X;
        int i4 = i3 + 1;
        this.X = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.Z++;
            this.u0 = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c != 'b') {
                if (c != 'f') {
                    if (c != 'n') {
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i4 + 4 > this.Y && !k(4)) {
                                        throw Z1("Unterminated escape sequence");
                                    }
                                    char c2 = 0;
                                    int i5 = this.X;
                                    int i6 = i5 + 4;
                                    while (i5 < i6) {
                                        char c3 = this.W[i5];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 < '0' || c3 > '9') {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 < 'A' || c3 > 'F') {
                                                StringBuilder G2 = wo1.G("\\u");
                                                G2.append(new String(this.W, this.X, 4));
                                                throw new NumberFormatException(G2.toString());
                                            } else {
                                                i = c3 - 'A';
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = c3 - '0';
                                        }
                                        c2 = (char) (i2 + c4);
                                        i5++;
                                    }
                                    this.X += 4;
                                    return c2;
                                }
                                throw Z1("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c;
    }

    private void d() throws IOException {
        if (!this.V) {
            throw Z1("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void e() throws IOException {
        K(true);
        int i = this.X - 1;
        this.X = i;
        if (i + 5 <= this.Y || k(5)) {
            int i2 = this.X;
            char[] cArr = this.W;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.X = i2 + 5;
            }
        }
    }

    private boolean k(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.W;
        int i4 = this.u0;
        int i5 = this.X;
        this.u0 = i4 - i5;
        int i6 = this.Y;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.Y = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.Y = 0;
        }
        this.X = 0;
        do {
            Reader reader = this.U;
            int i8 = this.Y;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.Y + read;
            this.Y = i2;
            if (this.Z == 0 && (i3 = this.u0) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.X++;
                this.u0 = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private String l(boolean z2) {
        StringBuilder F2 = wo1.F(h95.c);
        int i = 0;
        while (true) {
            int i2 = this.A0;
            if (i < i2) {
                int i3 = this.z0[i];
                if (i3 == 1 || i3 == 2) {
                    int i4 = this.C0[i];
                    if (z2 && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    F2.append(f14.u);
                    F2.append(i4);
                    F2.append(f14.v);
                } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                    F2.append('.');
                    String[] strArr = this.B0;
                    if (strArr[i] != null) {
                        F2.append(strArr[i]);
                    }
                }
                i++;
            } else {
                return F2.toString();
            }
        }
    }

    private boolean s(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (s(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ae, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
        r18.w0 = r11;
        r18.X += r8;
        r18.v0 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c4, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c6, code lost:
        r18.x0 = r8;
        r18.v0 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cc, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cd, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int x0() throws IOException {
        char[] cArr = this.W;
        int i = this.X;
        int i2 = this.Y;
        int i3 = 0;
        int i4 = 0;
        char c = 0;
        boolean z2 = true;
        long j = 0;
        boolean z3 = false;
        while (true) {
            if (i + i4 == i2) {
                if (i4 == cArr.length) {
                    return i3;
                }
                if (!k(i4 + 1)) {
                    break;
                }
                i = this.X;
                i2 = this.Y;
            }
            char c2 = cArr[i + i4];
            if (c2 != '+') {
                if (c2 == 'E' || c2 == 'e') {
                    i3 = 0;
                    if (c != 2 && c != 4) {
                        return 0;
                    }
                    c = 5;
                } else if (c2 == '-') {
                    i3 = 0;
                    if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return 0;
                    }
                } else if (c2 == '.') {
                    i3 = 0;
                    if (c != 2) {
                        return 0;
                    }
                    c = 3;
                } else if (c2 < '0' || c2 > '9') {
                    break;
                } else if (c == 1 || c == 0) {
                    j = -(c2 - '0');
                    i3 = 0;
                    c = 2;
                } else {
                    if (c == 2) {
                        if (j == 0) {
                            return 0;
                        }
                        long j2 = (10 * j) - (c2 - '0');
                        int i5 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
                        z2 &= i5 > 0 || (i5 == 0 && j2 < j);
                        j = j2;
                    } else if (c == 3) {
                        i3 = 0;
                        c = 4;
                    } else if (c == 5 || c == 6) {
                        i3 = 0;
                        c = 7;
                    }
                    i3 = 0;
                }
                i4++;
            } else {
                i3 = 0;
                if (c != 5) {
                    return 0;
                }
            }
            c = 6;
            i4++;
        }
    }

    public int A() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 15) {
            long j = this.w0;
            int i2 = (int) j;
            if (j == i2) {
                this.v0 = 0;
                int[] iArr = this.C0;
                int i3 = this.A0 - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder G2 = wo1.G("Expected an int but was ");
            G2.append(this.w0);
            G2.append(v());
            throw new NumberFormatException(G2.toString());
        }
        if (i == 16) {
            this.y0 = new String(this.W, this.X, this.x0);
            this.X += this.x0;
        } else if (i != 8 && i != 9 && i != 10) {
            StringBuilder G3 = wo1.G("Expected an int but was ");
            G3.append(Y());
            G3.append(v());
            throw new IllegalStateException(G3.toString());
        } else {
            if (i == 10) {
                this.y0 = X();
            } else {
                this.y0 = U(i == 8 ? '\'' : h95.b);
            }
            try {
                int parseInt = Integer.parseInt(this.y0);
                this.v0 = 0;
                int[] iArr2 = this.C0;
                int i4 = this.A0 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.v0 = 11;
        double parseDouble = Double.parseDouble(this.y0);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.y0 = null;
            this.v0 = 0;
            int[] iArr3 = this.C0;
            int i6 = this.A0 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder G4 = wo1.G("Expected an int but was ");
        G4.append(this.y0);
        G4.append(v());
        throw new NumberFormatException(G4.toString());
    }

    public long E() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 15) {
            this.v0 = 0;
            int[] iArr = this.C0;
            int i2 = this.A0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.w0;
        }
        if (i == 16) {
            this.y0 = new String(this.W, this.X, this.x0);
            this.X += this.x0;
        } else if (i != 8 && i != 9 && i != 10) {
            StringBuilder G2 = wo1.G("Expected a long but was ");
            G2.append(Y());
            G2.append(v());
            throw new IllegalStateException(G2.toString());
        } else {
            if (i == 10) {
                this.y0 = X();
            } else {
                this.y0 = U(i == 8 ? '\'' : h95.b);
            }
            try {
                long parseLong = Long.parseLong(this.y0);
                this.v0 = 0;
                int[] iArr2 = this.C0;
                int i3 = this.A0 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.v0 = 11;
        double parseDouble = Double.parseDouble(this.y0);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.y0 = null;
            this.v0 = 0;
            int[] iArr3 = this.C0;
            int i4 = this.A0 - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder G3 = wo1.G("Expected a long but was ");
        G3.append(this.y0);
        G3.append(v());
        throw new NumberFormatException(G3.toString());
    }

    public String F() throws IOException {
        String U;
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 14) {
            U = X();
        } else if (i == 12) {
            U = U('\'');
        } else if (i == 13) {
            U = U(h95.b);
        } else {
            StringBuilder G2 = wo1.G("Expected a name but was ");
            G2.append(Y());
            G2.append(v());
            throw new IllegalStateException(G2.toString());
        }
        this.v0 = 0;
        this.B0[this.A0 - 1] = U;
        return U;
    }

    public void P() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 7) {
            this.v0 = 0;
            int[] iArr = this.C0;
            int i2 = this.A0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder G2 = wo1.G("Expected null but was ");
        G2.append(Y());
        G2.append(v());
        throw new IllegalStateException(G2.toString());
    }

    public String W() throws IOException {
        String str;
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 10) {
            str = X();
        } else if (i == 8) {
            str = U('\'');
        } else if (i == 9) {
            str = U(h95.b);
        } else if (i == 11) {
            str = this.y0;
            this.y0 = null;
        } else if (i == 15) {
            str = Long.toString(this.w0);
        } else if (i == 16) {
            str = new String(this.W, this.X, this.x0);
            this.X += this.x0;
        } else {
            StringBuilder G2 = wo1.G("Expected a string but was ");
            G2.append(Y());
            G2.append(v());
            throw new IllegalStateException(G2.toString());
        }
        this.v0 = 0;
        int[] iArr = this.C0;
        int i2 = this.A0 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public px2 Y() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        switch (i) {
            case 1:
                return px2.BEGIN_OBJECT;
            case 2:
                return px2.END_OBJECT;
            case 3:
                return px2.BEGIN_ARRAY;
            case 4:
                return px2.END_ARRAY;
            case 5:
            case 6:
                return px2.BOOLEAN;
            case 7:
                return px2.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return px2.STRING;
            case 12:
            case 13:
            case 14:
                return px2.NAME;
            case 15:
            case 16:
                return px2.NUMBER;
            case 17:
                return px2.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void Y1() throws IOException {
        int i = 0;
        do {
            int i2 = this.v0;
            if (i2 == 0) {
                i2 = f();
            }
            if (i2 == 3) {
                X0(1);
            } else if (i2 == 1) {
                X0(3);
            } else {
                if (i2 == 4) {
                    this.A0--;
                } else if (i2 == 2) {
                    this.A0--;
                } else {
                    if (i2 == 14 || i2 == 10) {
                        T1();
                    } else if (i2 == 8 || i2 == 12) {
                        D1('\'');
                    } else if (i2 == 9 || i2 == 13) {
                        D1(h95.b);
                    } else if (i2 == 16) {
                        this.X += this.x0;
                    }
                    this.v0 = 0;
                }
                i--;
                this.v0 = 0;
            }
            i++;
            this.v0 = 0;
        } while (i != 0);
        int[] iArr = this.C0;
        int i3 = this.A0;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.B0[i3 - 1] = pg1.d;
    }

    public void a() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 3) {
            X0(1);
            this.C0[this.A0 - 1] = 0;
            this.v0 = 0;
            return;
        }
        StringBuilder G2 = wo1.G("Expected BEGIN_ARRAY but was ");
        G2.append(Y());
        G2.append(v());
        throw new IllegalStateException(G2.toString());
    }

    public void b() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 1) {
            X0(3);
            this.v0 = 0;
            return;
        }
        StringBuilder G2 = wo1.G("Expected BEGIN_OBJECT but was ");
        G2.append(Y());
        G2.append(v());
        throw new IllegalStateException(G2.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.v0 = 0;
        this.z0[0] = 8;
        this.A0 = 1;
        this.U.close();
    }

    public final void d1(boolean z2) {
        this.V = z2;
    }

    public int f() throws IOException {
        int K2;
        int[] iArr = this.z0;
        int i = this.A0;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int K3 = K(true);
            if (K3 != 44) {
                if (K3 != 59) {
                    if (K3 == 93) {
                        this.v0 = 4;
                        return 4;
                    }
                    throw Z1("Unterminated array");
                }
                d();
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5 && (K2 = K(true)) != 44) {
                if (K2 != 59) {
                    if (K2 == 125) {
                        this.v0 = 2;
                        return 2;
                    }
                    throw Z1("Unterminated object");
                }
                d();
            }
            int K4 = K(true);
            if (K4 == 34) {
                this.v0 = 13;
                return 13;
            } else if (K4 == 39) {
                d();
                this.v0 = 12;
                return 12;
            } else if (K4 == 125) {
                if (i2 != 5) {
                    this.v0 = 2;
                    return 2;
                }
                throw Z1("Expected name");
            } else {
                d();
                this.X--;
                if (s((char) K4)) {
                    this.v0 = 14;
                    return 14;
                }
                throw Z1("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int K5 = K(true);
            if (K5 != 58) {
                if (K5 == 61) {
                    d();
                    if (this.X < this.Y || k(1)) {
                        char[] cArr = this.W;
                        int i3 = this.X;
                        if (cArr[i3] == '>') {
                            this.X = i3 + 1;
                        }
                    }
                } else {
                    throw Z1("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.V) {
                e();
            }
            this.z0[this.A0 - 1] = 7;
        } else if (i2 == 7) {
            if (K(false) == -1) {
                this.v0 = 17;
                return 17;
            }
            d();
            this.X--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int K6 = K(true);
        if (K6 == 34) {
            this.v0 = 9;
            return 9;
        } else if (K6 == 39) {
            d();
            this.v0 = 8;
            return 8;
        } else {
            if (K6 != 44 && K6 != 59) {
                if (K6 == 91) {
                    this.v0 = 3;
                    return 3;
                } else if (K6 != 93) {
                    if (K6 != 123) {
                        this.X--;
                        int Z = Z();
                        if (Z != 0) {
                            return Z;
                        }
                        int x0 = x0();
                        if (x0 != 0) {
                            return x0;
                        }
                        if (s(this.W[this.X])) {
                            d();
                            this.v0 = 10;
                            return 10;
                        }
                        throw Z1("Expected value");
                    }
                    this.v0 = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.v0 = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                throw Z1("Unexpected value");
            }
            d();
            this.X--;
            this.v0 = 7;
            return 7;
        }
    }

    public String getPath() {
        return l(false);
    }

    public void h() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 4) {
            int i2 = this.A0 - 1;
            this.A0 = i2;
            int[] iArr = this.C0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.v0 = 0;
            return;
        }
        StringBuilder G2 = wo1.G("Expected END_ARRAY but was ");
        G2.append(Y());
        G2.append(v());
        throw new IllegalStateException(G2.toString());
    }

    public void j() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 2) {
            int i2 = this.A0 - 1;
            this.A0 = i2;
            this.B0[i2] = null;
            int[] iArr = this.C0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.v0 = 0;
            return;
        }
        StringBuilder G2 = wo1.G("Expected END_OBJECT but was ");
        G2.append(Y());
        G2.append(v());
        throw new IllegalStateException(G2.toString());
    }

    public String m() {
        return l(true);
    }

    public boolean q() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean r() {
        return this.V;
    }

    public String toString() {
        return getClass().getSimpleName() + v();
    }

    public String v() {
        StringBuilder J2 = wo1.J(" at line ", this.Z + 1, " column ", (this.X - this.u0) + 1, " path ");
        J2.append(getPath());
        return J2.toString();
    }

    public boolean w() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 5) {
            this.v0 = 0;
            int[] iArr = this.C0;
            int i2 = this.A0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.v0 = 0;
            int[] iArr2 = this.C0;
            int i3 = this.A0 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder G2 = wo1.G("Expected a boolean but was ");
            G2.append(Y());
            G2.append(v());
            throw new IllegalStateException(G2.toString());
        }
    }

    public double z() throws IOException {
        int i = this.v0;
        if (i == 0) {
            i = f();
        }
        if (i == 15) {
            this.v0 = 0;
            int[] iArr = this.C0;
            int i2 = this.A0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.w0;
        }
        if (i == 16) {
            this.y0 = new String(this.W, this.X, this.x0);
            this.X += this.x0;
        } else if (i == 8 || i == 9) {
            this.y0 = U(i == 8 ? '\'' : h95.b);
        } else if (i == 10) {
            this.y0 = X();
        } else if (i != 11) {
            StringBuilder G2 = wo1.G("Expected a double but was ");
            G2.append(Y());
            G2.append(v());
            throw new IllegalStateException(G2.toString());
        }
        this.v0 = 11;
        double parseDouble = Double.parseDouble(this.y0);
        if (!this.V && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new rx2("JSON forbids NaN and infinities: " + parseDouble + v());
        }
        this.y0 = null;
        this.v0 = 0;
        int[] iArr2 = this.C0;
        int i3 = this.A0 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }
}