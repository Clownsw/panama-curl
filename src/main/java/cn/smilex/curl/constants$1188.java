// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1188 {

    static final  GroupLayout CLSID_SBS_InternetSecurityManager$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_InternetSecurityManager$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_SBS_InternetSecurityManager", constants$1188.CLSID_SBS_InternetSecurityManager$LAYOUT);
    static final  GroupLayout CLSID_SBS_InternetZoneManager$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_InternetZoneManager$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_SBS_InternetZoneManager", constants$1188.CLSID_SBS_InternetZoneManager$LAYOUT);
    static final  GroupLayout IID_IAsyncMoniker$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IAsyncMoniker$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IAsyncMoniker", constants$1188.IID_IAsyncMoniker$LAYOUT);
    static final  GroupLayout CLSID_StdURLMoniker$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_StdURLMoniker$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_StdURLMoniker", constants$1188.CLSID_StdURLMoniker$LAYOUT);
    static final  GroupLayout CLSID_HttpProtocol$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_HttpProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_HttpProtocol", constants$1188.CLSID_HttpProtocol$LAYOUT);
    static final  GroupLayout CLSID_FtpProtocol$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_FtpProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_FtpProtocol", constants$1188.CLSID_FtpProtocol$LAYOUT);
}

