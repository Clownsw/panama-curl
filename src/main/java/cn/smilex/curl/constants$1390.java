// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1390 {

    static final FunctionDescriptor curl_hstswrite_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_hstswrite_callback$MH = RuntimeHelper.downcallHandle(
        constants$1390.curl_hstswrite_callback$FUNC
    );
    static final FunctionDescriptor curl_strequal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_strequal$MH = RuntimeHelper.downcallHandle(
        "curl_strequal",
        constants$1390.curl_strequal$FUNC
    );
    static final FunctionDescriptor curl_strnequal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle curl_strnequal$MH = RuntimeHelper.downcallHandle(
        "curl_strnequal",
        constants$1390.curl_strnequal$FUNC
    );
    static final FunctionDescriptor curl_mime_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_mime_init$MH = RuntimeHelper.downcallHandle(
        "curl_mime_init",
        constants$1390.curl_mime_init$FUNC
    );
    static final FunctionDescriptor curl_mime_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_mime_free$MH = RuntimeHelper.downcallHandle(
        "curl_mime_free",
        constants$1390.curl_mime_free$FUNC
    );
}


