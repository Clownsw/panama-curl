// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$807 {

    static final FunctionDescriptor NCryptSecretAgreement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptSecretAgreement$MH = RuntimeHelper.downcallHandle(
        "NCryptSecretAgreement",
        constants$807.NCryptSecretAgreement$FUNC
    );
    static final FunctionDescriptor NCryptDeriveKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptDeriveKey$MH = RuntimeHelper.downcallHandle(
        "NCryptDeriveKey",
        constants$807.NCryptDeriveKey$FUNC
    );
    static final FunctionDescriptor NCryptKeyDerivation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptKeyDerivation$MH = RuntimeHelper.downcallHandle(
        "NCryptKeyDerivation",
        constants$807.NCryptKeyDerivation$FUNC
    );
    static final FunctionDescriptor NCryptCreateClaim$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptCreateClaim$MH = RuntimeHelper.downcallHandle(
        "NCryptCreateClaim",
        constants$807.NCryptCreateClaim$FUNC
    );
    static final FunctionDescriptor NCryptVerifyClaim$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptVerifyClaim$MH = RuntimeHelper.downcallHandle(
        "NCryptVerifyClaim",
        constants$807.NCryptVerifyClaim$FUNC
    );
    static final FunctionDescriptor PCRYPT_DECRYPT_PRIVATE_KEY_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("_CRYPT_ALGORITHM_IDENTIFIER"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("_CRYPTOAPI_BLOB"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


