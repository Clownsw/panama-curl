// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$320 {

    static final FunctionDescriptor LocalLock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalLock$MH = RuntimeHelper.downcallHandle(
        "LocalLock",
        constants$320.LocalLock$FUNC
    );
    static final FunctionDescriptor LocalHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalHandle$MH = RuntimeHelper.downcallHandle(
        "LocalHandle",
        constants$320.LocalHandle$FUNC
    );
    static final FunctionDescriptor LocalUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalUnlock$MH = RuntimeHelper.downcallHandle(
        "LocalUnlock",
        constants$320.LocalUnlock$FUNC
    );
    static final FunctionDescriptor LocalSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalSize$MH = RuntimeHelper.downcallHandle(
        "LocalSize",
        constants$320.LocalSize$FUNC
    );
    static final FunctionDescriptor LocalFlags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalFlags$MH = RuntimeHelper.downcallHandle(
        "LocalFlags",
        constants$320.LocalFlags$FUNC
    );
    static final FunctionDescriptor LocalFree$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalFree$MH = RuntimeHelper.downcallHandle(
        "LocalFree",
        constants$320.LocalFree$FUNC
    );
}


