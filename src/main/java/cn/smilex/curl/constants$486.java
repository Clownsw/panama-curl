// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$486 {

    static final FunctionDescriptor GetMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMessageW$MH = RuntimeHelper.downcallHandle(
        "GetMessageW",
        constants$486.GetMessageW$FUNC
    );
    static final FunctionDescriptor TranslateMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TranslateMessage$MH = RuntimeHelper.downcallHandle(
        "TranslateMessage",
        constants$486.TranslateMessage$FUNC
    );
    static final FunctionDescriptor DispatchMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DispatchMessageA$MH = RuntimeHelper.downcallHandle(
        "DispatchMessageA",
        constants$486.DispatchMessageA$FUNC
    );
    static final FunctionDescriptor DispatchMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DispatchMessageW$MH = RuntimeHelper.downcallHandle(
        "DispatchMessageW",
        constants$486.DispatchMessageW$FUNC
    );
    static final FunctionDescriptor SetMessageQueue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMessageQueue$MH = RuntimeHelper.downcallHandle(
        "SetMessageQueue",
        constants$486.SetMessageQueue$FUNC
    );
    static final FunctionDescriptor PeekMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PeekMessageA$MH = RuntimeHelper.downcallHandle(
        "PeekMessageA",
        constants$486.PeekMessageA$FUNC
    );
}


