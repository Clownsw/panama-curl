// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$487 {

    static final FunctionDescriptor PeekMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PeekMessageW$MH = RuntimeHelper.downcallHandle(
        "PeekMessageW",
        constants$487.PeekMessageW$FUNC
    );
    static final FunctionDescriptor RegisterHotKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterHotKey$MH = RuntimeHelper.downcallHandle(
        "RegisterHotKey",
        constants$487.RegisterHotKey$FUNC
    );
    static final FunctionDescriptor UnregisterHotKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnregisterHotKey$MH = RuntimeHelper.downcallHandle(
        "UnregisterHotKey",
        constants$487.UnregisterHotKey$FUNC
    );
    static final FunctionDescriptor ExitWindowsEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExitWindowsEx$MH = RuntimeHelper.downcallHandle(
        "ExitWindowsEx",
        constants$487.ExitWindowsEx$FUNC
    );
    static final FunctionDescriptor SwapMouseButton$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SwapMouseButton$MH = RuntimeHelper.downcallHandle(
        "SwapMouseButton",
        constants$487.SwapMouseButton$FUNC
    );
    static final FunctionDescriptor GetMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetMessagePos",
        constants$487.GetMessagePos$FUNC
    );
}

