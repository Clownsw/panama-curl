// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$317 {

    static final FunctionDescriptor WinMain$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WinMain$MH = RuntimeHelper.downcallHandle(
        "WinMain",
        constants$317.WinMain$FUNC
    );
    static final FunctionDescriptor wWinMain$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wWinMain$MH = RuntimeHelper.downcallHandle(
        "wWinMain",
        constants$317.wWinMain$FUNC
    );
    static final FunctionDescriptor GlobalAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GlobalAlloc$MH = RuntimeHelper.downcallHandle(
        "GlobalAlloc",
        constants$317.GlobalAlloc$FUNC
    );
    static final FunctionDescriptor GlobalReAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GlobalReAlloc$MH = RuntimeHelper.downcallHandle(
        "GlobalReAlloc",
        constants$317.GlobalReAlloc$FUNC
    );
    static final FunctionDescriptor GlobalSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalSize$MH = RuntimeHelper.downcallHandle(
        "GlobalSize",
        constants$317.GlobalSize$FUNC
    );
    static final FunctionDescriptor GlobalUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalUnlock$MH = RuntimeHelper.downcallHandle(
        "GlobalUnlock",
        constants$317.GlobalUnlock$FUNC
    );
}


