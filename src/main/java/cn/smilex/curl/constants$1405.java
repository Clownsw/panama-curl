// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1405 {

    static final FunctionDescriptor curl_easy_header$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_easy_header$MH = RuntimeHelper.downcallHandle(
        "curl_easy_header",
        constants$1405.curl_easy_header$FUNC
    );
    static final FunctionDescriptor curl_easy_nextheader$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_easy_nextheader$MH = RuntimeHelper.downcallHandle(
        "curl_easy_nextheader",
        constants$1405.curl_easy_nextheader$FUNC
    );
    static final FunctionDescriptor curl_ws_recv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_ws_recv$MH = RuntimeHelper.downcallHandle(
        "curl_ws_recv",
        constants$1405.curl_ws_recv$FUNC
    );
    static final FunctionDescriptor curl_ws_send$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle curl_ws_send$MH = RuntimeHelper.downcallHandle(
        "curl_ws_send",
        constants$1405.curl_ws_send$FUNC
    );
    static final FunctionDescriptor curl_ws_meta$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_ws_meta$MH = RuntimeHelper.downcallHandle(
        "curl_ws_meta",
        constants$1405.curl_ws_meta$FUNC
    );
    static final MemorySegment LIBCURL_COPYRIGHT$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("1996 - 2022 Daniel Stenberg, <daniel@haxx.se>.");
}


