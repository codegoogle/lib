package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.8k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04868k {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02;
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{7, 95, 83, 55, 1, 28, 3, 48, 28, 6, 29, 7, 22, 1, 73, 83, ax5.a, 29, 18, 91, 8, 92, 24, 25, 16, 25, 8, 25, 92, 24, 25, 30, 9, 27, 92, 25, 10, 25, 18, 8, 15, 92, 26, 21, 16, 25, 82, 14, 44, 35, 106, 57, 109, 41, 40, 33, 40, 57, 40, 109, 43, 36, 33, 40, 108, 119, 118, 113, 102, 116, 108, 99, 97, 118, 117, bx.W5, 25, 10, 1, 27, 44, 0, 26, 1, 27, 41, 45, 46, 26, Flags.CD, 6, 10, 1, 12, 10, 33, 10, 27, 24, 0, 29, 4, 31, 58, 61, 40, bx.W5, 111, 43, bx.W5, 45, 58, 40, 111, bx.W5, 57, bx.W5, 33, 59, 60, 111, 41, 38, 35, bx.W5, 97, 69, 9, 38, 35, bx.W5, 111, 60, 38, 53, bx.W5, 117, 111, 111, 87, 85, 76, 76, 89, 88, 28, 89, 74, 89, 82, 72, 79, 18, 40, 16, 18, Flags.CD, Flags.CD, 18, 21, 28, 91, 24, 20, 9, 9, 14, Flags.CD, 15, 30, 31, 91, 31, 30, 25, 14, 28, 91, 30, 13, 30, 21, 15, 91, 23, 18, 21, 30, 85, 98, 68, 79, 95, 88, 81, 22, 66, 89, 22, 67, 70, 82, 87, 66, 83, 22, 67, 88, 68, 83, 85, 89, 68, 82, 83, 82, 22, 82, 83, 84, 67, 81, 122, 89, 81, 115, 64, 83, 88, 66, 24, 22, 87, 82, 82, 95, 88, 81, 22, 66, 89, 22, 121, 88, 81, 89, 95, 88, 81, 115, 64, 83, 88, 66, 24, 58, 17, 0, 8, 21, 6, 19, 19, 2, 10, 23, 19, 88, 93, 72, 93, g15.c, 126, 68, 119, 116, 124, 124, 114, 117, 124, 43, bx.W5, 45, 58, 40, 35, 32, 40, 60, 91, 84, 83, 84, 78, 85, 88, 89, 29, 88, 75, 88, 83, 73, 29, 78, 85, 82, 72, 81, 89, 29, 83, 82, 73, 29, 95, 88, 29, 72, 77, 89, 92, 73, 88, 89, 29, 73, 82, 29, 114, 83, 90, 82, 84, 83, 90, 120, 75, 88, 83, 73, 19, 107, 102, 126, 104, 126, 126, 100, 98, 99, 82, 100, 105, 72, 94, 72, 72, 82, 84, 85, 100, 79, 82, 86, 94, 105, 113, 115, 106, 106, g15.c, 126, 95, 108, g15.c, 116, 110, 105, 58, 39, 58, 49, 55, 32, 54, 59, 50, 39, 75, 77, 90, 76, 65, 72, 93, 103, 91, 87, 92, 93, 119, 106, 110, 102, 85, 88, 81, 68};
    }

    public static void A07() {
        A02 = new String[]{"TEIgz1GSUxi0w6HxI", "WqDufwBE7AlvD41n6qdN4YbCXU2LtDad", "95AkSvnB6didgYS0", "q9Pm9O4XheyxpjJIaV85netzFUNpUTJ1", "laKi0sQOm1cRNFPmXQKezZzTFfBBOlTJ", "R9By8R7rHrFXxi8d0eZrOpOQKJFwFXXr", "DNKj97yZe49oXEmfRz7aINNiwqbkjDQZ", "HsAQREGxpVIGFVt11mTJ2r8ajNtMZb1h"};
    }

    static {
        A07();
        A06();
        A04 = C04868k.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) - A06.size();
    }

    public static C04888m A01(String str, C8H c8h, Map<String, String> staticEnvironmentData) {
        C04888m c04888m = null;
        try {
            c04888m = new C04888m(c8h.A05().A01(), c8h.A05().A02(), new C8W(str, staticEnvironmentData, true).A02());
            A0C(c04888m, c8h);
            return c04888m;
        } catch (Exception unused) {
            return c04888m;
        }
    }

    public static JSONArray A03(C8H c8h) {
        return A04(c8h, -1);
    }

    public static JSONArray A04(C8H c8h, int i) {
        InterfaceC04838h A042;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                if (new File(c8h.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8h)).exists()) {
                    fileInputStream = c8h.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8h));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || i == 0) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        if (!jSONObject.has(A02(260, 7, 27))) {
                            jSONObject.put(A02(260, 7, 27), String.valueOf(0));
                        }
                        String line = jSONObject.getString(A02(343, 2, 126));
                        if (!A06.contains(line)) {
                            int i2 = jSONObject.getInt(A02(260, 7, 27));
                            if (A05.containsKey(line)) {
                                jSONObject.put(A02(260, 7, 27), String.valueOf(A05.get(line)));
                            } else {
                                A0F(line, i2);
                            }
                            jSONArray.put(jSONObject);
                            if (i > 0) {
                                i--;
                            }
                        }
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e = e;
                        A042 = c8h.A04();
                        A042.A3S(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException | JSONException e2) {
                c8h.A04().A3S(e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        e = e3;
                        A042 = c8h.A04();
                        A042.A3S(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject A05(C04888m c04888m) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 126), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 93), c04888m.A03());
        jSONObject.put(A02(aa.c.c, 4, 127), LW.A02(c04888m.A01()));
        jSONObject.put(A02(355, 12, 71), LW.A02(c04888m.A00()));
        jSONObject.put(A02(345, 10, 113), c04888m.A02());
        jSONObject.put(A02(267, 4, 64), c04888m.A04() != null ? new JSONObject(c04888m.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 27), String.valueOf(0));
        return jSONObject;
    }

    public static void A08(Context context) {
        synchronized (A03) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), context));
            if (file.exists()) {
                file.delete();
            }
            A0A(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A09(Context context) {
        A0A(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) + 1);
    }

    public static void A0A(Context context, int i) {
        int i2 = 0;
        SharedPreferences.Editor edit = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).edit();
        if (i >= 0) {
            i2 = i;
        }
        edit.putInt(A02(75, 10, 19), i2).apply();
    }

    public static void A0B(C8H c8h, String str) {
        File file = new File(c8h.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c8h.A04().A3S(new RuntimeException(A02(47, 18, 49)));
        }
    }

    public static void A0C(C04888m c04888m, C8H c8h) {
        if (c04888m != null && c8h != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8h);
                    File file = new File(c8h.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int A07 = J9.A07(c8h);
                        long fileSize = file.length();
                        if (A07 > 0 && fileSize > A07) {
                            boolean delete = file.delete();
                            A0A(c8h, 0);
                            A06.clear();
                            A05.clear();
                            if (delete) {
                                Map<String, String> A4S = c8h.A02().A4S();
                                A4S.put(A02(383, 7, 62), A02(271, 10, 103));
                                A4S.put(A02(390, 12, 68), String.valueOf((int) IronSourceConstants.IS_CAP_SESSION));
                                A01(A02(102, 36, 51) + fileSize + A02(1, 15, 15) + A00.getAndIncrement(), c8h, A4S);
                                return;
                            }
                            Log.e(A02(85, 17, 19), A02(16, 31, 0));
                        }
                    }
                    JSONObject A052 = A05(c04888m);
                    FileOutputStream openFileOutput = c8h.openFileOutput(processSpecificName, 32768);
                    String line = A052.toString() + A02(0, 1, 113);
                    openFileOutput.write(line.getBytes());
                    openFileOutput.close();
                    A09(c8h);
                } catch (Exception e) {
                    c8h.A04().A3S(e);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str) {
        Integer num = A05.get(str);
        if (num == null) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A02(189, 66, 74));
            }
            num = 0;
        } else {
            A05.remove(str);
        }
        A05.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void A0F(String str, int i) {
        if (!A06.contains(str)) {
            boolean containsKey = A05.containsKey(str);
            if (A02[7].charAt(23) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            strArr[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            if (containsKey) {
                A05.remove(str);
            }
            A05.put(str, Integer.valueOf(i));
            return;
        }
        throw new RuntimeException(A02(290, 53, 65));
    }

    public static boolean A0G(C8H c8h) {
        if (J9.A0P(c8h)) {
            return A0I(c8h);
        }
        boolean A0H = A0H(c8h);
        String[] strArr = A02;
        if (strArr[0].length() != strArr[5].length()) {
            String[] strArr2 = A02;
            strArr2[3] = "3ABJ1YchwKShiC4YrWnTlA0erUDCQvCN";
            strArr2[1] = "wuaZskSkctYpKQ1vHIoiu3NDqUJM9HRQ";
            return A0H;
        }
        throw new RuntimeException();
    }

    public static boolean A0H(C8H c8h) {
        JSONArray debugLogEvents = new JSONArray();
        synchronized (A03) {
            int i = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            try {
                File debugFile = new File(c8h.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8h));
                if (debugFile.exists()) {
                    fileInputStream = c8h.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8h));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (A02[4].charAt(1) != 'a') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A02;
                        strArr[2] = "N2MSSJLvxCxpns9Z";
                        strArr[2] = "N2MSSJLvxCxpns9Z";
                        if (line != null) {
                            JSONObject jSONObject = new JSONObject(line);
                            String string = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(string)) {
                                if (A05.containsKey(string)) {
                                    Integer num = A05.get(string);
                                    int retryLimit = num != null ? num.intValue() : 0;
                                    Integer valueOf = Integer.valueOf(retryLimit);
                                    int A022 = J9.A02(c8h);
                                    if (A022 > -1) {
                                        int retryLimit2 = A022 - 1;
                                        if (valueOf.intValue() > retryLimit2) {
                                            A0D(string);
                                            i++;
                                        }
                                    }
                                    jSONObject.put(A02(260, 7, 27), String.valueOf(valueOf));
                                    debugLogEvents.put(jSONObject);
                                } else {
                                    debugLogEvents.put(jSONObject);
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            int i2 = debugLogEvents.length();
                            for (int i3 = 0; i3 < i2; i3++) {
                                sb.append(debugLogEvents.getJSONObject(i3).toString());
                                sb.append('\n');
                            }
                            fileOutputStream = c8h.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8h), 0);
                            fileOutputStream.write(sb.toString().getBytes());
                        }
                    }
                }
                int retryLimit3 = A00(c8h);
                A0A(c8h, retryLimit3);
                if (i > 0) {
                    c8h.A04().A82(A02(271, 10, 103), C04848i.A28, new C04858j(A02(WKSRecord.Service.NETBIOS_DGM, 15, 64), A02(367, 16, 102) + i));
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        c8h.A04().A3S(e);
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return true;
            } catch (IOException | JSONException e2) {
                c8h.A04().A3S(e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        c8h.A04().A3S(e3);
                        A06.clear();
                        A05.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x016c, code lost:
        r7 = r18.openFileInput(r3);
        r6 = r18.openFileOutput(r5, 0);
        r2 = new byte[1024];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0179, code lost:
        r1 = r7.read(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:
        if (r1 <= 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017f, code lost:
        r6.write(r2, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0184, code lost:
        r7.close();
        r10.close();
        A0B(r18, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022b A[Catch: IOException -> 0x0243, all -> 0x028d, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0230 A[Catch: IOException -> 0x0243, all -> 0x028d, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0235 A[Catch: IOException -> 0x0243, all -> 0x028d, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023a A[Catch: IOException -> 0x0243, all -> 0x028d, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023f A[Catch: IOException -> 0x0243, all -> 0x028d, TRY_LEAVE, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0262 A[Catch: IOException -> 0x027a, all -> 0x028d, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0267 A[Catch: IOException -> 0x027a, all -> 0x028d, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026c A[Catch: IOException -> 0x027a, all -> 0x028d, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0271 A[Catch: IOException -> 0x027a, all -> 0x028d, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0276 A[Catch: IOException -> 0x027a, all -> 0x028d, TRY_LEAVE, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0226 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0I(C8H c8h) {
        int intValue;
        synchronized (A03) {
            int skippedEvents = 0;
            FileInputStream inputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream debugFileOutputStream = null;
            FileInputStream tempFileInputStream = null;
            FileOutputStream tempFileOutputStream = null;
            try {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8h);
                    File file = new File(c8h.getFilesDir(), processSpecificName);
                    String str = processSpecificName + A02(255, 5, 25);
                    A0B(c8h, str);
                    if (file.exists()) {
                        tempFileOutputStream = c8h.openFileOutput(str, 32768);
                        inputStream = c8h.openFileInput(processSpecificName);
                        try {
                            inputStreamReader = new InputStreamReader(inputStream);
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        String tempFileName = bufferedReader.readLine();
                                        if (tempFileName == null) {
                                            break;
                                        }
                                        try {
                                            JSONObject jSONObject = new JSONObject(tempFileName);
                                            String string = jSONObject.getString(A02(343, 2, 126));
                                            if (A06.contains(string)) {
                                                continue;
                                            } else if (A05.containsKey(string)) {
                                                try {
                                                    Integer num = A05.get(string);
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        try {
                                                            intValue = num.intValue();
                                                        } catch (IOException e) {
                                                            e = e;
                                                            c8h.A04().A3S(e);
                                                            if (bufferedReader != null) {
                                                            }
                                                            if (inputStreamReader != null) {
                                                            }
                                                            if (inputStream != null) {
                                                            }
                                                            if (debugFileOutputStream != null) {
                                                            }
                                                            if (tempFileInputStream != null) {
                                                            }
                                                            if (tempFileOutputStream != null) {
                                                            }
                                                            A06.clear();
                                                            A05.clear();
                                                            return false;
                                                        } catch (JSONException e2) {
                                                            e = e2;
                                                            if (!BuildConfigApi.isDebug()) {
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            if (bufferedReader != null) {
                                                            }
                                                            if (inputStreamReader != null) {
                                                            }
                                                            if (inputStream != null) {
                                                            }
                                                            if (debugFileOutputStream != null) {
                                                            }
                                                            if (tempFileInputStream != null) {
                                                            }
                                                            if (tempFileOutputStream != null) {
                                                            }
                                                            A06.clear();
                                                            A05.clear();
                                                            throw th;
                                                        }
                                                    }
                                                    Integer valueOf = Integer.valueOf(intValue);
                                                    int retryLimit = J9.A02(c8h);
                                                    if (retryLimit > -1) {
                                                        try {
                                                            if (valueOf.intValue() > retryLimit - 1) {
                                                                try {
                                                                    try {
                                                                        A0D(string);
                                                                        skippedEvents++;
                                                                    } catch (IOException e3) {
                                                                        e = e3;
                                                                        c8h.A04().A3S(e);
                                                                        if (bufferedReader != null) {
                                                                            try {
                                                                                bufferedReader.close();
                                                                            } catch (IOException e4) {
                                                                                c8h.A04().A3S(e4);
                                                                                A06.clear();
                                                                                A05.clear();
                                                                                return false;
                                                                            }
                                                                        }
                                                                        if (inputStreamReader != null) {
                                                                            inputStreamReader.close();
                                                                        }
                                                                        if (inputStream != null) {
                                                                            inputStream.close();
                                                                        }
                                                                        if (debugFileOutputStream != null) {
                                                                            debugFileOutputStream.close();
                                                                        }
                                                                        if (tempFileInputStream != null) {
                                                                            tempFileInputStream.close();
                                                                        }
                                                                        if (tempFileOutputStream != null) {
                                                                            tempFileOutputStream.close();
                                                                        }
                                                                        A06.clear();
                                                                        A05.clear();
                                                                        return false;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        if (bufferedReader != null) {
                                                                            try {
                                                                                bufferedReader.close();
                                                                            } catch (IOException e5) {
                                                                                c8h.A04().A3S(e5);
                                                                                A06.clear();
                                                                                A05.clear();
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        if (inputStreamReader != null) {
                                                                            inputStreamReader.close();
                                                                        }
                                                                        if (inputStream != null) {
                                                                            inputStream.close();
                                                                        }
                                                                        if (debugFileOutputStream != null) {
                                                                            debugFileOutputStream.close();
                                                                        }
                                                                        if (tempFileInputStream != null) {
                                                                            tempFileInputStream.close();
                                                                        }
                                                                        if (tempFileOutputStream != null) {
                                                                            tempFileOutputStream.close();
                                                                        }
                                                                        A06.clear();
                                                                        A05.clear();
                                                                        throw th;
                                                                    }
                                                                } catch (JSONException e6) {
                                                                    e = e6;
                                                                    if (!BuildConfigApi.isDebug()) {
                                                                        Log.e(A04, A02(153, 36, 7), e);
                                                                    }
                                                                }
                                                            }
                                                        } catch (IOException e7) {
                                                            e = e7;
                                                            c8h.A04().A3S(e);
                                                            if (bufferedReader != null) {
                                                            }
                                                            if (inputStreamReader != null) {
                                                            }
                                                            if (inputStream != null) {
                                                            }
                                                            if (debugFileOutputStream != null) {
                                                            }
                                                            if (tempFileInputStream != null) {
                                                            }
                                                            if (tempFileOutputStream != null) {
                                                            }
                                                            A06.clear();
                                                            A05.clear();
                                                            return false;
                                                        } catch (JSONException e8) {
                                                            e = e8;
                                                            String[] strArr = A02;
                                                            String processSpecificDebugFileName = strArr[0];
                                                            if (processSpecificDebugFileName.length() == strArr[5].length()) {
                                                                throw new RuntimeException();
                                                            }
                                                            String[] strArr2 = A02;
                                                            strArr2[4] = "PaJ69Xgk2FO5ZkKDoxQsNWOe25Zt4Hgu";
                                                            strArr2[4] = "PaJ69Xgk2FO5ZkKDoxQsNWOe25Zt4Hgu";
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            if (bufferedReader != null) {
                                                            }
                                                            if (inputStreamReader != null) {
                                                            }
                                                            if (inputStream != null) {
                                                            }
                                                            if (debugFileOutputStream != null) {
                                                            }
                                                            if (tempFileInputStream != null) {
                                                            }
                                                            if (tempFileOutputStream != null) {
                                                            }
                                                            A06.clear();
                                                            A05.clear();
                                                            throw th;
                                                        }
                                                    }
                                                    String processSpecificDebugFileName2 = A02(260, 7, 27);
                                                    jSONObject.put(processSpecificDebugFileName2, String.valueOf(valueOf));
                                                    tempFileOutputStream.write((jSONObject.toString() + '\n').getBytes());
                                                } catch (IOException e9) {
                                                    e = e9;
                                                } catch (JSONException e10) {
                                                    e = e10;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            } else {
                                                tempFileOutputStream.write((jSONObject.toString() + '\n').getBytes());
                                            }
                                        } catch (JSONException e11) {
                                            e = e11;
                                            String processSpecificDebugFileName3 = A02[6];
                                            if (processSpecificDebugFileName3.charAt(4) != '9') {
                                                throw new RuntimeException();
                                            }
                                            String[] strArr3 = A02;
                                            strArr3[2] = "CXUo6jkI5Gt7UUmN";
                                            strArr3[2] = "CXUo6jkI5Gt7UUmN";
                                        }
                                    } catch (IOException e12) {
                                        e = e12;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            } catch (IOException e13) {
                                e = e13;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (IOException e14) {
                            e = e14;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                    A0A(c8h, A00(c8h));
                    if (skippedEvents > 0) {
                        c8h.A04().A82(A02(271, 10, 103), C04848i.A28, new C04858j(A02(WKSRecord.Service.NETBIOS_DGM, 15, 64), A02(367, 16, 102) + skippedEvents));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e15) {
                            c8h.A04().A3S(e15);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (debugFileOutputStream != null) {
                        debugFileOutputStream.close();
                    }
                    if (tempFileInputStream != null) {
                        tempFileInputStream.close();
                    }
                    if (tempFileOutputStream != null) {
                        tempFileOutputStream.close();
                    }
                    A06.clear();
                    A05.clear();
                    return true;
                } catch (IOException e16) {
                    e = e16;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    public static boolean A0J(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}