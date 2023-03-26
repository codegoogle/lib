package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public class qd {
    public static void a(ViewGroup.LayoutParams param, String str) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(") ");
        G.append(str);
        G.append(g54.A);
        String sb = G.toString();
        PrintStream printStream = System.out;
        StringBuilder M = wo1.M(" >>>>>>>>>>>>>>>>>>. dump ", sb, g54.A);
        M.append(param.getClass().getName());
        printStream.println(M.toString());
        for (Field field : param.getClass().getFields()) {
            try {
                Object obj = field.get(param);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(sb + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + sb);
    }

    public static void b(ViewGroup layout, String str) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(") ");
        G.append(str);
        G.append(g54.A);
        String sb = G.toString();
        int childCount = layout.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = layout.getChildAt(i);
            PrintStream printStream = System.out;
            StringBuilder L = wo1.L(sb, "     ");
            L.append(k(childAt));
            printStream.println(L.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(sb + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void c(Object obj) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(")");
        String sb = G.toString();
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder L = wo1.L(sb, "------------- ");
        L.append(cls.getName());
        L.append(" --------------------");
        printStream.println(L.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(sb + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder L2 = wo1.L(sb, "------------- ");
        L2.append(cls.getSimpleName());
        L2.append(" --------------------");
        printStream2.println(L2.toString());
    }

    public static String d(MotionEvent event) {
        Field[] fields;
        int action = event.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String e(int n) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[n + 2];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(")");
        return G.toString();
    }

    public static String f() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(") ");
        G.append(stackTraceElement.getMethodName());
        G.append("()");
        return G.toString();
    }

    public static String g() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(")");
        return G.toString();
    }

    public static String h() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(")");
        return G.toString();
    }

    public static String i(Context context, int id) {
        if (id != -1) {
            try {
                return context.getResources().getResourceEntryName(id);
            } catch (Exception unused) {
                return wo1.l("?", id);
            }
        }
        return "UNKNOWN";
    }

    public static String j(Context context, int[] id) {
        String str;
        try {
            String str2 = id.length + "[";
            int i = 0;
            while (i < id.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i == 0 ? "" : " ");
                String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(id[i]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + id[i] + " ";
                }
                str2 = sb2 + str;
                i++;
            }
            return str2 + "]";
        } catch (Exception e) {
            e.toString();
            return "UNKNOWN";
        }
    }

    public static String k(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String l(ge layout, int stateId) {
        return m(layout, stateId, -1);
    }

    public static String m(ge layout, int stateId, int len) {
        int length;
        if (stateId == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = layout.getContext().getResources().getResourceEntryName(stateId);
        if (len != -1) {
            if (resourceEntryName.length() > len) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() <= len || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
                return resourceEntryName;
            }
            int length2 = (resourceEntryName.length() - len) / length;
            return resourceEntryName.replaceAll(CharBuffer.allocate(length2).toString().replace((char) 0, '.') + "_", "_");
        }
        return resourceEntryName;
    }

    public static void n(String tag, String msg, int n) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(n, stackTrace.length - 1);
        String str = " ";
        for (int i = 1; i <= min; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder G = wo1.G(".(");
            G.append(stackTrace[i].getFileName());
            G.append(":");
            G.append(stackTrace[i].getLineNumber());
            G.append(") ");
            G.append(stackTrace[i].getMethodName());
            G.toString();
            str = str + " ";
        }
    }

    public static void o(String msg, int n) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(n, stackTrace.length - 1);
        String str = " ";
        for (int i = 1; i <= min; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder G = wo1.G(".(");
            G.append(stackTrace[i].getFileName());
            G.append(":");
            G.append(stackTrace[i].getLineNumber());
            G.append(") ");
            String sb = G.toString();
            str = wo1.t(str, " ");
            PrintStream printStream = System.out;
            printStream.println(msg + str + sb + str);
        }
    }
}