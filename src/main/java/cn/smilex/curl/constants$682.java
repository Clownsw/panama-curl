// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$682 {

    static final FunctionDescriptor DrvGetModuleHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrvGetModuleHandle$MH = RuntimeHelper.downcallHandle(
        "DrvGetModuleHandle",
        constants$682.DrvGetModuleHandle$FUNC
    );
    static final FunctionDescriptor GetDriverModuleHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDriverModuleHandle$MH = RuntimeHelper.downcallHandle(
        "GetDriverModuleHandle",
        constants$682.GetDriverModuleHandle$FUNC
    );
    static final FunctionDescriptor DefDriverProc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DefDriverProc$MH = RuntimeHelper.downcallHandle(
        "DefDriverProc",
        constants$682.DefDriverProc$FUNC
    );
    static final FunctionDescriptor DriverCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DriverCallback$MH = RuntimeHelper.downcallHandle(
        "DriverCallback",
        constants$682.DriverCallback$FUNC
    );
    static final FunctionDescriptor sndOpenSound$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sndOpenSound$MH = RuntimeHelper.downcallHandle(
        "sndOpenSound",
        constants$682.sndOpenSound$FUNC
    );
    static final FunctionDescriptor DRIVERMSGPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}

