package com.anythink.core.common.res.image;

import android.os.SystemClock;
import com.anythink.core.common.j.e;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes2.dex */
public abstract class b {
    private final String a = getClass().getSimpleName();
    public String c;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    /* renamed from: com.anythink.core.common.res.image.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends com.anythink.core.common.j.b.b {
        public AnonymousClass1() {
        }

        private void b(String str) {
            b.this.e = System.currentTimeMillis();
            b.this.f = SystemClock.elapsedRealtime();
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    e.b(b.this.a, "REQUEST URL: ".concat(String.valueOf(str)));
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                        b bVar = b.this;
                        if (bVar.d) {
                            bVar.a(c.b, "Task had been canceled.");
                            httpURLConnection2.disconnect();
                            return;
                        }
                        httpURLConnection2.setConnectTimeout(60000);
                        httpURLConnection2.connect();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (responseCode != 200) {
                            e.d(b.this.a, "http respond status code is " + responseCode + " ! url=" + str);
                            if (responseCode == 302) {
                                b bVar2 = b.this;
                                if (!bVar2.d) {
                                    String headerField = httpURLConnection2.getHeaderField("Location");
                                    if (headerField != null) {
                                        if (!headerField.startsWith("http")) {
                                            headerField = str + headerField;
                                        }
                                        b(headerField);
                                    }
                                } else {
                                    bVar2.a(c.b, "Task had been canceled.");
                                }
                                httpURLConnection2.disconnect();
                                return;
                            }
                            b.this.a(c.a, httpURLConnection2.getResponseMessage());
                            httpURLConnection2.disconnect();
                            return;
                        }
                        b bVar3 = b.this;
                        if (bVar3.d) {
                            bVar3.a(c.b, "Task had been canceled.");
                            httpURLConnection2.disconnect();
                            return;
                        }
                        bVar3.i = httpURLConnection2.getContentLength();
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        boolean a = b.this.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        b.this.g = System.currentTimeMillis();
                        b.this.h = SystemClock.elapsedRealtime();
                        if (a) {
                            e.a(b.this.a, "download success --> " + b.this.c);
                            b.this.c();
                        } else {
                            e.a(b.this.a, "download fail --> " + b.this.c);
                            b.this.a(c.a, "Save fail!");
                        }
                        httpURLConnection2.disconnect();
                    } catch (StackOverflowError e) {
                        e = e;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        e.d(b.this.a, e.getMessage());
                        b.this.a(c.a, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (SocketTimeoutException e2) {
                        e = e2;
                        httpURLConnection = httpURLConnection2;
                        b.this.a(c.a, e.getMessage());
                        e.d(b.this.a, e.toString());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        httpURLConnection = httpURLConnection2;
                        e.d(b.this.a, e.getMessage());
                        b.this.a(c.a, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (OutOfMemoryError e4) {
                        e = e4;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        e.d(b.this.a, e.getMessage());
                        b.this.a(c.a, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Error e5) {
                        e = e5;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        e.d(b.this.a, e.getMessage());
                        b.this.a(c.a, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (ConnectTimeoutException e6) {
                        e = e6;
                        httpURLConnection = httpURLConnection2;
                        b.this.a(c.a, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (StackOverflowError e7) {
                    e = e7;
                } catch (SocketTimeoutException e8) {
                    e = e8;
                } catch (ConnectTimeoutException e9) {
                    e = e9;
                } catch (Exception e10) {
                    e = e10;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                } catch (Error e12) {
                    e = e12;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.anythink.core.common.j.b.b
        public final void a() {
            try {
                b(b.this.c);
            } catch (Exception e) {
                e.d(b.this.a, e.getMessage());
                b.this.a(c.a, e.getMessage());
            } catch (OutOfMemoryError e2) {
                e = e2;
                System.gc();
                b.this.a(c.a, e.getMessage());
            } catch (StackOverflowError e3) {
                e = e3;
                System.gc();
                b.this.a(c.a, e.getMessage());
            }
        }
    }

    public b(String str) {
        this.c = str;
    }

    private void e() {
        this.d = true;
    }

    private void f() {
        a(new AnonymousClass1());
    }

    private static int g() {
        return 60000;
    }

    private static int h() {
        return 20000;
    }

    public abstract Map<String, String> a();

    public abstract void a(com.anythink.core.common.j.b.b bVar);

    public abstract void a(String str, String str2);

    public abstract boolean a(InputStream inputStream);

    public abstract void b();

    public abstract void c();

    public final void d() {
        this.d = false;
        a(new AnonymousClass1());
    }
}