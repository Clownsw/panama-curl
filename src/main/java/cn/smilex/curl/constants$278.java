// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$278 {

    static final FunctionDescriptor SetEventWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEventWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "SetEventWhenCallbackReturns",
        constants$278.SetEventWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor ReleaseSemaphoreWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ReleaseSemaphoreWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "ReleaseSemaphoreWhenCallbackReturns",
        constants$278.ReleaseSemaphoreWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor ReleaseMutexWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseMutexWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "ReleaseMutexWhenCallbackReturns",
        constants$278.ReleaseMutexWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor LeaveCriticalSectionWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LeaveCriticalSectionWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "LeaveCriticalSectionWhenCallbackReturns",
        constants$278.LeaveCriticalSectionWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor FreeLibraryWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeLibraryWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "FreeLibraryWhenCallbackReturns",
        constants$278.FreeLibraryWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor CallbackMayRunLong$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CallbackMayRunLong$MH = RuntimeHelper.downcallHandle(
        "CallbackMayRunLong",
        constants$278.CallbackMayRunLong$FUNC
    );
}

