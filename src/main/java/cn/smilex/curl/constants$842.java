// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$842 {

    static final FunctionDescriptor CertAddEnhancedKeyUsageIdentifier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddEnhancedKeyUsageIdentifier$MH = RuntimeHelper.downcallHandle(
        "CertAddEnhancedKeyUsageIdentifier",
        constants$842.CertAddEnhancedKeyUsageIdentifier$FUNC
    );
    static final FunctionDescriptor CertRemoveEnhancedKeyUsageIdentifier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRemoveEnhancedKeyUsageIdentifier$MH = RuntimeHelper.downcallHandle(
        "CertRemoveEnhancedKeyUsageIdentifier",
        constants$842.CertRemoveEnhancedKeyUsageIdentifier$FUNC
    );
    static final FunctionDescriptor CertGetValidUsages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetValidUsages$MH = RuntimeHelper.downcallHandle(
        "CertGetValidUsages",
        constants$842.CertGetValidUsages$FUNC
    );
    static final FunctionDescriptor CryptMsgGetAndVerifySigner$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgGetAndVerifySigner$MH = RuntimeHelper.downcallHandle(
        "CryptMsgGetAndVerifySigner",
        constants$842.CryptMsgGetAndVerifySigner$FUNC
    );
    static final FunctionDescriptor CryptMsgSignCTL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgSignCTL$MH = RuntimeHelper.downcallHandle(
        "CryptMsgSignCTL",
        constants$842.CryptMsgSignCTL$FUNC
    );
    static final FunctionDescriptor CryptMsgEncodeAndSignCTL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgEncodeAndSignCTL$MH = RuntimeHelper.downcallHandle(
        "CryptMsgEncodeAndSignCTL",
        constants$842.CryptMsgEncodeAndSignCTL$FUNC
    );
}

