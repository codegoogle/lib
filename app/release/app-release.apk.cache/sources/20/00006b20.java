package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes4.dex */
public class Generator {
    private long current;
    public final int dclass;
    public long end;
    public final String namePattern;
    public final Name origin;
    public final String rdataPattern;
    public long start;
    public long step;
    public final long ttl;
    public final int type;

    public Generator(long j, long j2, long j3, String str, int i, int i2, long j4, String str2, Name name) {
        if (j >= 0 && j2 >= 0 && j <= j2 && j3 > 0) {
            if (supportedType(i)) {
                DClass.check(i2);
                this.start = j;
                this.end = j2;
                this.step = j3;
                this.namePattern = str;
                this.type = i;
                this.dclass = i2;
                this.ttl = j4;
                this.rdataPattern = str2;
                this.origin = name;
                this.current = j;
                return;
            }
            throw new IllegalArgumentException("unsupported type");
        }
        throw new IllegalArgumentException("invalid range specification");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
        if (r3 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
        if (r5 != ',') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
        r3 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
        if (r3 >= r0.length) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
        r5 = (char) (r0[r3] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
        if (r5 == ',') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
        if (r5 != '}') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a8, code lost:
        if (r5 < '0') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00aa, code lost:
        if (r5 > '9') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ac, code lost:
        r5 = (char) (r5 - '0');
        r16 = (r16 * 10) + r5;
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bd, code lost:
        throw new org.xbill.DNS.TextParseException("invalid width");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00be, code lost:
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bf, code lost:
        if (r5 != ',') goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c1, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c6, code lost:
        if (r8 == r0.length) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c8, code lost:
        r3 = (char) (r0[r8] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cf, code lost:
        if (r3 != 'o') goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
        r3 = false;
        r5 = 1;
        r13 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d8, code lost:
        if (r3 != 'x') goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00da, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:
        r5 = 1;
        r13 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e1, code lost:
        if (r3 != 'X') goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e3, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e7, code lost:
        if (r3 != 'd') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ef, code lost:
        throw new org.xbill.DNS.TextParseException("invalid base");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f5, code lost:
        throw new org.xbill.DNS.TextParseException("invalid base");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f6, code lost:
        r3 = false;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f8, code lost:
        r8 = r8 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fa, code lost:
        if (r8 == r0.length) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fe, code lost:
        if (r0[r8] != 125) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0100, code lost:
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010a, code lost:
        throw new org.xbill.DNS.TextParseException("invalid modifiers");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String substitute(String str, long j) throws IOException {
        int i;
        boolean z;
        long j2;
        long j3;
        String l;
        boolean z2;
        byte[] bytes = str.getBytes();
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        boolean z3 = false;
        loop0: while (i2 < bytes.length) {
            char c = (char) (bytes[i2] & 255);
            if (z3) {
                stringBuffer.append(c);
                i = 1;
                z3 = false;
            } else if (c != '\\') {
                if (c == '$') {
                    int i3 = i2 + 1;
                    if (i3 < bytes.length && bytes[i3] == 36) {
                        stringBuffer.append((char) (bytes[i3] & 255));
                    } else {
                        long j4 = 10;
                        if (i3 < bytes.length && bytes[i3] == 123) {
                            int i4 = i3 + 1;
                            if (i4 >= bytes.length || bytes[i4] != 45) {
                                z2 = false;
                            } else {
                                i3 = i4;
                                z2 = true;
                            }
                            j3 = 0;
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= bytes.length) {
                                    break;
                                }
                                c = (char) (bytes[i5] & 255);
                                if (c == ',' || c == '}') {
                                    break;
                                } else if (c < '0' || c > '9') {
                                    break loop0;
                                } else {
                                    c = (char) (c - '0');
                                    j3 = (j3 * 10) + c;
                                    i3 = i5;
                                }
                            }
                            throw new TextParseException("invalid offset");
                        }
                        i3 = i2;
                        z = false;
                        j2 = 0;
                        j3 = 0;
                        long j5 = j + j3;
                        if (j5 >= 0) {
                            if (j4 == 8) {
                                l = Long.toOctalString(j5);
                            } else if (j4 == 16) {
                                l = Long.toHexString(j5);
                            } else {
                                l = Long.toString(j5);
                            }
                            if (z) {
                                l = l.toUpperCase(Locale.US);
                            }
                            if (j2 != 0 && j2 > l.length()) {
                                int length = ((int) j2) - l.length();
                                while (true) {
                                    int i6 = length - 1;
                                    if (length <= 0) {
                                        break;
                                    }
                                    stringBuffer.append('0');
                                    length = i6;
                                }
                            }
                            stringBuffer.append(l);
                        } else {
                            throw new TextParseException("invalid offset expansion");
                        }
                    }
                    i2 = i3;
                } else {
                    stringBuffer.append(c);
                }
                i = 1;
            } else if (i2 + 1 == bytes.length) {
                throw new TextParseException("invalid escape character");
            } else {
                i = 1;
                z3 = true;
            }
            i2 += i;
        }
        return stringBuffer.toString();
    }

    public static boolean supportedType(int i) {
        Type.check(i);
        return i == 12 || i == 5 || i == 39 || i == 1 || i == 28 || i == 2;
    }

    public Record[] expand() throws IOException {
        ArrayList arrayList = new ArrayList();
        long j = this.start;
        while (j < this.end) {
            arrayList.add(Record.fromString(Name.fromString(substitute(this.namePattern, this.current), this.origin), this.type, this.dclass, this.ttl, substitute(this.rdataPattern, this.current), this.origin));
            j += this.step;
        }
        return (Record[]) arrayList.toArray(new Record[arrayList.size()]);
    }

    public Record nextRecord() throws IOException {
        long j = this.current;
        if (j > this.end) {
            return null;
        }
        Name fromString = Name.fromString(substitute(this.namePattern, j), this.origin);
        String substitute = substitute(this.rdataPattern, this.current);
        this.current += this.step;
        return Record.fromString(fromString, this.type, this.dclass, this.ttl, substitute, this.origin);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("$GENERATE ");
        stringBuffer.append(this.start + "-" + this.end);
        if (this.step > 1) {
            StringBuilder G = wo1.G("/");
            G.append(this.step);
            stringBuffer.append(G.toString());
        }
        stringBuffer.append(" ");
        stringBuffer.append(this.namePattern + " ");
        stringBuffer.append(this.ttl + " ");
        if (this.dclass != 1 || !Options.check("noPrintIN")) {
            stringBuffer.append(DClass.string(this.dclass) + " ");
        }
        stringBuffer.append(Type.string(this.type) + " ");
        stringBuffer.append(this.rdataPattern + " ");
        return stringBuffer.toString();
    }
}