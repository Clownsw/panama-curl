// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$307 {

    static final FunctionDescriptor IsValidSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsValidSid$MH = RuntimeHelper.downcallHandle(
        "IsValidSid",
        constants$307.IsValidSid$FUNC
    );
    static final FunctionDescriptor IsWellKnownSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsWellKnownSid$MH = RuntimeHelper.downcallHandle(
        "IsWellKnownSid",
        constants$307.IsWellKnownSid$FUNC
    );
    static final FunctionDescriptor MakeAbsoluteSD$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MakeAbsoluteSD$MH = RuntimeHelper.downcallHandle(
        "MakeAbsoluteSD",
        constants$307.MakeAbsoluteSD$FUNC
    );
    static final FunctionDescriptor MakeSelfRelativeSD$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MakeSelfRelativeSD$MH = RuntimeHelper.downcallHandle(
        "MakeSelfRelativeSD",
        constants$307.MakeSelfRelativeSD$FUNC
    );
    static final FunctionDescriptor MapGenericMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapGenericMask$MH = RuntimeHelper.downcallHandle(
        "MapGenericMask",
        constants$307.MapGenericMask$FUNC
    );
    static final FunctionDescriptor ObjectCloseAuditAlarmW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ObjectCloseAuditAlarmW$MH = RuntimeHelper.downcallHandle(
        "ObjectCloseAuditAlarmW",
        constants$307.ObjectCloseAuditAlarmW$FUNC
    );
}


