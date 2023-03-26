package com.anythink.basead.d.b.a;

import android.net.Uri;
import com.anythink.basead.c.d;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.i.c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00b1: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:28:0x00b1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d a(j jVar, i iVar, String str) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        int responseCode;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (Exception e) {
                e = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection3 != null) {
                }
                throw th;
            }
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
            } catch (Exception e2) {
                e = e2;
                c.a(jVar.b, iVar.k(), iVar.d(), iVar.v(), str, "", e.getMessage());
            }
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                JSONObject optJSONObject = new JSONObject(sb.toString()).optJSONObject("data");
                d dVar = new d(optJSONObject.optString("dstlink"), "", optJSONObject.optString("clickid"));
                bufferedReader.close();
                inputStreamReader.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                httpURLConnection.disconnect();
                return dVar;
            }
            c.a(jVar.b, iVar.k(), iVar.d(), iVar.v(), str, String.valueOf(responseCode), "");
            httpURLConnection.disconnect();
            return null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection3 = httpURLConnection2;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
            throw th;
        }
    }

    public static String a(String str) {
        try {
            return Uri.parse(str).getQueryParameter("qz_gdt");
        } catch (Throwable unused) {
            return null;
        }
    }
}