// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$229 {

    static final FunctionDescriptor InitializeSRWLock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeSRWLock$MH = RuntimeHelper.downcallHandle(
        "InitializeSRWLock",
        constants$229.InitializeSRWLock$FUNC
    );
    static final FunctionDescriptor ReleaseSRWLockExclusive$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseSRWLockExclusive$MH = RuntimeHelper.downcallHandle(
        "ReleaseSRWLockExclusive",
        constants$229.ReleaseSRWLockExclusive$FUNC
    );
    static final FunctionDescriptor ReleaseSRWLockShared$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseSRWLockShared$MH = RuntimeHelper.downcallHandle(
        "ReleaseSRWLockShared",
        constants$229.ReleaseSRWLockShared$FUNC
    );
    static final FunctionDescriptor AcquireSRWLockExclusive$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AcquireSRWLockExclusive$MH = RuntimeHelper.downcallHandle(
        "AcquireSRWLockExclusive",
        constants$229.AcquireSRWLockExclusive$FUNC
    );
    static final FunctionDescriptor AcquireSRWLockShared$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AcquireSRWLockShared$MH = RuntimeHelper.downcallHandle(
        "AcquireSRWLockShared",
        constants$229.AcquireSRWLockShared$FUNC
    );
    static final FunctionDescriptor TryAcquireSRWLockExclusive$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TryAcquireSRWLockExclusive$MH = RuntimeHelper.downcallHandle(
        "TryAcquireSRWLockExclusive",
        constants$229.TryAcquireSRWLockExclusive$FUNC
    );
}


