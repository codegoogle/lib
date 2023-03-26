package com.anythink.expressad.mbbanner.a.d;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.mbbanner.a.b.e;
import com.anythink.expressad.mbbanner.a.c.d;
import com.anythink.expressad.mbbanner.a.c.f;
import com.anythink.expressad.videocommon.b.g;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class b {
    private static final String a = "b";
    private Context b;
    private e d;
    private com.anythink.expressad.mbbanner.a.e.a e;
    private com.anythink.expressad.mbbanner.a.c.b f;
    private d g;
    private int c = 0;
    private volatile boolean h = false;
    private Timer i = new Timer();
    private volatile List<String> j = new ArrayList();
    private volatile boolean k = false;
    private volatile boolean l = false;
    private volatile boolean m = false;

    /* renamed from: com.anythink.expressad.mbbanner.a.d.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends TimerTask {
        public final /* synthetic */ String a;

        public AnonymousClass1(String str) {
            this.a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (b.this.h) {
                return;
            }
            b.this.h = true;
            b.this.a(this.a, -1, "", false);
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.d.b$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ com.anythink.expressad.foundation.d.d a;

        public AnonymousClass2(com.anythink.expressad.foundation.d.d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
            n.b(b.a, "在单独子线程保存数据库 开始");
            com.anythink.expressad.foundation.d.d dVar = this.a;
            if (dVar != null && (arrayList = dVar.J) != null && arrayList.size() > 0) {
                Context unused = b.this.b;
                com.anythink.expressad.mbbanner.a.e.b.a();
            }
            n.b(b.a, "在单独子线程保存数据库 完成");
        }
    }

    public b(Context context, e eVar, com.anythink.expressad.mbbanner.a.c.b bVar, com.anythink.expressad.mbbanner.a.e.a aVar) {
        this.b = context.getApplicationContext();
        this.d = eVar;
        this.f = bVar;
        this.e = aVar;
    }

    private void d(String str) {
        this.d.a(str);
    }

    private void b(String str) {
        String str2 = a;
        n.b(str2, "在子线程处理业务逻辑 完成");
        n.b(str2, "downloadResource--> Fail");
        this.h = true;
        this.e.b(this.f, str);
        this.g.a(str);
    }

    private void c(String str) {
        this.i.schedule(new AnonymousClass1(str), 60000L);
    }

    private void a(String str) {
        if (this.m) {
            return;
        }
        if ((this.k || this.l) && this.j.size() == 0) {
            n.b(a, "在子线程处理业务逻辑 完成");
            this.h = true;
            this.m = true;
            this.i.cancel();
            this.e.a(this.f, str);
            this.g.a(str);
        }
    }

    private int c() {
        try {
            int b = this.d.b();
            if (b > this.d.c()) {
                return 0;
            }
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        g.a().a(str2, new f(this, str));
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        new Thread(new AnonymousClass2(dVar)).start();
    }

    public final void a(String str, int i, String str2, boolean z) {
        if (!z) {
            if (i == -1) {
                String str3 = a;
                n.d(str3, " unitId =" + str + " --> time out!");
            }
            this.i.cancel();
            String str4 = a;
            n.b(str4, "在子线程处理业务逻辑 完成");
            n.b(str4, "downloadResource--> Fail");
            this.h = true;
            this.e.b(this.f, str);
            this.g.a(str);
        } else if (i == 1) {
            n.b(a, "downloadResource--> Success Image");
            synchronized (this) {
                this.j.remove(str2);
                if (this.j.size() == 0) {
                    a(str);
                }
            }
        } else if (i == 2) {
            n.b(a, "downloadResource--> Success banner_html");
            this.l = true;
            a(str);
        } else if (i == 3) {
            n.b(a, "downloadResource--> Success banner_url");
            this.k = true;
            a(str);
        }
    }

    private String b() {
        return this.d.a();
    }

    private void b(String str, List<com.anythink.expressad.foundation.d.c> list) {
        int i = this.c;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    i += list.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i > this.d.c()) {
            n.b(a, "saveNextOffset 重置offset为0");
            i = 0;
        }
        n.b(a, "saveNextOffset 算出 下次的offset是:".concat(String.valueOf(i)));
        if (v.b(str)) {
            this.d.a(i);
        }
    }

    public final void a(String str, com.anythink.expressad.foundation.d.d dVar, d dVar2) {
        this.g = dVar2;
        if (dVar == null) {
            this.e.a(this.f, "campaignUnit is NULL!", str);
            this.g.a(str);
            return;
        }
        List<com.anythink.expressad.foundation.d.c> a2 = a(dVar);
        new Thread(new AnonymousClass2(dVar)).start();
        if (a2.size() == 0) {
            n.b(a, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
            this.e.a(this.f, com.anythink.expressad.reward.a.d.a, str);
            this.g.a(str);
            return;
        }
        String str2 = a;
        n.b(str2, "在子线程处理业务逻辑 开始");
        this.i.schedule(new AnonymousClass1(str), 60000L);
        this.d.a(dVar.c());
        int i = this.c;
        int i2 = 0;
        try {
            if (a2.size() > 0) {
                i += a2.size();
            }
            if (i > this.d.c()) {
                n.b(str2, "saveNextOffset 重置offset为0");
                i = 0;
            }
            n.b(str2, "saveNextOffset 算出 下次的offset是:".concat(String.valueOf(i)));
            if (v.b(str)) {
                this.d.a(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.anythink.expressad.foundation.d.c cVar = a2.get(0);
        String trim = cVar.o().trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!TextUtils.isEmpty(trim)) {
                g.a().a(trim, new f(this, str));
            }
            if (a2.size() > 0) {
                while (i2 < a2.size()) {
                    a2.get(i2).c(cVar.o());
                    a2.get(i2).a(true);
                    i2++;
                }
            }
        } else {
            String trim2 = cVar.p().trim();
            if (!TextUtils.isEmpty(trim2)) {
                String a3 = a(str, trim2);
                if (a2.size() > 0) {
                    while (i2 < a2.size()) {
                        a2.get(i2).d(a3);
                        a2.get(i2).a(trim2.contains("<MBTPLMARK>"));
                        i2++;
                    }
                }
            } else {
                this.l = true;
                this.k = true;
            }
        }
        a(str, a2);
    }

    private List<com.anythink.expressad.foundation.d.c> a(com.anythink.expressad.foundation.d.d dVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar != null) {
            try {
                ArrayList<com.anythink.expressad.foundation.d.c> arrayList2 = dVar.J;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList<com.anythink.expressad.foundation.d.c> arrayList3 = dVar.J;
                    String str = a;
                    n.b(str, "getNeedShowList 总共返回的campaign有：" + arrayList3.size());
                    for (int i = 0; i < arrayList3.size(); i++) {
                        com.anythink.expressad.foundation.d.c cVar = arrayList3.get(i);
                        if (cVar != null && cVar.N() != 99 && (!TextUtils.isEmpty(cVar.o()) || !TextUtils.isEmpty(cVar.p()) || !TextUtils.isEmpty(cVar.be()))) {
                            if (s.a(cVar)) {
                                cVar.h(s.a(this.b, cVar.ba()) ? 1 : 2);
                            }
                            if (cVar.ag() != 1 && s.a(this.b, cVar.ba())) {
                                if (s.a(cVar)) {
                                    arrayList.add(cVar);
                                } else {
                                    int i2 = com.anythink.expressad.foundation.g.a.cz;
                                    s.c();
                                }
                            }
                            arrayList.add(cVar);
                        }
                    }
                    String str2 = a;
                    n.b(str2, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    private void a(String str, List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            if (!TextUtils.isEmpty(cVar.be())) {
                this.j.add(cVar.be());
                com.anythink.expressad.foundation.g.d.b.a(this.b).a(cVar.be(), new com.anythink.expressad.mbbanner.a.c.g(this, str));
            }
        }
    }

    private String a(String str, String str2) {
        File file;
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    String b = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                    String a2 = o.a(w.a(str2));
                    if (TextUtils.isEmpty(a2)) {
                        a2 = String.valueOf(System.currentTimeMillis());
                    }
                    File file2 = new File(b, a2.concat(".html"));
                    Uri.parse(str2).getPath();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        fileOutputStream2.write(str2.getBytes());
                        fileOutputStream2.flush();
                        String absolutePath = file2.getAbsolutePath();
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        str3 = absolutePath;
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                        file = new File(str3);
                        if (!file.exists()) {
                        }
                        a(str, 2, str2, false);
                        return str3;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e5) {
                e = e5;
            }
            file = new File(str3);
            if (!file.exists() && file.isFile() && file.canRead()) {
                a(str, 2, str2, true);
            } else {
                a(str, 2, str2, false);
            }
        }
        return str3;
    }
}