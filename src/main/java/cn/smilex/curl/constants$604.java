// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$604 {

    static final FunctionDescriptor CALINFO_ENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CALINFO_ENUMPROCW$MH = RuntimeHelper.downcallHandle(
        constants$604.CALINFO_ENUMPROCW$FUNC
    );
    static final FunctionDescriptor CALINFO_ENUMPROCEXW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CALINFO_ENUMPROCEXW$MH = RuntimeHelper.downcallHandle(
        constants$604.CALINFO_ENUMPROCEXW$FUNC
    );
    static final FunctionDescriptor GEO_ENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GEO_ENUMPROC$MH = RuntimeHelper.downcallHandle(
        constants$604.GEO_ENUMPROC$FUNC
    );
    static final FunctionDescriptor GEO_ENUMNAMEPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}

