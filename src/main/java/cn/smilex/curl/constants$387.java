// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$387 {

    static final FunctionDescriptor GetCurrentHwProfileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentHwProfileA$MH = RuntimeHelper.downcallHandle(
        "GetCurrentHwProfileA",
        constants$387.GetCurrentHwProfileA$FUNC
    );
    static final FunctionDescriptor GetCurrentHwProfileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentHwProfileW$MH = RuntimeHelper.downcallHandle(
        "GetCurrentHwProfileW",
        constants$387.GetCurrentHwProfileW$FUNC
    );
    static final FunctionDescriptor VerifyVersionInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VerifyVersionInfoA$MH = RuntimeHelper.downcallHandle(
        "VerifyVersionInfoA",
        constants$387.VerifyVersionInfoA$FUNC
    );
    static final FunctionDescriptor VerifyVersionInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VerifyVersionInfoW$MH = RuntimeHelper.downcallHandle(
        "VerifyVersionInfoW",
        constants$387.VerifyVersionInfoW$FUNC
    );
    static final FunctionDescriptor HRESULT_FROM_WIN32$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle HRESULT_FROM_WIN32$MH = RuntimeHelper.downcallHandle(
        "HRESULT_FROM_WIN32",
        constants$387.HRESULT_FROM_WIN32$FUNC
    );
    static final FunctionDescriptor SystemTimeToTzSpecificLocalTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToTzSpecificLocalTime$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToTzSpecificLocalTime",
        constants$387.SystemTimeToTzSpecificLocalTime$FUNC
    );
}


