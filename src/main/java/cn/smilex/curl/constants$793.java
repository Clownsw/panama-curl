// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$793 {

    static final FunctionDescriptor CryptContextAddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptContextAddRef$MH = RuntimeHelper.downcallHandle(
        "CryptContextAddRef",
        constants$793.CryptContextAddRef$FUNC
    );
    static final FunctionDescriptor CryptDuplicateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDuplicateKey$MH = RuntimeHelper.downcallHandle(
        "CryptDuplicateKey",
        constants$793.CryptDuplicateKey$FUNC
    );
    static final FunctionDescriptor CryptDuplicateHash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDuplicateHash$MH = RuntimeHelper.downcallHandle(
        "CryptDuplicateHash",
        constants$793.CryptDuplicateHash$FUNC
    );
    static final FunctionDescriptor GetEncSChannel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEncSChannel$MH = RuntimeHelper.downcallHandle(
        "GetEncSChannel",
        constants$793.GetEncSChannel$FUNC
    );
    static final FunctionDescriptor BCryptOpenAlgorithmProvider$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptOpenAlgorithmProvider$MH = RuntimeHelper.downcallHandle(
        "BCryptOpenAlgorithmProvider",
        constants$793.BCryptOpenAlgorithmProvider$FUNC
    );
    static final FunctionDescriptor BCryptEnumAlgorithms$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptEnumAlgorithms$MH = RuntimeHelper.downcallHandle(
        "BCryptEnumAlgorithms",
        constants$793.BCryptEnumAlgorithms$FUNC
    );
}


