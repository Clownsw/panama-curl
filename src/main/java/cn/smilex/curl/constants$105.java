// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$105 {

    static final FunctionDescriptor _strnset_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _strnset_s$MH = RuntimeHelper.downcallHandle(
        "_strnset_s",
        constants$105._strnset_s$FUNC
    );
    static final FunctionDescriptor _strnset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _strnset$MH = RuntimeHelper.downcallHandle(
        "_strnset",
        constants$105._strnset$FUNC
    );
    static final FunctionDescriptor strpbrk$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strpbrk$MH = RuntimeHelper.downcallHandle(
        "strpbrk",
        constants$105.strpbrk$FUNC
    );
    static final FunctionDescriptor _strrev$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strrev$MH = RuntimeHelper.downcallHandle(
        "_strrev",
        constants$105._strrev$FUNC
    );
    static final FunctionDescriptor _strset_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _strset_s$MH = RuntimeHelper.downcallHandle(
        "_strset_s",
        constants$105._strset_s$FUNC
    );
    static final FunctionDescriptor _strset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _strset$MH = RuntimeHelper.downcallHandle(
        "_strset",
        constants$105._strset$FUNC
    );
}

