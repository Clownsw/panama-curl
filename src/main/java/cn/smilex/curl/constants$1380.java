// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1380 {

    static final FunctionDescriptor WSASetIPUserMtu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASetIPUserMtu$MH = RuntimeHelper.downcallHandle(
        "WSASetIPUserMtu",
        constants$1380.WSASetIPUserMtu$FUNC
    );
    static final FunctionDescriptor WSAGetFailConnectOnIcmpError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSAGetFailConnectOnIcmpError$MH = RuntimeHelper.downcallHandle(
        "WSAGetFailConnectOnIcmpError",
        constants$1380.WSAGetFailConnectOnIcmpError$FUNC
    );
    static final FunctionDescriptor WSASetFailConnectOnIcmpError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASetFailConnectOnIcmpError$MH = RuntimeHelper.downcallHandle(
        "WSASetFailConnectOnIcmpError",
        constants$1380.WSASetFailConnectOnIcmpError$FUNC
    );
    static final FunctionDescriptor WSAGetIcmpErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSAGetIcmpErrorInfo$MH = RuntimeHelper.downcallHandle(
        "WSAGetIcmpErrorInfo",
        constants$1380.WSAGetIcmpErrorInfo$FUNC
    );
    static final FunctionDescriptor WSAGetUdpSendMessageSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSAGetUdpSendMessageSize$MH = RuntimeHelper.downcallHandle(
        "WSAGetUdpSendMessageSize",
        constants$1380.WSAGetUdpSendMessageSize$FUNC
    );
    static final FunctionDescriptor WSASetUdpSendMessageSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASetUdpSendMessageSize$MH = RuntimeHelper.downcallHandle(
        "WSASetUdpSendMessageSize",
        constants$1380.WSASetUdpSendMessageSize$FUNC
    );
}


