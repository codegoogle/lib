package com.p7700g.p99005;

import java.io.PrintStream;

/* compiled from: CLParser.java */
/* loaded from: classes.dex */
public class ra {
    public static boolean a = false;
    private String b;
    private boolean c = false;
    private int d;

    /* compiled from: CLParser.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            b.values();
            int[] iArr = new int[7];
            a = iArr;
            try {
                iArr[b.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: CLParser.java */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public ra(String str) {
        this.b = str;
    }

    private na a(na naVar, int i, b bVar, boolean z, char[] cArr) {
        na i0;
        if (a) {
            System.out.println("CREATE " + bVar + " at " + cArr[i]);
        }
        switch (bVar.ordinal()) {
            case 1:
                i0 = qa.i0(cArr);
                i++;
                break;
            case 2:
                i0 = la.D(cArr);
                i++;
                break;
            case 3:
                i0 = pa.C(cArr);
                break;
            case 4:
                i0 = ta.C(cArr);
                break;
            case 5:
                i0 = oa.D(cArr);
                break;
            case 6:
                i0 = ua.C(cArr);
                break;
            default:
                i0 = null;
                break;
        }
        if (i0 == null) {
            return null;
        }
        i0.x(this.d);
        if (z) {
            i0.y(i);
        }
        if (naVar instanceof ma) {
            i0.t((ma) naVar);
        }
        return i0;
    }

    private na b(int i, char c, na naVar, char[] cArr) throws sa {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return naVar;
        }
        if (c == '\"' || c == '\'') {
            if (naVar instanceof qa) {
                return a(naVar, i, b.KEY, true, cArr);
            }
            return a(naVar, i, b.STRING, true, cArr);
        } else if (c != '[') {
            if (c != ']') {
                if (c == '{') {
                    return a(naVar, i, b.OBJECT, true, cArr);
                }
                if (c != '}') {
                    switch (c) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return a(naVar, i, b.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            return naVar;
                        case '/':
                            int i2 = i + 1;
                            if (i2 >= cArr.length || cArr[i2] != '/') {
                                return naVar;
                            }
                            this.c = true;
                            return naVar;
                        default:
                            if ((naVar instanceof ma) && !(naVar instanceof qa)) {
                                na a2 = a(naVar, i, b.TOKEN, true, cArr);
                                ua uaVar = (ua) a2;
                                if (uaVar.H(c, i)) {
                                    return a2;
                                }
                                throw new sa("incorrect token <" + c + "> at line " + this.d, uaVar);
                            }
                            return a(naVar, i, b.KEY, true, cArr);
                    }
                }
            }
            naVar.u(i - 1);
            na c2 = naVar.c();
            c2.u(i);
            return c2;
        } else {
            return a(naVar, i, b.ARRAY, true, cArr);
        }
    }

    public static qa d(String str) throws sa {
        return new ra(str).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0141 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qa c() throws sa {
        na c;
        char[] charArray = this.b.toCharArray();
        int length = charArray.length;
        int i = 1;
        this.d = 1;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char c2 = charArray[i2];
            if (c2 == '{') {
                break;
            }
            if (c2 == '\n') {
                this.d++;
            }
            i2++;
        }
        if (i2 != -1) {
            qa i0 = qa.i0(charArray);
            i0.x(this.d);
            i0.y(i2);
            int i3 = i2 + 1;
            qa qaVar = i0;
            while (i3 < length) {
                char c3 = charArray[i3];
                if (c3 == '\n') {
                    this.d += i;
                }
                if (this.c) {
                    if (c3 == '\n') {
                        this.c = z;
                    } else {
                        continue;
                        i3++;
                        i = 1;
                        z = false;
                    }
                }
                if (qaVar == null) {
                    break;
                }
                if (qaVar.n()) {
                    c = b(i3, c3, qaVar, charArray);
                } else {
                    if (qaVar instanceof qa) {
                        if (c3 == '}') {
                            qaVar.u(i3 - 1);
                            if (qaVar.n() && (!(qaVar instanceof oa) || ((oa) qaVar).z.size() > 0)) {
                                qaVar = qaVar.c();
                            }
                        } else {
                            c = b(i3, c3, qaVar, charArray);
                        }
                    } else if (!(qaVar instanceof la)) {
                        boolean z2 = qaVar instanceof ta;
                        if (z2) {
                            long j = qaVar.v;
                            if (charArray[(int) j] == c3) {
                                qaVar.y(j + 1);
                                qaVar.u(i3 - 1);
                            }
                        } else {
                            if (qaVar instanceof ua) {
                                ua uaVar = (ua) qaVar;
                                if (!uaVar.H(c3, i3)) {
                                    StringBuilder G = wo1.G("parsing incorrect token ");
                                    G.append(uaVar.b());
                                    G.append(" at line ");
                                    G.append(this.d);
                                    throw new sa(G.toString(), uaVar);
                                }
                            }
                            if ((qaVar instanceof oa) || z2) {
                                long j2 = qaVar.v;
                                char c4 = charArray[(int) j2];
                                if ((c4 == '\'' || c4 == '\"') && c4 == c3) {
                                    qaVar.y(j2 + 1);
                                    qaVar.u(i3 - 1);
                                }
                            }
                            if (!qaVar.n() && (c3 == '}' || c3 == ']' || c3 == ',' || c3 == ' ' || c3 == '\t' || c3 == '\r' || c3 == '\n' || c3 == ':')) {
                                long j3 = i3 - 1;
                                qaVar.u(j3);
                                if (c3 == '}' || c3 == ']') {
                                    c = qaVar.c();
                                    c.u(j3);
                                    if (c instanceof oa) {
                                        c = c.c();
                                        c.u(j3);
                                    }
                                }
                            }
                        }
                        if (qaVar.n()) {
                        }
                    } else if (c3 == ']') {
                        qaVar.u(i3 - 1);
                        if (qaVar.n()) {
                            qaVar = qaVar.c();
                        }
                    } else {
                        c = b(i3, c3, qaVar, charArray);
                    }
                    i3++;
                    i = 1;
                    z = false;
                }
                qaVar = c;
                if (qaVar.n()) {
                }
                i3++;
                i = 1;
                z = false;
            }
            while (qaVar != null && !qaVar.n()) {
                if (qaVar instanceof ta) {
                    qaVar.y(((int) qaVar.v) + 1);
                }
                qaVar.u(length - 1);
                qaVar = qaVar.c();
            }
            if (a) {
                PrintStream printStream = System.out;
                StringBuilder G2 = wo1.G("Root: ");
                G2.append(i0.B());
                printStream.println(G2.toString());
            }
            return i0;
        }
        throw new sa("invalid json content", null);
    }
}