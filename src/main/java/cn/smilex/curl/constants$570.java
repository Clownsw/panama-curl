// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$570 {

    static final FunctionDescriptor LoadCursorA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadCursorA$MH = RuntimeHelper.downcallHandle(
        "LoadCursorA",
        constants$570.LoadCursorA$FUNC
    );
    static final FunctionDescriptor LoadCursorW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadCursorW$MH = RuntimeHelper.downcallHandle(
        "LoadCursorW",
        constants$570.LoadCursorW$FUNC
    );
    static final FunctionDescriptor LoadCursorFromFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadCursorFromFileA$MH = RuntimeHelper.downcallHandle(
        "LoadCursorFromFileA",
        constants$570.LoadCursorFromFileA$FUNC
    );
    static final FunctionDescriptor LoadCursorFromFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadCursorFromFileW$MH = RuntimeHelper.downcallHandle(
        "LoadCursorFromFileW",
        constants$570.LoadCursorFromFileW$FUNC
    );
    static final FunctionDescriptor CreateCursor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateCursor$MH = RuntimeHelper.downcallHandle(
        "CreateCursor",
        constants$570.CreateCursor$FUNC
    );
    static final FunctionDescriptor DestroyCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyCursor$MH = RuntimeHelper.downcallHandle(
        "DestroyCursor",
        constants$570.DestroyCursor$FUNC
    );
}


