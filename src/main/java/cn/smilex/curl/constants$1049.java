// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1049 {

    static final  GroupLayout CLSID_IdentityUnmarshal$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_IdentityUnmarshal$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_IdentityUnmarshal", constants$1049.CLSID_IdentityUnmarshal$LAYOUT);
    static final  GroupLayout CLSID_InProcFreeMarshaler$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_InProcFreeMarshaler$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_InProcFreeMarshaler", constants$1049.CLSID_InProcFreeMarshaler$LAYOUT);
    static final  GroupLayout CLSID_Picture_Metafile$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_Picture_Metafile$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_Picture_Metafile", constants$1049.CLSID_Picture_Metafile$LAYOUT);
    static final  GroupLayout CLSID_Picture_EnhMetafile$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_Picture_EnhMetafile$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_Picture_EnhMetafile", constants$1049.CLSID_Picture_EnhMetafile$LAYOUT);
    static final  GroupLayout CLSID_Picture_Dib$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_Picture_Dib$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_Picture_Dib", constants$1049.CLSID_Picture_Dib$LAYOUT);
    static final  GroupLayout GUID_TRISTATE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_TRISTATE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_TRISTATE", constants$1049.GUID_TRISTATE$LAYOUT);
}

