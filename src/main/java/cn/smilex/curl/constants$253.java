// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$253 {

    static final FunctionDescriptor SetThreadInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadInformation$MH = RuntimeHelper.downcallHandle(
        "SetThreadInformation",
        constants$253.SetThreadInformation$FUNC
    );
    static final FunctionDescriptor IsProcessCritical$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsProcessCritical$MH = RuntimeHelper.downcallHandle(
        "IsProcessCritical",
        constants$253.IsProcessCritical$FUNC
    );
    static final FunctionDescriptor SetProtectedPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProtectedPolicy$MH = RuntimeHelper.downcallHandle(
        "SetProtectedPolicy",
        constants$253.SetProtectedPolicy$FUNC
    );
    static final FunctionDescriptor QueryProtectedPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryProtectedPolicy$MH = RuntimeHelper.downcallHandle(
        "QueryProtectedPolicy",
        constants$253.QueryProtectedPolicy$FUNC
    );
    static final FunctionDescriptor SetThreadIdealProcessor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadIdealProcessor$MH = RuntimeHelper.downcallHandle(
        "SetThreadIdealProcessor",
        constants$253.SetThreadIdealProcessor$FUNC
    );
    static final FunctionDescriptor SetProcessInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessInformation$MH = RuntimeHelper.downcallHandle(
        "SetProcessInformation",
        constants$253.SetProcessInformation$FUNC
    );
}


