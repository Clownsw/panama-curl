// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$675 {

    static final FunctionDescriptor CopyLZFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyLZFile$MH = RuntimeHelper.downcallHandle(
        "CopyLZFile",
        constants$675.CopyLZFile$FUNC
    );
    static final FunctionDescriptor LZCopy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LZCopy$MH = RuntimeHelper.downcallHandle(
        "LZCopy",
        constants$675.LZCopy$FUNC
    );
    static final FunctionDescriptor LZInit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LZInit$MH = RuntimeHelper.downcallHandle(
        "LZInit",
        constants$675.LZInit$FUNC
    );
    static final FunctionDescriptor GetExpandedNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetExpandedNameA$MH = RuntimeHelper.downcallHandle(
        "GetExpandedNameA",
        constants$675.GetExpandedNameA$FUNC
    );
    static final FunctionDescriptor GetExpandedNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetExpandedNameW$MH = RuntimeHelper.downcallHandle(
        "GetExpandedNameW",
        constants$675.GetExpandedNameW$FUNC
    );
    static final FunctionDescriptor LZOpenFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle LZOpenFileA$MH = RuntimeHelper.downcallHandle(
        "LZOpenFileA",
        constants$675.LZOpenFileA$FUNC
    );
}

