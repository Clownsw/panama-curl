// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1353 {

    static final FunctionDescriptor gethostbyaddr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gethostbyaddr$MH = RuntimeHelper.downcallHandle(
        "gethostbyaddr",
        constants$1353.gethostbyaddr$FUNC
    );
    static final FunctionDescriptor gethostbyname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gethostbyname$MH = RuntimeHelper.downcallHandle(
        "gethostbyname",
        constants$1353.gethostbyname$FUNC
    );
    static final FunctionDescriptor gethostname$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gethostname$MH = RuntimeHelper.downcallHandle(
        "gethostname",
        constants$1353.gethostname$FUNC
    );
    static final FunctionDescriptor GetHostNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetHostNameW$MH = RuntimeHelper.downcallHandle(
        "GetHostNameW",
        constants$1353.GetHostNameW$FUNC
    );
    static final FunctionDescriptor getservbyport$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getservbyport$MH = RuntimeHelper.downcallHandle(
        "getservbyport",
        constants$1353.getservbyport$FUNC
    );
    static final FunctionDescriptor getservbyname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getservbyname$MH = RuntimeHelper.downcallHandle(
        "getservbyname",
        constants$1353.getservbyname$FUNC
    );
}


