// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1133 {

    static final  OfAddress __MIDL_itf_oaidl_0000_0023_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oaidl_0000_0023_v0_0_s_ifspec$VH = constants$1133.__MIDL_itf_oaidl_0000_0023_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oaidl_0000_0023_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0023_v0_0_s_ifspec", constants$1133.__MIDL_itf_oaidl_0000_0023_v0_0_s_ifspec$LAYOUT);
    static final FunctionDescriptor BSTR_UserSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BSTR_UserSize$MH = RuntimeHelper.downcallHandle(
        "BSTR_UserSize",
        constants$1133.BSTR_UserSize$FUNC
    );
    static final FunctionDescriptor BSTR_UserMarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BSTR_UserMarshal$MH = RuntimeHelper.downcallHandle(
        "BSTR_UserMarshal",
        constants$1133.BSTR_UserMarshal$FUNC
    );
    static final FunctionDescriptor BSTR_UserUnmarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BSTR_UserUnmarshal$MH = RuntimeHelper.downcallHandle(
        "BSTR_UserUnmarshal",
        constants$1133.BSTR_UserUnmarshal$FUNC
    );
    static final FunctionDescriptor BSTR_UserFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BSTR_UserFree$MH = RuntimeHelper.downcallHandle(
        "BSTR_UserFree",
        constants$1133.BSTR_UserFree$FUNC
    );
    static final FunctionDescriptor CLEANLOCALSTORAGE_UserSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLEANLOCALSTORAGE_UserSize$MH = RuntimeHelper.downcallHandle(
        "CLEANLOCALSTORAGE_UserSize",
        constants$1133.CLEANLOCALSTORAGE_UserSize$FUNC
    );
}


