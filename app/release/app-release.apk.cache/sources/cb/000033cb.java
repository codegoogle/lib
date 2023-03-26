package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.ak;
import com.ironsource.mediationsdk.logger.IronLog;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.fe3;
import com.p7700g.p99005.ge3;
import com.p7700g.p99005.k21;
import com.p7700g.p99005.nr;
import com.p7700g.p99005.ya2;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a extends Thread {
    private static final fe3 s = new AnonymousClass1();
    private static final ge3 t = new C0111a();
    private final int x;
    public fe3 u = s;
    private ge3 v = t;
    private final Handler w = new Handler(Looper.getMainLooper());
    private String y = "";
    public boolean z = false;
    public boolean A = false;
    private volatile int B = 0;
    private int C = 1;
    private int D = 0;
    private final Runnable E = new b();

    /* renamed from: com.ironsource.environment.a$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass1 implements fe3 {
        public static String a(int i) {
            String str = "not defined message for " + i;
            if (i != 404) {
                switch (i) {
                    case 1004:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case 1006:
                        return "http empty response";
                    default:
                        switch (i) {
                            case 1008:
                                return "socket timeout exception";
                            case nr.j /* 1009 */:
                                return "io exception";
                            case 1010:
                                return "uri syntax exception";
                            case 1011:
                                return "http error code";
                            default:
                                switch (i) {
                                    case nr.s /* 1018 */:
                                        return "file not found exception";
                                    case nr.t /* 1019 */:
                                        return "out of memory exception";
                                    case 1020:
                                        return "failed to create folder for file";
                                    default:
                                        return str;
                                }
                        }
                }
            }
            return "http not found";
        }

        public static String a(Context context) {
            ConnectivityManager connectivityManager;
            String str;
            StringBuilder sb = new StringBuilder();
            if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            str = "3g";
                        } else if (type == 1) {
                            str = k21.b;
                        } else {
                            sb.append(typeName);
                        }
                        sb.append(str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        }

        public static String a(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8").replace(ya2.z, "%20");
            } catch (UnsupportedEncodingException unused) {
                return "";
            }
        }

        public static String a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                return Base64.encodeToString(b(str.getBytes("UTF-8"), (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)))), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on string encryption error: " + e.getMessage());
                e.printStackTrace();
                return "";
            }
        }

        public static String a(byte[] bArr) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return sb.toString();
                    }
                    sb.append(readLine);
                }
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while decompressing " + e);
                return null;
            }
        }

        public static Map<String, Object> a(Object[][] objArr) {
            HashMap hashMap = new HashMap();
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
            return hashMap;
        }

        public static void a(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                throw new Exception("url is null");
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            context.startActivity(intent);
        }

        public static byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }

        public static JSONObject b(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", str);
                jSONObject.put("adViewId", str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        public static boolean b(Context context) {
            ConnectivityManager connectivityManager;
            if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public static byte[] b(String str) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        }

        private static byte[] b(byte[] bArr, PublicKey publicKey) {
            try {
                Cipher cipher = Cipher.getInstance(CryptoConstants.CIPHER_RSA);
                cipher.init(1, publicKey);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on encryption error: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }

        public static int c(Context context) {
            if (context != null) {
                try {
                    return context.getResources().getConfiguration().mcc;
                } catch (Exception e) {
                    e.printStackTrace();
                    return -1;
                }
            }
            return -1;
        }

        public static String c() {
            try {
                new ak();
                return ak.a();
            } catch (Throwable unused) {
                return ",kiang";
            }
        }

        public static String c(String str) {
            return Base64.encodeToString(str.getBytes(), 10);
        }

        public static int d(Context context) {
            if (context != null) {
                try {
                    return context.getResources().getConfiguration().mnc;
                } catch (Exception e) {
                    e.printStackTrace();
                    return -1;
                }
            }
            return -1;
        }

        public static boolean d() {
            try {
                new ak();
                ak.a();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public static String e(Context context) {
            if (context != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    return telephonyManager != null ? telephonyManager.getSimOperator() : "";
                } catch (Exception e) {
                    e.printStackTrace();
                    return "";
                }
            }
            return "";
        }

        public static int f(Context context) {
            if (context != null) {
                try {
                    return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return -1;
        }

        @Override // com.p7700g.p99005.fe3
        public final void a() {
        }

        @Override // com.p7700g.p99005.fe3
        public final void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* renamed from: com.ironsource.environment.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0111a implements ge3 {
        @Override // com.p7700g.p99005.ge3
        public final void a(InterruptedException interruptedException) {
            interruptedException.getMessage();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.B = (aVar.B + 1) % Integer.MAX_VALUE;
        }
    }

    public a(int i) {
        this.x = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("|ANR-ANRHandler|");
        while (!isInterrupted() && this.D < this.C) {
            int i = this.B;
            this.w.post(this.E);
            try {
                Thread.sleep(this.x);
                if (this.B != i) {
                    this.D = 0;
                } else if (this.A || !Debug.isDebuggerConnected()) {
                    this.D++;
                    this.u.a();
                    String str = e.c;
                    if (str != null && !str.trim().isEmpty()) {
                        new c(e.c, String.valueOf(System.currentTimeMillis()), "ANR").d();
                    }
                } else {
                    int i2 = this.B;
                    int i3 = this.B;
                }
            } catch (InterruptedException e) {
                this.v.a(e);
                return;
            }
        }
        if (this.D >= this.C) {
            this.u.b();
        }
    }
}