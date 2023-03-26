package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p7700g.p99005.a4;
import com.p7700g.p99005.b5;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.gq;
import com.p7700g.p99005.k4;
import com.p7700g.p99005.nq;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.s4;
import com.p7700g.p99005.v4;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.x4;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z4;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ActionMenuPresenter extends k4 implements gq.a {
    private static final String TAG = "ActionMenuPresenter";
    private final SparseBooleanArray mActionButtonGroups;
    public ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    public int mOpenSubMenuId;
    public OverflowMenuButton mOverflowButton;
    public OverflowPopup mOverflowPopup;
    private Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private ActionMenuPopupCallback mPopupCallback;
    public final PopupPresenterCallback mPopupPresenterCallback;
    public OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    /* loaded from: classes.dex */
    public class ActionButtonSubmenu extends v4 {
        public ActionButtonSubmenu(Context context, b5 b5Var, View view) {
            super(context, b5Var, view, false, x2.b.G);
            if (!((s4) b5Var.getItem()).o()) {
                View view2 = ActionMenuPresenter.this.mOverflowButton;
                setAnchorView(view2 == null ? (View) ActionMenuPresenter.this.mMenuView : view2);
            }
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        @Override // com.p7700g.p99005.v4
        public void onDismiss() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.mActionButtonPopup = null;
            actionMenuPresenter.mOpenSubMenuId = 0;
            super.onDismiss();
        }
    }

    /* loaded from: classes.dex */
    public class ActionMenuPopupCallback extends ActionMenuItemView.b {
        public ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public z4 getPopup() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.mActionButtonPopup;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.getPopup();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.mPopup = overflowPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.mMenu != null) {
                ActionMenuPresenter.this.mMenu.d();
            }
            View view = (View) ActionMenuPresenter.this.mMenuView;
            if (view != null && view.getWindowToken() != null && this.mPopup.tryShow()) {
                ActionMenuPresenter.this.mOverflowPopup = this.mPopup;
            }
            ActionMenuPresenter.this.mPostedOpenRunnable = null;
        }
    }

    /* loaded from: classes.dex */
    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, null, x2.b.F);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public z4 getPopup() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.mOverflowPopup;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.getPopup();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    ActionMenuPresenter.this.showOverflowMenu();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.mPostedOpenRunnable != null) {
                        return false;
                    }
                    actionMenuPresenter.hideOverflowMenu();
                    return true;
                }
            });
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.showOverflowMenu();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                fk.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class OverflowPopup extends v4 {
        public OverflowPopup(Context context, p4 p4Var, View view, boolean z) {
            super(context, p4Var, view, z, x2.b.G);
            setGravity(nq.c);
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        @Override // com.p7700g.p99005.v4
        public void onDismiss() {
            if (ActionMenuPresenter.this.mMenu != null) {
                ActionMenuPresenter.this.mMenu.close();
            }
            ActionMenuPresenter.this.mOverflowPopup = null;
            super.onDismiss();
        }
    }

    /* loaded from: classes.dex */
    public class PopupPresenterCallback implements w4.a {
        public PopupPresenterCallback() {
        }

        @Override // com.p7700g.p99005.w4.a
        public void onCloseMenu(@x1 p4 p4Var, boolean z) {
            if (p4Var instanceof b5) {
                p4Var.G().f(false);
            }
            w4.a callback = ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(p4Var, z);
            }
        }

        @Override // com.p7700g.p99005.w4.a
        public boolean onOpenSubMenu(@x1 p4 p4Var) {
            if (p4Var == ActionMenuPresenter.this.mMenu) {
                return false;
            }
            ActionMenuPresenter.this.mOpenSubMenuId = ((b5) p4Var).getItem().getItemId();
            w4.a callback = ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                return callback.onOpenSubMenu(p4Var);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int openSubMenuId;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }

        public SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, x2.j.d, x2.j.c);
        this.mActionButtonGroups = new SparseBooleanArray();
        this.mPopupPresenterCallback = new PopupPresenterCallback();
    }

    private View findViewForItem(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof x4.a) && ((x4.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.k4
    public void bindItemView(s4 s4Var, x4.a aVar) {
        aVar.d(s4Var, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.mMenuView);
        if (this.mPopupCallback == null) {
            this.mPopupCallback = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.mPopupCallback);
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    @Override // com.p7700g.p99005.k4
    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.mOverflowButton) {
            return false;
        }
        return super.filterLeftoverView(viewGroup, i);
    }

    @Override // com.p7700g.p99005.k4, com.p7700g.p99005.w4
    public boolean flagActionItems() {
        ArrayList<s4> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        p4 p4Var = actionMenuPresenter.mMenu;
        View view = null;
        int i5 = 0;
        if (p4Var != null) {
            arrayList = p4Var.H();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.mMaxItems;
        int i7 = actionMenuPresenter.mActionItemWidthLimit;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.mMenuView;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            s4 s4Var = arrayList.get(i10);
            if (s4Var.d()) {
                i8++;
            } else if (s4Var.q()) {
                i9++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.mExpandedActionViewsExclusive && s4Var.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.mReserveOverflow && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.mActionButtonGroups;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.mStrictWidthLimit) {
            int i12 = actionMenuPresenter.mMinCellSize;
            i2 = i7 / i12;
            i3 = ((i7 % i12) / i2) + i12;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            s4 s4Var2 = arrayList.get(i13);
            if (s4Var2.d()) {
                View itemView = actionMenuPresenter.getItemView(s4Var2, view, viewGroup);
                if (actionMenuPresenter.mStrictWidthLimit) {
                    i2 -= ActionMenuView.measureChildForCells(itemView, i3, i2, makeMeasureSpec, i5);
                } else {
                    itemView.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = s4Var2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                s4Var2.x(true);
                i4 = i;
            } else if (s4Var2.q()) {
                int groupId2 = s4Var2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!actionMenuPresenter.mStrictWidthLimit || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View itemView2 = actionMenuPresenter.getItemView(s4Var2, null, viewGroup);
                    if (actionMenuPresenter.mStrictWidthLimit) {
                        int measureChildForCells = ActionMenuView.measureChildForCells(itemView2, i3, i2, makeMeasureSpec, 0);
                        i2 -= measureChildForCells;
                        if (measureChildForCells == 0) {
                            z4 = false;
                        }
                    } else {
                        itemView2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!actionMenuPresenter.mStrictWidthLimit ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        s4 s4Var3 = arrayList.get(i15);
                        if (s4Var3.getGroupId() == groupId2) {
                            if (s4Var3.o()) {
                                i11++;
                            }
                            s4Var3.x(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                s4Var2.x(z3);
            } else {
                i4 = i;
                s4Var2.x(false);
                i13++;
                view = null;
                actionMenuPresenter = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            actionMenuPresenter = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // com.p7700g.p99005.k4
    public View getItemView(s4 s4Var, View view, ViewGroup viewGroup) {
        View actionView = s4Var.getActionView();
        if (actionView == null || s4Var.m()) {
            actionView = super.getItemView(s4Var, view, viewGroup);
        }
        actionView.setVisibility(s4Var.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // com.p7700g.p99005.k4, com.p7700g.p99005.w4
    public x4 getMenuView(ViewGroup viewGroup) {
        x4 x4Var = this.mMenuView;
        x4 menuView = super.getMenuView(viewGroup);
        if (x4Var != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    public Drawable getOverflowIcon() {
        OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.mPendingOverflowIconSet) {
            return this.mPendingOverflowIcon;
        }
        return null;
    }

    public boolean hideOverflowMenu() {
        x4 x4Var;
        OpenOverflowRunnable openOverflowRunnable = this.mPostedOpenRunnable;
        if (openOverflowRunnable != null && (x4Var = this.mMenuView) != null) {
            ((View) x4Var).removeCallbacks(openOverflowRunnable);
            this.mPostedOpenRunnable = null;
            return true;
        }
        OverflowPopup overflowPopup = this.mOverflowPopup;
        if (overflowPopup != null) {
            overflowPopup.dismiss();
            return true;
        }
        return false;
    }

    public boolean hideSubMenus() {
        ActionButtonSubmenu actionButtonSubmenu = this.mActionButtonPopup;
        if (actionButtonSubmenu != null) {
            actionButtonSubmenu.dismiss();
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.k4, com.p7700g.p99005.w4
    public void initForMenu(@x1 Context context, @z1 p4 p4Var) {
        super.initForMenu(context, p4Var);
        Resources resources = context.getResources();
        a4 b = a4.b(context);
        if (!this.mReserveOverflowSet) {
            this.mReserveOverflow = b.h();
        }
        if (!this.mWidthLimitSet) {
            this.mWidthLimit = b.c();
        }
        if (!this.mMaxItemsSet) {
            this.mMaxItems = b.d();
        }
        int i = this.mWidthLimit;
        if (this.mReserveOverflow) {
            if (this.mOverflowButton == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.mSystemContext);
                this.mOverflowButton = overflowMenuButton;
                if (this.mPendingOverflowIconSet) {
                    overflowMenuButton.setImageDrawable(this.mPendingOverflowIcon);
                    this.mPendingOverflowIcon = null;
                    this.mPendingOverflowIconSet = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.mOverflowButton.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.mOverflowButton.getMeasuredWidth();
        } else {
            this.mOverflowButton = null;
        }
        this.mActionItemWidthLimit = i;
        this.mMinCellSize = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean isOverflowMenuShowPending() {
        return this.mPostedOpenRunnable != null || isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowing() {
        OverflowPopup overflowPopup = this.mOverflowPopup;
        return overflowPopup != null && overflowPopup.isShowing();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // com.p7700g.p99005.k4, com.p7700g.p99005.w4
    public void onCloseMenu(p4 p4Var, boolean z) {
        dismissPopupMenus();
        super.onCloseMenu(p4Var, z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = a4.b(this.mContext).d();
        }
        p4 p4Var = this.mMenu;
        if (p4Var != null) {
            p4Var.N(true);
        }
    }

    @Override // com.p7700g.p99005.w4
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).openSubMenuId) > 0 && (findItem = this.mMenu.findItem(i)) != null) {
            onSubMenuSelected((b5) findItem.getSubMenu());
        }
    }

    @Override // com.p7700g.p99005.w4
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.openSubMenuId = this.mOpenSubMenuId;
        return savedState;
    }

    @Override // com.p7700g.p99005.k4, com.p7700g.p99005.w4
    public boolean onSubMenuSelected(b5 b5Var) {
        boolean z = false;
        if (b5Var.hasVisibleItems()) {
            b5 b5Var2 = b5Var;
            while (b5Var2.n0() != this.mMenu) {
                b5Var2 = (b5) b5Var2.n0();
            }
            View findViewForItem = findViewForItem(b5Var2.getItem());
            if (findViewForItem == null) {
                return false;
            }
            this.mOpenSubMenuId = b5Var.getItem().getItemId();
            int size = b5Var.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = b5Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.mContext, b5Var, findViewForItem);
            this.mActionButtonPopup = actionButtonSubmenu;
            actionButtonSubmenu.setForceShowIcon(z);
            this.mActionButtonPopup.show();
            super.onSubMenuSelected(b5Var);
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq.a
    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            return;
        }
        p4 p4Var = this.mMenu;
        if (p4Var != null) {
            p4Var.f(false);
        }
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mExpandedActionViewsExclusive = z;
    }

    public void setItemLimit(int i) {
        this.mMaxItems = i;
        this.mMaxItemsSet = true;
    }

    public void setMenuView(ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    public void setOverflowIcon(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
            return;
        }
        this.mPendingOverflowIconSet = true;
        this.mPendingOverflowIcon = drawable;
    }

    public void setReserveOverflow(boolean z) {
        this.mReserveOverflow = z;
        this.mReserveOverflowSet = true;
    }

    public void setWidthLimit(int i, boolean z) {
        this.mWidthLimit = i;
        this.mStrictWidthLimit = z;
        this.mWidthLimitSet = true;
    }

    @Override // com.p7700g.p99005.k4
    public boolean shouldIncludeItem(int i, s4 s4Var) {
        return s4Var.o();
    }

    public boolean showOverflowMenu() {
        p4 p4Var;
        if (!this.mReserveOverflow || isOverflowMenuShowing() || (p4Var = this.mMenu) == null || this.mMenuView == null || this.mPostedOpenRunnable != null || p4Var.C().isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.mContext, this.mMenu, this.mOverflowButton, true));
        this.mPostedOpenRunnable = openOverflowRunnable;
        ((View) this.mMenuView).post(openOverflowRunnable);
        return true;
    }

    @Override // com.p7700g.p99005.k4, com.p7700g.p99005.w4
    public void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.mMenuView).requestLayout();
        p4 p4Var = this.mMenu;
        boolean z2 = false;
        if (p4Var != null) {
            ArrayList<s4> v = p4Var.v();
            int size = v.size();
            for (int i = 0; i < size; i++) {
                gq b = v.get(i).b();
                if (b != null) {
                    b.setSubUiVisibilityListener(this);
                }
            }
        }
        p4 p4Var2 = this.mMenu;
        ArrayList<s4> C = p4Var2 != null ? p4Var2.C() : null;
        if (this.mReserveOverflow && C != null) {
            int size2 = C.size();
            if (size2 == 1) {
                z2 = !C.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.mOverflowButton == null) {
                this.mOverflowButton = new OverflowMenuButton(this.mSystemContext);
            }
            ViewGroup viewGroup = (ViewGroup) this.mOverflowButton.getParent();
            if (viewGroup != this.mMenuView) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.mOverflowButton);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.mMenuView;
                actionMenuView.addView(this.mOverflowButton, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.mOverflowButton;
            if (overflowMenuButton != null) {
                ViewParent parent = overflowMenuButton.getParent();
                x4 x4Var = this.mMenuView;
                if (parent == x4Var) {
                    ((ViewGroup) x4Var).removeView(this.mOverflowButton);
                }
            }
        }
        ((ActionMenuView) this.mMenuView).setOverflowReserved(this.mReserveOverflow);
    }
}