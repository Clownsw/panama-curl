// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$294 {

    static final FunctionDescriptor FindResourceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindResourceW$MH = RuntimeHelper.downcallHandle(
        "FindResourceW",
        constants$294.FindResourceW$FUNC
    );
    static final FunctionDescriptor LoadLibraryA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadLibraryA$MH = RuntimeHelper.downcallHandle(
        "LoadLibraryA",
        constants$294.LoadLibraryA$FUNC
    );
    static final FunctionDescriptor LoadLibraryW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadLibraryW$MH = RuntimeHelper.downcallHandle(
        "LoadLibraryW",
        constants$294.LoadLibraryW$FUNC
    );
    static final FunctionDescriptor EnumResourceNamesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumResourceNamesW$MH = RuntimeHelper.downcallHandle(
        "EnumResourceNamesW",
        constants$294.EnumResourceNamesW$FUNC
    );
    static final FunctionDescriptor AccessCheck$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AccessCheck$MH = RuntimeHelper.downcallHandle(
        "AccessCheck",
        constants$294.AccessCheck$FUNC
    );
    static final FunctionDescriptor AccessCheckAndAuditAlarmW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AccessCheckAndAuditAlarmW$MH = RuntimeHelper.downcallHandle(
        "AccessCheckAndAuditAlarmW",
        constants$294.AccessCheckAndAuditAlarmW$FUNC
    );
}


