// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$423 {

    static final FunctionDescriptor GetGraphicsMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGraphicsMode$MH = RuntimeHelper.downcallHandle(
        "GetGraphicsMode",
        constants$423.GetGraphicsMode$FUNC
    );
    static final FunctionDescriptor GetMapMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMapMode$MH = RuntimeHelper.downcallHandle(
        "GetMapMode",
        constants$423.GetMapMode$FUNC
    );
    static final FunctionDescriptor GetMetaFileBitsEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMetaFileBitsEx$MH = RuntimeHelper.downcallHandle(
        "GetMetaFileBitsEx",
        constants$423.GetMetaFileBitsEx$FUNC
    );
    static final FunctionDescriptor GetMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMetaFileA$MH = RuntimeHelper.downcallHandle(
        "GetMetaFileA",
        constants$423.GetMetaFileA$FUNC
    );
    static final FunctionDescriptor GetMetaFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMetaFileW$MH = RuntimeHelper.downcallHandle(
        "GetMetaFileW",
        constants$423.GetMetaFileW$FUNC
    );
    static final FunctionDescriptor GetNearestColor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNearestColor$MH = RuntimeHelper.downcallHandle(
        "GetNearestColor",
        constants$423.GetNearestColor$FUNC
    );
}

