package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.lt;
import com.p7700g.p99005.m2;
import com.p7700g.p99005.q0;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z4;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ListPopupWindow implements z4 {
    private static final boolean DEBUG = false;
    public static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static Method sGetMaxAvailableHeightMethod;
    private static Method sSetClipToWindowEnabledMethod;
    private static Method sSetEpicenterBoundsMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    public DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    public final Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private AdapterView.OnItemClickListener mItemClickListener;
    private AdapterView.OnItemSelectedListener mItemSelectedListener;
    public int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    public PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    public final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    private final Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    @e2(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @e1
        public static int getMaxAvailableHeight(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    @e2(29)
    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @e1
        public static void setEpicenterBounds(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @e1
        public static void setIsClippedToScreen(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* loaded from: classes.dex */
    public class ListSelectorHider implements Runnable {
        public ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.clearListSelection();
        }
    }

    /* loaded from: classes.dex */
    public class PopupDataSetObserver extends DataSetObserver {
        public PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class PopupScrollListener implements AbsListView.OnScrollListener {
        public PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || ListPopupWindow.this.isInputMethodNotNeeded() || ListPopupWindow.this.mPopup.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.mHandler.removeCallbacks(listPopupWindow.mResizePopupRunnable);
            ListPopupWindow.this.mResizePopupRunnable.run();
        }
    }

    /* loaded from: classes.dex */
    public class PopupTouchInterceptor implements View.OnTouchListener {
        public PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.mPopup) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.mPopup.getWidth() && y >= 0 && y < ListPopupWindow.this.mPopup.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.mHandler.postDelayed(listPopupWindow.mResizePopupRunnable, 250L);
                return false;
            } else if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.mHandler.removeCallbacks(listPopupWindow2.mResizePopupRunnable);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class ResizePopupRunnable implements Runnable {
        public ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.mDropDownList;
            if (dropDownListView == null || !sr.N0(dropDownListView) || ListPopupWindow.this.mDropDownList.getCount() <= ListPopupWindow.this.mDropDownList.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.mDropDownList.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.mListItemExpandMaximum) {
                listPopupWindow.mPopup.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                sSetClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                sGetMaxAvailableHeightMethod = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(@x1 Context context) {
        this(context, null, x2.b.Z1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int buildDropDown() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        if (this.mDropDownList == null) {
            Context context = this.mContext;
            this.mShowDropDownRunnable = new Runnable() { // from class: androidx.appcompat.widget.ListPopupWindow.2
                @Override // java.lang.Runnable
                public void run() {
                    View anchorView = ListPopupWindow.this.getAnchorView();
                    if (anchorView == null || anchorView.getWindowToken() == null) {
                        return;
                    }
                    ListPopupWindow.this.show();
                }
            };
            DropDownListView createDropDownListView = createDropDownListView(context, !this.mModal);
            this.mDropDownList = createDropDownListView;
            Drawable drawable = this.mDropDownListHighlight;
            if (drawable != null) {
                createDropDownListView.setSelector(drawable);
            }
            this.mDropDownList.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j) {
                    DropDownListView dropDownListView;
                    if (i4 == -1 || (dropDownListView = ListPopupWindow.this.mDropDownList) == null) {
                        return;
                    }
                    dropDownListView.setListSelectionHidden(false);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.mDropDownList.setOnScrollListener(this.mScrollListener);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mItemSelectedListener;
            if (onItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(onItemSelectedListener);
            }
            DropDownListView dropDownListView = this.mDropDownList;
            View view = this.mPromptView;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.mPromptPosition;
                if (i4 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(dropDownListView, layoutParams);
                } else if (i4 == 1) {
                    linearLayout.addView(dropDownListView, layoutParams);
                    linearLayout.addView(view);
                }
                int i5 = this.mDropDownWidth;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                dropDownListView = linearLayout;
            } else {
                i = 0;
            }
            this.mPopup.setContentView(dropDownListView);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.mPopup.getContentView();
            View view2 = this.mPromptView;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            Rect rect = this.mTempRect;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -i6;
            }
        } else {
            this.mTempRect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = getMaxAvailableHeight(getAnchorView(), this.mDropDownVerticalOffset, this.mPopup.getInputMethodMode() == 2);
        if (this.mDropDownAlwaysVisible || this.mDropDownHeight == -1) {
            return maxAvailableHeight + i2;
        }
        int i7 = this.mDropDownWidth;
        if (i7 == -2) {
            int i8 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.mTempRect;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.mTempRect;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int measureHeightOfChildrenCompat = this.mDropDownList.measureHeightOfChildrenCompat(makeMeasureSpec, 0, -1, maxAvailableHeight - i, -1);
        if (measureHeightOfChildrenCompat > 0) {
            i += this.mDropDownList.getPaddingBottom() + this.mDropDownList.getPaddingTop() + i2;
        }
        return measureHeightOfChildrenCompat + i;
    }

    private int getMaxAvailableHeight(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = sGetMaxAvailableHeightMethod;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.mPopup, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            return this.mPopup.getMaxAvailableHeight(view, i);
        }
        return Api24Impl.getMaxAvailableHeight(this.mPopup, view, i, z);
    }

    private static boolean isConfirmKey(int i) {
        return i == 66 || i == 23;
    }

    private void removePromptView() {
        View view = this.mPromptView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    private void setPopupClipToScreenEnabled(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetClipToWindowEnabledMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        Api29Impl.setIsClippedToScreen(this.mPopup, z);
    }

    public void clearListSelection() {
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new ForwardingListener(view) { // from class: androidx.appcompat.widget.ListPopupWindow.1
            @Override // androidx.appcompat.widget.ForwardingListener
            public ListPopupWindow getPopup() {
                return ListPopupWindow.this;
            }
        };
    }

    @x1
    public DropDownListView createDropDownListView(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    @Override // com.p7700g.p99005.z4
    public void dismiss() {
        this.mPopup.dismiss();
        removePromptView();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    @z1
    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    @m2
    public int getAnimationStyle() {
        return this.mPopup.getAnimationStyle();
    }

    @z1
    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    @z1
    public Rect getEpicenterBounds() {
        if (this.mEpicenterBounds != null) {
            return new Rect(this.mEpicenterBounds);
        }
        return null;
    }

    public int getHeight() {
        return this.mDropDownHeight;
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    public int getInputMethodMode() {
        return this.mPopup.getInputMethodMode();
    }

    @Override // com.p7700g.p99005.z4
    @z1
    public ListView getListView() {
        return this.mDropDownList;
    }

    public int getPromptPosition() {
        return this.mPromptPosition;
    }

    @z1
    public Object getSelectedItem() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItem();
        }
        return null;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemPosition();
        }
        return -1;
    }

    @z1
    public View getSelectedView() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedView();
        }
        return null;
    }

    public int getSoftInputMode() {
        return this.mPopup.getSoftInputMode();
    }

    public int getVerticalOffset() {
        if (this.mDropDownVerticalOffsetSet) {
            return this.mDropDownVerticalOffset;
        }
        return 0;
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean isDropDownAlwaysVisible() {
        return this.mDropDownAlwaysVisible;
    }

    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }

    public boolean isModal() {
        return this.mModal;
    }

    @Override // com.p7700g.p99005.z4
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public boolean onKeyDown(int i, @x1 KeyEvent keyEvent) {
        int lookForSelectablePosition;
        if (isShowing() && i != 62 && (this.mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i))) {
            int selectedItemPosition = this.mDropDownList.getSelectedItemPosition();
            boolean z = !this.mPopup.isAboveAnchor();
            ListAdapter listAdapter = this.mAdapter;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int lookForSelectablePosition2 = areAllItemsEnabled ? 0 : this.mDropDownList.lookForSelectablePosition(0, true);
                if (areAllItemsEnabled) {
                    lookForSelectablePosition = listAdapter.getCount() - 1;
                } else {
                    lookForSelectablePosition = this.mDropDownList.lookForSelectablePosition(listAdapter.getCount() - 1, false);
                }
                i2 = lookForSelectablePosition2;
                i3 = lookForSelectablePosition;
            }
            if ((z && i == 19 && selectedItemPosition <= i2) || (!z && i == 20 && selectedItemPosition >= i3)) {
                clearListSelection();
                this.mPopup.setInputMethodMode(1);
                show();
                return true;
            }
            this.mDropDownList.setListSelectionHidden(false);
            if (this.mDropDownList.onKeyDown(i, keyEvent)) {
                this.mPopup.setInputMethodMode(2);
                this.mDropDownList.requestFocusFromTouch();
                show();
                if (i == 19 || i == 20 || i == 23 || i == 66) {
                    return true;
                }
            } else if (z && i == 20) {
                if (selectedItemPosition == i3) {
                    return true;
                }
            } else if (!z && i == 19 && selectedItemPosition == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyPreIme(int i, @x1 KeyEvent keyEvent) {
        if (i == 4 && isShowing()) {
            View view = this.mDropDownAnchorView;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                    return false;
                }
                dismiss();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, @x1 KeyEvent keyEvent) {
        if (!isShowing() || this.mDropDownList.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.mDropDownList.onKeyUp(i, keyEvent);
        if (onKeyUp && isConfirmKey(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean performItemClick(int i) {
        if (isShowing()) {
            if (this.mItemClickListener != null) {
                DropDownListView dropDownListView = this.mDropDownList;
                this.mItemClickListener.onItemClick(dropDownListView, dropDownListView.getChildAt(i - dropDownListView.getFirstVisiblePosition()), i, dropDownListView.getAdapter().getItemId(i));
                return true;
            }
            return true;
        }
        return false;
    }

    public void postShow() {
        this.mHandler.post(this.mShowDropDownRunnable);
    }

    public void setAdapter(@z1 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.mObserver;
        if (dataSetObserver == null) {
            this.mObserver = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.mAdapter);
        }
    }

    public void setAnchorView(@z1 View view) {
        this.mDropDownAnchorView = view;
    }

    public void setAnimationStyle(@m2 int i) {
        this.mPopup.setAnimationStyle(i);
    }

    public void setBackgroundDrawable(@z1 Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i) {
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            Rect rect = this.mTempRect;
            this.mDropDownWidth = rect.left + rect.right + i;
            return;
        }
        setWidth(i);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setDropDownAlwaysVisible(boolean z) {
        this.mDropDownAlwaysVisible = z;
    }

    public void setDropDownGravity(int i) {
        this.mDropDownGravity = i;
    }

    public void setEpicenterBounds(@z1 Rect rect) {
        this.mEpicenterBounds = rect != null ? new Rect(rect) : null;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setForceIgnoreOutsideTouch(boolean z) {
        this.mForceIgnoreOutsideTouch = z;
    }

    public void setHeight(int i) {
        if (i < 0 && -2 != i && -1 != i) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.mDropDownHeight = i;
    }

    public void setHorizontalOffset(int i) {
        this.mDropDownHorizontalOffset = i;
    }

    public void setInputMethodMode(int i) {
        this.mPopup.setInputMethodMode(i);
    }

    public void setListItemExpandMax(int i) {
        this.mListItemExpandMaximum = i;
    }

    public void setListSelector(Drawable drawable) {
        this.mDropDownListHighlight = drawable;
    }

    public void setModal(boolean z) {
        this.mModal = z;
        this.mPopup.setFocusable(z);
    }

    public void setOnDismissListener(@z1 PopupWindow.OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(@z1 AdapterView.OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void setOnItemSelectedListener(@z1 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.mItemSelectedListener = onItemSelectedListener;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setOverlapAnchor(boolean z) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = z;
    }

    public void setPromptPosition(int i) {
        this.mPromptPosition = i;
    }

    public void setPromptView(@z1 View view) {
        boolean isShowing = isShowing();
        if (isShowing) {
            removePromptView();
        }
        this.mPromptView = view;
        if (isShowing) {
            show();
        }
    }

    public void setSelection(int i) {
        DropDownListView dropDownListView = this.mDropDownList;
        if (!isShowing() || dropDownListView == null) {
            return;
        }
        dropDownListView.setListSelectionHidden(false);
        dropDownListView.setSelection(i);
        if (dropDownListView.getChoiceMode() != 0) {
            dropDownListView.setItemChecked(i, true);
        }
    }

    public void setSoftInputMode(int i) {
        this.mPopup.setSoftInputMode(i);
    }

    public void setVerticalOffset(int i) {
        this.mDropDownVerticalOffset = i;
        this.mDropDownVerticalOffsetSet = true;
    }

    public void setWidth(int i) {
        this.mDropDownWidth = i;
    }

    public void setWindowLayoutType(int i) {
        this.mDropDownWindowLayoutType = i;
    }

    @Override // com.p7700g.p99005.z4
    public void show() {
        int buildDropDown = buildDropDown();
        boolean isInputMethodNotNeeded = isInputMethodNotNeeded();
        lt.d(this.mPopup, this.mDropDownWindowLayoutType);
        boolean z = true;
        if (this.mPopup.isShowing()) {
            if (sr.N0(getAnchorView())) {
                int i = this.mDropDownWidth;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = getAnchorView().getWidth();
                }
                int i2 = this.mDropDownHeight;
                if (i2 == -1) {
                    if (!isInputMethodNotNeeded) {
                        buildDropDown = -1;
                    }
                    if (isInputMethodNotNeeded) {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(0);
                    } else {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    buildDropDown = i2;
                }
                this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : false);
                this.mPopup.update(getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, i < 0 ? -1 : i, buildDropDown < 0 ? -1 : buildDropDown);
                return;
            }
            return;
        }
        int i3 = this.mDropDownWidth;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = getAnchorView().getWidth();
        }
        int i4 = this.mDropDownHeight;
        if (i4 == -1) {
            buildDropDown = -1;
        } else if (i4 != -2) {
            buildDropDown = i4;
        }
        this.mPopup.setWidth(i3);
        this.mPopup.setHeight(buildDropDown);
        setPopupClipToScreenEnabled(true);
        this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
        this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
        if (this.mOverlapAnchorSet) {
            lt.c(this.mPopup, this.mOverlapAnchor);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetEpicenterBoundsMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, this.mEpicenterBounds);
                } catch (Exception unused) {
                }
            }
        } else {
            Api29Impl.setEpicenterBounds(this.mPopup, this.mEpicenterBounds);
        }
        lt.e(this.mPopup, getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if (!this.mModal || this.mDropDownList.isInTouchMode()) {
            clearListSelection();
        }
        if (this.mModal) {
            return;
        }
        this.mHandler.post(this.mHideSelector);
    }

    public ListPopupWindow(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, x2.b.Z1);
    }

    public ListPopupWindow(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = 1002;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new ResizePopupRunnable();
        this.mTouchInterceptor = new PopupTouchInterceptor();
        this.mScrollListener = new PopupScrollListener();
        this.mHideSelector = new ListSelectorHider();
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.m.a4, i, i2);
        this.mDropDownHorizontalOffset = obtainStyledAttributes.getDimensionPixelOffset(x2.m.b4, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(x2.m.c4, 0);
        this.mDropDownVerticalOffset = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.mPopup = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}