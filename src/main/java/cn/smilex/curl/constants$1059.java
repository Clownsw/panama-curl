// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1059 {

    static final FunctionDescriptor CoCreateInstanceEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoCreateInstanceEx$MH = RuntimeHelper.downcallHandle(
        "CoCreateInstanceEx",
        constants$1059.CoCreateInstanceEx$FUNC
    );
    static final FunctionDescriptor CoCreateInstanceFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoCreateInstanceFromApp$MH = RuntimeHelper.downcallHandle(
        "CoCreateInstanceFromApp",
        constants$1059.CoCreateInstanceFromApp$FUNC
    );
    static final FunctionDescriptor CoRegisterActivationFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterActivationFilter$MH = RuntimeHelper.downcallHandle(
        "CoRegisterActivationFilter",
        constants$1059.CoRegisterActivationFilter$FUNC
    );
    static final FunctionDescriptor CoGetCancelObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetCancelObject$MH = RuntimeHelper.downcallHandle(
        "CoGetCancelObject",
        constants$1059.CoGetCancelObject$FUNC
    );
    static final FunctionDescriptor CoSetCancelObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoSetCancelObject$MH = RuntimeHelper.downcallHandle(
        "CoSetCancelObject",
        constants$1059.CoSetCancelObject$FUNC
    );
    static final FunctionDescriptor CoCancelCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoCancelCall$MH = RuntimeHelper.downcallHandle(
        "CoCancelCall",
        constants$1059.CoCancelCall$FUNC
    );
}


