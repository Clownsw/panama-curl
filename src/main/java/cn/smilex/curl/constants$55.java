// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$55 {

    static final FunctionDescriptor _wctime64_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wctime64_s$MH = RuntimeHelper.downcallHandle(
        "_wctime64_s",
        constants$55._wctime64_s$FUNC
    );
    static final FunctionDescriptor _wstrdate_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _wstrdate_s$MH = RuntimeHelper.downcallHandle(
        "_wstrdate_s",
        constants$55._wstrdate_s$FUNC
    );
    static final FunctionDescriptor _wstrdate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wstrdate$MH = RuntimeHelper.downcallHandle(
        "_wstrdate",
        constants$55._wstrdate$FUNC
    );
    static final FunctionDescriptor _wstrtime_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _wstrtime_s$MH = RuntimeHelper.downcallHandle(
        "_wstrtime_s",
        constants$55._wstrtime_s$FUNC
    );
    static final FunctionDescriptor _wstrtime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wstrtime$MH = RuntimeHelper.downcallHandle(
        "_wstrtime",
        constants$55._wstrtime$FUNC
    );
    static final FunctionDescriptor _wctime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wctime$MH = RuntimeHelper.downcallHandle(
        "_wctime",
        constants$55._wctime$FUNC
    );
}


