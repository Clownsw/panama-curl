// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$262 {

    static final FunctionDescriptor InstallELAMCertificateInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InstallELAMCertificateInfo$MH = RuntimeHelper.downcallHandle(
        "InstallELAMCertificateInfo",
        constants$262.InstallELAMCertificateInfo$FUNC
    );
    static final FunctionDescriptor GetProcessorSystemCycleTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessorSystemCycleTime$MH = RuntimeHelper.downcallHandle(
        "GetProcessorSystemCycleTime",
        constants$262.GetProcessorSystemCycleTime$FUNC
    );
    static final FunctionDescriptor GetOsManufacturingMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOsManufacturingMode$MH = RuntimeHelper.downcallHandle(
        "GetOsManufacturingMode",
        constants$262.GetOsManufacturingMode$FUNC
    );
    static final FunctionDescriptor GetIntegratedDisplaySize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetIntegratedDisplaySize$MH = RuntimeHelper.downcallHandle(
        "GetIntegratedDisplaySize",
        constants$262.GetIntegratedDisplaySize$FUNC
    );
    static final FunctionDescriptor SetComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameA",
        constants$262.SetComputerNameA$FUNC
    );
    static final FunctionDescriptor SetComputerNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameW$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameW",
        constants$262.SetComputerNameW$FUNC
    );
}

