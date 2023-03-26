package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.b.c;
import com.anythink.expressad.atsignalcommon.mraid.MraidUriUtil;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class m implements Handler.Callback, d {
    public Pattern a;
    public String b;
    public Context d;
    public WindVaneWebView e;
    public final int c = 1;
    public Handler f = new Handler(Looper.getMainLooper(), this);

    public m(Context context) {
        this.d = context;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final WebView a() {
        return this.e;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final a b(String str) {
        if (str == null) {
            return null;
        }
        a mraidMethodContext = MraidUriUtil.getMraidMethodContext(this.e, str);
        if (mraidMethodContext != null) {
            mraidMethodContext.a = this.e;
            return mraidMethodContext;
        }
        Matcher matcher = this.a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                aVar.f = matcher.group(5);
            }
            if (groupCount >= 3) {
                aVar.d = matcher.group(1);
                aVar.g = matcher.group(2);
                String group = matcher.group(3);
                aVar.e = group;
                HashMap<String, String> hashMap = com.anythink.expressad.atsignalcommon.base.e.k;
                if (hashMap != null && hashMap.containsKey(group)) {
                    aVar.e = com.anythink.expressad.atsignalcommon.base.e.k.get(aVar.e);
                }
                aVar.a = this.e;
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        a aVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str != null) {
            aVar = MraidUriUtil.getMraidMethodContext(this.e, str);
            if (aVar != null) {
                aVar.a = this.e;
            } else {
                Matcher matcher = this.a.matcher(str);
                if (matcher.matches()) {
                    aVar = new a();
                    int groupCount = matcher.groupCount();
                    if (groupCount >= 5) {
                        aVar.f = matcher.group(5);
                    }
                    if (groupCount >= 3) {
                        aVar.d = matcher.group(1);
                        aVar.g = matcher.group(2);
                        String group = matcher.group(3);
                        aVar.e = group;
                        HashMap<String, String> hashMap = com.anythink.expressad.atsignalcommon.base.e.k;
                        if (hashMap != null && hashMap.containsKey(group)) {
                            aVar.e = com.anythink.expressad.atsignalcommon.base.e.k.get(aVar.e);
                        }
                        aVar.a = this.e;
                    }
                }
            }
            if (aVar != null) {
                return;
            }
            WindVaneWebView windVaneWebView = aVar.a;
            Object jsObject = windVaneWebView != null ? windVaneWebView.getJsObject(aVar.d) : null;
            if (jsObject == null) {
                return;
            }
            try {
                c.f a = com.anythink.expressad.atsignalcommon.b.c.a(this.d.getClassLoader(), jsObject.getClass().getName()).a(aVar.e, Object.class, String.class);
                if (jsObject instanceof l) {
                    aVar.b = jsObject;
                    aVar.c = a;
                    aVar.b = jsObject;
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = aVar;
                    this.f.sendMessage(obtain);
                    return;
                }
                return;
            } catch (c.b.a e) {
                if (com.anythink.expressad.a.a) {
                    e.printStackTrace();
                    return;
                }
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        aVar = null;
        if (aVar != null) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void d(String str) {
        this.b = str;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = aVar.b;
        c.f fVar = aVar.c;
        Object[] objArr = new Object[2];
        objArr[0] = aVar;
        objArr[1] = TextUtils.isEmpty(aVar.f) ? "{}" : aVar.f;
        fVar.a(obj, objArr);
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void a(WindVaneWebView windVaneWebView) {
        this.e = windVaneWebView;
    }

    private void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.a;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.d);
        if (jsObject == null) {
            return;
        }
        try {
            c.f a = com.anythink.expressad.atsignalcommon.b.c.a(this.d.getClassLoader(), jsObject.getClass().getName()).a(aVar.e, Object.class, String.class);
            if (jsObject instanceof l) {
                aVar.b = jsObject;
                aVar.c = a;
                aVar.b = jsObject;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = aVar;
                this.f.sendMessage(obtain);
            }
        } catch (c.b.a e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b(a aVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = aVar;
        this.f.sendMessage(obtain);
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final String b() {
        return this.b;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void a(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final boolean a(String str) {
        if (n.a(str)) {
            this.a = n.b(str);
            this.b = str;
            return true;
        }
        return false;
    }
}