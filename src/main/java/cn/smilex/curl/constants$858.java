// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$858 {

    static final FunctionDescriptor CryptMemRealloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptMemRealloc$MH = RuntimeHelper.downcallHandle(
        "CryptMemRealloc",
        constants$858.CryptMemRealloc$FUNC
    );
    static final FunctionDescriptor CryptMemFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMemFree$MH = RuntimeHelper.downcallHandle(
        "CryptMemFree",
        constants$858.CryptMemFree$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$858.PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$FUNC
    );
    static final FunctionDescriptor CryptCreateAsyncHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCreateAsyncHandle$MH = RuntimeHelper.downcallHandle(
        "CryptCreateAsyncHandle",
        constants$858.CryptCreateAsyncHandle$FUNC
    );
    static final FunctionDescriptor CryptSetAsyncParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptSetAsyncParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetAsyncParam",
        constants$858.CryptSetAsyncParam$FUNC
    );
}


