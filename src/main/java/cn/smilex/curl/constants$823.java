// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$823 {

    static final FunctionDescriptor PFN_CERT_STORE_PROV_DELETE_CERT$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_DELETE_CERT$MH = RuntimeHelper.downcallHandle(
        constants$823.PFN_CERT_STORE_PROV_DELETE_CERT$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_SET_CERT_PROPERTY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_SET_CERT_PROPERTY$MH = RuntimeHelper.downcallHandle(
        constants$823.PFN_CERT_STORE_PROV_SET_CERT_PROPERTY$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_READ_CRL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_READ_CRL$MH = RuntimeHelper.downcallHandle(
        constants$823.PFN_CERT_STORE_PROV_READ_CRL$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_WRITE_CRL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
}


