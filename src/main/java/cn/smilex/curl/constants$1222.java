// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1222 {

    static final FunctionDescriptor CoInternetGetSession$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInternetGetSession$MH = RuntimeHelper.downcallHandle(
        "CoInternetGetSession",
        constants$1222.CoInternetGetSession$FUNC
    );
    static final FunctionDescriptor CoInternetGetSecurityUrl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInternetGetSecurityUrl$MH = RuntimeHelper.downcallHandle(
        "CoInternetGetSecurityUrl",
        constants$1222.CoInternetGetSecurityUrl$FUNC
    );
    static final FunctionDescriptor AsyncInstallDistributionUnit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AsyncInstallDistributionUnit$MH = RuntimeHelper.downcallHandle(
        "AsyncInstallDistributionUnit",
        constants$1222.AsyncInstallDistributionUnit$FUNC
    );
    static final FunctionDescriptor CoInternetGetSecurityUrlEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CoInternetGetSecurityUrlEx$MH = RuntimeHelper.downcallHandle(
        "CoInternetGetSecurityUrlEx",
        constants$1222.CoInternetGetSecurityUrlEx$FUNC
    );
    static final FunctionDescriptor CoInternetSetFeatureEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInternetSetFeatureEnabled$MH = RuntimeHelper.downcallHandle(
        "CoInternetSetFeatureEnabled",
        constants$1222.CoInternetSetFeatureEnabled$FUNC
    );
    static final FunctionDescriptor CoInternetIsFeatureEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInternetIsFeatureEnabled$MH = RuntimeHelper.downcallHandle(
        "CoInternetIsFeatureEnabled",
        constants$1222.CoInternetIsFeatureEnabled$FUNC
    );
}


