// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$859 {

    static final FunctionDescriptor CryptGetAsyncParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetAsyncParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetAsyncParam",
        constants$859.CryptGetAsyncParam$FUNC
    );
    static final FunctionDescriptor CryptCloseAsyncHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCloseAsyncHandle$MH = RuntimeHelper.downcallHandle(
        "CryptCloseAsyncHandle",
        constants$859.CryptCloseAsyncHandle$FUNC
    );
    static final FunctionDescriptor PFN_FREE_ENCODED_OBJECT_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_FREE_ENCODED_OBJECT_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$859.PFN_FREE_ENCODED_OBJECT_FUNC$FUNC
    );
    static final FunctionDescriptor CryptRetrieveObjectByUrlA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptRetrieveObjectByUrlA$MH = RuntimeHelper.downcallHandle(
        "CryptRetrieveObjectByUrlA",
        constants$859.CryptRetrieveObjectByUrlA$FUNC
    );
    static final FunctionDescriptor CryptRetrieveObjectByUrlW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptRetrieveObjectByUrlW$MH = RuntimeHelper.downcallHandle(
        "CryptRetrieveObjectByUrlW",
        constants$859.CryptRetrieveObjectByUrlW$FUNC
    );
}


