// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$483 {

    static final FunctionDescriptor SetProcessWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessWindowStation$MH = RuntimeHelper.downcallHandle(
        "SetProcessWindowStation",
        constants$483.SetProcessWindowStation$FUNC
    );
    static final FunctionDescriptor GetProcessWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetProcessWindowStation$MH = RuntimeHelper.downcallHandle(
        "GetProcessWindowStation",
        constants$483.GetProcessWindowStation$FUNC
    );
    static final FunctionDescriptor SetUserObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetUserObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetUserObjectSecurity",
        constants$483.SetUserObjectSecurity$FUNC
    );
    static final FunctionDescriptor GetUserObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectSecurity",
        constants$483.GetUserObjectSecurity$FUNC
    );
    static final FunctionDescriptor GetUserObjectInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectInformationA$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectInformationA",
        constants$483.GetUserObjectInformationA$FUNC
    );
    static final FunctionDescriptor GetUserObjectInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectInformationW$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectInformationW",
        constants$483.GetUserObjectInformationW$FUNC
    );
}

