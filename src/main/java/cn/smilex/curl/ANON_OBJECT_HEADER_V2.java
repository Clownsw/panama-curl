// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ANON_OBJECT_HEADER_V2 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Sig1"),
        Constants$root.C_SHORT$LAYOUT.withName("Sig2"),
        Constants$root.C_SHORT$LAYOUT.withName("Version"),
        Constants$root.C_SHORT$LAYOUT.withName("Machine"),
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ClassID"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfData"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataSize"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataOffset")
    ).withName("ANON_OBJECT_HEADER_V2");
    public static MemoryLayout $LAYOUT() {
        return ANON_OBJECT_HEADER_V2.$struct$LAYOUT;
    }
    static final VarHandle Sig1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sig1"));
    public static VarHandle Sig1$VH() {
        return ANON_OBJECT_HEADER_V2.Sig1$VH;
    }
    public static short Sig1$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER_V2.Sig1$VH.get(seg);
    }
    public static void Sig1$set( MemorySegment seg, short x) {
        ANON_OBJECT_HEADER_V2.Sig1$VH.set(seg, x);
    }
    public static short Sig1$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER_V2.Sig1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig1$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER_V2.Sig1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sig2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sig2"));
    public static VarHandle Sig2$VH() {
        return ANON_OBJECT_HEADER_V2.Sig2$VH;
    }
    public static short Sig2$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER_V2.Sig2$VH.get(seg);
    }
    public static void Sig2$set( MemorySegment seg, short x) {
        ANON_OBJECT_HEADER_V2.Sig2$VH.set(seg, x);
    }
    public static short Sig2$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER_V2.Sig2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig2$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER_V2.Sig2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return ANON_OBJECT_HEADER_V2.Version$VH;
    }
    public static short Version$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER_V2.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, short x) {
        ANON_OBJECT_HEADER_V2.Version$VH.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER_V2.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER_V2.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Machine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Machine"));
    public static VarHandle Machine$VH() {
        return ANON_OBJECT_HEADER_V2.Machine$VH;
    }
    public static short Machine$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER_V2.Machine$VH.get(seg);
    }
    public static void Machine$set( MemorySegment seg, short x) {
        ANON_OBJECT_HEADER_V2.Machine$VH.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER_V2.Machine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER_V2.Machine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return ANON_OBJECT_HEADER_V2.TimeDateStamp$VH;
    }
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_V2.TimeDateStamp$VH.get(seg);
    }
    public static void TimeDateStamp$set( MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_V2.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_V2.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_V2.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ClassID$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    static final VarHandle SizeOfData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfData"));
    public static VarHandle SizeOfData$VH() {
        return ANON_OBJECT_HEADER_V2.SizeOfData$VH;
    }
    public static int SizeOfData$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_V2.SizeOfData$VH.get(seg);
    }
    public static void SizeOfData$set( MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_V2.SizeOfData$VH.set(seg, x);
    }
    public static int SizeOfData$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_V2.SizeOfData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfData$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_V2.SizeOfData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return ANON_OBJECT_HEADER_V2.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_V2.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_V2.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_V2.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_V2.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataSize"));
    public static VarHandle MetaDataSize$VH() {
        return ANON_OBJECT_HEADER_V2.MetaDataSize$VH;
    }
    public static int MetaDataSize$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_V2.MetaDataSize$VH.get(seg);
    }
    public static void MetaDataSize$set( MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_V2.MetaDataSize$VH.set(seg, x);
    }
    public static int MetaDataSize$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_V2.MetaDataSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataSize$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_V2.MetaDataSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataOffset"));
    public static VarHandle MetaDataOffset$VH() {
        return ANON_OBJECT_HEADER_V2.MetaDataOffset$VH;
    }
    public static int MetaDataOffset$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_V2.MetaDataOffset$VH.get(seg);
    }
    public static void MetaDataOffset$set( MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_V2.MetaDataOffset$VH.set(seg, x);
    }
    public static int MetaDataOffset$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_V2.MetaDataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataOffset$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_V2.MetaDataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


