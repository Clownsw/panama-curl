// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$802 {

    static final FunctionDescriptor BCryptUnregisterConfigChangeNotify$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptUnregisterConfigChangeNotify$MH = RuntimeHelper.downcallHandle(
        "BCryptUnregisterConfigChangeNotify",
        constants$802.BCryptUnregisterConfigChangeNotify$FUNC
    );
    static final FunctionDescriptor BCryptResolveProviders$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptResolveProviders$MH = RuntimeHelper.downcallHandle(
        "BCryptResolveProviders",
        constants$802.BCryptResolveProviders$FUNC
    );
    static final FunctionDescriptor BCryptGetFipsAlgorithmMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptGetFipsAlgorithmMode$MH = RuntimeHelper.downcallHandle(
        "BCryptGetFipsAlgorithmMode",
        constants$802.BCryptGetFipsAlgorithmMode$FUNC
    );
    static final FunctionDescriptor CngGetFipsAlgorithmMode$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT);
    static final MethodHandle CngGetFipsAlgorithmMode$MH = RuntimeHelper.downcallHandle(
        "CngGetFipsAlgorithmMode",
        constants$802.CngGetFipsAlgorithmMode$FUNC
    );
    static final FunctionDescriptor PFN_NCRYPT_ALLOC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFN_NCRYPT_ALLOC$MH = RuntimeHelper.downcallHandle(
        constants$802.PFN_NCRYPT_ALLOC$FUNC
    );
}


