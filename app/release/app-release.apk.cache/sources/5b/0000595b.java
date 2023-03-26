package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.p7700g.p99005.p5;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: BrowserActionsFallbackMenuAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public class r5 extends BaseAdapter {
    private final List<q5> s;
    private final Context t;

    /* compiled from: BrowserActionsFallbackMenuAdapter.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ c t;
        public final /* synthetic */ gn2 u;

        public a(String str, c cVar, gn2 gn2Var) {
            this.s = str;
            this.t = cVar;
            this.u = gn2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.s, this.t.b.getText())) {
                try {
                    bitmap = (Bitmap) this.u.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.t.a.setVisibility(0);
                    this.t.a.setImageBitmap(bitmap);
                    return;
                }
                this.t.a.setVisibility(4);
                this.t.a.setImageBitmap(null);
            }
        }
    }

    /* compiled from: BrowserActionsFallbackMenuAdapter.java */
    /* loaded from: classes.dex */
    public class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            runnable.run();
        }
    }

    /* compiled from: BrowserActionsFallbackMenuAdapter.java */
    /* loaded from: classes.dex */
    public static class c {
        public final ImageView a;
        public final TextView b;

        public c(ImageView imageView, TextView textView) {
            this.a = imageView;
            this.b = textView;
        }
    }

    public r5(List<q5> list, Context context) {
        this.s = list;
        this.t = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.s.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.s.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        q5 q5Var = this.s.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.t).inflate(p5.d.b, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(p5.c.b);
            TextView textView = (TextView) view.findViewById(p5.c.c);
            if (imageView != null && textView != null) {
                cVar = new c(imageView, textView);
                view.setTag(cVar);
            } else {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
        } else {
            cVar = (c) view.getTag();
        }
        String e = q5Var.e();
        cVar.b.setText(e);
        if (q5Var.b() != 0) {
            cVar.a.setImageDrawable(oi.g(this.t.getResources(), q5Var.b(), null));
        } else if (q5Var.c() != null) {
            gn2<Bitmap> l = v5.l(this.t.getContentResolver(), q5Var.c());
            l.a(new a(e, cVar, l), new b());
        } else {
            cVar.a.setImageBitmap(null);
            cVar.a.setVisibility(4);
        }
        return view;
    }
}