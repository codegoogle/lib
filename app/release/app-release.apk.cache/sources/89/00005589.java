package com.p7700g.p99005;

import android.text.TextUtils;
import com.anchorfree.sdk.RemoteConfigLoader;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: RemoteFilePrefs.java */
/* loaded from: classes.dex */
public class p41 {
    @x1
    private final x31 a;
    @x1
    private final String b;
    @x1
    private final String c;
    @z1
    private final h31 d;

    public p41(@x1 x31 x31Var, @x1 String str, @x1 String str2, @z1 h31 h31Var) {
        this.a = x31Var;
        this.b = str;
        this.c = str2;
        this.d = h31Var;
    }

    @x1
    public String a() {
        return this.a.e(b(), "");
    }

    @x1
    public String b() {
        return String.format("pref:remote:file:hash:%s:%s", this.c, this.b);
    }

    @x1
    public String c() {
        return String.format("pref:remote:file:error:%s:%s", this.c, this.b);
    }

    @x1
    public String d() {
        return this.a.e(e(), "");
    }

    @x1
    public String e() {
        return String.format("pref:remote:file:path:%s:%s", this.c, this.b);
    }

    @x1
    public String f() {
        return String.format("pref:remote:file:ts:%s:%s", this.c, this.b);
    }

    @x1
    public String g(@x1 RemoteConfigLoader.FilesObject filesObject) {
        return filesObject.getValueForKey(this.c);
    }

    @x1
    public String h() {
        return this.b;
    }

    @x1
    public String i() {
        return this.c;
    }

    public boolean j() {
        return !TextUtils.isEmpty(this.a.e(e(), ""));
    }

    public void k() {
        this.a.c().remove(b()).remove(c()).remove(e()).remove(f()).a();
    }

    public void l(@x1 Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        this.a.c().b(c(), stringWriter.toString()).d();
    }

    public void m(@x1 File file, @x1 RemoteConfigLoader.FilesObject filesObject) {
        this.a.c().b(b(), g(filesObject)).b(e(), file.getAbsolutePath()).c(f(), System.currentTimeMillis()).remove(c()).a();
        h31 h31Var = this.d;
        if (h31Var != null) {
            h31Var.e(new q41(this.c, this.b));
        }
    }

    public p41(@x1 x31 x31Var, @x1 String str, @x1 String str2) {
        this(x31Var, str, str2, null);
    }
}