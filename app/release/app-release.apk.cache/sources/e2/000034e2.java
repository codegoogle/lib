package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.ironsource.mediationsdk.C1274f;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p7700g.p99005.wo1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1276h {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    public i f;
    private String g;
    private String h;
    private com.ironsource.mediationsdk.utils.c i;
    private InterfaceC1275g j;
    public ISBannerSize k;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        private long A;
        private int B;
        private int D;
        private final URL G;
        private final JSONObject H;
        private final boolean I;
        private final int J;
        private final long K;
        private final boolean L;
        private final boolean M;
        private final int N;
        private WeakReference<InterfaceC1275g> s;
        private int t;
        private String u;
        private String v;
        private List<com.ironsource.mediationsdk.server.b> w;
        private com.ironsource.mediationsdk.server.b x;
        private JSONObject y;
        private JSONObject z;
        private String C = "other";
        private String E = "";
        private int F = 0;

        public a(InterfaceC1275g interfaceC1275g, URL url, JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
            this.s = new WeakReference<>(interfaceC1275g);
            this.G = url;
            this.H = jSONObject;
            this.I = z;
            this.J = i;
            this.K = j;
            this.L = z2;
            this.M = z3;
            this.N = i2;
        }

        private static String a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0153 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00cf A[Catch: Exception -> 0x0234, SocketTimeoutException -> 0x0237, TryCatch #6 {SocketTimeoutException -> 0x0237, Exception -> 0x0234, blocks: (B:12:0x007b, B:15:0x0098, B:20:0x00c5, B:22:0x00cf, B:24:0x00df, B:26:0x00e4, B:28:0x00ff, B:30:0x0116, B:32:0x013a, B:34:0x014d, B:36:0x0153, B:37:0x0157, B:39:0x0161, B:41:0x0168, B:45:0x0176, B:47:0x017c, B:49:0x0189, B:50:0x018f, B:51:0x0194, B:52:0x0195, B:54:0x019f, B:56:0x01a6, B:57:0x01ab, B:58:0x01ac, B:59:0x01cf, B:62:0x01d4, B:63:0x01db, B:65:0x01dd, B:67:0x01e3, B:69:0x01ed, B:70:0x01f5, B:72:0x01fb, B:74:0x0205, B:76:0x0212, B:75:0x020c, B:27:0x00f3, B:23:0x00db, B:18:0x00a2), top: B:106:0x007b }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00db A[Catch: Exception -> 0x0234, SocketTimeoutException -> 0x0237, TryCatch #6 {SocketTimeoutException -> 0x0237, Exception -> 0x0234, blocks: (B:12:0x007b, B:15:0x0098, B:20:0x00c5, B:22:0x00cf, B:24:0x00df, B:26:0x00e4, B:28:0x00ff, B:30:0x0116, B:32:0x013a, B:34:0x014d, B:36:0x0153, B:37:0x0157, B:39:0x0161, B:41:0x0168, B:45:0x0176, B:47:0x017c, B:49:0x0189, B:50:0x018f, B:51:0x0194, B:52:0x0195, B:54:0x019f, B:56:0x01a6, B:57:0x01ab, B:58:0x01ac, B:59:0x01cf, B:62:0x01d4, B:63:0x01db, B:65:0x01dd, B:67:0x01e3, B:69:0x01ed, B:70:0x01f5, B:72:0x01fb, B:74:0x0205, B:76:0x0212, B:75:0x020c, B:27:0x00f3, B:23:0x00db, B:18:0x00a2), top: B:106:0x007b }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e4 A[Catch: Exception -> 0x0234, SocketTimeoutException -> 0x0237, TryCatch #6 {SocketTimeoutException -> 0x0237, Exception -> 0x0234, blocks: (B:12:0x007b, B:15:0x0098, B:20:0x00c5, B:22:0x00cf, B:24:0x00df, B:26:0x00e4, B:28:0x00ff, B:30:0x0116, B:32:0x013a, B:34:0x014d, B:36:0x0153, B:37:0x0157, B:39:0x0161, B:41:0x0168, B:45:0x0176, B:47:0x017c, B:49:0x0189, B:50:0x018f, B:51:0x0194, B:52:0x0195, B:54:0x019f, B:56:0x01a6, B:57:0x01ab, B:58:0x01ac, B:59:0x01cf, B:62:0x01d4, B:63:0x01db, B:65:0x01dd, B:67:0x01e3, B:69:0x01ed, B:70:0x01f5, B:72:0x01fb, B:74:0x0205, B:76:0x0212, B:75:0x020c, B:27:0x00f3, B:23:0x00db, B:18:0x00a2), top: B:106:0x007b }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f3 A[Catch: Exception -> 0x0234, SocketTimeoutException -> 0x0237, TryCatch #6 {SocketTimeoutException -> 0x0237, Exception -> 0x0234, blocks: (B:12:0x007b, B:15:0x0098, B:20:0x00c5, B:22:0x00cf, B:24:0x00df, B:26:0x00e4, B:28:0x00ff, B:30:0x0116, B:32:0x013a, B:34:0x014d, B:36:0x0153, B:37:0x0157, B:39:0x0161, B:41:0x0168, B:45:0x0176, B:47:0x017c, B:49:0x0189, B:50:0x018f, B:51:0x0194, B:52:0x0195, B:54:0x019f, B:56:0x01a6, B:57:0x01ab, B:58:0x01ac, B:59:0x01cf, B:62:0x01d4, B:63:0x01db, B:65:0x01dd, B:67:0x01e3, B:69:0x01ed, B:70:0x01f5, B:72:0x01fb, B:74:0x0205, B:76:0x0212, B:75:0x020c, B:27:0x00f3, B:23:0x00db, B:18:0x00a2), top: B:106:0x007b }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0116 A[Catch: Exception -> 0x0234, SocketTimeoutException -> 0x0237, TryCatch #6 {SocketTimeoutException -> 0x0237, Exception -> 0x0234, blocks: (B:12:0x007b, B:15:0x0098, B:20:0x00c5, B:22:0x00cf, B:24:0x00df, B:26:0x00e4, B:28:0x00ff, B:30:0x0116, B:32:0x013a, B:34:0x014d, B:36:0x0153, B:37:0x0157, B:39:0x0161, B:41:0x0168, B:45:0x0176, B:47:0x017c, B:49:0x0189, B:50:0x018f, B:51:0x0194, B:52:0x0195, B:54:0x019f, B:56:0x01a6, B:57:0x01ab, B:58:0x01ac, B:59:0x01cf, B:62:0x01d4, B:63:0x01db, B:65:0x01dd, B:67:0x01e3, B:69:0x01ed, B:70:0x01f5, B:72:0x01fb, B:74:0x0205, B:76:0x0212, B:75:0x020c, B:27:0x00f3, B:23:0x00db, B:18:0x00a2), top: B:106:0x007b }] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean b() {
            long time;
            HttpURLConnection httpURLConnection;
            JSONObject jSONObject;
            boolean z;
            OutputStream outputStream;
            OutputStreamWriter outputStreamWriter;
            BufferedWriter bufferedWriter;
            String d;
            String encode;
            int responseCode;
            String str;
            JSONObject jSONObject2;
            this.A = wo1.T();
            int i = 0;
            try {
                int i2 = 1015;
                ?? r7 = 1;
                this.D = this.F == 1015 ? 1 : this.N;
                this.B = 0;
                HttpURLConnection httpURLConnection2 = null;
                while (true) {
                    int i3 = this.B;
                    int i4 = this.J;
                    if (i3 >= i4) {
                        this.B = i4 - 1;
                        this.C = "trials_fail";
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str2 = "Auction Handler: auction trial " + (this.B + r7) + " out of " + this.J + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str2, i);
                        IronSourceUtils.sendAutomationLog(str2);
                        URL url = this.G;
                        int i5 = (int) this.K;
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                        httpURLConnection.setReadTimeout(i5);
                        httpURLConnection.setDoInput(r7);
                        httpURLConnection.setDoOutput(r7);
                        try {
                            jSONObject = this.H;
                            z = this.L;
                            outputStream = httpURLConnection.getOutputStream();
                            outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                            bufferedWriter = new BufferedWriter(outputStreamWriter);
                        } catch (SocketTimeoutException e) {
                            e = e;
                            httpURLConnection2 = httpURLConnection;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            this.t = 1006;
                            this.u = "Connection timed out";
                            IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                            this.B++;
                            i = 0;
                            i2 = 1015;
                            r7 = 1;
                        } catch (Exception e2) {
                            e = e2;
                            httpURLConnection2 = httpURLConnection;
                            IronLog.INTERNAL.error("getting exception " + e);
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            this.t = 1000;
                            this.u = e.getMessage();
                            this.C = "other";
                            return false;
                        }
                    } catch (SocketTimeoutException e3) {
                        e = e3;
                    } catch (Exception e4) {
                        e = e4;
                    }
                    if (this.D == 2) {
                        try {
                            d = com.ironsource.mediationsdk.utils.g.a().d();
                        } catch (JSONException e5) {
                            this.E = e5.getLocalizedMessage();
                            this.F = i2;
                            this.D = r7;
                            IronLog.INTERNAL.error("get encrypted session key exception " + e5.getMessage());
                        }
                        String jSONObject3 = jSONObject.toString();
                        String c = c();
                        if (z) {
                            encode = IronSourceAES.encode(c, jSONObject3);
                        } else {
                            IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                            encode = IronSourceAES.compressAndEncrypt(c, jSONObject3);
                        }
                        bufferedWriter.write(this.D != 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", d, encode) : String.format("{\"request\" : \"%1$s\"}", encode));
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        outputStreamWriter.close();
                        outputStream.close();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 200) {
                            String a = a(httpURLConnection);
                            try {
                                boolean z2 = this.I;
                                boolean z3 = this.M;
                                if (TextUtils.isEmpty(a)) {
                                    throw new JSONException("empty response");
                                }
                                JSONObject jSONObject4 = new JSONObject(a);
                                if (z2) {
                                    String c2 = c();
                                    String string = jSONObject4.getString(this.D == 2 ? com.anythink.expressad.d.a.b.dx : "response");
                                    if (z3) {
                                        IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
                                        String decryptAndDecompress = IronSourceAES.decryptAndDecompress(c2, string);
                                        if (decryptAndDecompress == null) {
                                            throw new JSONException("decompression error");
                                        }
                                        jSONObject2 = new JSONObject(decryptAndDecompress);
                                    } else {
                                        String decode = IronSourceAES.decode(c2, string);
                                        if (TextUtils.isEmpty(decode)) {
                                            throw new JSONException("decryption error");
                                        }
                                        jSONObject2 = new JSONObject(decode);
                                    }
                                    jSONObject4 = jSONObject2;
                                }
                                C1274f.a();
                                C1274f.a a2 = C1274f.a(jSONObject4);
                                this.v = a2.a;
                                this.w = a2.b;
                                this.x = a2.c;
                                this.y = a2.d;
                                this.z = a2.e;
                                this.t = a2.f;
                                this.u = a2.g;
                                httpURLConnection.disconnect();
                                return true;
                            } catch (JSONException e6) {
                                if (e6.getMessage() != null && e6.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.t = 1003;
                                    this.u = "Auction decryption error";
                                }
                                if (e6.getMessage() == null || !e6.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.t = 1002;
                                    str = "Auction parsing error";
                                } else {
                                    this.t = 1008;
                                    str = "Auction decompression error";
                                }
                                this.u = str;
                                this.C = "parsing";
                                IronLog.INTERNAL.error("Auction handle response exception " + e6.getMessage());
                                httpURLConnection.disconnect();
                                return false;
                            }
                        }
                        this.t = 1001;
                        String str3 = "Auction status not 200 error, error code response from server - " + responseCode;
                        this.u = str3;
                        IronLog.INTERNAL.error(str3);
                        httpURLConnection.disconnect();
                        if (this.B < this.J - 1) {
                            long time2 = this.K - (new Date().getTime() - time);
                            if (time2 > 0) {
                                SystemClock.sleep(time2);
                            }
                        }
                        httpURLConnection2 = httpURLConnection;
                        this.B++;
                        i = 0;
                        i2 = 1015;
                        r7 = 1;
                    }
                    d = "";
                    String jSONObject32 = jSONObject.toString();
                    String c3 = c();
                    if (z) {
                    }
                    bufferedWriter.write(this.D != 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", d, encode) : String.format("{\"request\" : \"%1$s\"}", encode));
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStreamWriter.close();
                    outputStream.close();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                    }
                }
            } catch (Exception e7) {
                this.t = 1007;
                this.u = e7.getMessage();
                this.B = 0;
                this.C = "other";
                IronLog.INTERNAL.error("Auction request exception " + e7.getMessage());
                return false;
            }
        }

        private String c() {
            return this.D == 2 ? com.ironsource.mediationsdk.utils.g.a().c() : com.ironsource.mediationsdk.utils.g.a().b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean b = b();
            InterfaceC1275g interfaceC1275g = this.s.get();
            if (interfaceC1275g == null) {
                return;
            }
            long T = wo1.T() - this.A;
            if (b) {
                interfaceC1275g.a(this.w, this.v, this.x, this.y, this.z, this.B + 1, T, this.F, this.E);
            } else {
                interfaceC1275g.a(this.t, this.u, this.B + 1, this.C, T);
            }
        }
    }

    public C1276h(i iVar) {
        this.a = "1";
        this.b = ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB;
        this.c = ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_NORMAL;
        this.d = ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB;
        this.e = "GenericNotifications";
        this.f = iVar;
    }

    @Deprecated
    public C1276h(String str, com.ironsource.mediationsdk.utils.c cVar, InterfaceC1275g interfaceC1275g) {
        this.a = "1";
        this.b = ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB;
        this.c = ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_NORMAL;
        this.d = ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB;
        this.e = "GenericNotifications";
        this.g = str;
        this.i = cVar;
        this.j = interfaceC1275g;
        this.h = IronSourceUtils.getSessionId();
    }

    private JSONObject a(Context context, Map<String, Object> map, List<String> list, C1277j c1277j, int i, boolean z, IronSourceSegment ironSourceSegment) {
        new JSONObject();
        com.ironsource.mediationsdk.utils.p c = L.a().u.c.e.c();
        JSONObject b = b(ironSourceSegment);
        boolean z2 = c.d;
        C1274f a2 = C1274f.a();
        if (z2) {
            return a2.f(this.g, z, map, list, c1277j, i, this.k, b);
        }
        JSONObject b2 = a2.b(context, map, list, c1277j, i, this.h, this.i, this.k, b);
        b2.put("adUnit", this.g);
        b2.put("doNotEncryptResponse", z ? "false" : "true");
        return b2;
    }

    public static void a(com.ironsource.mediationsdk.server.b bVar, int i, com.ironsource.mediationsdk.server.b bVar2) {
        for (String str : bVar.f()) {
            String a2 = C1274f.a().a(str, i, bVar, "", "", "");
            C1274f.a();
            C1274f.h("reportLoadSuccess", bVar.a(), a2);
        }
        if (bVar2 != null) {
            for (String str2 : bVar2.f()) {
                String a3 = C1274f.a().a(str2, i, bVar, "", ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB, "");
                C1274f.a();
                C1274f.h("reportLoadSuccess", "GenericNotifications", a3);
            }
        }
    }

    public static void a(com.ironsource.mediationsdk.server.b bVar, int i, com.ironsource.mediationsdk.server.b bVar2, String str) {
        for (String str2 : bVar.d()) {
            String a2 = C1274f.a().a(str2, i, bVar, "", "", str);
            C1274f.a();
            C1274f.h("reportImpression", bVar.a(), a2);
        }
        if (bVar2 != null) {
            for (String str3 : bVar2.d()) {
                String a3 = C1274f.a().a(str3, i, bVar, "", ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB, str);
                C1274f.a();
                C1274f.h("reportImpression", "GenericNotifications", a3);
            }
        }
    }

    public static void a(ArrayList<String> arrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> concurrentHashMap, int i, com.ironsource.mediationsdk.server.b bVar, com.ironsource.mediationsdk.server.b bVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(bVar2.a())) {
                z2 = i == 2;
                z = true;
            } else {
                com.ironsource.mediationsdk.server.b bVar3 = concurrentHashMap.get(next);
                String c = bVar3.c();
                String str = z ? z2 ? ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB : ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_NORMAL : "1";
                for (String str2 : bVar3.e()) {
                    String a2 = C1274f.a().a(str2, i, bVar2, c, str, "");
                    C1274f.a();
                    C1274f.h("reportAuctionLose", bVar3.a(), a2);
                }
            }
        }
        if (bVar != null) {
            for (String str3 : bVar.e()) {
                String a3 = C1274f.a().a(str3, i, bVar2, "", ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB, "");
                C1274f.a();
                C1274f.h("reportAuctionLose", "GenericNotifications", a3);
            }
        }
    }

    private static JSONObject b(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a2 = ironSourceSegment.a();
        for (int i = 0; i < a2.size(); i++) {
            try {
                jSONObject.put((String) a2.get(i).first, a2.get(i).second);
            } catch (JSONException e) {
                e.printStackTrace();
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    @Deprecated
    public final void a(Context context, Map<String, Object> map, List<String> list, C1277j c1277j, int i, IronSourceSegment ironSourceSegment) {
        try {
            boolean z = IronSourceUtils.getSerr() == 1;
            JSONObject a2 = a(context, map, list, c1277j, i, z, ironSourceSegment);
            InterfaceC1275g interfaceC1275g = this.j;
            URL url = new URL(this.i.d);
            com.ironsource.mediationsdk.utils.c cVar = this.i;
            com.ironsource.environment.e.c.a.c(new a(interfaceC1275g, url, a2, z, cVar.f, cVar.i, cVar.q, cVar.r, cVar.s));
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e.getMessage());
            this.j.a(1000, e.getMessage(), 0, "other", 0L);
        }
    }

    public final void a(CopyOnWriteArrayList<ac> copyOnWriteArrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> concurrentHashMap, int i, com.ironsource.mediationsdk.server.b bVar, com.ironsource.mediationsdk.server.b bVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<ac> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().k());
        }
        a(arrayList, concurrentHashMap, i, bVar, bVar2);
    }
}