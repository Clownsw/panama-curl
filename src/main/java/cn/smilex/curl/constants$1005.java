// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1005 {

    static final FunctionDescriptor _mblen_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mblen_l$MH = RuntimeHelper.downcallHandle(
        "_mblen_l",
        constants$1005._mblen_l$FUNC
    );
    static final FunctionDescriptor _mbstrlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mbstrlen$MH = RuntimeHelper.downcallHandle(
        "_mbstrlen",
        constants$1005._mbstrlen$FUNC
    );
    static final FunctionDescriptor _mbstrlen_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mbstrlen_l$MH = RuntimeHelper.downcallHandle(
        "_mbstrlen_l",
        constants$1005._mbstrlen_l$FUNC
    );
    static final FunctionDescriptor _mbstrnlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _mbstrnlen$MH = RuntimeHelper.downcallHandle(
        "_mbstrnlen",
        constants$1005._mbstrnlen$FUNC
    );
    static final FunctionDescriptor _mbstrnlen_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mbstrnlen_l$MH = RuntimeHelper.downcallHandle(
        "_mbstrnlen_l",
        constants$1005._mbstrnlen_l$FUNC
    );
    static final FunctionDescriptor mbtowc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mbtowc$MH = RuntimeHelper.downcallHandle(
        "mbtowc",
        constants$1005.mbtowc$FUNC
    );
}


