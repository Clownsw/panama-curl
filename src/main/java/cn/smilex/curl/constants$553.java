// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$553 {

    static final FunctionDescriptor MSGBOXCALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MSGBOXCALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$553.MSGBOXCALLBACK$FUNC
    );
    static final FunctionDescriptor MessageBoxIndirectA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MessageBoxIndirectA$MH = RuntimeHelper.downcallHandle(
        "MessageBoxIndirectA",
        constants$553.MessageBoxIndirectA$FUNC
    );
    static final FunctionDescriptor MessageBoxIndirectW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MessageBoxIndirectW$MH = RuntimeHelper.downcallHandle(
        "MessageBoxIndirectW",
        constants$553.MessageBoxIndirectW$FUNC
    );
    static final FunctionDescriptor MessageBeep$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MessageBeep$MH = RuntimeHelper.downcallHandle(
        "MessageBeep",
        constants$553.MessageBeep$FUNC
    );
    static final FunctionDescriptor ShowCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowCursor$MH = RuntimeHelper.downcallHandle(
        "ShowCursor",
        constants$553.ShowCursor$FUNC
    );
    static final FunctionDescriptor SetCursorPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCursorPos$MH = RuntimeHelper.downcallHandle(
        "SetCursorPos",
        constants$553.SetCursorPos$FUNC
    );
}


