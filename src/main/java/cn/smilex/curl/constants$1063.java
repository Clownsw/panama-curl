// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1063 {

    static final FunctionDescriptor RoGetAgileReference$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RoGetAgileReference$MH = RuntimeHelper.downcallHandle(
        "RoGetAgileReference",
        constants$1063.RoGetAgileReference$FUNC
    );
    static final FunctionDescriptor LPFNGETCLASSOBJECT$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPFNGETCLASSOBJECT$MH = RuntimeHelper.downcallHandle(
        constants$1063.LPFNGETCLASSOBJECT$FUNC
    );
    static final FunctionDescriptor LPFNCANUNLOADNOW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle LPFNCANUNLOADNOW$MH = RuntimeHelper.downcallHandle(
        constants$1063.LPFNCANUNLOADNOW$FUNC
    );
    static final FunctionDescriptor DllGetClassObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DllGetClassObject$MH = RuntimeHelper.downcallHandle(
        "DllGetClassObject",
        constants$1063.DllGetClassObject$FUNC
    );
}

