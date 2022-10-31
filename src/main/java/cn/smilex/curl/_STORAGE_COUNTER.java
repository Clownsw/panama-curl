// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_COUNTER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Week"),
                Constants$root.C_LONG$LAYOUT.withName("Year")
            ).withName("ManufactureDate"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("AsUlonglong")
        ).withName("Value")
    ).withName("_STORAGE_COUNTER");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_COUNTER.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _STORAGE_COUNTER.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_STORAGE_COUNTER.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _STORAGE_COUNTER.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_STORAGE_COUNTER.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _STORAGE_COUNTER.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Value {

        static final  GroupLayout Value$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Week"),
                Constants$root.C_LONG$LAYOUT.withName("Year")
            ).withName("ManufactureDate"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("AsUlonglong")
        );
        public static MemoryLayout $LAYOUT() {
            return Value.Value$union$LAYOUT;
        }
        public static class ManufactureDate {

            static final  GroupLayout Value$ManufactureDate$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Week"),
                Constants$root.C_LONG$LAYOUT.withName("Year")
            );
            public static MemoryLayout $LAYOUT() {
                return ManufactureDate.Value$ManufactureDate$struct$LAYOUT;
            }
            static final VarHandle Week$VH = Value$ManufactureDate$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Week"));
            public static VarHandle Week$VH() {
                return ManufactureDate.Week$VH;
            }
            public static int Week$get(MemorySegment seg) {
                return (int)ManufactureDate.Week$VH.get(seg);
            }
            public static void Week$set( MemorySegment seg, int x) {
                ManufactureDate.Week$VH.set(seg, x);
            }
            public static int Week$get(MemorySegment seg, long index) {
                return (int)ManufactureDate.Week$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Week$set(MemorySegment seg, long index, int x) {
                ManufactureDate.Week$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Year$VH = Value$ManufactureDate$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Year"));
            public static VarHandle Year$VH() {
                return ManufactureDate.Year$VH;
            }
            public static int Year$get(MemorySegment seg) {
                return (int)ManufactureDate.Year$VH.get(seg);
            }
            public static void Year$set( MemorySegment seg, int x) {
                ManufactureDate.Year$VH.set(seg, x);
            }
            public static int Year$get(MemorySegment seg, long index) {
                return (int)ManufactureDate.Year$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Year$set(MemorySegment seg, long index, int x) {
                ManufactureDate.Year$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment ManufactureDate$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        static final VarHandle AsUlonglong$VH = Value$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AsUlonglong"));
        public static VarHandle AsUlonglong$VH() {
            return Value.AsUlonglong$VH;
        }
        public static long AsUlonglong$get(MemorySegment seg) {
            return (long)Value.AsUlonglong$VH.get(seg);
        }
        public static void AsUlonglong$set( MemorySegment seg, long x) {
            Value.AsUlonglong$VH.set(seg, x);
        }
        public static long AsUlonglong$get(MemorySegment seg, long index) {
            return (long)Value.AsUlonglong$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AsUlonglong$set(MemorySegment seg, long index, long x) {
            Value.AsUlonglong$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Value$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


