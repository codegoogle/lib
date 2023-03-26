package com.p7700g.p99005;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import com.p7700g.p99005.i2;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LinkifyCompat.java */
/* loaded from: classes.dex */
public final class po {
    private static final String[] a = new String[0];
    private static final Comparator<b> b = no.s;

    /* compiled from: LinkifyCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @e1
        public static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* compiled from: LinkifyCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public URLSpan a;
        public String b;
        public int c;
        public int d;
    }

    /* compiled from: LinkifyCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    private po() {
    }

    private static void a(@x1 TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void b(@x1 TextView textView, @x1 Pattern pattern, @z1 String str) {
        if (q()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            d(textView, pattern, str, null, null, null);
        }
    }

    public static void c(@x1 TextView textView, @x1 Pattern pattern, @z1 String str, @z1 Linkify.MatchFilter matchFilter, @z1 Linkify.TransformFilter transformFilter) {
        if (q()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            d(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    public static void d(@x1 TextView textView, @x1 Pattern pattern, @z1 String str, @z1 String[] strArr, @z1 Linkify.MatchFilter matchFilter, @z1 Linkify.TransformFilter transformFilter) {
        if (q()) {
            a.a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (h(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            a(textView);
        }
    }

    public static boolean e(@x1 Spannable spannable, int i) {
        if (q()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            l(arrayList, spannable, hp.w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            l(arrayList, spannable, hp.A, new String[]{em.a}, null, null);
        }
        if ((i & 8) != 0) {
            m(arrayList, spannable);
        }
        p(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == null) {
                j(bVar.b, bVar.c, bVar.d, spannable);
            }
        }
        return true;
    }

    public static boolean f(@x1 Spannable spannable, @x1 Pattern pattern, @z1 String str) {
        if (q()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return h(spannable, pattern, str, null, null, null);
    }

    public static boolean g(@x1 Spannable spannable, @x1 Pattern pattern, @z1 String str, @z1 Linkify.MatchFilter matchFilter, @z1 Linkify.TransformFilter transformFilter) {
        if (q()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return h(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    public static boolean h(@x1 Spannable spannable, @x1 Pattern pattern, @z1 String str, @z1 String[] strArr, @z1 Linkify.MatchFilter matchFilter, @z1 Linkify.TransformFilter transformFilter) {
        if (q()) {
            return a.b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str2 = strArr[i];
            i++;
            strArr2[i] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) && group != null) {
                j(o(group, strArr2, matcher, transformFilter), start, end, spannable);
                z = true;
            }
        }
        return z;
    }

    public static boolean i(@x1 TextView textView, int i) {
        if (q()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (e((Spannable) text, i)) {
                a(textView);
                return true;
            }
        } else {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (e(valueOf, i)) {
                a(textView);
                textView.setText(valueOf);
                return true;
            }
        }
        return false;
    }

    private static void j(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    private static String k(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return oo.c(str);
    }

    private static void l(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    b bVar = new b();
                    bVar.b = o(group, strArr, matcher, transformFilter);
                    bVar.c = start;
                    bVar.d = end;
                    arrayList.add(bVar);
                }
            }
        }
    }

    private static void m(ArrayList<b> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String k = k(obj);
                if (k != null && (indexOf = obj.indexOf(k)) >= 0) {
                    b bVar = new b();
                    int length = k.length() + indexOf;
                    bVar.c = indexOf + i;
                    i += length;
                    bVar.d = i;
                    obj = obj.substring(length);
                    try {
                        String encode = URLEncoder.encode(k, "UTF-8");
                        bVar.b = "geo:0,0?q=" + encode;
                        arrayList.add(bVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    public static /* synthetic */ int n(b bVar, b bVar2) {
        int i = bVar.c;
        int i2 = bVar2.c;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(bVar2.d, bVar.d);
    }

    private static String o(@x1 String str, @x1 String[] strArr, Matcher matcher, @z1 Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    StringBuilder G = wo1.G(str2);
                    G.append(str.substring(str2.length()));
                    str = G.toString();
                }
            } else {
                i++;
            }
        }
        return (z || strArr.length <= 0) ? str : wo1.C(new StringBuilder(), strArr[0], str);
    }

    private static void p(ArrayList<b> arrayList, Spannable spannable) {
        URLSpan[] uRLSpanArr;
        int i;
        int i2 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.a = uRLSpan;
            bVar.c = spannable.getSpanStart(uRLSpan);
            bVar.d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, b);
        int size = arrayList.size();
        while (i2 < size - 1) {
            b bVar2 = arrayList.get(i2);
            int i3 = i2 + 1;
            b bVar3 = arrayList.get(i3);
            int i4 = bVar2.c;
            int i5 = bVar3.c;
            if (i4 <= i5 && (i = bVar2.d) > i5) {
                int i6 = bVar3.d;
                int i7 = (i6 > i && i - i4 <= i6 - i5) ? i - i4 < i6 - i5 ? i2 : -1 : i3;
                if (i7 != -1) {
                    Object obj = arrayList.get(i7).a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i7);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    private static boolean q() {
        return Build.VERSION.SDK_INT >= 28;
    }
}