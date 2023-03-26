package com.p7700g.p99005;

import com.p7700g.p99005.q32;

/* compiled from: AutoValue_AndroidClientInfo.java */
/* loaded from: classes2.dex */
public final class s32 extends q32 {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;

    /* compiled from: AutoValue_AndroidClientInfo.java */
    /* loaded from: classes2.dex */
    public static final class b extends q32.a {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;

        @Override // com.p7700g.p99005.q32.a
        public q32 a() {
            return new s32(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a b(@z1 String str) {
            this.l = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a c(@z1 String str) {
            this.j = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a d(@z1 String str) {
            this.d = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a e(@z1 String str) {
            this.h = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a f(@z1 String str) {
            this.c = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a g(@z1 String str) {
            this.i = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a h(@z1 String str) {
            this.g = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a i(@z1 String str) {
            this.k = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a j(@z1 String str) {
            this.b = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a k(@z1 String str) {
            this.f = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a l(@z1 String str) {
            this.e = str;
            return this;
        }

        @Override // com.p7700g.p99005.q32.a
        public q32.a m(@z1 Integer num) {
            this.a = num;
            return this;
        }
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String b() {
        return this.l;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String c() {
        return this.j;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String d() {
        return this.d;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q32) {
            q32 q32Var = (q32) obj;
            Integer num = this.a;
            if (num != null ? num.equals(q32Var.m()) : q32Var.m() == null) {
                String str = this.b;
                if (str != null ? str.equals(q32Var.j()) : q32Var.j() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(q32Var.f()) : q32Var.f() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(q32Var.d()) : q32Var.d() == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(q32Var.l()) : q32Var.l() == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(q32Var.k()) : q32Var.k() == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(q32Var.h()) : q32Var.h() == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(q32Var.e()) : q32Var.e() == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(q32Var.g()) : q32Var.g() == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(q32Var.c()) : q32Var.c() == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(q32Var.i()) : q32Var.i() == null) {
                                                        String str11 = this.l;
                                                        if (str11 == null) {
                                                            if (q32Var.b() == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(q32Var.b())) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String f() {
        return this.c;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String g() {
        return this.i;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String i() {
        return this.k;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String j() {
        return this.b;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String k() {
        return this.f;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public String l() {
        return this.e;
    }

    @Override // com.p7700g.p99005.q32
    @z1
    public Integer m() {
        return this.a;
    }

    public String toString() {
        StringBuilder G = wo1.G("AndroidClientInfo{sdkVersion=");
        G.append(this.a);
        G.append(", model=");
        G.append(this.b);
        G.append(", hardware=");
        G.append(this.c);
        G.append(", device=");
        G.append(this.d);
        G.append(", product=");
        G.append(this.e);
        G.append(", osBuild=");
        G.append(this.f);
        G.append(", manufacturer=");
        G.append(this.g);
        G.append(", fingerprint=");
        G.append(this.h);
        G.append(", locale=");
        G.append(this.i);
        G.append(", country=");
        G.append(this.j);
        G.append(", mccMnc=");
        G.append(this.k);
        G.append(", applicationBuild=");
        return wo1.C(G, this.l, "}");
    }

    private s32(@z1 Integer num, @z1 String str, @z1 String str2, @z1 String str3, @z1 String str4, @z1 String str5, @z1 String str6, @z1 String str7, @z1 String str8, @z1 String str9, @z1 String str10, @z1 String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }
}