// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1335 {

    static final FunctionDescriptor UnsubscribeServiceChangeNotifications$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnsubscribeServiceChangeNotifications$MH = RuntimeHelper.downcallHandle(
        "UnsubscribeServiceChangeNotifications",
        constants$1335.UnsubscribeServiceChangeNotifications$FUNC
    );
    static final FunctionDescriptor WaitServiceState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WaitServiceState$MH = RuntimeHelper.downcallHandle(
        "WaitServiceState",
        constants$1335.WaitServiceState$FUNC
    );
    static final FunctionDescriptor GetServiceRegistryStateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceRegistryStateKey$MH = RuntimeHelper.downcallHandle(
        "GetServiceRegistryStateKey",
        constants$1335.GetServiceRegistryStateKey$FUNC
    );
    static final FunctionDescriptor GetServiceDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceDirectory$MH = RuntimeHelper.downcallHandle(
        "GetServiceDirectory",
        constants$1335.GetServiceDirectory$FUNC
    );
    static final FunctionDescriptor IMCENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IMCENUMPROC$MH = RuntimeHelper.downcallHandle(
        constants$1335.IMCENUMPROC$FUNC
    );
}


