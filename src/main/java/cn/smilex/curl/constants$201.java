// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$201 {

    static final FunctionDescriptor GetDiskFreeSpaceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDiskFreeSpaceW$MH = RuntimeHelper.downcallHandle(
        "GetDiskFreeSpaceW",
        constants$201.GetDiskFreeSpaceW$FUNC
    );
    static final FunctionDescriptor GetDiskFreeSpaceExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDiskFreeSpaceExA$MH = RuntimeHelper.downcallHandle(
        "GetDiskFreeSpaceExA",
        constants$201.GetDiskFreeSpaceExA$FUNC
    );
    static final FunctionDescriptor GetDiskFreeSpaceExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDiskFreeSpaceExW$MH = RuntimeHelper.downcallHandle(
        "GetDiskFreeSpaceExW",
        constants$201.GetDiskFreeSpaceExW$FUNC
    );
    static final FunctionDescriptor GetDiskSpaceInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDiskSpaceInformationA$MH = RuntimeHelper.downcallHandle(
        "GetDiskSpaceInformationA",
        constants$201.GetDiskSpaceInformationA$FUNC
    );
    static final FunctionDescriptor GetDiskSpaceInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDiskSpaceInformationW$MH = RuntimeHelper.downcallHandle(
        "GetDiskSpaceInformationW",
        constants$201.GetDiskSpaceInformationW$FUNC
    );
    static final FunctionDescriptor GetDriveTypeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDriveTypeA$MH = RuntimeHelper.downcallHandle(
        "GetDriveTypeA",
        constants$201.GetDriveTypeA$FUNC
    );
}

