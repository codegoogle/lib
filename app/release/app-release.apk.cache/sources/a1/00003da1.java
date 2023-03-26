package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* compiled from: FragmentTabHost.java */
@Deprecated
/* loaded from: classes.dex */
public class cy extends TabHost implements TabHost.OnTabChangeListener {
    private final ArrayList<c> s;
    private FrameLayout t;
    private Context u;
    private FragmentManager v;
    private int w;
    private TabHost.OnTabChangeListener x;
    private c y;
    private boolean z;

    /* compiled from: FragmentTabHost.java */
    /* loaded from: classes.dex */
    public static class a implements TabHost.TabContentFactory {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* compiled from: FragmentTabHost.java */
    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public String s;

        /* compiled from: FragmentTabHost.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        @x1
        public String toString() {
            StringBuilder G = wo1.G("FragmentTabHost.SavedState{");
            G.append(Integer.toHexString(System.identityHashCode(this)));
            G.append(" curTab=");
            return wo1.C(G, this.s, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.s);
        }

        public b(Parcel parcel) {
            super(parcel);
            this.s = parcel.readString();
        }
    }

    /* compiled from: FragmentTabHost.java */
    /* loaded from: classes.dex */
    public static final class c {
        @x1
        public final String a;
        @x1
        public final Class<?> b;
        @z1
        public final Bundle c;
        public Fragment d;

        public c(@x1 String str, @x1 Class<?> cls, @z1 Bundle bundle) {
            this.a = str;
            this.b = cls;
            this.c = bundle;
        }
    }

    @Deprecated
    public cy(@x1 Context context) {
        super(context, null);
        this.s = new ArrayList<>();
        f(context, null);
    }

    @z1
    private dy b(@z1 String str, @z1 dy dyVar) {
        Fragment fragment;
        c e = e(str);
        if (this.y != e) {
            if (dyVar == null) {
                dyVar = this.v.r();
            }
            c cVar = this.y;
            if (cVar != null && (fragment = cVar.d) != null) {
                dyVar.v(fragment);
            }
            if (e != null) {
                Fragment fragment2 = e.d;
                if (fragment2 == null) {
                    Fragment a2 = this.v.E0().a(this.u.getClassLoader(), e.b.getName());
                    e.d = a2;
                    a2.setArguments(e.c);
                    dyVar.g(this.w, e.d, e.a);
                } else {
                    dyVar.p(fragment2);
                }
            }
            this.y = e;
        }
        return dyVar;
    }

    private void c() {
        if (this.t == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.w);
            this.t = frameLayout;
            if (frameLayout != null) {
                return;
            }
            StringBuilder G = wo1.G("No tab content FrameLayout found for id ");
            G.append(this.w);
            throw new IllegalStateException(G.toString());
        }
    }

    private void d(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.t = frameLayout2;
            frameLayout2.setId(this.w);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @z1
    private c e(String str) {
        int size = this.s.size();
        for (int i = 0; i < size; i++) {
            c cVar = this.s.get(i);
            if (cVar.a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    private void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.w = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void a(@x1 TabHost.TabSpec tabSpec, @x1 Class<?> cls, @z1 Bundle bundle) {
        tabSpec.setContent(new a(this.u));
        String tag = tabSpec.getTag();
        c cVar = new c(tag, cls, bundle);
        if (this.z) {
            Fragment q0 = this.v.q0(tag);
            cVar.d = q0;
            if (q0 != null && !q0.isDetached()) {
                dy r = this.v.r();
                r.v(cVar.d);
                r.q();
            }
        }
        this.s.add(cVar);
        addTab(tabSpec);
    }

    @Deprecated
    public void g(@x1 Context context, @x1 FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.u = context;
        this.v = fragmentManager;
        c();
    }

    @Deprecated
    public void h(@x1 Context context, @x1 FragmentManager fragmentManager, int i) {
        d(context);
        super.setup();
        this.u = context;
        this.v = fragmentManager;
        this.w = i;
        c();
        this.t.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.s.size();
        dy dyVar = null;
        for (int i = 0; i < size; i++) {
            c cVar = this.s.get(i);
            Fragment q0 = this.v.q0(cVar.a);
            cVar.d = q0;
            if (q0 != null && !q0.isDetached()) {
                if (cVar.a.equals(currentTabTag)) {
                    this.y = cVar;
                } else {
                    if (dyVar == null) {
                        dyVar = this.v.r();
                    }
                    dyVar.v(cVar.d);
                }
            }
        }
        this.z = true;
        dy b2 = b(currentTabTag, dyVar);
        if (b2 != null) {
            b2.q();
            this.v.l0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCurrentTabByTag(bVar.s);
    }

    @Override // android.view.View
    @x1
    @Deprecated
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.s = getCurrentTabTag();
        return bVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@z1 String str) {
        dy b2;
        if (this.z && (b2 = b(str, null)) != null) {
            b2.q();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.x;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@z1 TabHost.OnTabChangeListener onTabChangeListener) {
        this.x = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public cy(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new ArrayList<>();
        f(context, attributeSet);
    }
}