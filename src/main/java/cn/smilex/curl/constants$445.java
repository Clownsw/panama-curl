// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$445 {

    static final FunctionDescriptor CopyEnhMetaFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyEnhMetaFileW$MH = RuntimeHelper.downcallHandle(
        "CopyEnhMetaFileW",
        constants$445.CopyEnhMetaFileW$FUNC
    );
    static final FunctionDescriptor CreateEnhMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEnhMetaFileA$MH = RuntimeHelper.downcallHandle(
        "CreateEnhMetaFileA",
        constants$445.CreateEnhMetaFileA$FUNC
    );
    static final FunctionDescriptor CreateEnhMetaFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEnhMetaFileW$MH = RuntimeHelper.downcallHandle(
        "CreateEnhMetaFileW",
        constants$445.CreateEnhMetaFileW$FUNC
    );
    static final FunctionDescriptor DeleteEnhMetaFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteEnhMetaFile$MH = RuntimeHelper.downcallHandle(
        "DeleteEnhMetaFile",
        constants$445.DeleteEnhMetaFile$FUNC
    );
    static final FunctionDescriptor EnumEnhMetaFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumEnhMetaFile$MH = RuntimeHelper.downcallHandle(
        "EnumEnhMetaFile",
        constants$445.EnumEnhMetaFile$FUNC
    );
    static final FunctionDescriptor GetEnhMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEnhMetaFileA$MH = RuntimeHelper.downcallHandle(
        "GetEnhMetaFileA",
        constants$445.GetEnhMetaFileA$FUNC
    );
}


