// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class USN_RECORD_V2 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("RecordLength"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorVersion"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("FileReferenceNumber"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ParentFileReferenceNumber"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Usn"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("TimeStamp"),
        Constants$root.C_LONG$LAYOUT.withName("Reason"),
        Constants$root.C_LONG$LAYOUT.withName("SourceInfo"),
        Constants$root.C_LONG$LAYOUT.withName("SecurityId"),
        Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
        Constants$root.C_SHORT$LAYOUT.withName("FileNameLength"),
        Constants$root.C_SHORT$LAYOUT.withName("FileNameOffset"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
        MemoryLayout.paddingLayout(16)
    );
    public static MemoryLayout $LAYOUT() {
        return USN_RECORD_V2.$struct$LAYOUT;
    }
    static final VarHandle RecordLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RecordLength"));
    public static VarHandle RecordLength$VH() {
        return USN_RECORD_V2.RecordLength$VH;
    }
    public static int RecordLength$get(MemorySegment seg) {
        return (int)USN_RECORD_V2.RecordLength$VH.get(seg);
    }
    public static void RecordLength$set( MemorySegment seg, int x) {
        USN_RECORD_V2.RecordLength$VH.set(seg, x);
    }
    public static int RecordLength$get(MemorySegment seg, long index) {
        return (int)USN_RECORD_V2.RecordLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RecordLength$set(MemorySegment seg, long index, int x) {
        USN_RECORD_V2.RecordLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorVersion"));
    public static VarHandle MajorVersion$VH() {
        return USN_RECORD_V2.MajorVersion$VH;
    }
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)USN_RECORD_V2.MajorVersion$VH.get(seg);
    }
    public static void MajorVersion$set( MemorySegment seg, short x) {
        USN_RECORD_V2.MajorVersion$VH.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)USN_RECORD_V2.MajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        USN_RECORD_V2.MajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorVersion"));
    public static VarHandle MinorVersion$VH() {
        return USN_RECORD_V2.MinorVersion$VH;
    }
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)USN_RECORD_V2.MinorVersion$VH.get(seg);
    }
    public static void MinorVersion$set( MemorySegment seg, short x) {
        USN_RECORD_V2.MinorVersion$VH.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)USN_RECORD_V2.MinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        USN_RECORD_V2.MinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileReferenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileReferenceNumber"));
    public static VarHandle FileReferenceNumber$VH() {
        return USN_RECORD_V2.FileReferenceNumber$VH;
    }
    public static long FileReferenceNumber$get(MemorySegment seg) {
        return (long)USN_RECORD_V2.FileReferenceNumber$VH.get(seg);
    }
    public static void FileReferenceNumber$set( MemorySegment seg, long x) {
        USN_RECORD_V2.FileReferenceNumber$VH.set(seg, x);
    }
    public static long FileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)USN_RECORD_V2.FileReferenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileReferenceNumber$set(MemorySegment seg, long index, long x) {
        USN_RECORD_V2.FileReferenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ParentFileReferenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParentFileReferenceNumber"));
    public static VarHandle ParentFileReferenceNumber$VH() {
        return USN_RECORD_V2.ParentFileReferenceNumber$VH;
    }
    public static long ParentFileReferenceNumber$get(MemorySegment seg) {
        return (long)USN_RECORD_V2.ParentFileReferenceNumber$VH.get(seg);
    }
    public static void ParentFileReferenceNumber$set( MemorySegment seg, long x) {
        USN_RECORD_V2.ParentFileReferenceNumber$VH.set(seg, x);
    }
    public static long ParentFileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)USN_RECORD_V2.ParentFileReferenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParentFileReferenceNumber$set(MemorySegment seg, long index, long x) {
        USN_RECORD_V2.ParentFileReferenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Usn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Usn"));
    public static VarHandle Usn$VH() {
        return USN_RECORD_V2.Usn$VH;
    }
    public static long Usn$get(MemorySegment seg) {
        return (long)USN_RECORD_V2.Usn$VH.get(seg);
    }
    public static void Usn$set( MemorySegment seg, long x) {
        USN_RECORD_V2.Usn$VH.set(seg, x);
    }
    public static long Usn$get(MemorySegment seg, long index) {
        return (long)USN_RECORD_V2.Usn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Usn$set(MemorySegment seg, long index, long x) {
        USN_RECORD_V2.Usn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TimeStamp$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    static final VarHandle Reason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reason"));
    public static VarHandle Reason$VH() {
        return USN_RECORD_V2.Reason$VH;
    }
    public static int Reason$get(MemorySegment seg) {
        return (int)USN_RECORD_V2.Reason$VH.get(seg);
    }
    public static void Reason$set( MemorySegment seg, int x) {
        USN_RECORD_V2.Reason$VH.set(seg, x);
    }
    public static int Reason$get(MemorySegment seg, long index) {
        return (int)USN_RECORD_V2.Reason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reason$set(MemorySegment seg, long index, int x) {
        USN_RECORD_V2.Reason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SourceInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceInfo"));
    public static VarHandle SourceInfo$VH() {
        return USN_RECORD_V2.SourceInfo$VH;
    }
    public static int SourceInfo$get(MemorySegment seg) {
        return (int)USN_RECORD_V2.SourceInfo$VH.get(seg);
    }
    public static void SourceInfo$set( MemorySegment seg, int x) {
        USN_RECORD_V2.SourceInfo$VH.set(seg, x);
    }
    public static int SourceInfo$get(MemorySegment seg, long index) {
        return (int)USN_RECORD_V2.SourceInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceInfo$set(MemorySegment seg, long index, int x) {
        USN_RECORD_V2.SourceInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityId"));
    public static VarHandle SecurityId$VH() {
        return USN_RECORD_V2.SecurityId$VH;
    }
    public static int SecurityId$get(MemorySegment seg) {
        return (int)USN_RECORD_V2.SecurityId$VH.get(seg);
    }
    public static void SecurityId$set( MemorySegment seg, int x) {
        USN_RECORD_V2.SecurityId$VH.set(seg, x);
    }
    public static int SecurityId$get(MemorySegment seg, long index) {
        return (int)USN_RECORD_V2.SecurityId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityId$set(MemorySegment seg, long index, int x) {
        USN_RECORD_V2.SecurityId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileAttributes"));
    public static VarHandle FileAttributes$VH() {
        return USN_RECORD_V2.FileAttributes$VH;
    }
    public static int FileAttributes$get(MemorySegment seg) {
        return (int)USN_RECORD_V2.FileAttributes$VH.get(seg);
    }
    public static void FileAttributes$set( MemorySegment seg, int x) {
        USN_RECORD_V2.FileAttributes$VH.set(seg, x);
    }
    public static int FileAttributes$get(MemorySegment seg, long index) {
        return (int)USN_RECORD_V2.FileAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileAttributes$set(MemorySegment seg, long index, int x) {
        USN_RECORD_V2.FileAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileNameLength"));
    public static VarHandle FileNameLength$VH() {
        return USN_RECORD_V2.FileNameLength$VH;
    }
    public static short FileNameLength$get(MemorySegment seg) {
        return (short)USN_RECORD_V2.FileNameLength$VH.get(seg);
    }
    public static void FileNameLength$set( MemorySegment seg, short x) {
        USN_RECORD_V2.FileNameLength$VH.set(seg, x);
    }
    public static short FileNameLength$get(MemorySegment seg, long index) {
        return (short)USN_RECORD_V2.FileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, short x) {
        USN_RECORD_V2.FileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileNameOffset"));
    public static VarHandle FileNameOffset$VH() {
        return USN_RECORD_V2.FileNameOffset$VH;
    }
    public static short FileNameOffset$get(MemorySegment seg) {
        return (short)USN_RECORD_V2.FileNameOffset$VH.get(seg);
    }
    public static void FileNameOffset$set( MemorySegment seg, short x) {
        USN_RECORD_V2.FileNameOffset$VH.set(seg, x);
    }
    public static short FileNameOffset$get(MemorySegment seg, long index) {
        return (short)USN_RECORD_V2.FileNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameOffset$set(MemorySegment seg, long index, short x) {
        USN_RECORD_V2.FileNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(60, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


