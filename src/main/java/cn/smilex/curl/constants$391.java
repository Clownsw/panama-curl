// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$391 {

    static final FunctionDescriptor OpenJobObjectA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenJobObjectA$MH = RuntimeHelper.downcallHandle(
        "OpenJobObjectA",
        constants$391.OpenJobObjectA$FUNC
    );
    static final FunctionDescriptor CreateJobSet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateJobSet$MH = RuntimeHelper.downcallHandle(
        "CreateJobSet",
        constants$391.CreateJobSet$FUNC
    );
    static final FunctionDescriptor FindFirstVolumeA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeA$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeA",
        constants$391.FindFirstVolumeA$FUNC
    );
    static final FunctionDescriptor FindNextVolumeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindNextVolumeA$MH = RuntimeHelper.downcallHandle(
        "FindNextVolumeA",
        constants$391.FindNextVolumeA$FUNC
    );
    static final FunctionDescriptor FindFirstVolumeMountPointA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeMountPointA",
        constants$391.FindFirstVolumeMountPointA$FUNC
    );
    static final FunctionDescriptor FindFirstVolumeMountPointW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeMountPointW$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeMountPointW",
        constants$391.FindFirstVolumeMountPointW$FUNC
    );
}


