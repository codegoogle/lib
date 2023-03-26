package com.p7700g.p99005;

import com.microsoft.appcenter.crashes.utils.ErrorLogHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* loaded from: classes3.dex */
public class es2 {
    private static final String a = "PersistedInstallation";
    private static final String b = "Fid";
    private static final String c = "AuthToken";
    private static final String d = "RefreshToken";
    private static final String e = "TokenCreationEpochInSecs";
    private static final String f = "ExpiresInSecs";
    private static final String g = "Status";
    private static final String h = "FisError";
    private final File i;
    @x1
    private final pn2 j;

    /* compiled from: PersistedInstallation.java */
    /* loaded from: classes3.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public es2(@x1 pn2 pn2Var) {
        File filesDir = pn2Var.l().getFilesDir();
        StringBuilder G = wo1.G("PersistedInstallation.");
        G.append(pn2Var.r());
        G.append(ErrorLogHelper.ERROR_LOG_FILE_EXTENSION);
        this.i = new File(filesDir, G.toString());
        this.j = pn2Var;
    }

    private JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.i);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void a() {
        this.i.delete();
    }

    @x1
    public fs2 b(@x1 fs2 fs2Var) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b, fs2Var.d());
            jSONObject.put(g, fs2Var.g().ordinal());
            jSONObject.put(c, fs2Var.b());
            jSONObject.put(d, fs2Var.f());
            jSONObject.put(e, fs2Var.h());
            jSONObject.put(f, fs2Var.c());
            jSONObject.put(h, fs2Var.e());
            createTempFile = File.createTempFile(a, "tmp", this.j.l().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.i)) {
            return fs2Var;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    @x1
    public fs2 d() {
        JSONObject c2 = c();
        String optString = c2.optString(b, null);
        int optInt = c2.optInt(g, a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c2.optString(c, null);
        String optString3 = c2.optString(d, null);
        long optLong = c2.optLong(e, 0L);
        long optLong2 = c2.optLong(f, 0L);
        return fs2.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c2.optString(h, null)).a();
    }
}