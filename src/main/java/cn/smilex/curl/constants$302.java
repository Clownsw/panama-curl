// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$302 {

    static final FunctionDescriptor FindFirstFreeAce$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFreeAce$MH = RuntimeHelper.downcallHandle(
        "FindFirstFreeAce",
        constants$302.FindFirstFreeAce$FUNC
    );
    static final FunctionDescriptor FreeSid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeSid$MH = RuntimeHelper.downcallHandle(
        "FreeSid",
        constants$302.FreeSid$FUNC
    );
    static final FunctionDescriptor GetAce$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetAce$MH = RuntimeHelper.downcallHandle(
        "GetAce",
        constants$302.GetAce$FUNC
    );
    static final FunctionDescriptor GetAclInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAclInformation$MH = RuntimeHelper.downcallHandle(
        "GetAclInformation",
        constants$302.GetAclInformation$FUNC
    );
    static final FunctionDescriptor GetFileSecurityW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileSecurityW$MH = RuntimeHelper.downcallHandle(
        "GetFileSecurityW",
        constants$302.GetFileSecurityW$FUNC
    );
    static final FunctionDescriptor GetKernelObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetKernelObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "GetKernelObjectSecurity",
        constants$302.GetKernelObjectSecurity$FUNC
    );
}


