package com.p7700g.p99005;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import com.p7700g.p99005.x2;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class j3 {
    private static final String g = "AppCompatViewInflater";
    private final Object[] i = new Object[2];
    private static final Class<?>[] a = {Context.class, AttributeSet.class};
    private static final int[] b = {16843375};
    private static final int[] c = {16844160};
    private static final int[] d = {16844156};
    private static final int[] e = {16844148};
    private static final String[] f = {"android.widget.", "android.view.", "android.webkit."};
    private static final y7<String, Constructor<? extends View>> h = new y7<>();

    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {
        private final View s;
        private final String t;
        private Method u;
        private Context v;

        public a(@x1 View view, @x1 String str) {
            this.s = view;
            this.t = str;
        }

        private void a(@z1 Context context) {
            String sb;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.t, View.class)) != null) {
                        this.u = method;
                        this.v = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.s.getId();
            if (id == -1) {
                sb = "";
            } else {
                StringBuilder G = wo1.G(" with id '");
                G.append(this.s.getContext().getResources().getResourceEntryName(id));
                G.append("'");
                sb = G.toString();
            }
            StringBuilder G2 = wo1.G("Could not find method ");
            G2.append(this.t);
            G2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            G2.append(this.s.getClass());
            G2.append(sb);
            throw new IllegalStateException(G2.toString());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@x1 View view) {
            if (this.u == null) {
                a(this.s.getContext());
            }
            try {
                this.u.invoke(this.v, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void a(@x1 Context context, @x1 View view, @x1 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
        if (obtainStyledAttributes.hasValue(0)) {
            sr.B1(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d);
        if (obtainStyledAttributes2.hasValue(0)) {
            sr.D1(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, e);
        if (obtainStyledAttributes3.hasValue(0)) {
            sr.m2(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && sr.J0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        y7<String, Constructor<? extends View>> y7Var = h;
        Constructor<? extends View> constructor = y7Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(a);
            y7Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.i);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(com.anythink.expressad.a.B)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.i;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f;
                if (i >= strArr.length) {
                    return null;
                }
                View s = s(context, str, strArr[i]);
                if (s != null) {
                    return s;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.i;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.m.K6, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(x2.m.L6, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(x2.m.P6, 0);
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof d4) && ((d4) context).c() == resourceId) ? context : new d4(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @x1
    public AppCompatAutoCompleteTextView c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @x1
    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @x1
    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @x1
    public AppCompatCheckedTextView f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @x1
    public AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @x1
    public AppCompatImageButton h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @x1
    public AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @x1
    public AppCompatMultiAutoCompleteTextView j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @x1
    public AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @x1
    public AppCompatRatingBar l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @x1
    public AppCompatSeekBar m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @x1
    public AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @x1
    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @x1
    public AppCompatToggleButton p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @z1
    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, @x1 Context context, @x1 AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View l;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = TintContextWrapper.wrap(context2);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                l = l(context2, attributeSet);
                v(l, str);
                break;
            case 1:
                l = f(context2, attributeSet);
                v(l, str);
                break;
            case 2:
                l = j(context2, attributeSet);
                v(l, str);
                break;
            case 3:
                l = o(context2, attributeSet);
                v(l, str);
                break;
            case 4:
                l = h(context2, attributeSet);
                v(l, str);
                break;
            case 5:
                l = m(context2, attributeSet);
                v(l, str);
                break;
            case 6:
                l = n(context2, attributeSet);
                v(l, str);
                break;
            case 7:
                l = k(context2, attributeSet);
                v(l, str);
                break;
            case '\b':
                l = p(context2, attributeSet);
                v(l, str);
                break;
            case '\t':
                l = i(context2, attributeSet);
                v(l, str);
                break;
            case '\n':
                l = c(context2, attributeSet);
                v(l, str);
                break;
            case 11:
                l = e(context2, attributeSet);
                v(l, str);
                break;
            case '\f':
                l = g(context2, attributeSet);
                v(l, str);
                break;
            case '\r':
                l = d(context2, attributeSet);
                v(l, str);
                break;
            default:
                l = q(context2, str, attributeSet);
                break;
        }
        if (l == null && context != context2) {
            l = t(context2, str, attributeSet);
        }
        if (l != null) {
            b(l, attributeSet);
            a(context2, l, attributeSet);
        }
        return l;
    }
}