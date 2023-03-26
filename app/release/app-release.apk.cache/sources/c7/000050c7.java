package com.p7700g.p99005;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: Bundle.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class mm {
    @NotNull
    public static final Bundle a() {
        return new Bundle(0);
    }

    @NotNull
    public static final Bundle b(@NotNull hp4<String, ? extends Object>... hp4VarArr) {
        c25.p(hp4VarArr, "pairs");
        Bundle bundle = new Bundle(hp4VarArr.length);
        for (hp4<String, ? extends Object> hp4Var : hp4VarArr) {
            String f = hp4Var.f();
            Object g = hp4Var.g();
            if (g == null) {
                bundle.putString(f, null);
            } else if (g instanceof Boolean) {
                bundle.putBoolean(f, ((Boolean) g).booleanValue());
            } else if (g instanceof Byte) {
                bundle.putByte(f, ((Number) g).byteValue());
            } else if (g instanceof Character) {
                bundle.putChar(f, ((Character) g).charValue());
            } else if (g instanceof Double) {
                bundle.putDouble(f, ((Number) g).doubleValue());
            } else if (g instanceof Float) {
                bundle.putFloat(f, ((Number) g).floatValue());
            } else if (g instanceof Integer) {
                bundle.putInt(f, ((Number) g).intValue());
            } else if (g instanceof Long) {
                bundle.putLong(f, ((Number) g).longValue());
            } else if (g instanceof Short) {
                bundle.putShort(f, ((Number) g).shortValue());
            } else if (g instanceof Bundle) {
                bundle.putBundle(f, (Bundle) g);
            } else if (g instanceof CharSequence) {
                bundle.putCharSequence(f, (CharSequence) g);
            } else if (g instanceof Parcelable) {
                bundle.putParcelable(f, (Parcelable) g);
            } else if (g instanceof boolean[]) {
                bundle.putBooleanArray(f, (boolean[]) g);
            } else if (g instanceof byte[]) {
                bundle.putByteArray(f, (byte[]) g);
            } else if (g instanceof char[]) {
                bundle.putCharArray(f, (char[]) g);
            } else if (g instanceof double[]) {
                bundle.putDoubleArray(f, (double[]) g);
            } else if (g instanceof float[]) {
                bundle.putFloatArray(f, (float[]) g);
            } else if (g instanceof int[]) {
                bundle.putIntArray(f, (int[]) g);
            } else if (g instanceof long[]) {
                bundle.putLongArray(f, (long[]) g);
            } else if (g instanceof short[]) {
                bundle.putShortArray(f, (short[]) g);
            } else if (g instanceof Object[]) {
                Class<?> componentType = g.getClass().getComponentType();
                c25.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(f, (Parcelable[]) g);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(f, (String[]) g);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(f, (CharSequence[]) g);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(f, (Serializable) g);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + f + h95.b);
                }
            } else if (g instanceof Serializable) {
                bundle.putSerializable(f, (Serializable) g);
            } else if (g instanceof IBinder) {
                km.a(bundle, f, (IBinder) g);
            } else if (g instanceof Size) {
                lm.a(bundle, f, (Size) g);
            } else if (g instanceof SizeF) {
                lm.b(bundle, f, (SizeF) g);
            } else {
                throw new IllegalArgumentException("Illegal value type " + g.getClass().getCanonicalName() + " for key \"" + f + h95.b);
            }
        }
        return bundle;
    }
}