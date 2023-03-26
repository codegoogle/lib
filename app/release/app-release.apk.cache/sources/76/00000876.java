package com.anythink.expressad.foundation.h;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.PowerManager;
import android.os.StatFs;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.k21;
import com.p7700g.p99005.pt0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.yb0;
import com.p7700g.p99005.zg2;
import com.p7700g.p99005.zq5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s extends f {
    public static final String a = "SameTools";
    public static List<String> b = null;
    public static final String c = "(-?[0-9]+)(,[0-9]+)*(\\.[0-9]+)?";
    private static char[] d = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};
    private static char[] e = {'.', 'X'};
    private static int f = 0;
    private static int g = 1;
    private static int h = 2;
    private static int i = 3;
    private static int j = 0;
    private static int k = 7;
    private static int l = 14;
    private static int m = 19;
    private static int n = 16;
    private static int o = 26;
    private static String p = "[一-龥]";
    private static Pattern q = Pattern.compile("[一-龥]");
    private static int r = 1;
    private static boolean s = true;
    private static Map<String, String> t;

    public static <T extends String> boolean a(T t2) {
        return t2 == null || t2.length() == 0;
    }

    public static boolean b(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static float c(Context context) {
        if (context != null) {
            try {
                float f2 = context.getResources().getDisplayMetrics().density;
                if (f2 == 0.0f) {
                    return 2.5f;
                }
                return f2;
            } catch (Exception e2) {
                e2.printStackTrace();
                return 2.5f;
            }
        }
        return 2.5f;
    }

    public static void c() {
    }

    private static int d(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private static boolean e() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    private static long f() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    private static <T extends String> boolean g(T t2) {
        return t2 != null && t2.length() > 0;
    }

    private static String h() {
        return new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date(System.currentTimeMillis()));
    }

    private static boolean i() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    private static long j() {
        if (i()) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        }
        return -1L;
    }

    private static boolean k(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return k21.b.equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US));
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static float l(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static boolean l() {
        return true;
    }

    private static float m(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    private static boolean m() {
        return true;
    }

    private static float n(Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    private static boolean n() {
        return true;
    }

    private static boolean o() {
        return true;
    }

    private static boolean o(String str) {
        return q.matcher(str).find();
    }

    private static boolean p() {
        return true;
    }

    private static boolean p(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.length() == 4) {
                int parseInt = Integer.parseInt(str.substring(0, 2));
                if (parseInt > 0 && parseInt < 13) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static String q() {
        String str = Build.MODEL;
        n.a(a, "phoneType is : ".concat(String.valueOf(str)));
        return str;
    }

    private static boolean r(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("[\\u4E00-\\u9FBF]+").matcher(str.trim()).find();
    }

    private static String s() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th) {
            th.printStackTrace();
            str = "";
        }
        if (v.a(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            return sb.toString();
        }
        return str;
    }

    private static JSONArray t() {
        JSONArray jSONArray = new JSONArray();
        try {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.foundation.b.a.b().e();
            if (com.anythink.expressad.d.b.b() == null) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.b.c();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONArray;
    }

    private static String u() {
        String str;
        str = "";
        try {
            JSONArray t2 = t();
            str = t2.length() > 0 ? b(t2) : "";
            n.b(a, "get excludes:".concat(String.valueOf(str)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str;
    }

    private static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    public static int d(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return o(context).heightPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static boolean i(String str) {
        int length;
        if (!TextUtils.isEmpty(str) && (length = str.length()) > 1) {
            char charAt = str.charAt(0);
            for (int i2 = 1; i2 < length; i2++) {
                if (charAt != str.charAt(i2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static DisplayMetrics o(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    private static <T> boolean a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    private static int c(Context context, float f2) {
        return (int) ((f2 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[0-9]+$").matcher(str).find();
    }

    private static boolean m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z]+$").matcher(str).find();
    }

    private static boolean n(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z0-9]+$").matcher(str).find();
    }

    private static boolean p(Context context) {
        return f.a(context);
    }

    private static boolean q(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int charAt = str.charAt(i2) + 1;
            char c2 = (char) charAt;
            i2++;
            if (i2 < length) {
                c2 = str.charAt(i2);
                continue;
            }
            if (c2 != charAt) {
                return false;
            }
        }
        return true;
    }

    private static String r() {
        try {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.foundation.b.a.b().e();
            if (com.anythink.expressad.d.b.b() == null) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.b.c();
            }
            JSONArray jSONArray = new JSONArray();
            return jSONArray.length() > 0 ? b(jSONArray) : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int a(Context context, float f2) {
        float f3 = 2.5f;
        if (context != null) {
            try {
                float f4 = context.getResources().getDisplayMetrics().density;
                if (f4 != 0.0f) {
                    f3 = f4;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return (int) ((f2 / f3) + 0.5f);
    }

    private static boolean b(com.anythink.expressad.foundation.d.c cVar) {
        return (cVar == null || TextUtils.isEmpty(cVar.ah())) ? false : true;
    }

    private static String c(String str, int i2) {
        if (str == null || i2 <= 0 || str.length() < i2) {
            return null;
        }
        n.a(a, "getFixedNuater, str is : ".concat(str));
        Matcher matcher = Pattern.compile("\\d{" + i2 + "}").matcher(str);
        if (matcher.find()) {
            int start = matcher.start();
            return str.substring(start, matcher.group().length() + start);
        }
        return null;
    }

    private static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        char[] charArray = str.toCharArray();
        HashMap hashMap = new HashMap();
        int i2 = 0;
        for (char c2 : charArray) {
            Integer num = (Integer) hashMap.get(Character.valueOf(c2));
            int intValue = (num == null ? 0 : num.intValue()) + 1;
            hashMap.put(Character.valueOf(c2), Integer.valueOf(intValue));
            if (i2 < intValue) {
                i2 = intValue;
            }
        }
        return i2;
    }

    private static String b(Context context, String str) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str);
            if (obj instanceof String) {
                return obj.toString();
            }
            if (obj instanceof Integer) {
                StringBuilder sb = new StringBuilder();
                sb.append(((Integer) obj).intValue());
                return sb.toString();
            } else if (obj instanceof Boolean) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((Boolean) obj).booleanValue());
                return sb2.toString();
            } else {
                return "";
            }
        } catch (Exception e2) {
            n.a(a, e2);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r2.equals("4") != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.B);
            try {
                try {
                    if (!TextUtils.isEmpty(queryParameter)) {
                        if (!queryParameter.equals("2")) {
                        }
                        z = true;
                        if (TextUtils.isEmpty(parse.getQueryParameter(com.anythink.expressad.a.W))) {
                            return true;
                        }
                        return z;
                    }
                    if (TextUtils.isEmpty(parse.getQueryParameter(com.anythink.expressad.a.W))) {
                    }
                } catch (Throwable unused) {
                    return z;
                }
            } catch (Exception e2) {
                e = e2;
                n.d(a, e.getMessage());
                return false;
            }
            z = false;
        } catch (Exception e3) {
            e = e3;
            z = false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return o(context).widthPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static long g() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        }
        return -1L;
    }

    private static long k() {
        if (i()) {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        }
        return -1L;
    }

    private static synchronized String s(String str) {
        synchronized (s.class) {
            String str2 = com.anythink.expressad.foundation.b.a.b().e() + "_" + str;
            Map<String, String> map = t;
            if (map == null || !map.containsKey(str2)) {
                return null;
            }
            return t.get(str2);
        }
    }

    private static void a(Activity activity) {
        InputMethodManager inputMethodManager;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static int i(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", pt0.a) != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", pt0.a));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    private static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str) ? false : Pattern.compile("^[0-9]+$").matcher(str).find()) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length - 1) {
                char charAt = str.charAt(i2);
                char c2 = (char) (charAt + 1);
                if (charAt == '9') {
                    c2 = '0';
                }
                i2++;
                if (str.charAt(i2) != c2) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private static boolean q(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isScreenOn();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static final synchronized String d() {
        synchronized (s.class) {
        }
        return "";
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.Y);
                if (TextUtils.isEmpty(queryParameter)) {
                    return false;
                }
                return queryParameter.equals("0");
            }
            return false;
        } catch (Exception e2) {
            n.d(a, e2.getMessage());
            return false;
        }
    }

    private static void a(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context == null || view == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.z);
                if (TextUtils.isEmpty(queryParameter)) {
                    return false;
                }
                return queryParameter.equals("1");
            }
            return false;
        } catch (Exception e2) {
            n.d(a, e2.getMessage());
            return false;
        }
    }

    private static boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str) ? false : Pattern.compile("^[a-zA-Z]+$").matcher(str).find()) {
            int length = str.length();
            String lowerCase = str.toLowerCase();
            int i2 = 0;
            while (i2 < length - 1) {
                char charAt = lowerCase.charAt(i2);
                char c2 = (char) (charAt + 1);
                if (charAt == 'z') {
                    c2 = 'a';
                }
                i2++;
                if (lowerCase.charAt(i2) != c2) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private static Bitmap a(Bitmap bitmap, int i2, int i3) {
        try {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(i2 / width, i3 / height);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(String str) {
        try {
            return v.b(str) ? URLEncoder.encode(str, "utf-8") : "";
        } catch (Throwable th) {
            n.b(a, th.getMessage(), th);
            return "";
        }
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int b(Context context, float f2) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f2 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static int j(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.a b2 = com.anythink.expressad.d.b.b();
            if (b2 == null) {
                com.anythink.expressad.d.b.a();
                b2 = com.anythink.expressad.d.b.c();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return b2.R();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String c(List<String> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str : list) {
                        if (v.b(str)) {
                            jSONArray.put(str);
                        }
                    }
                    return jSONArray.toString();
                }
            } catch (Throwable th) {
                n.b(a, th.getMessage(), th);
            }
        }
        return zq5.e;
    }

    private static void b(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context == null || view == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 0);
    }

    private static String a(long j2) {
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis < yb0.g) {
            return "Now";
        }
        if (currentTimeMillis < 3600000) {
            return "One hour";
        }
        if (currentTimeMillis < com.anythink.expressad.foundation.g.a.bV) {
            return wo1.z(new StringBuilder(), (int) (currentTimeMillis / 3600000), "Hours");
        }
        return DateFormat.format("MM-dd kk:mm", System.currentTimeMillis()).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long b(File file) {
        long j2 = 0;
        FileInputStream fileInputStream = null;
        try {
            if (file.exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    j2 = fileInputStream2.available();
                    fileInputStream = fileInputStream2;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } else {
                file.createNewFile();
            }
        } catch (Exception unused3) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long a(File file) {
        long j2 = 0;
        FileInputStream fileInputStream = null;
        try {
            if (file.exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    j2 = fileInputStream2.available();
                    fileInputStream = fileInputStream2;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception unused3) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void c(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(5122);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static int b(Activity activity) {
        return activity.getWindow().findViewById(16908290).getTop() - d(activity);
    }

    private static final char[] c(int i2) {
        StringBuilder sb;
        if (i2 == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(r.b, k)));
            sb.append(e[j]);
            sb.append(String.valueOf(Arrays.copyOfRange(r.b, k, l)));
            sb.append(e[j]);
            sb.append(String.valueOf(Arrays.copyOfRange(r.b, l, n)));
            sb.append(e[j]);
            sb.append(String.valueOf(q.c));
        } else if (i2 == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(r.b, k)));
            sb.append(e[j]);
            sb.append(String.valueOf(Arrays.copyOfRange(r.b, k, l)));
            sb.append(e[j]);
            sb.append(String.valueOf(Arrays.copyOfRange(r.b, m, o)));
        } else if (i2 == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(r.b, n, m)));
            sb.append(String.valueOf(d));
        } else if (i2 != 3) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(r.b, n, m)));
            sb.append(String.valueOf(q.c));
        }
        return sb.toString().toCharArray();
    }

    public static int a() {
        int i2 = r;
        r = i2 + 1;
        return i2;
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static void b(View view) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i2 = layoutParams.height;
        if (i2 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
    }

    private static boolean a(JSONObject jSONObject, String str) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        hashMap.remove("sign");
        return b(hashMap, str).equals((String) hashMap.get("sign"));
    }

    private static boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Pattern.compile(str).matcher(str2).find();
    }

    private static String b(HashMap<String, String> hashMap, String str) {
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, String>>() { // from class: com.anythink.expressad.foundation.h.s.1
            private static int a(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
                return entry.getKey().toString().compareTo(entry2.getKey());
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
                return entry.getKey().toString().compareTo(entry2.getKey());
            }
        });
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append(AppCenter.KEY_VALUE_DELIMITER);
            sb.append((String) entry.getValue());
            sb.append("&");
        }
        if (sb.toString().endsWith("&")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str);
        return o.a(sb.toString());
    }

    private static boolean a(HashMap<String, String> hashMap, String str) {
        hashMap.remove("sign");
        return b(hashMap, str).equals(hashMap.get("sign"));
    }

    private static boolean a(String str, int i2) {
        int i3 = i2 + 4;
        if (str != null && str.length() == i3 && str.matches("[0-9]+")) {
            int parseInt = Integer.parseInt(str.substring(0, i2));
            int i4 = i2 + 2;
            int parseInt2 = Integer.parseInt(str.substring(i2, i4));
            int parseInt3 = Integer.parseInt(str.substring(i4, i3));
            if (parseInt > 0 && parseInt2 > 0 && parseInt2 <= 12 && parseInt3 > 0 && parseInt3 <= 31) {
                return parseInt2 != 2 ? !(parseInt2 == 4 || parseInt2 == 6 || parseInt2 == 9 || parseInt2 == 11) || parseInt3 <= 30 : ((parseInt % 4 != 0 || parseInt % 100 == 0) && parseInt % 400 != 0) ? parseInt3 <= 28 : parseInt3 <= 29;
            }
            return false;
        }
        return false;
    }

    private static SpannableString b(String str, int i2) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        Matcher matcher = Pattern.compile(c).matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            spannableString.setSpan(new ForegroundColorSpan(i2), start, matcher.group().length() + start, 34);
        }
        return spannableString;
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (charSequence.charAt(i3) != ' ') {
                i2++;
            }
        }
        return i2;
    }

    private static String b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a b2 = com.anythink.expressad.d.b.b();
        if (b2 == null) {
            com.anythink.expressad.d.b.a();
            b2 = com.anythink.expressad.d.b.c();
        }
        int l2 = b2.l();
        if (jSONArray.length() > l2) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < l2; i2++) {
                try {
                    jSONArray2.put(jSONArray.get(i2));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            return jSONArray2.toString();
        }
        return jSONArray.toString();
    }

    private static Drawable a(Bitmap bitmap) {
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return null;
    }

    public static boolean a(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            try {
                return cVar.M() == 1;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static int a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Integer.parseInt((String) obj);
                }
                return 0;
            } catch (Throwable th) {
                n.b(a, th.getMessage(), th);
                return 0;
            }
        }
        return 0;
    }

    public static double a(Double d2) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d2);
            return v.b(format) ? Double.parseDouble(format) : zg2.s;
        } catch (Exception e2) {
            e2.printStackTrace();
            return zg2.s;
        }
    }

    public static double b(String str) {
        try {
            return !TextUtils.isEmpty(str) ? Double.parseDouble(str) : zg2.s;
        } catch (Exception e2) {
            e2.printStackTrace();
            return zg2.s;
        }
    }

    private static String b(int i2) {
        String valueOf;
        try {
            if (i2 >= 0 && i2 < 10) {
                valueOf = "0" + Integer.toString(i2);
            } else {
                valueOf = String.valueOf(i2);
            }
            return valueOf;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    private static String a(int i2) {
        int i3;
        String str;
        if (i2 <= 0) {
            return "00:00";
        }
        try {
            int i4 = i2 / 60;
            if (i4 < 60) {
                str = b(i4) + ":" + b(i2 % 60);
            } else {
                int i5 = i4 / 60;
                if (i5 > 99) {
                    return "99:59:59";
                }
                int i6 = (i2 - (i5 * com.anythink.expressad.d.a.b.ck)) - ((i4 % 60) * 60);
                str = b(i5) + ":" + b(i3) + ":" + b(i6);
            }
            return str;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static Object b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(c(f))).getMethod(String.valueOf(c(h)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(c(g))).getMethod(String.valueOf(c(i)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean b(List list) {
        return !(list == null || list.isEmpty());
    }

    private static <T> boolean b(T[] tArr) {
        return !(tArr == null || tArr.length == 0);
    }

    private static void a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        try {
            imageView.setImageResource(0);
            imageView.setImageDrawable(null);
            imageView.setImageURI(null);
            imageView.setImageBitmap(null);
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
            }
        }
    }

    public static List<String> a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        String optString = jSONArray.optString(i2);
                        if (v.b(optString)) {
                            arrayList.add(optString);
                        }
                    }
                    return arrayList;
                }
                return null;
            } catch (Throwable th) {
                n.b(a, th.getMessage(), th);
                return null;
            }
        }
        return null;
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z;
        synchronized (s.class) {
            z = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (b(str, context) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z;
    }

    private static synchronized String a(String str, Context context, String str2) {
        StringBuilder sb;
        String sb2;
        synchronized (s.class) {
            try {
                Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    sb = new StringBuilder("&rtins_type=");
                } else {
                    sb = new StringBuilder("?rtins_type=");
                }
            } catch (Exception unused) {
                sb = new StringBuilder("&rtins_type=");
            }
            try {
                if (b(str2, context) != null) {
                    sb.append(1);
                } else {
                    sb.append(2);
                }
            } catch (Exception unused2) {
                sb.append(0);
            }
            sb2 = sb.toString();
        }
        return sb2;
    }

    public static synchronized String a(Context context, String str, String str2) {
        String sb;
        synchronized (s.class) {
            StringBuilder sb2 = new StringBuilder(str2);
            try {
                sb2.append(a(str2, context, str));
            } catch (Exception unused) {
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public static synchronized void a(String str, String str2) {
        synchronized (s.class) {
            if (t == null) {
                t = new HashMap();
            }
            t.put(com.anythink.expressad.foundation.b.a.b().e() + "_" + str, str2);
        }
    }
}