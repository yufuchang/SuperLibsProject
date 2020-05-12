package com.yufuchang.developer.keyboard;


public enum EmmKeyboardType {


    /**
     * 字母键盘
     */
    LETTER(0, R.string.emm_keyboard_letter),

    /**
     * 数字键盘
     */
    NUMBER(1, R.string.emm_keyboard_number),

    /**
     * 符号键盘
     */
    SYMBOL(2, R.string.emm_keyboard_symbol);

    private int code;
    private int nameResId;

    EmmKeyboardType(int code, int nameResId) {
        this.code = code;
        this.nameResId = nameResId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getName() {
        return nameResId;
    }

    public void setName(int nameResId) {
        this.nameResId = nameResId;
    }
}
