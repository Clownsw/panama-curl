// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$358 {

    static final FunctionDescriptor Wow64EnableWow64FsRedirection$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle Wow64EnableWow64FsRedirection$MH = RuntimeHelper.downcallHandle(
        "Wow64EnableWow64FsRedirection",
        constants$358.Wow64EnableWow64FsRedirection$FUNC
    );
    static final FunctionDescriptor PGET_SYSTEM_WOW64_DIRECTORY_A$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PGET_SYSTEM_WOW64_DIRECTORY_A$MH = RuntimeHelper.downcallHandle(
        constants$358.PGET_SYSTEM_WOW64_DIRECTORY_A$FUNC
    );
    static final FunctionDescriptor PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PGET_SYSTEM_WOW64_DIRECTORY_W$MH = RuntimeHelper.downcallHandle(
        constants$358.PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC
    );
    static final FunctionDescriptor SetDllDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDllDirectoryA$MH = RuntimeHelper.downcallHandle(
        "SetDllDirectoryA",
        constants$358.SetDllDirectoryA$FUNC
    );
}

