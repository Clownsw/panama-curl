// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$665 {

    static final FunctionDescriptor WNetCloseEnum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetCloseEnum$MH = RuntimeHelper.downcallHandle(
        "WNetCloseEnum",
        constants$665.WNetCloseEnum$FUNC
    );
    static final FunctionDescriptor WNetGetResourceParentA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetResourceParentA$MH = RuntimeHelper.downcallHandle(
        "WNetGetResourceParentA",
        constants$665.WNetGetResourceParentA$FUNC
    );
    static final FunctionDescriptor WNetGetResourceParentW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetResourceParentW$MH = RuntimeHelper.downcallHandle(
        "WNetGetResourceParentW",
        constants$665.WNetGetResourceParentW$FUNC
    );
    static final FunctionDescriptor WNetGetResourceInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetResourceInformationA$MH = RuntimeHelper.downcallHandle(
        "WNetGetResourceInformationA",
        constants$665.WNetGetResourceInformationA$FUNC
    );
    static final FunctionDescriptor WNetGetResourceInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetResourceInformationW$MH = RuntimeHelper.downcallHandle(
        "WNetGetResourceInformationW",
        constants$665.WNetGetResourceInformationW$FUNC
    );
    static final FunctionDescriptor WNetGetUniversalNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetUniversalNameA$MH = RuntimeHelper.downcallHandle(
        "WNetGetUniversalNameA",
        constants$665.WNetGetUniversalNameA$FUNC
    );
}


