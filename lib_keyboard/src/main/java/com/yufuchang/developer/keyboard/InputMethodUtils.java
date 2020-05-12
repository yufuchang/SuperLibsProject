package com.yufuchang.developer.keyboard;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * 隐藏输入法弹出框
 */
public class InputMethodUtils {
    public static void hide(Activity activity) {
        try {
            //解决关闭软键盘抛出异常的问题
            View view = activity.getWindow().peekDecorView();
            if (view != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public static void hide(Context context, View view) {
        if (view == null) {
            return;
        }

        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /**
     * 显示虚拟键盘
     *
     * @param v
     */
    public static void showKeyboard(View v) {
        InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(v, InputMethodManager.SHOW_FORCED);
    }

    public static void display(final Activity activity, final EditText editText) {
        display(activity, editText, 300);
    }

    public static void display(final Activity activity, final EditText editText, int delay) {
        try {
            editText.postDelayed(new Runnable() {
                @Override
                public void run() {
                    editText.requestFocus();
                    ((InputMethodManager) activity
                            .getSystemService(Context.INPUT_METHOD_SERVICE))
                            .showSoftInput(editText, 0);
                }
            }, delay);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
