// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$872 {

    static final FunctionDescriptor CryptUpdateProtectedState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptUpdateProtectedState$MH = RuntimeHelper.downcallHandle(
        "CryptUpdateProtectedState",
        constants$872.CryptUpdateProtectedState$FUNC
    );
    static final FunctionDescriptor CryptProtectMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptProtectMemory$MH = RuntimeHelper.downcallHandle(
        "CryptProtectMemory",
        constants$872.CryptProtectMemory$FUNC
    );
    static final FunctionDescriptor CryptUnprotectMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptUnprotectMemory$MH = RuntimeHelper.downcallHandle(
        "CryptUnprotectMemory",
        constants$872.CryptUnprotectMemory$FUNC
    );
    static final FunctionDescriptor QueryUsersOnEncryptedFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryUsersOnEncryptedFile$MH = RuntimeHelper.downcallHandle(
        "QueryUsersOnEncryptedFile",
        constants$872.QueryUsersOnEncryptedFile$FUNC
    );
    static final FunctionDescriptor QueryRecoveryAgentsOnEncryptedFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryRecoveryAgentsOnEncryptedFile$MH = RuntimeHelper.downcallHandle(
        "QueryRecoveryAgentsOnEncryptedFile",
        constants$872.QueryRecoveryAgentsOnEncryptedFile$FUNC
    );
    static final FunctionDescriptor RemoveUsersFromEncryptedFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveUsersFromEncryptedFile$MH = RuntimeHelper.downcallHandle(
        "RemoveUsersFromEncryptedFile",
        constants$872.RemoveUsersFromEncryptedFile$FUNC
    );
}


