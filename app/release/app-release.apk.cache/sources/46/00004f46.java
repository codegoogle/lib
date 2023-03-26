package com.p7700g.p99005;

import com.p7700g.p99005.kt3;
import java.text.ParseException;

/* compiled from: HttpHeaderReaderImpl.java */
/* loaded from: classes3.dex */
public final class lt3 extends kt3 {
    private String i;
    private boolean j;
    private int k;
    private int l;
    private kt3.j m;
    private String n;

    public lt3(String str, boolean z) {
        str = str == null ? "" : str;
        this.i = str;
        this.j = z;
        this.k = 0;
        this.l = str.length();
    }

    private char M(boolean z) throws ParseException {
        if (z) {
            Q();
        }
        int i = this.k;
        if (i < this.l) {
            return this.i.charAt(i);
        }
        throw new ParseException("End of header", this.k);
    }

    private kt3.j N(char c, boolean z) throws ParseException {
        if (c > 127) {
            this.k++;
            return kt3.j.Control;
        }
        int i = vs3.h[c];
        if (i == 0) {
            int i2 = this.k;
            int i3 = i2 + 1;
            while (true) {
                this.k = i3;
                int i4 = this.k;
                if (i4 >= this.l || !vs3.g(this.i.charAt(i4))) {
                    break;
                }
                i3 = this.k + 1;
            }
            this.n = this.i.substring(i2, this.k);
            return kt3.j.Token;
        } else if (i == 1) {
            P(z);
            return kt3.j.QuotedString;
        } else if (i == 2) {
            if (this.j) {
                O();
                return kt3.j.Comment;
            }
            throw new ParseException("Comments are not allowed", this.k);
        } else if (i == 3) {
            this.k++;
            this.n = String.valueOf(c);
            return kt3.j.Separator;
        } else if (i == 4) {
            this.k++;
            this.n = String.valueOf(c);
            return kt3.j.Control;
        } else {
            throw new ParseException("White space not allowed", this.k);
        }
    }

    private void O() throws ParseException {
        int i = this.k + 1;
        this.k = i;
        boolean z = false;
        int i2 = 1;
        while (i2 > 0) {
            int i3 = this.k;
            if (i3 >= this.l) {
                break;
            }
            char charAt = this.i.charAt(i3);
            if (charAt == '\\') {
                this.k++;
            } else if (charAt != '\r') {
                if (charAt == '(') {
                    i2++;
                } else if (charAt == ')') {
                    i2--;
                }
                this.k++;
            }
            z = true;
            this.k++;
        }
        if (i2 == 0) {
            this.n = z ? vs3.e(this.i, i, this.k - 1) : this.i.substring(i, this.k - 1);
            return;
        }
        throw new ParseException("Unbalanced comments", this.k);
    }

    private void P(boolean z) throws ParseException {
        int i = this.k + 1;
        this.k = i;
        boolean z2 = false;
        while (true) {
            int i2 = this.k;
            if (i2 < this.l) {
                char charAt = this.i.charAt(i2);
                if (!z && charAt == '\\') {
                    this.k++;
                } else if (charAt != '\r') {
                    if (charAt == '\"') {
                        this.n = z2 ? vs3.f(this.i, i, this.k, z) : this.i.substring(i, this.k);
                        this.k++;
                        return;
                    }
                    this.k++;
                }
                z2 = true;
                this.k++;
            } else {
                throw new ParseException("Unbalanced quoted string", this.k);
            }
        }
    }

    private boolean Q() {
        while (true) {
            int i = this.k;
            if (i >= this.l) {
                return false;
            }
            if (!vs3.i(this.i.charAt(i))) {
                return true;
            }
            this.k++;
        }
    }

    @Override // com.p7700g.p99005.kt3
    public kt3.j a() {
        return this.m;
    }

    @Override // com.p7700g.p99005.kt3
    public String b() {
        return this.n;
    }

    @Override // com.p7700g.p99005.kt3
    public int c() {
        return this.k;
    }

    @Override // com.p7700g.p99005.kt3
    public String d() {
        int i = this.k;
        if (i < this.l) {
            return this.i.substring(i);
        }
        return null;
    }

    @Override // com.p7700g.p99005.kt3
    public boolean e() {
        return Q();
    }

    @Override // com.p7700g.p99005.kt3
    public boolean f(char c, boolean z) {
        if (z) {
            Q();
        }
        int i = this.k;
        if (i >= this.l) {
            return false;
        }
        char charAt = this.i.charAt(i);
        return vs3.h[charAt] == 3 && charAt == c;
    }

    @Override // com.p7700g.p99005.kt3
    public kt3.j i() throws ParseException {
        return j(true);
    }

    @Override // com.p7700g.p99005.kt3
    public kt3.j j(boolean z) throws ParseException {
        return k(z, false);
    }

    @Override // com.p7700g.p99005.kt3
    public kt3.j k(boolean z, boolean z2) throws ParseException {
        kt3.j N = N(M(z), z2);
        this.m = N;
        return N;
    }

    @Override // com.p7700g.p99005.kt3
    public String m(char c, char c2) throws ParseException {
        o(c);
        int i = this.k;
        while (true) {
            int i2 = this.k;
            if (i2 >= this.l || this.i.charAt(i2) == c2) {
                break;
            }
            this.k++;
        }
        int i3 = this.k;
        if (i != i3) {
            if (i3 != this.l) {
                this.m = kt3.j.Token;
                String str = this.i;
                this.k = i3 + 1;
                String substring = str.substring(i, i3);
                this.n = substring;
                return substring;
            }
            throw new ParseException("No end separator '" + c2 + "'", this.k);
        }
        throw new ParseException("No characters between the separators '" + c + "' and '" + c2 + "'", this.k);
    }

    public lt3(String str) {
        this(str, false);
    }
}