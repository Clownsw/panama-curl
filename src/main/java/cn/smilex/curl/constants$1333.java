// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1333 {

    static final FunctionDescriptor StartServiceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartServiceW$MH = RuntimeHelper.downcallHandle(
        "StartServiceW",
        constants$1333.StartServiceW$FUNC
    );
    static final FunctionDescriptor UnlockServiceDatabase$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnlockServiceDatabase$MH = RuntimeHelper.downcallHandle(
        "UnlockServiceDatabase",
        constants$1333.UnlockServiceDatabase$FUNC
    );
    static final FunctionDescriptor NotifyServiceStatusChangeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NotifyServiceStatusChangeA$MH = RuntimeHelper.downcallHandle(
        "NotifyServiceStatusChangeA",
        constants$1333.NotifyServiceStatusChangeA$FUNC
    );
    static final FunctionDescriptor NotifyServiceStatusChangeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NotifyServiceStatusChangeW$MH = RuntimeHelper.downcallHandle(
        "NotifyServiceStatusChangeW",
        constants$1333.NotifyServiceStatusChangeW$FUNC
    );
    static final FunctionDescriptor ControlServiceExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ControlServiceExA$MH = RuntimeHelper.downcallHandle(
        "ControlServiceExA",
        constants$1333.ControlServiceExA$FUNC
    );
    static final FunctionDescriptor ControlServiceExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ControlServiceExW$MH = RuntimeHelper.downcallHandle(
        "ControlServiceExW",
        constants$1333.ControlServiceExW$FUNC
    );
}


