// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$833 {

    static final FunctionDescriptor CertFreeCRLContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCRLContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeCRLContext",
        constants$833.CertFreeCRLContext$FUNC
    );
    static final FunctionDescriptor CertSetCRLContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetCRLContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertSetCRLContextProperty",
        constants$833.CertSetCRLContextProperty$FUNC
    );
    static final FunctionDescriptor CertGetCRLContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCRLContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertGetCRLContextProperty",
        constants$833.CertGetCRLContextProperty$FUNC
    );
    static final FunctionDescriptor CertEnumCRLContextProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertEnumCRLContextProperties$MH = RuntimeHelper.downcallHandle(
        "CertEnumCRLContextProperties",
        constants$833.CertEnumCRLContextProperties$FUNC
    );
    static final FunctionDescriptor CertFindCertificateInCRL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFindCertificateInCRL$MH = RuntimeHelper.downcallHandle(
        "CertFindCertificateInCRL",
        constants$833.CertFindCertificateInCRL$FUNC
    );
    static final FunctionDescriptor CertIsValidCRLForCertificate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertIsValidCRLForCertificate$MH = RuntimeHelper.downcallHandle(
        "CertIsValidCRLForCertificate",
        constants$833.CertIsValidCRLForCertificate$FUNC
    );
}


