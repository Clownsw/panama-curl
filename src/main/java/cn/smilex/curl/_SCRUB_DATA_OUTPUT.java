// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCRUB_DATA_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ErrorFileOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ErrorLength"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfBytesRepaired"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfBytesFailed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("InternalFileReference"),
        Constants$root.C_SHORT$LAYOUT.withName("ResumeContextLength"),
        Constants$root.C_SHORT$LAYOUT.withName("ParityExtentDataOffset"),
        MemoryLayout.sequenceLayout(9, Constants$root.C_LONG$LAYOUT).withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfMetadataBytesProcessed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfDataBytesProcessed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNumberOfMetadataBytesInUse"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNumberOfDataBytesInUse"),
        MemoryLayout.sequenceLayout(816, Constants$root.C_CHAR$LAYOUT).withName("ResumeContext")
    ).withName("_SCRUB_DATA_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _SCRUB_DATA_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCRUB_DATA_OUTPUT.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SCRUB_DATA_OUTPUT.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SCRUB_DATA_OUTPUT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCRUB_DATA_OUTPUT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCRUB_DATA_OUTPUT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SCRUB_DATA_OUTPUT.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_SCRUB_DATA_OUTPUT.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _SCRUB_DATA_OUTPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_SCRUB_DATA_OUTPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _SCRUB_DATA_OUTPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return _SCRUB_DATA_OUTPUT.Status$VH;
    }
    public static int Status$get(MemorySegment seg) {
        return (int)_SCRUB_DATA_OUTPUT.Status$VH.get(seg);
    }
    public static void Status$set( MemorySegment seg, int x) {
        _SCRUB_DATA_OUTPUT.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)_SCRUB_DATA_OUTPUT.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        _SCRUB_DATA_OUTPUT.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorFileOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorFileOffset"));
    public static VarHandle ErrorFileOffset$VH() {
        return _SCRUB_DATA_OUTPUT.ErrorFileOffset$VH;
    }
    public static long ErrorFileOffset$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.ErrorFileOffset$VH.get(seg);
    }
    public static void ErrorFileOffset$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.ErrorFileOffset$VH.set(seg, x);
    }
    public static long ErrorFileOffset$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.ErrorFileOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorFileOffset$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.ErrorFileOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorLength"));
    public static VarHandle ErrorLength$VH() {
        return _SCRUB_DATA_OUTPUT.ErrorLength$VH;
    }
    public static long ErrorLength$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.ErrorLength$VH.get(seg);
    }
    public static void ErrorLength$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.ErrorLength$VH.set(seg, x);
    }
    public static long ErrorLength$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.ErrorLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorLength$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.ErrorLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfBytesRepaired$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBytesRepaired"));
    public static VarHandle NumberOfBytesRepaired$VH() {
        return _SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH;
    }
    public static long NumberOfBytesRepaired$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH.get(seg);
    }
    public static void NumberOfBytesRepaired$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH.set(seg, x);
    }
    public static long NumberOfBytesRepaired$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBytesRepaired$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfBytesFailed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBytesFailed"));
    public static VarHandle NumberOfBytesFailed$VH() {
        return _SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH;
    }
    public static long NumberOfBytesFailed$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH.get(seg);
    }
    public static void NumberOfBytesFailed$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH.set(seg, x);
    }
    public static long NumberOfBytesFailed$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBytesFailed$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InternalFileReference$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InternalFileReference"));
    public static VarHandle InternalFileReference$VH() {
        return _SCRUB_DATA_OUTPUT.InternalFileReference$VH;
    }
    public static long InternalFileReference$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.InternalFileReference$VH.get(seg);
    }
    public static void InternalFileReference$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.InternalFileReference$VH.set(seg, x);
    }
    public static long InternalFileReference$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.InternalFileReference$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InternalFileReference$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.InternalFileReference$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ResumeContextLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ResumeContextLength"));
    public static VarHandle ResumeContextLength$VH() {
        return _SCRUB_DATA_OUTPUT.ResumeContextLength$VH;
    }
    public static short ResumeContextLength$get(MemorySegment seg) {
        return (short)_SCRUB_DATA_OUTPUT.ResumeContextLength$VH.get(seg);
    }
    public static void ResumeContextLength$set( MemorySegment seg, short x) {
        _SCRUB_DATA_OUTPUT.ResumeContextLength$VH.set(seg, x);
    }
    public static short ResumeContextLength$get(MemorySegment seg, long index) {
        return (short)_SCRUB_DATA_OUTPUT.ResumeContextLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ResumeContextLength$set(MemorySegment seg, long index, short x) {
        _SCRUB_DATA_OUTPUT.ResumeContextLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ParityExtentDataOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParityExtentDataOffset"));
    public static VarHandle ParityExtentDataOffset$VH() {
        return _SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH;
    }
    public static short ParityExtentDataOffset$get(MemorySegment seg) {
        return (short)_SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH.get(seg);
    }
    public static void ParityExtentDataOffset$set( MemorySegment seg, short x) {
        _SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH.set(seg, x);
    }
    public static short ParityExtentDataOffset$get(MemorySegment seg, long index) {
        return (short)_SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParityExtentDataOffset$set(MemorySegment seg, long index, short x) {
        _SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(60, 36);
    }
    static final VarHandle NumberOfMetadataBytesProcessed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfMetadataBytesProcessed"));
    public static VarHandle NumberOfMetadataBytesProcessed$VH() {
        return _SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH;
    }
    public static long NumberOfMetadataBytesProcessed$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH.get(seg);
    }
    public static void NumberOfMetadataBytesProcessed$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH.set(seg, x);
    }
    public static long NumberOfMetadataBytesProcessed$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfMetadataBytesProcessed$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfDataBytesProcessed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfDataBytesProcessed"));
    public static VarHandle NumberOfDataBytesProcessed$VH() {
        return _SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH;
    }
    public static long NumberOfDataBytesProcessed$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH.get(seg);
    }
    public static void NumberOfDataBytesProcessed$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH.set(seg, x);
    }
    public static long NumberOfDataBytesProcessed$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfDataBytesProcessed$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNumberOfMetadataBytesInUse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfMetadataBytesInUse"));
    public static VarHandle TotalNumberOfMetadataBytesInUse$VH() {
        return _SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH;
    }
    public static long TotalNumberOfMetadataBytesInUse$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH.get(seg);
    }
    public static void TotalNumberOfMetadataBytesInUse$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH.set(seg, x);
    }
    public static long TotalNumberOfMetadataBytesInUse$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfMetadataBytesInUse$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNumberOfDataBytesInUse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfDataBytesInUse"));
    public static VarHandle TotalNumberOfDataBytesInUse$VH() {
        return _SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH;
    }
    public static long TotalNumberOfDataBytesInUse$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH.get(seg);
    }
    public static void TotalNumberOfDataBytesInUse$set( MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH.set(seg, x);
    }
    public static long TotalNumberOfDataBytesInUse$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfDataBytesInUse$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ResumeContext$slice(MemorySegment seg) {
        return seg.asSlice(128, 816);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


