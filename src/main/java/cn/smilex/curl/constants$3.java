// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor fputws$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fputws$MH = RuntimeHelper.downcallHandle(
        "fputws",
        constants$3.fputws$FUNC
    );
    static final FunctionDescriptor _getws_s$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _getws_s$MH = RuntimeHelper.downcallHandle(
        "_getws_s",
        constants$3._getws_s$FUNC
    );
    static final FunctionDescriptor putwc$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putwc$MH = RuntimeHelper.downcallHandle(
        "putwc",
        constants$3.putwc$FUNC
    );
    static final FunctionDescriptor putwchar$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle putwchar$MH = RuntimeHelper.downcallHandle(
        "putwchar",
        constants$3.putwchar$FUNC
    );
    static final FunctionDescriptor _putws$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _putws$MH = RuntimeHelper.downcallHandle(
        "_putws",
        constants$3._putws$FUNC
    );
    static final FunctionDescriptor ungetwc$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ungetwc$MH = RuntimeHelper.downcallHandle(
        "ungetwc",
        constants$3.ungetwc$FUNC
    );
}


