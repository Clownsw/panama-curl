// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$928 {

    static final FunctionDescriptor DeviceDsmInitializeInput$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmInitializeInput$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmInitializeInput",
        constants$928.DeviceDsmInitializeInput$FUNC
    );
    static final FunctionDescriptor DeviceDsmAddDataSetRange$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmAddDataSetRange$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmAddDataSetRange",
        constants$928.DeviceDsmAddDataSetRange$FUNC
    );
    static final FunctionDescriptor DeviceDsmValidateInput$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmValidateInput$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmValidateInput",
        constants$928.DeviceDsmValidateInput$FUNC
    );
    static final FunctionDescriptor DeviceDsmOutputBlock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmOutputBlock$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmOutputBlock",
        constants$928.DeviceDsmOutputBlock$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetOutputLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetOutputLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetOutputLength",
        constants$928.DeviceDsmGetOutputLength$FUNC
    );
    static final FunctionDescriptor DeviceDsmValidateOutputLength$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmValidateOutputLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmValidateOutputLength",
        constants$928.DeviceDsmValidateOutputLength$FUNC
    );
}

