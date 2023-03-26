package com.anythink.core.common.i;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.g.a.b;
import com.anythink.core.common.g.h;
import com.anythink.core.common.j.e;
import com.anythink.core.common.j.n;
import com.microsoft.appcenter.persistence.DatabasePersistence;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class b {
    private static b b;
    private Context h;
    private File i;
    private AtomicInteger j;
    private final String a = "Agent";
    private int c = 5;
    private int d = 10;
    private long e = 1800000;
    private String f = "";
    private String g = "";
    private boolean k = false;
    private String l = "";
    private h m = new h() { // from class: com.anythink.core.common.i.b.1
        @Override // com.anythink.core.common.g.h
        public final void onLoadCanceled(int i) {
            b.this.k = false;
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadError(int i, String str, AdError adError) {
            b.this.k = false;
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadFinish(int i, Object obj) {
            b.this.a(((Integer) obj).intValue());
            b.this.k = false;
            n.a(b.this.h, g.o, "LOG_SEND_TIME", System.currentTimeMillis());
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadStart(int i) {
        }
    };
    private b.a n = new b.a() { // from class: com.anythink.core.common.i.b.2
        @Override // com.anythink.core.common.g.a.b.a
        public final void a(Object obj) {
            if (obj instanceof com.anythink.core.common.g.a.a) {
                b.this.a(((com.anythink.core.common.g.a.a) obj).a());
                b.this.k = false;
                n.a(b.this.h, g.o, "LOG_SEND_TIME", System.currentTimeMillis());
            }
        }

        @Override // com.anythink.core.common.g.a.b.a
        public final void a(Throwable th) {
            b.this.k = false;
        }
    };
    private Object o = new Object();

    private b() {
    }

    private synchronized void c() {
        AtomicInteger atomicInteger;
        String readLine;
        if (this.h == null) {
            return;
        }
        if (this.k || (atomicInteger = this.j) == null || atomicInteger.get() < this.c) {
            return;
        }
        this.k = true;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.i));
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.d && (readLine = bufferedReader2.readLine()) != null; i++) {
                    arrayList.add(readLine);
                    e.b("Agent", "Try to send:".concat(readLine));
                }
                com.anythink.core.c.a b2 = com.anythink.core.c.b.a(m.a().e()).b(m.a().n());
                if (b2 != null) {
                    if (b2.m() != 1) {
                        new com.anythink.core.common.g.b(this.h, b2.m(), arrayList).a(0, this.m);
                    } else {
                        com.anythink.core.common.g.a.a aVar = new com.anythink.core.common.g.a.a(arrayList);
                        aVar.a(1, b2.l());
                        aVar.a(this.n);
                    }
                } else {
                    new com.anythink.core.common.g.b(this.h, 0, arrayList).a(0, this.m);
                }
                try {
                    bufferedReader2.close();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                bufferedReader = bufferedReader2;
                this.k = false;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
            } catch (OutOfMemoryError | StackOverflowError unused4) {
                bufferedReader = bufferedReader2;
                this.k = false;
                System.gc();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused5) {
                    }
                }
            } catch (Throwable unused6) {
                bufferedReader = bufferedReader2;
                this.k = false;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused7) {
                    }
                }
            }
        } catch (Exception unused8) {
        } catch (OutOfMemoryError | StackOverflowError unused9) {
        } catch (Throwable unused10) {
        }
    }

    public final void b() {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.i.b.3
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0133, code lost:
                if (r0 == null) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
                if (r0 == null) goto L50;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                BufferedReader bufferedReader;
                Throwable th;
                ArrayList arrayList;
                int i;
                h hVar;
                String readLine;
                synchronized (this) {
                    if (b.this.h == null) {
                        return;
                    }
                    if (System.currentTimeMillis() - n.a(b.this.h, g.o, "LOG_SEND_TIME", (Long) 0L).longValue() > b.this.e || (b.this.j != null && b.this.j.get() >= b.this.c)) {
                        e.b("Agent", "sendLogByTime:30 minites");
                        if (!b.this.k && b.this.j != null && b.this.j.get() > 0) {
                            b.this.k = true;
                            h hVar2 = null;
                            try {
                                try {
                                    bufferedReader = new BufferedReader(new FileReader(b.this.i));
                                } catch (Error unused) {
                                } catch (Exception unused2) {
                                } catch (OutOfMemoryError | StackOverflowError unused3) {
                                }
                                try {
                                    try {
                                        arrayList = new ArrayList();
                                        i = 0;
                                        while (i < b.this.d && (readLine = bufferedReader.readLine()) != null) {
                                            arrayList.add(readLine);
                                            e.b("Agent", "SendLogByTime:".concat(readLine));
                                            i++;
                                        }
                                        bufferedReader.close();
                                    } catch (Error unused4) {
                                        hVar2 = bufferedReader;
                                        b.this.k = false;
                                        hVar2 = hVar2;
                                    } catch (Exception unused5) {
                                        hVar2 = bufferedReader;
                                        b.this.k = false;
                                        hVar2 = hVar2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (Exception unused6) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (OutOfMemoryError | StackOverflowError unused7) {
                                    hVar2 = bufferedReader;
                                    b.this.k = false;
                                    System.gc();
                                    hVar2 = hVar2;
                                    if (hVar2 != null) {
                                        hVar2.close();
                                        hVar2 = hVar2;
                                    }
                                }
                                if (i == 0) {
                                    b.this.k = false;
                                    try {
                                        bufferedReader.close();
                                    } catch (Exception unused8) {
                                    }
                                    return;
                                }
                                com.anythink.core.c.a b2 = com.anythink.core.c.b.a(m.a().e()).b(m.a().n());
                                if (b2 != null) {
                                    if (b2.m() != 1) {
                                        com.anythink.core.common.g.b bVar = new com.anythink.core.common.g.b(b.this.h, b2.m(), arrayList);
                                        h hVar3 = b.this.m;
                                        bVar.a(0, hVar3);
                                        hVar = hVar3;
                                    } else {
                                        com.anythink.core.common.g.a.a aVar = new com.anythink.core.common.g.a.a(arrayList);
                                        aVar.a(1, b2.l());
                                        b.a aVar2 = b.this.n;
                                        aVar.a(aVar2);
                                        hVar = aVar2;
                                    }
                                } else {
                                    com.anythink.core.common.g.b bVar2 = new com.anythink.core.common.g.b(b.this.h, 0, arrayList);
                                    h hVar4 = b.this.m;
                                    bVar2.a(0, hVar4);
                                    hVar = hVar4;
                                }
                                bufferedReader.close();
                                hVar2 = hVar;
                            } catch (Throwable th3) {
                                bufferedReader = hVar2;
                                th = th3;
                            }
                        }
                    }
                }
            }
        });
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
            }
            bVar = b;
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc A[Catch: all -> 0x0144, Error -> 0x0146, OutOfMemoryError | StackOverflowError -> 0x0150, OutOfMemoryError | StackOverflowError -> 0x0150, Exception -> 0x0169, TryCatch #1 {OutOfMemoryError | StackOverflowError -> 0x0150, blocks: (B:10:0x001a, B:12:0x0078, B:14:0x008b, B:15:0x0094, B:17:0x009c, B:25:0x00e1, B:25:0x00e1, B:37:0x00f8, B:37:0x00f8, B:39:0x00fc, B:39:0x00fc, B:40:0x0103, B:40:0x0103, B:42:0x0115, B:42:0x0115, B:44:0x011c, B:44:0x011c, B:46:0x012c, B:46:0x012c, B:48:0x0133, B:48:0x0133, B:47:0x0131, B:47:0x0131, B:43:0x011a, B:43:0x011a, B:33:0x00ef, B:33:0x00ef, B:34:0x00f2, B:34:0x00f2, B:36:0x00f5, B:36:0x00f5), top: B:78:0x001a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[Catch: all -> 0x0144, Error -> 0x0146, OutOfMemoryError | StackOverflowError -> 0x0150, OutOfMemoryError | StackOverflowError -> 0x0150, Exception -> 0x0169, TryCatch #1 {OutOfMemoryError | StackOverflowError -> 0x0150, blocks: (B:10:0x001a, B:12:0x0078, B:14:0x008b, B:15:0x0094, B:17:0x009c, B:25:0x00e1, B:25:0x00e1, B:37:0x00f8, B:37:0x00f8, B:39:0x00fc, B:39:0x00fc, B:40:0x0103, B:40:0x0103, B:42:0x0115, B:42:0x0115, B:44:0x011c, B:44:0x011c, B:46:0x012c, B:46:0x012c, B:48:0x0133, B:48:0x0133, B:47:0x0131, B:47:0x0131, B:43:0x011a, B:43:0x011a, B:33:0x00ef, B:33:0x00ef, B:34:0x00f2, B:34:0x00f2, B:36:0x00f5, B:36:0x00f5), top: B:78:0x001a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[Catch: all -> 0x0144, Error -> 0x0146, OutOfMemoryError | StackOverflowError -> 0x0150, OutOfMemoryError | StackOverflowError -> 0x0150, Exception -> 0x0169, TryCatch #1 {OutOfMemoryError | StackOverflowError -> 0x0150, blocks: (B:10:0x001a, B:12:0x0078, B:14:0x008b, B:15:0x0094, B:17:0x009c, B:25:0x00e1, B:25:0x00e1, B:37:0x00f8, B:37:0x00f8, B:39:0x00fc, B:39:0x00fc, B:40:0x0103, B:40:0x0103, B:42:0x0115, B:42:0x0115, B:44:0x011c, B:44:0x011c, B:46:0x012c, B:46:0x012c, B:48:0x0133, B:48:0x0133, B:47:0x0131, B:47:0x0131, B:43:0x011a, B:43:0x011a, B:33:0x00ef, B:33:0x00ef, B:34:0x00f2, B:34:0x00f2, B:36:0x00f5, B:36:0x00f5), top: B:78:0x001a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c A[Catch: all -> 0x0144, Error -> 0x0146, OutOfMemoryError | StackOverflowError -> 0x0150, OutOfMemoryError | StackOverflowError -> 0x0150, Exception -> 0x0169, TryCatch #1 {OutOfMemoryError | StackOverflowError -> 0x0150, blocks: (B:10:0x001a, B:12:0x0078, B:14:0x008b, B:15:0x0094, B:17:0x009c, B:25:0x00e1, B:25:0x00e1, B:37:0x00f8, B:37:0x00f8, B:39:0x00fc, B:39:0x00fc, B:40:0x0103, B:40:0x0103, B:42:0x0115, B:42:0x0115, B:44:0x011c, B:44:0x011c, B:46:0x012c, B:46:0x012c, B:48:0x0133, B:48:0x0133, B:47:0x0131, B:47:0x0131, B:43:0x011a, B:43:0x011a, B:33:0x00ef, B:33:0x00ef, B:34:0x00f2, B:34:0x00f2, B:36:0x00f5, B:36:0x00f5), top: B:78:0x001a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131 A[Catch: all -> 0x0144, Error -> 0x0146, OutOfMemoryError | StackOverflowError -> 0x0150, OutOfMemoryError | StackOverflowError -> 0x0150, Exception -> 0x0169, TryCatch #1 {OutOfMemoryError | StackOverflowError -> 0x0150, blocks: (B:10:0x001a, B:12:0x0078, B:14:0x008b, B:15:0x0094, B:17:0x009c, B:25:0x00e1, B:25:0x00e1, B:37:0x00f8, B:37:0x00f8, B:39:0x00fc, B:39:0x00fc, B:40:0x0103, B:40:0x0103, B:42:0x0115, B:42:0x0115, B:44:0x011c, B:44:0x011c, B:46:0x012c, B:46:0x012c, B:48:0x0133, B:48:0x0133, B:47:0x0131, B:47:0x0131, B:43:0x011a, B:43:0x011a, B:33:0x00ef, B:33:0x00ef, B:34:0x00f2, B:34:0x00f2, B:36:0x00f5, B:36:0x00f5), top: B:78:0x001a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c A[Catch: all -> 0x0175, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0009, B:49:0x0138, B:51:0x013c, B:52:0x0141, B:70:0x0173, B:55:0x0146, B:57:0x014a, B:60:0x0153, B:62:0x0157, B:67:0x0169, B:69:0x016d, B:10:0x001a, B:12:0x0078, B:14:0x008b, B:15:0x0094, B:17:0x009c, B:25:0x00e1, B:37:0x00f8, B:39:0x00fc, B:40:0x0103, B:42:0x0115, B:44:0x011c, B:46:0x012c, B:48:0x0133, B:47:0x0131, B:43:0x011a, B:33:0x00ef, B:34:0x00f2, B:36:0x00f5, B:59:0x0150), top: B:79:0x0003, inners: #5, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context) {
        AtomicInteger atomicInteger;
        LineNumberReader lineNumberReader;
        Throwable th;
        synchronized (this.o) {
            if (this.h != null) {
                return;
            }
            this.l = m.a().n();
            this.h = context.getApplicationContext();
            try {
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.h.getApplicationContext().getFilesDir().getAbsolutePath());
                        String str = File.separator;
                        sb.append(str);
                        sb.append(DatabasePersistence.COLUMN_LOG);
                        sb.append(str);
                        sb.append("anythink_agent_log");
                        this.f = sb.toString();
                        this.g = this.h.getApplicationContext().getFilesDir().getAbsolutePath() + str + DatabasePersistence.COLUMN_LOG + str + "anythink_temp_log";
                        if (this.i == null) {
                            File file = new File(this.f);
                            this.i = file;
                            if (!file.getParentFile().exists()) {
                                this.i.getParentFile().mkdirs();
                            }
                            if (!this.i.exists()) {
                                this.i.createNewFile();
                            }
                        }
                        LineNumberReader lineNumberReader2 = null;
                        try {
                            try {
                                lineNumberReader = new LineNumberReader(new FileReader(this.i));
                            } catch (Exception unused) {
                            } catch (Throwable th2) {
                                lineNumberReader = null;
                                th = th2;
                            }
                        } catch (IOException unused2) {
                        }
                        try {
                            lineNumberReader.skip(Long.MAX_VALUE);
                            int lineNumber = lineNumberReader.getLineNumber();
                            if (this.j == null) {
                                this.j = new AtomicInteger(lineNumber);
                            }
                            lineNumberReader.close();
                            e.b("Agent", "init file log count:" + this.j.get());
                            lineNumberReader.close();
                        } catch (Exception unused3) {
                            lineNumberReader2 = lineNumberReader;
                            if (lineNumberReader2 != null) {
                                lineNumberReader2.close();
                            }
                            if (this.j == null) {
                            }
                            com.anythink.core.c.a b2 = com.anythink.core.c.b.a(this.h).b(this.l);
                            if (b2.X() == 0) {
                            }
                            this.c = r2;
                            this.d = r2 * 2;
                            this.e = b2.Z() == 0 ? b2.Z() : this.e;
                            b();
                            if (this.j == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (lineNumberReader != null) {
                                try {
                                    lineNumberReader.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                        if (this.j == null) {
                            this.j = new AtomicInteger(0);
                        }
                        com.anythink.core.c.a b22 = com.anythink.core.c.b.a(this.h).b(this.l);
                        int X = b22.X() == 0 ? b22.X() : this.c;
                        this.c = X;
                        this.d = X * 2;
                        this.e = b22.Z() == 0 ? b22.Z() : this.e;
                        b();
                    } catch (Error unused5) {
                        if (this.j == null) {
                            atomicInteger = new AtomicInteger(0);
                        }
                    }
                } catch (Exception unused6) {
                    if (this.j == null) {
                        atomicInteger = new AtomicInteger(0);
                    }
                }
            } catch (OutOfMemoryError | StackOverflowError unused7) {
                System.gc();
                if (this.j == null) {
                    atomicInteger = new AtomicInteger(0);
                }
            }
            if (this.j == null) {
                atomicInteger = new AtomicInteger(0);
                this.j = atomicInteger;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r0 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(com.anythink.core.common.e.h hVar) {
        if (this.i == null || this.j == null) {
            a(m.a().e());
        }
        com.anythink.core.c.a b2 = com.anythink.core.c.b.a(this.h).b(this.l);
        int X = b2.X() != 0 ? b2.X() : this.c;
        this.c = X;
        this.d = X * 2;
        this.e = b2.Z();
        FileWriter fileWriter = null;
        try {
            try {
                try {
                    String jSONObject = hVar.a().toString();
                    FileWriter fileWriter2 = new FileWriter(this.i, true);
                    try {
                        fileWriter2.append((CharSequence) jSONObject);
                        fileWriter2.append((CharSequence) "\n");
                        fileWriter2.flush();
                        fileWriter2.close();
                        this.j.incrementAndGet();
                        fileWriter2.close();
                    } catch (Error unused) {
                        fileWriter = fileWriter2;
                    } catch (Exception unused2) {
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                        c();
                    } catch (OutOfMemoryError | StackOverflowError unused3) {
                        fileWriter = fileWriter2;
                        System.gc();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (OutOfMemoryError | StackOverflowError unused5) {
                } catch (Error unused6) {
                } catch (Exception unused7) {
                }
            } catch (IOException unused8) {
            }
            c();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i) {
        File file;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            file = new File(this.g);
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(this.i));
        } catch (OutOfMemoryError | StackOverflowError unused) {
        } catch (Error unused2) {
        } catch (Exception unused3) {
        } catch (Throwable unused4) {
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                i3++;
                if (i3 > i) {
                    fileWriter.append((CharSequence) readLine);
                    fileWriter.append((CharSequence) "\n");
                } else {
                    e.b("Agent", "Remove log:".concat(readLine));
                }
            }
            fileWriter.flush();
            fileWriter.close();
            bufferedReader.close();
            AtomicInteger atomicInteger = this.j;
            if (atomicInteger.get() - i >= 0) {
                i2 = this.j.get() - i;
            }
            atomicInteger.set(i2);
            this.i.delete();
            file.renameTo(this.i);
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
        } catch (Error unused6) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused7) {
                }
            }
        } catch (Exception unused8) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused9) {
                }
            }
        } catch (OutOfMemoryError | StackOverflowError unused10) {
            bufferedReader2 = bufferedReader;
            System.gc();
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused11) {
                }
            }
        } catch (Throwable unused12) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused13) {
                }
            }
        }
    }
}