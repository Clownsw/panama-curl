// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$87 {

    static final FunctionDescriptor wcschr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle wcschr$MH = RuntimeHelper.downcallHandle(
        "wcschr",
        constants$87.wcschr$FUNC
    );
    static final FunctionDescriptor wcsrchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle wcsrchr$MH = RuntimeHelper.downcallHandle(
        "wcsrchr",
        constants$87.wcsrchr$FUNC
    );
    static final FunctionDescriptor wcsstr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcsstr$MH = RuntimeHelper.downcallHandle(
        "wcsstr",
        constants$87.wcsstr$FUNC
    );
    static final FunctionDescriptor memcpy_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memcpy_s$MH = RuntimeHelper.downcallHandle(
        "memcpy_s",
        constants$87.memcpy_s$FUNC
    );
    static final FunctionDescriptor memmove_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memmove_s$MH = RuntimeHelper.downcallHandle(
        "memmove_s",
        constants$87.memmove_s$FUNC
    );
    static final FunctionDescriptor _memicmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _memicmp$MH = RuntimeHelper.downcallHandle(
        "_memicmp",
        constants$87._memicmp$FUNC
    );
}


