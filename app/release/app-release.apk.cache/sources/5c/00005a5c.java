package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;

/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes.dex */
public final class ro0 extends po0 {
    private static final vv5 A = vv5.u("'\\");
    private static final vv5 B = vv5.u("\"\\");
    private static final vv5 C = vv5.u("{}[]:, \n\t\r\f/\\;#=");
    private static final vv5 D = vv5.u("\n\r");
    private static final vv5 E = vv5.u("*/");
    private static final int F = 0;
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = 3;
    private static final int J = 4;
    private static final int K = 5;
    private static final int L = 6;
    private static final int M = 7;
    private static final int N = 8;
    private static final int O = 9;
    private static final int P = 10;
    private static final int Q = 11;
    private static final int R = 12;
    private static final int S = 13;
    private static final int T = 14;
    private static final int U = 15;
    private static final int V = 16;
    private static final int W = 17;
    private static final int X = 18;
    private static final int Y = 0;
    private static final int Z = 1;
    private static final int u0 = 2;
    private static final int v0 = 3;
    private static final int w0 = 4;
    private static final int x0 = 5;
    private static final int y0 = 6;
    private static final long z = -922337203685477580L;
    private static final int z0 = 7;
    private final uv5 A0;
    private final sv5 B0;
    private int C0 = 0;
    private long D0;
    private int E0;
    @z1
    private String F0;

    public ro0(uv5 uv5Var) {
        Objects.requireNonNull(uv5Var, "source == null");
        this.A0 = uv5Var;
        this.B0 = uv5Var.n();
        v(6);
    }

    private boolean D1() throws IOException {
        uv5 uv5Var = this.A0;
        vv5 vv5Var = E;
        long d0 = uv5Var.d0(vv5Var);
        boolean z2 = d0 != -1;
        sv5 sv5Var = this.B0;
        sv5Var.skip(z2 ? d0 + vv5Var.C3() : sv5Var.z2());
        return z2;
    }

    private void J1() throws IOException {
        long n0 = this.A0.n0(D);
        sv5 sv5Var = this.B0;
        sv5Var.skip(n0 != -1 ? n0 + 1 : sv5Var.z2());
    }

    private void K() throws IOException {
        if (!this.x) {
            throw F("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void K1() throws IOException {
        long n0 = this.A0.n0(C);
        sv5 sv5Var = this.B0;
        if (n0 == -1) {
            n0 = sv5Var.z2();
        }
        sv5Var.skip(n0);
    }

    private int P() throws IOException {
        int[] iArr = this.u;
        int i = this.t;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int X2 = X(true);
            this.B0.readByte();
            if (X2 != 44) {
                if (X2 != 59) {
                    if (X2 == 93) {
                        this.C0 = 4;
                        return 4;
                    }
                    throw F("Unterminated array");
                }
                K();
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int X3 = X(true);
                this.B0.readByte();
                if (X3 != 44) {
                    if (X3 != 59) {
                        if (X3 == 125) {
                            this.C0 = 2;
                            return 2;
                        }
                        throw F("Unterminated object");
                    }
                    K();
                }
            }
            int X4 = X(true);
            if (X4 == 34) {
                this.B0.readByte();
                this.C0 = 13;
                return 13;
            } else if (X4 == 39) {
                this.B0.readByte();
                K();
                this.C0 = 12;
                return 12;
            } else if (X4 != 125) {
                K();
                if (W((char) X4)) {
                    this.C0 = 14;
                    return 14;
                }
                throw F("Expected name");
            } else if (i2 != 5) {
                this.B0.readByte();
                this.C0 = 2;
                return 2;
            } else {
                throw F("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int X5 = X(true);
            this.B0.readByte();
            if (X5 != 58) {
                if (X5 == 61) {
                    K();
                    if (this.A0.i1(1L) && this.B0.d2(0L) == 62) {
                        this.B0.readByte();
                    }
                } else {
                    throw F("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (X(false) == -1) {
                this.C0 = 18;
                return 18;
            }
            K();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int X6 = X(true);
        if (X6 == 34) {
            this.B0.readByte();
            this.C0 = 9;
            return 9;
        } else if (X6 == 39) {
            K();
            this.B0.readByte();
            this.C0 = 8;
            return 8;
        } else {
            if (X6 != 44 && X6 != 59) {
                if (X6 == 91) {
                    this.B0.readByte();
                    this.C0 = 3;
                    return 3;
                } else if (X6 != 93) {
                    if (X6 != 123) {
                        int x02 = x0();
                        if (x02 != 0) {
                            return x02;
                        }
                        int X0 = X0();
                        if (X0 != 0) {
                            return X0;
                        }
                        if (W(this.B0.d2(0L))) {
                            K();
                            this.C0 = 10;
                            return 10;
                        }
                        throw F("Expected value");
                    }
                    this.B0.readByte();
                    this.C0 = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.B0.readByte();
                    this.C0 = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                throw F("Unexpected value");
            }
            K();
            this.C0 = 7;
            return 7;
        }
    }

    private int U(String str, po0.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.C0 = 0;
                this.v[this.t - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private boolean W(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        K();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.B0.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.A0.i1(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        K();
        r3 = r6.B0.d2(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.B0.readByte();
        r6.B0.readByte();
        J1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.B0.readByte();
        r6.B0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (D1() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw F("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        K();
        J1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int X(boolean z2) throws IOException {
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.A0.i1(i2)) {
                    if (z2) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                byte d2 = this.B0.d2(i);
                if (d2 != 10 && d2 != 32 && d2 != 13 && d2 != 9) {
                    break;
                }
                i = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
        if (W(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
        if (r8 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
        if (r8 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009e, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009f, code lost:
        r16.D0 = r8;
        r16.B0.skip(r5);
        r16.C0 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
        if (r6 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b2, code lost:
        if (r6 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b5, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b7, code lost:
        r16.E0 = r5;
        r16.C0 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int X0() throws IOException {
        char c = 1;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c2 = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.A0.i1(i3)) {
                break;
            }
            byte d2 = this.B0.d2(i2);
            if (d2 != 43) {
                if (d2 == 69 || d2 == 101) {
                    if (c2 != 2 && c2 != 4) {
                        return i;
                    }
                    c2 = 5;
                } else if (d2 != 45) {
                    if (d2 != 46) {
                        if (d2 < 48 || d2 > 57) {
                            break;
                        } else if (c2 == c || c2 == 0) {
                            j = -(d2 - 48);
                            i = 0;
                            c2 = 2;
                        } else {
                            if (c2 == 2) {
                                if (j == 0) {
                                    return i;
                                }
                                long j2 = (10 * j) - (d2 - 48);
                                int i4 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
                                z2 &= i4 > 0 || (i4 == 0 && j2 < j);
                                j = j2;
                            } else if (c2 == 3) {
                                i = 0;
                                c2 = 4;
                            } else if (c2 == 5 || c2 == 6) {
                                i = 0;
                                c2 = 7;
                            }
                            i = 0;
                        }
                    } else if (c2 != 2) {
                        return i;
                    } else {
                        c2 = 3;
                    }
                } else if (c2 == 0) {
                    c2 = 1;
                    z3 = true;
                } else if (c2 != 5) {
                    return i;
                }
                i2 = i3;
                c = 1;
            } else if (c2 != 5) {
                return i;
            }
            c2 = 6;
            i2 = i3;
            c = 1;
        }
    }

    private String Y(vv5 vv5Var) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long n0 = this.A0.n0(vv5Var);
            if (n0 != -1) {
                if (this.B0.d2(n0) != 92) {
                    if (sb == null) {
                        String g = this.B0.g(n0);
                        this.B0.readByte();
                        return g;
                    }
                    sb.append(this.B0.g(n0));
                    this.B0.readByte();
                    return sb.toString();
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.B0.g(n0));
                this.B0.readByte();
                sb.append(c1());
            } else {
                throw F("Unterminated string");
            }
        }
    }

    private String Z() throws IOException {
        long n0 = this.A0.n0(C);
        return n0 != -1 ? this.B0.g(n0) : this.B0.u1();
    }

    private char c1() throws IOException {
        int i;
        int i2;
        if (this.A0.i1(1L)) {
            byte readByte = this.B0.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.x) {
                                        return (char) readByte;
                                    }
                                    StringBuilder G2 = wo1.G("Invalid escape sequence: \\");
                                    G2.append((char) readByte);
                                    throw F(G2.toString());
                                } else if (this.A0.i1(4L)) {
                                    char c = 0;
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        byte d2 = this.B0.d2(i3);
                                        char c2 = (char) (c << 4);
                                        if (d2 < 48 || d2 > 57) {
                                            if (d2 >= 97 && d2 <= 102) {
                                                i = d2 - 97;
                                            } else if (d2 < 65 || d2 > 70) {
                                                StringBuilder G3 = wo1.G("\\u");
                                                G3.append(this.B0.g(4L));
                                                throw F(G3.toString());
                                            } else {
                                                i = d2 - 65;
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = d2 - 48;
                                        }
                                        c = (char) (i2 + c2);
                                    }
                                    this.B0.skip(4L);
                                    return c;
                                } else {
                                    StringBuilder G4 = wo1.G("Unterminated escape sequence at path ");
                                    G4.append(getPath());
                                    throw new EOFException(G4.toString());
                                }
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
        throw F("Unterminated escape sequence");
    }

    private void d1(vv5 vv5Var) throws IOException {
        while (true) {
            long n0 = this.A0.n0(vv5Var);
            if (n0 != -1) {
                if (this.B0.d2(n0) == 92) {
                    this.B0.skip(n0 + 1);
                    c1();
                } else {
                    this.B0.skip(n0 + 1);
                    return;
                }
            } else {
                throw F("Unterminated string");
            }
        }
    }

    private int x0() throws IOException {
        int i;
        String str;
        String str2;
        byte d2 = this.B0.d2(0L);
        if (d2 == 116 || d2 == 84) {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (d2 == 102 || d2 == 70) {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (d2 != 110 && d2 != 78) {
            return 0;
        } else {
            i = 7;
            str = pg1.d;
            str2 = "NULL";
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.A0.i1(i3)) {
                return 0;
            }
            byte d22 = this.B0.d2(i2);
            if (d22 != str.charAt(i2) && d22 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.A0.i1(length + 1) && W(this.B0.d2(length))) {
            return 0;
        }
        this.B0.skip(length);
        this.C0 = i;
        return i;
    }

    @Override // com.p7700g.p99005.po0
    public void A() throws IOException {
        if (!this.y) {
            int i = 0;
            do {
                int i2 = this.C0;
                if (i2 == 0) {
                    i2 = P();
                }
                if (i2 == 3) {
                    v(1);
                } else if (i2 == 1) {
                    v(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.t--;
                        } else {
                            StringBuilder G2 = wo1.G("Expected a value but was ");
                            G2.append(s());
                            G2.append(" at path ");
                            G2.append(getPath());
                            throw new no0(G2.toString());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.t--;
                        } else {
                            StringBuilder G3 = wo1.G("Expected a value but was ");
                            G3.append(s());
                            G3.append(" at path ");
                            G3.append(getPath());
                            throw new no0(G3.toString());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        K1();
                    } else if (i2 == 9 || i2 == 13) {
                        d1(B);
                    } else if (i2 == 8 || i2 == 12) {
                        d1(A);
                    } else if (i2 == 17) {
                        this.B0.skip(this.E0);
                    } else if (i2 == 18) {
                        StringBuilder G4 = wo1.G("Expected a value but was ");
                        G4.append(s());
                        G4.append(" at path ");
                        G4.append(getPath());
                        throw new no0(G4.toString());
                    }
                    this.C0 = 0;
                }
                i++;
                this.C0 = 0;
            } while (i != 0);
            int[] iArr = this.w;
            int i3 = this.t;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.v[i3 - 1] = pg1.d;
            return;
        }
        StringBuilder G5 = wo1.G("Cannot skip unexpected ");
        G5.append(s());
        G5.append(" at ");
        G5.append(getPath());
        throw new no0(G5.toString());
    }

    @Override // com.p7700g.p99005.po0
    public void b() throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 3) {
            v(1);
            this.w[this.t - 1] = 0;
            this.C0 = 0;
            return;
        }
        StringBuilder G2 = wo1.G("Expected BEGIN_ARRAY but was ");
        G2.append(s());
        G2.append(" at path ");
        G2.append(getPath());
        throw new no0(G2.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.C0 = 0;
        this.u[0] = 8;
        this.t = 1;
        this.B0.d();
        this.A0.close();
    }

    @Override // com.p7700g.p99005.po0
    public void d() throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 1) {
            v(3);
            this.C0 = 0;
            return;
        }
        StringBuilder G2 = wo1.G("Expected BEGIN_OBJECT but was ");
        G2.append(s());
        G2.append(" at path ");
        G2.append(getPath());
        throw new no0(G2.toString());
    }

    @Override // com.p7700g.p99005.po0
    public void e() throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 4) {
            int i2 = this.t - 1;
            this.t = i2;
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.C0 = 0;
            return;
        }
        StringBuilder G2 = wo1.G("Expected END_ARRAY but was ");
        G2.append(s());
        G2.append(" at path ");
        G2.append(getPath());
        throw new no0(G2.toString());
    }

    @Override // com.p7700g.p99005.po0
    public void f() throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 2) {
            int i2 = this.t - 1;
            this.t = i2;
            this.v[i2] = null;
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.C0 = 0;
            return;
        }
        StringBuilder G2 = wo1.G("Expected END_OBJECT but was ");
        G2.append(s());
        G2.append(" at path ");
        G2.append(getPath());
        throw new no0(G2.toString());
    }

    @Override // com.p7700g.p99005.po0
    public boolean h() throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.p7700g.p99005.po0
    public boolean j() throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 5) {
            this.C0 = 0;
            int[] iArr = this.w;
            int i2 = this.t - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.C0 = 0;
            int[] iArr2 = this.w;
            int i3 = this.t - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder G2 = wo1.G("Expected a boolean but was ");
            G2.append(s());
            G2.append(" at path ");
            G2.append(getPath());
            throw new no0(G2.toString());
        }
    }

    @Override // com.p7700g.p99005.po0
    public double k() throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 16) {
            this.C0 = 0;
            int[] iArr = this.w;
            int i2 = this.t - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.D0;
        }
        if (i == 17) {
            this.F0 = this.B0.g(this.E0);
        } else if (i == 9) {
            this.F0 = Y(B);
        } else if (i == 8) {
            this.F0 = Y(A);
        } else if (i == 10) {
            this.F0 = Z();
        } else if (i != 11) {
            StringBuilder G2 = wo1.G("Expected a double but was ");
            G2.append(s());
            G2.append(" at path ");
            G2.append(getPath());
            throw new no0(G2.toString());
        }
        this.C0 = 11;
        try {
            double parseDouble = Double.parseDouble(this.F0);
            if (!this.x && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new oo0("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.F0 = null;
            this.C0 = 0;
            int[] iArr2 = this.w;
            int i3 = this.t - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder G3 = wo1.G("Expected a double but was ");
            G3.append(this.F0);
            G3.append(" at path ");
            G3.append(getPath());
            throw new no0(G3.toString());
        }
    }

    @Override // com.p7700g.p99005.po0
    public int l() throws IOException {
        String Y2;
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 16) {
            long j = this.D0;
            int i2 = (int) j;
            if (j == i2) {
                this.C0 = 0;
                int[] iArr = this.w;
                int i3 = this.t - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder G2 = wo1.G("Expected an int but was ");
            G2.append(this.D0);
            G2.append(" at path ");
            G2.append(getPath());
            throw new no0(G2.toString());
        }
        if (i == 17) {
            this.F0 = this.B0.g(this.E0);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                Y2 = Y(B);
            } else {
                Y2 = Y(A);
            }
            this.F0 = Y2;
            try {
                int parseInt = Integer.parseInt(Y2);
                this.C0 = 0;
                int[] iArr2 = this.w;
                int i4 = this.t - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder G3 = wo1.G("Expected an int but was ");
            G3.append(s());
            G3.append(" at path ");
            G3.append(getPath());
            throw new no0(G3.toString());
        }
        this.C0 = 11;
        try {
            double parseDouble = Double.parseDouble(this.F0);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.F0 = null;
                this.C0 = 0;
                int[] iArr3 = this.w;
                int i6 = this.t - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder G4 = wo1.G("Expected an int but was ");
            G4.append(this.F0);
            G4.append(" at path ");
            G4.append(getPath());
            throw new no0(G4.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder G5 = wo1.G("Expected an int but was ");
            G5.append(this.F0);
            G5.append(" at path ");
            G5.append(getPath());
            throw new no0(G5.toString());
        }
    }

    @Override // com.p7700g.p99005.po0
    public String m() throws IOException {
        String str;
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 14) {
            str = Z();
        } else if (i == 13) {
            str = Y(B);
        } else if (i == 12) {
            str = Y(A);
        } else if (i == 15) {
            str = this.F0;
        } else {
            StringBuilder G2 = wo1.G("Expected a name but was ");
            G2.append(s());
            G2.append(" at path ");
            G2.append(getPath());
            throw new no0(G2.toString());
        }
        this.C0 = 0;
        this.v[this.t - 1] = str;
        return str;
    }

    @Override // com.p7700g.p99005.po0
    public String q() throws IOException {
        String g;
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i == 10) {
            g = Z();
        } else if (i == 9) {
            g = Y(B);
        } else if (i == 8) {
            g = Y(A);
        } else if (i == 11) {
            g = this.F0;
            this.F0 = null;
        } else if (i == 16) {
            g = Long.toString(this.D0);
        } else if (i == 17) {
            g = this.B0.g(this.E0);
        } else {
            StringBuilder G2 = wo1.G("Expected a string but was ");
            G2.append(s());
            G2.append(" at path ");
            G2.append(getPath());
            throw new no0(G2.toString());
        }
        this.C0 = 0;
        int[] iArr = this.w;
        int i2 = this.t - 1;
        iArr[i2] = iArr[i2] + 1;
        return g;
    }

    @Override // com.p7700g.p99005.po0
    public po0.b s() throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        switch (i) {
            case 1:
                return po0.b.BEGIN_OBJECT;
            case 2:
                return po0.b.END_OBJECT;
            case 3:
                return po0.b.BEGIN_ARRAY;
            case 4:
                return po0.b.END_ARRAY;
            case 5:
            case 6:
                return po0.b.BOOLEAN;
            case 7:
                return po0.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return po0.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return po0.b.NAME;
            case 16:
            case 17:
                return po0.b.NUMBER;
            case 18:
                return po0.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder G2 = wo1.G("JsonReader(");
        G2.append(this.A0);
        G2.append(")");
        return G2.toString();
    }

    @Override // com.p7700g.p99005.po0
    public int w(po0.a aVar) throws IOException {
        int i = this.C0;
        if (i == 0) {
            i = P();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return U(this.F0, aVar);
        }
        int X1 = this.A0.X1(aVar.b);
        if (X1 != -1) {
            this.C0 = 0;
            this.v[this.t - 1] = aVar.a[X1];
            return X1;
        }
        String str = this.v[this.t - 1];
        String m = m();
        int U2 = U(m, aVar);
        if (U2 == -1) {
            this.C0 = 15;
            this.F0 = m;
            this.v[this.t - 1] = str;
        }
        return U2;
    }

    @Override // com.p7700g.p99005.po0
    public void z() throws IOException {
        if (!this.y) {
            int i = this.C0;
            if (i == 0) {
                i = P();
            }
            if (i == 14) {
                K1();
            } else if (i == 13) {
                d1(B);
            } else if (i == 12) {
                d1(A);
            } else if (i != 15) {
                StringBuilder G2 = wo1.G("Expected a name but was ");
                G2.append(s());
                G2.append(" at path ");
                G2.append(getPath());
                throw new no0(G2.toString());
            }
            this.C0 = 0;
            this.v[this.t - 1] = pg1.d;
            return;
        }
        StringBuilder G3 = wo1.G("Cannot skip unexpected ");
        G3.append(s());
        G3.append(" at ");
        G3.append(getPath());
        throw new no0(G3.toString());
    }
}