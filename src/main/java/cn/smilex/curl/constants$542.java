// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$542 {

    static final FunctionDescriptor UpdateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UpdateWindow$MH = RuntimeHelper.downcallHandle(
        "UpdateWindow",
        constants$542.UpdateWindow$FUNC
    );
    static final FunctionDescriptor SetActiveWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetActiveWindow$MH = RuntimeHelper.downcallHandle(
        "SetActiveWindow",
        constants$542.SetActiveWindow$FUNC
    );
    static final FunctionDescriptor GetForegroundWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetForegroundWindow$MH = RuntimeHelper.downcallHandle(
        "GetForegroundWindow",
        constants$542.GetForegroundWindow$FUNC
    );
    static final FunctionDescriptor PaintDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PaintDesktop$MH = RuntimeHelper.downcallHandle(
        "PaintDesktop",
        constants$542.PaintDesktop$FUNC
    );
    static final FunctionDescriptor SwitchToThisWindow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SwitchToThisWindow$MH = RuntimeHelper.downcallHandle(
        "SwitchToThisWindow",
        constants$542.SwitchToThisWindow$FUNC
    );
    static final FunctionDescriptor SetForegroundWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetForegroundWindow$MH = RuntimeHelper.downcallHandle(
        "SetForegroundWindow",
        constants$542.SetForegroundWindow$FUNC
    );
}

