// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$291 {

    static final FunctionDescriptor GetModuleHandleExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetModuleHandleExW$MH = RuntimeHelper.downcallHandle(
        "GetModuleHandleExW",
        constants$291.GetModuleHandleExW$FUNC
    );
    static final FunctionDescriptor GetProcAddress$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcAddress$MH = RuntimeHelper.downcallHandle(
        "GetProcAddress",
        constants$291.GetProcAddress$FUNC
    );
    static final FunctionDescriptor LoadLibraryExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadLibraryExA$MH = RuntimeHelper.downcallHandle(
        "LoadLibraryExA",
        constants$291.LoadLibraryExA$FUNC
    );
    static final FunctionDescriptor LoadLibraryExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadLibraryExW$MH = RuntimeHelper.downcallHandle(
        "LoadLibraryExW",
        constants$291.LoadLibraryExW$FUNC
    );
    static final FunctionDescriptor LoadResource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadResource$MH = RuntimeHelper.downcallHandle(
        "LoadResource",
        constants$291.LoadResource$FUNC
    );
    static final FunctionDescriptor LoadStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadStringA$MH = RuntimeHelper.downcallHandle(
        "LoadStringA",
        constants$291.LoadStringA$FUNC
    );
}


