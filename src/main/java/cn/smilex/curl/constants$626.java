// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$626 {

    static final FunctionDescriptor ResolveLocaleName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ResolveLocaleName$MH = RuntimeHelper.downcallHandle(
        "ResolveLocaleName",
        constants$626.ResolveLocaleName$FUNC
    );
    static final FunctionDescriptor AllocConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle AllocConsole$MH = RuntimeHelper.downcallHandle(
        "AllocConsole",
        constants$626.AllocConsole$FUNC
    );
    static final FunctionDescriptor FreeConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle FreeConsole$MH = RuntimeHelper.downcallHandle(
        "FreeConsole",
        constants$626.FreeConsole$FUNC
    );
    static final FunctionDescriptor AttachConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AttachConsole$MH = RuntimeHelper.downcallHandle(
        "AttachConsole",
        constants$626.AttachConsole$FUNC
    );
    static final FunctionDescriptor GetConsoleCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetConsoleCP$MH = RuntimeHelper.downcallHandle(
        "GetConsoleCP",
        constants$626.GetConsoleCP$FUNC
    );
    static final FunctionDescriptor GetConsoleOutputCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetConsoleOutputCP$MH = RuntimeHelper.downcallHandle(
        "GetConsoleOutputCP",
        constants$626.GetConsoleOutputCP$FUNC
    );
}


