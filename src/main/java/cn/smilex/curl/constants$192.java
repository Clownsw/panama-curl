// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$192 {

    static final FunctionDescriptor PENCLAVE_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PENCLAVE_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$192.PENCLAVE_ROUTINE$FUNC
    );
    static final FunctionDescriptor LPENCLAVE_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPENCLAVE_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$192.LPENCLAVE_ROUTINE$FUNC
    );
    static final FunctionDescriptor IsApiSetImplemented$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsApiSetImplemented$MH = RuntimeHelper.downcallHandle(
        "IsApiSetImplemented",
        constants$192.IsApiSetImplemented$FUNC
    );
    static final FunctionDescriptor SetEnvironmentStringsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEnvironmentStringsW$MH = RuntimeHelper.downcallHandle(
        "SetEnvironmentStringsW",
        constants$192.SetEnvironmentStringsW$FUNC
    );
    static final FunctionDescriptor GetStdHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetStdHandle$MH = RuntimeHelper.downcallHandle(
        "GetStdHandle",
        constants$192.GetStdHandle$FUNC
    );
}


