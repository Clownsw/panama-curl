// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$488 {

    static final FunctionDescriptor GetMessageTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessageTime$MH = RuntimeHelper.downcallHandle(
        "GetMessageTime",
        constants$488.GetMessageTime$FUNC
    );
    static final FunctionDescriptor GetMessageExtraInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle GetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        "GetMessageExtraInfo",
        constants$488.GetMessageExtraInfo$FUNC
    );
    static final FunctionDescriptor GetUnpredictedMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetUnpredictedMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetUnpredictedMessagePos",
        constants$488.GetUnpredictedMessagePos$FUNC
    );
    static final FunctionDescriptor IsWow64Message$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsWow64Message$MH = RuntimeHelper.downcallHandle(
        "IsWow64Message",
        constants$488.IsWow64Message$FUNC
    );
    static final FunctionDescriptor SetMessageExtraInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        "SetMessageExtraInfo",
        constants$488.SetMessageExtraInfo$FUNC
    );
    static final FunctionDescriptor SendMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendMessageA$MH = RuntimeHelper.downcallHandle(
        "SendMessageA",
        constants$488.SendMessageA$FUNC
    );
}


