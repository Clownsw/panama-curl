// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$318 {

    static final FunctionDescriptor GlobalLock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalLock$MH = RuntimeHelper.downcallHandle(
        "GlobalLock",
        constants$318.GlobalLock$FUNC
    );
    static final FunctionDescriptor GlobalFlags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFlags$MH = RuntimeHelper.downcallHandle(
        "GlobalFlags",
        constants$318.GlobalFlags$FUNC
    );
    static final FunctionDescriptor GlobalHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalHandle$MH = RuntimeHelper.downcallHandle(
        "GlobalHandle",
        constants$318.GlobalHandle$FUNC
    );
    static final FunctionDescriptor GlobalFree$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFree$MH = RuntimeHelper.downcallHandle(
        "GlobalFree",
        constants$318.GlobalFree$FUNC
    );
    static final FunctionDescriptor GlobalCompact$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GlobalCompact$MH = RuntimeHelper.downcallHandle(
        "GlobalCompact",
        constants$318.GlobalCompact$FUNC
    );
    static final FunctionDescriptor GlobalFix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFix$MH = RuntimeHelper.downcallHandle(
        "GlobalFix",
        constants$318.GlobalFix$FUNC
    );
}


