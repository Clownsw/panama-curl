// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$841 {

    static final FunctionDescriptor PFN_CERT_ENUM_PHYSICAL_STORE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_ENUM_PHYSICAL_STORE$MH = RuntimeHelper.downcallHandle(
        constants$841.PFN_CERT_ENUM_PHYSICAL_STORE$FUNC
    );
    static final FunctionDescriptor CertEnumSystemStoreLocation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumSystemStoreLocation$MH = RuntimeHelper.downcallHandle(
        "CertEnumSystemStoreLocation",
        constants$841.CertEnumSystemStoreLocation$FUNC
    );
    static final FunctionDescriptor CertEnumSystemStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumSystemStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumSystemStore",
        constants$841.CertEnumSystemStore$FUNC
    );
    static final FunctionDescriptor CertEnumPhysicalStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumPhysicalStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumPhysicalStore",
        constants$841.CertEnumPhysicalStore$FUNC
    );
    static final FunctionDescriptor CertGetEnhancedKeyUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetEnhancedKeyUsage$MH = RuntimeHelper.downcallHandle(
        "CertGetEnhancedKeyUsage",
        constants$841.CertGetEnhancedKeyUsage$FUNC
    );
    static final FunctionDescriptor CertSetEnhancedKeyUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetEnhancedKeyUsage$MH = RuntimeHelper.downcallHandle(
        "CertSetEnhancedKeyUsage",
        constants$841.CertSetEnhancedKeyUsage$FUNC
    );
}

