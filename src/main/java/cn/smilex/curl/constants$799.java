// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$799 {

    static final FunctionDescriptor BCryptDeriveKeyCapi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptDeriveKeyCapi$MH = RuntimeHelper.downcallHandle(
        "BCryptDeriveKeyCapi",
        constants$799.BCryptDeriveKeyCapi$FUNC
    );
    static final FunctionDescriptor BCryptDeriveKeyPBKDF2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptDeriveKeyPBKDF2$MH = RuntimeHelper.downcallHandle(
        "BCryptDeriveKeyPBKDF2",
        constants$799.BCryptDeriveKeyPBKDF2$FUNC
    );
    static final FunctionDescriptor BCryptQueryProviderRegistration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptQueryProviderRegistration$MH = RuntimeHelper.downcallHandle(
        "BCryptQueryProviderRegistration",
        constants$799.BCryptQueryProviderRegistration$FUNC
    );
    static final FunctionDescriptor BCryptEnumRegisteredProviders$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptEnumRegisteredProviders$MH = RuntimeHelper.downcallHandle(
        "BCryptEnumRegisteredProviders",
        constants$799.BCryptEnumRegisteredProviders$FUNC
    );
    static final FunctionDescriptor BCryptCreateContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptCreateContext$MH = RuntimeHelper.downcallHandle(
        "BCryptCreateContext",
        constants$799.BCryptCreateContext$FUNC
    );
    static final FunctionDescriptor BCryptDeleteContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptDeleteContext$MH = RuntimeHelper.downcallHandle(
        "BCryptDeleteContext",
        constants$799.BCryptDeleteContext$FUNC
    );
}

