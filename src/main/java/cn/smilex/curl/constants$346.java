// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$346 {

    static final FunctionDescriptor CreateWaitableTimerExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateWaitableTimerExA$MH = RuntimeHelper.downcallHandle(
        "CreateWaitableTimerExA",
        constants$346.CreateWaitableTimerExA$FUNC
    );
    static final FunctionDescriptor CreateFileMappingA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileMappingA$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingA",
        constants$346.CreateFileMappingA$FUNC
    );
    static final FunctionDescriptor CreateFileMappingNumaA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateFileMappingNumaA$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingNumaA",
        constants$346.CreateFileMappingNumaA$FUNC
    );
    static final FunctionDescriptor OpenFileMappingA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenFileMappingA$MH = RuntimeHelper.downcallHandle(
        "OpenFileMappingA",
        constants$346.OpenFileMappingA$FUNC
    );
    static final FunctionDescriptor GetLogicalDriveStringsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLogicalDriveStringsA$MH = RuntimeHelper.downcallHandle(
        "GetLogicalDriveStringsA",
        constants$346.GetLogicalDriveStringsA$FUNC
    );
    static final FunctionDescriptor LoadPackagedLibrary$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadPackagedLibrary$MH = RuntimeHelper.downcallHandle(
        "LoadPackagedLibrary",
        constants$346.LoadPackagedLibrary$FUNC
    );
}


