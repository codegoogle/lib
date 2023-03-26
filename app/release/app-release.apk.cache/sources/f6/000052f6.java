package com.p7700g.p99005;

import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: UriPattern.java */
/* loaded from: classes3.dex */
public class ns3 {
    public static final ns3 a = new ns3();
    private static final b b = new b();
    private final String c;
    private final Pattern d;
    private final int[] e;

    /* compiled from: UriPattern.java */
    /* loaded from: classes3.dex */
    public static final class b implements MatchResult {
        private b() {
        }

        @Override // java.util.regex.MatchResult
        public int end() {
            return 0;
        }

        @Override // java.util.regex.MatchResult
        public int end(int i) {
            if (i == 0) {
                return end();
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.regex.MatchResult
        public String group() {
            return "";
        }

        @Override // java.util.regex.MatchResult
        public String group(int i) {
            if (i == 0) {
                return group();
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.regex.MatchResult
        public int groupCount() {
            return 0;
        }

        @Override // java.util.regex.MatchResult
        public int start() {
            return 0;
        }

        @Override // java.util.regex.MatchResult
        public int start(int i) {
            if (i == 0) {
                return start();
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* compiled from: UriPattern.java */
    /* loaded from: classes3.dex */
    public final class c implements MatchResult {
        private final MatchResult a;

        public c(MatchResult matchResult) {
            this.a = matchResult;
        }

        @Override // java.util.regex.MatchResult
        public int end() {
            return this.a.end();
        }

        @Override // java.util.regex.MatchResult
        public String group() {
            return this.a.group();
        }

        @Override // java.util.regex.MatchResult
        public int groupCount() {
            return ns3.this.e.length - 1;
        }

        @Override // java.util.regex.MatchResult
        public int start() {
            return this.a.start();
        }

        @Override // java.util.regex.MatchResult
        public int end(int i) {
            if (i <= groupCount()) {
                return i > 0 ? this.a.end(ns3.this.e[i - 1]) : this.a.end();
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.regex.MatchResult
        public String group(int i) {
            if (i <= groupCount()) {
                return i > 0 ? this.a.group(ns3.this.e[i - 1]) : this.a.group();
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.regex.MatchResult
        public int start(int i) {
            if (i <= groupCount()) {
                return i > 0 ? this.a.start(ns3.this.e[i - 1]) : this.a.start();
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public ns3() {
        this.c = "";
        this.d = null;
        this.e = null;
    }

    private static Pattern b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return Pattern.compile(str);
    }

    public final int[] c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final MatchResult e(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            Pattern pattern = this.d;
            if (pattern == null) {
                return null;
            }
            Matcher matcher = pattern.matcher(charSequence);
            if (matcher.matches()) {
                return this.e.length > 0 ? new c(matcher) : matcher;
            }
            return null;
        } else if (this.d == null) {
            return b;
        } else {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.c;
            String str2 = ((ns3) obj).c;
            if (str != str2) {
                return str != null && str.equals(str2);
            }
            return true;
        }
        return false;
    }

    public final boolean f(CharSequence charSequence, List<String> list) {
        if (list != null) {
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                return this.d == null;
            }
            Pattern pattern = this.d;
            if (pattern == null) {
                return false;
            }
            Matcher matcher = pattern.matcher(charSequence);
            if (matcher.matches()) {
                list.clear();
                if (this.e.length > 0) {
                    while (true) {
                        int[] iArr = this.e;
                        if (i >= iArr.length - 1) {
                            break;
                        }
                        list.add(matcher.group(iArr[i]));
                        i++;
                    }
                } else {
                    for (int i2 = 1; i2 <= matcher.groupCount(); i2++) {
                        list.add(matcher.group(i2));
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    public final boolean g(CharSequence charSequence, List<String> list, Map<String, String> map) {
        if (map != null) {
            if (charSequence == null || charSequence.length() == 0) {
                return this.d == null;
            }
            Pattern pattern = this.d;
            if (pattern == null) {
                return false;
            }
            Matcher matcher = pattern.matcher(charSequence);
            if (matcher.matches()) {
                map.clear();
                for (int i = 0; i < list.size(); i++) {
                    String str = list.get(i);
                    int[] iArr = this.e;
                    String group = matcher.group(iArr.length > 0 ? iArr[i] : i + 1);
                    String str2 = map.get(str);
                    if (str2 != null && !str2.equals(group)) {
                        return false;
                    }
                    map.put(str, group);
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    public ns3(String str) {
        this(str, ps3.a);
    }

    public ns3(String str, int[] iArr) {
        this(b(str), iArr);
    }

    public ns3(Pattern pattern) {
        this(pattern, ps3.a);
    }

    public ns3(Pattern pattern, int[] iArr) {
        if (pattern != null) {
            this.c = pattern.toString();
            this.d = pattern;
            this.e = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }
}