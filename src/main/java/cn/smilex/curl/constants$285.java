// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$285 {

    static final FunctionDescriptor GetSystemWow64DirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemWow64DirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetSystemWow64DirectoryW",
        constants$285.GetSystemWow64DirectoryW$FUNC
    );
    static final FunctionDescriptor Wow64SetThreadDefaultGuestMachine$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle Wow64SetThreadDefaultGuestMachine$MH = RuntimeHelper.downcallHandle(
        "Wow64SetThreadDefaultGuestMachine",
        constants$285.Wow64SetThreadDefaultGuestMachine$FUNC
    );
    static final FunctionDescriptor IsWow64Process2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsWow64Process2$MH = RuntimeHelper.downcallHandle(
        "IsWow64Process2",
        constants$285.IsWow64Process2$FUNC
    );
    static final FunctionDescriptor GetSystemWow64Directory2A$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetSystemWow64Directory2A$MH = RuntimeHelper.downcallHandle(
        "GetSystemWow64Directory2A",
        constants$285.GetSystemWow64Directory2A$FUNC
    );
    static final FunctionDescriptor GetSystemWow64Directory2W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetSystemWow64Directory2W$MH = RuntimeHelper.downcallHandle(
        "GetSystemWow64Directory2W",
        constants$285.GetSystemWow64Directory2W$FUNC
    );
    static final FunctionDescriptor IsWow64GuestMachineSupported$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsWow64GuestMachineSupported$MH = RuntimeHelper.downcallHandle(
        "IsWow64GuestMachineSupported",
        constants$285.IsWow64GuestMachineSupported$FUNC
    );
}


