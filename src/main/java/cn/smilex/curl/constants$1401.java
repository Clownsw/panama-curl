// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1401 {

    static final FunctionDescriptor curl_multi_strerror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle curl_multi_strerror$MH = RuntimeHelper.downcallHandle(
        "curl_multi_strerror",
        constants$1401.curl_multi_strerror$FUNC
    );
    static final FunctionDescriptor curl_socket_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_socket_callback$MH = RuntimeHelper.downcallHandle(
        constants$1401.curl_socket_callback$FUNC
    );
    static final FunctionDescriptor curl_multi_timer_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_multi_timer_callback$MH = RuntimeHelper.downcallHandle(
        constants$1401.curl_multi_timer_callback$FUNC
    );
    static final FunctionDescriptor curl_multi_socket$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_multi_socket$MH = RuntimeHelper.downcallHandle(
        "curl_multi_socket",
        constants$1401.curl_multi_socket$FUNC
    );
}


