// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$224 {

    static final FunctionDescriptor GetNamedPipeHandleStateW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNamedPipeHandleStateW$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeHandleStateW",
        constants$224.GetNamedPipeHandleStateW$FUNC
    );
    static final FunctionDescriptor CallNamedPipeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CallNamedPipeW$MH = RuntimeHelper.downcallHandle(
        "CallNamedPipeW",
        constants$224.CallNamedPipeW$FUNC
    );
    static final FunctionDescriptor QueryPerformanceCounter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryPerformanceCounter$MH = RuntimeHelper.downcallHandle(
        "QueryPerformanceCounter",
        constants$224.QueryPerformanceCounter$FUNC
    );
    static final FunctionDescriptor QueryPerformanceFrequency$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryPerformanceFrequency$MH = RuntimeHelper.downcallHandle(
        "QueryPerformanceFrequency",
        constants$224.QueryPerformanceFrequency$FUNC
    );
    static final FunctionDescriptor HeapCreate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle HeapCreate$MH = RuntimeHelper.downcallHandle(
        "HeapCreate",
        constants$224.HeapCreate$FUNC
    );
    static final FunctionDescriptor HeapDestroy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapDestroy$MH = RuntimeHelper.downcallHandle(
        "HeapDestroy",
        constants$224.HeapDestroy$FUNC
    );
}


