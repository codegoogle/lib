package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.cx;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public class nx implements LayoutInflater.Factory2 {
    private static final String s = "FragmentManager";
    public final FragmentManager t;

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ yx s;

        public a(yx yxVar) {
            this.s = yxVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k = this.s.k();
            this.s.m();
            ky.n((ViewGroup) k.mView.getParent(), nx.this.t).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public nx(FragmentManager fragmentManager) {
        this.t = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @z1
    public View onCreateView(@x1 String str, @x1 Context context, @x1 AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @z1
    public View onCreateView(@z1 View view, @x1 String str, @x1 Context context, @x1 AttributeSet attributeSet) {
        yx A;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.t);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cx.l.z);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(cx.l.A);
            }
            int resourceId = obtainStyledAttributes.getResourceId(cx.l.B, -1);
            String string = obtainStyledAttributes.getString(cx.l.C);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !lx.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment p0 = resourceId != -1 ? this.t.p0(resourceId) : null;
            if (p0 == null && string != null) {
                p0 = this.t.q0(string);
            }
            if (p0 == null && id != -1) {
                p0 = this.t.p0(id);
            }
            if (p0 == null) {
                p0 = this.t.E0().a(context.getClassLoader(), attributeValue);
                p0.mFromLayout = true;
                p0.mFragmentId = resourceId != 0 ? resourceId : id;
                p0.mContainerId = id;
                p0.mTag = string;
                p0.mInLayout = true;
                FragmentManager fragmentManager = this.t;
                p0.mFragmentManager = fragmentManager;
                p0.mHost = fragmentManager.H0();
                p0.onInflate(this.t.H0().g(), attributeSet, p0.mSavedFragmentState);
                A = this.t.k(p0);
                if (FragmentManager.T0(2)) {
                    String str2 = "Fragment " + p0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId);
                }
            } else if (!p0.mInLayout) {
                p0.mInLayout = true;
                FragmentManager fragmentManager2 = this.t;
                p0.mFragmentManager = fragmentManager2;
                p0.mHost = fragmentManager2.H0();
                p0.onInflate(this.t.H0().g(), attributeSet, p0.mSavedFragmentState);
                A = this.t.A(p0);
                if (FragmentManager.T0(2)) {
                    String str3 = "Retained Fragment " + p0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId);
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            p0.mContainer = (ViewGroup) view;
            A.m();
            A.j();
            View view2 = p0.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (p0.mView.getTag() == null) {
                    p0.mView.setTag(string);
                }
                p0.mView.addOnAttachStateChangeListener(new a(A));
                return p0.mView;
            }
            throw new IllegalStateException(wo1.u("Fragment ", attributeValue, " did not create a view."));
        }
        return null;
    }
}