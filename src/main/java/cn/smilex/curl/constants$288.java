// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$288 {

    static final FunctionDescriptor ENUMRESTYPEPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ENUMRESTYPEPROCA$MH = RuntimeHelper.downcallHandle(
        constants$288.ENUMRESTYPEPROCA$FUNC
    );
    static final FunctionDescriptor ENUMRESTYPEPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ENUMRESTYPEPROCW$MH = RuntimeHelper.downcallHandle(
        constants$288.ENUMRESTYPEPROCW$FUNC
    );
    static final FunctionDescriptor DisableThreadLibraryCalls$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisableThreadLibraryCalls$MH = RuntimeHelper.downcallHandle(
        "DisableThreadLibraryCalls",
        constants$288.DisableThreadLibraryCalls$FUNC
    );
    static final FunctionDescriptor FindResourceExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle FindResourceExW$MH = RuntimeHelper.downcallHandle(
        "FindResourceExW",
        constants$288.FindResourceExW$FUNC
    );
    static final FunctionDescriptor FindStringOrdinal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindStringOrdinal$MH = RuntimeHelper.downcallHandle(
        "FindStringOrdinal",
        constants$288.FindStringOrdinal$FUNC
    );
}


