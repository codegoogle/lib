package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: FindAddress.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oo {
    private static final int a = 4;
    private static final int b = 14;
    private static final int c = 5;
    private static final int d = 25;
    private static final int e = 5;
    private static final String g = "\n\u000b\f\r\u0085\u2028\u2029";
    private static final String h = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";
    private static final String i = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String j = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String k = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final String m = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String n = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final String o = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String p = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final a[] f = {new a(99, 99, -1, -1), new a(35, 36, -1, -1), new a(71, 72, -1, -1), new a(96, 96, -1, -1), new a(85, 86, -1, -1), new a(90, 96, -1, -1), new a(80, 81, -1, -1), new a(6, 6, -1, -1), new a(20, 20, -1, -1), new a(19, 19, -1, -1), new a(32, 34, -1, -1), new a(96, 96, -1, -1), new a(30, 31, -1, -1), new a(96, 96, -1, -1), new a(96, 96, -1, -1), new a(50, 52, -1, -1), new a(83, 83, -1, -1), new a(60, 62, -1, -1), new a(46, 47, -1, -1), new a(66, 67, 73, -1), new a(40, 42, -1, -1), new a(70, 71, -1, -1), new a(1, 2, -1, -1), new a(20, 21, -1, -1), new a(3, 4, -1, -1), new a(96, 96, -1, -1), new a(48, 49, -1, -1), new a(55, 56, -1, -1), new a(63, 65, -1, -1), new a(96, 96, -1, -1), new a(38, 39, -1, -1), new a(55, 56, -1, -1), new a(27, 28, -1, -1), new a(58, 58, -1, -1), new a(68, 69, -1, -1), new a(3, 4, -1, -1), new a(7, 8, -1, -1), new a(87, 88, 86, -1), new a(88, 89, 96, -1), new a(10, 14, 0, 6), new a(43, 45, -1, -1), new a(73, 74, -1, -1), new a(97, 97, -1, -1), new a(15, 19, -1, -1), new a(6, 6, 0, 9), new a(96, 96, -1, -1), new a(2, 2, -1, -1), new a(29, 29, -1, -1), new a(57, 57, -1, -1), new a(37, 38, -1, -1), new a(75, 79, 87, 88), new a(84, 84, -1, -1), new a(22, 24, 20, -1), new a(6, 9, -1, -1), new a(5, 5, -1, -1), new a(98, 99, -1, -1), new a(53, 54, -1, -1), new a(24, 26, -1, -1), new a(82, 83, -1, -1)};
    private static final Pattern l = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final Pattern q = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final Pattern r = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final Pattern s = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final Pattern t = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);
    private static final Pattern u = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* compiled from: FindAddress.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean a(String str) {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            return (this.a <= parseInt && parseInt <= this.b) || parseInt == this.c || parseInt == this.d;
        }
    }

    private oo() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        return -r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int a(String str, MatchResult matchResult) {
        int length;
        MatchResult i2;
        int end = matchResult.end();
        Matcher matcher = l.matcher(str);
        String str2 = "";
        int i3 = 1;
        int i4 = 1;
        boolean z = true;
        boolean z2 = false;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            if (end < str.length()) {
                if (!matcher.find(end)) {
                    length = str.length();
                    break;
                } else if (matcher.end() - matcher.start() > 25) {
                    length = matcher.end();
                    break;
                } else {
                    while (end < matcher.start()) {
                        int i7 = end + 1;
                        if (g.indexOf(str.charAt(end)) != -1) {
                            i3++;
                        }
                        end = i7;
                    }
                    if (i3 > 5 || (i4 = i4 + 1) > 14) {
                        break;
                    }
                    if (h(str, end) == null) {
                        if (!d(matcher.group(0))) {
                            if (i4 == 5 && !z2) {
                                end = matcher.end();
                                break;
                            }
                            if (z2 && i4 > 4 && (i2 = i(str, end)) != null) {
                                if (str2.equals("et") && i2.group(0).equals(com.anythink.expressad.foundation.d.c.bk)) {
                                    end = i2.end();
                                    break;
                                }
                                Matcher matcher2 = l.matcher(str);
                                if (matcher2.find(i2.end())) {
                                    if (g(matcher2.group(0), i2)) {
                                        return matcher2.end();
                                    }
                                } else {
                                    i6 = i2.end();
                                }
                            }
                            z = false;
                        } else {
                            z = false;
                            z2 = true;
                        }
                    } else if (z && i3 > 1) {
                        return -end;
                    } else {
                        if (i5 == -1) {
                            i5 = end;
                        }
                    }
                    str2 = matcher.group(0);
                    end = matcher.end();
                }
            } else {
                break;
            }
        }
        if (i6 > 0) {
            return i6;
        }
        if (i5 <= 0) {
            i5 = end;
        }
        return -i5;
    }

    private static boolean b(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (Character.isDigit(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 > 5) {
            return false;
        }
        Matcher matcher = t.matcher(str);
        if (matcher.find()) {
            int parseInt = Integer.parseInt(matcher.group(1));
            if (parseInt == 0) {
                return false;
            }
            String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
            int i4 = parseInt % 10;
            if (i4 == 1) {
                return lowerCase.equals(parseInt % 100 != 11 ? "st" : "th");
            } else if (i4 == 2) {
                return lowerCase.equals(parseInt % 100 != 12 ? "nd" : "th");
            } else if (i4 != 3) {
                return lowerCase.equals("th");
            } else {
                return lowerCase.equals(parseInt % 100 != 13 ? "rd" : "th");
            }
        }
        return true;
    }

    public static String c(String str) {
        Matcher matcher = q.matcher(str);
        int i2 = 0;
        while (matcher.find(i2)) {
            if (b(matcher.group(0))) {
                int start = matcher.start();
                int a2 = a(str, matcher);
                if (a2 > 0) {
                    return str.substring(start, a2);
                }
                i2 = -a2;
            } else {
                i2 = matcher.end();
            }
        }
        return null;
    }

    @r2
    public static boolean d(String str) {
        return s.matcher(str).matches();
    }

    @r2
    public static boolean e(String str) {
        return u.matcher(str).matches();
    }

    @r2
    public static boolean f(String str, String str2) {
        return g(str, i(str2, 0));
    }

    private static boolean g(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        while (true) {
            if (groupCount <= 0) {
                break;
            }
            int i2 = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                groupCount = i2;
                break;
            }
            groupCount = i2;
        }
        return u.matcher(str).matches() && f[groupCount].a(str);
    }

    @r2
    public static MatchResult h(String str, int i2) {
        if (i2 <= 0 || o.indexOf(str.charAt(i2 - 1)) != -1) {
            Matcher region = q.matcher(str).region(i2, str.length());
            if (region.lookingAt()) {
                MatchResult matchResult = region.toMatchResult();
                if (b(matchResult.group(0))) {
                    return matchResult;
                }
            }
            return null;
        }
        return null;
    }

    @r2
    public static MatchResult i(String str, int i2) {
        if (i2 <= 0 || j.indexOf(str.charAt(i2 - 1)) != -1) {
            Matcher region = r.matcher(str).region(i2, str.length());
            if (region.lookingAt()) {
                return region.toMatchResult();
            }
            return null;
        }
        return null;
    }
}