// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$484 {

    static final FunctionDescriptor SetUserObjectInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserObjectInformationA$MH = RuntimeHelper.downcallHandle(
        "SetUserObjectInformationA",
        constants$484.SetUserObjectInformationA$FUNC
    );
    static final FunctionDescriptor SetUserObjectInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserObjectInformationW$MH = RuntimeHelper.downcallHandle(
        "SetUserObjectInformationW",
        constants$484.SetUserObjectInformationW$FUNC
    );
    static final FunctionDescriptor IsHungAppWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsHungAppWindow$MH = RuntimeHelper.downcallHandle(
        "IsHungAppWindow",
        constants$484.IsHungAppWindow$FUNC
    );
    static final FunctionDescriptor DisableProcessWindowsGhosting$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle DisableProcessWindowsGhosting$MH = RuntimeHelper.downcallHandle(
        "DisableProcessWindowsGhosting",
        constants$484.DisableProcessWindowsGhosting$FUNC
    );
    static final FunctionDescriptor RegisterWindowMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterWindowMessageA$MH = RuntimeHelper.downcallHandle(
        "RegisterWindowMessageA",
        constants$484.RegisterWindowMessageA$FUNC
    );
    static final FunctionDescriptor RegisterWindowMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterWindowMessageW$MH = RuntimeHelper.downcallHandle(
        "RegisterWindowMessageW",
        constants$484.RegisterWindowMessageW$FUNC
    );
}

