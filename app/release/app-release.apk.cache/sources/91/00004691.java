package com.p7700g.p99005;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.appcompat.widget.ActivityChooserModel;
import com.p7700g.p99005.gn3;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/p7700g/p99005/hi3;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "", "titlePrefix", "previouslyDeniedPostfix", "Lcom/p7700g/p99005/hi3$a;", "callback", "Lcom/p7700g/p99005/yq4;", "a", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/p7700g/p99005/hi3$a;)V", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class hi3 {
    @NotNull
    public static final hi3 a = new hi3();

    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/p7700g/p99005/hi3$a", "", "Lcom/p7700g/p99005/yq4;", "a", "()V", "b", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "Lcom/p7700g/p99005/yq4;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ a s;

        public b(a aVar) {
            this.s = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.s.a();
        }
    }

    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "Lcom/p7700g/p99005/yq4;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ a s;

        public c(a aVar) {
            this.s = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.s.b();
        }
    }

    private hi3() {
    }

    public final void a(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull a aVar) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        c25.p(str, "titlePrefix");
        c25.p(str2, "previouslyDeniedPostfix");
        c25.p(aVar, "callback");
        String string = activity.getString(gn3.m.i0);
        c25.o(string, "activity.getString(R.str…sion_not_available_title)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        c25.o(format, "java.lang.String.format(this, *args)");
        String string2 = activity.getString(gn3.m.g0);
        c25.o(string2, "activity.getString(R.str…on_not_available_message)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
        c25.o(format2, "java.lang.String.format(this, *args)");
        new AlertDialog.Builder(activity).setTitle(format).setMessage(format2).setPositiveButton(gn3.m.h0, new b(aVar)).setNegativeButton(17039369, new c(aVar)).show();
    }
}