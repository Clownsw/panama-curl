// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1385 {

    static final FunctionDescriptor curl_opensocket_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_opensocket_callback$MH = RuntimeHelper.downcallHandle(
        constants$1385.curl_opensocket_callback$FUNC
    );
    static final FunctionDescriptor curl_closesocket_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle curl_closesocket_callback$MH = RuntimeHelper.downcallHandle(
        constants$1385.curl_closesocket_callback$FUNC
    );
    static final FunctionDescriptor curl_ioctl_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_ioctl_callback$MH = RuntimeHelper.downcallHandle(
        constants$1385.curl_ioctl_callback$FUNC
    );
}


