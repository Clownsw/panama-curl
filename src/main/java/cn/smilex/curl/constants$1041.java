// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1041 {

    static final  GroupLayout CLSID_PSInPlaceActive$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_PSInPlaceActive$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_PSInPlaceActive", constants$1041.CLSID_PSInPlaceActive$LAYOUT);
    static final  GroupLayout CLSID_PSInPlaceFrame$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_PSInPlaceFrame$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_PSInPlaceFrame", constants$1041.CLSID_PSInPlaceFrame$LAYOUT);
    static final  GroupLayout CLSID_PSDragDrop$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_PSDragDrop$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_PSDragDrop", constants$1041.CLSID_PSDragDrop$LAYOUT);
    static final  GroupLayout CLSID_PSBindCtx$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_PSBindCtx$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_PSBindCtx", constants$1041.CLSID_PSBindCtx$LAYOUT);
    static final  GroupLayout CLSID_PSEnumerators$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_PSEnumerators$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_PSEnumerators", constants$1041.CLSID_PSEnumerators$LAYOUT);
    static final  GroupLayout CLSID_StaticMetafile$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_StaticMetafile$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_StaticMetafile", constants$1041.CLSID_StaticMetafile$LAYOUT);
}


