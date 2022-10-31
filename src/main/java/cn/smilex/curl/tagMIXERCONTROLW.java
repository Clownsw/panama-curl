// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMIXERCONTROLW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStruct"),
        Constants$root.C_LONG$LAYOUT.withName("dwControlID"),
        Constants$root.C_LONG$LAYOUT.withName("dwControlType"),
        Constants$root.C_LONG$LAYOUT.withName("fdwControl"),
        Constants$root.C_LONG$LAYOUT.withName("cMultipleItems"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_SHORT$LAYOUT).withName("szShortName"),
        MemoryLayout.sequenceLayout(64, Constants$root.C_SHORT$LAYOUT).withName("szName"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("lMinimum"),
                Constants$root.C_LONG$LAYOUT.withName("lMaximum")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwMinimum"),
                Constants$root.C_LONG$LAYOUT.withName("dwMaximum")
            ).withName("$anon$1"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("dwReserved")
        ).withName("Bounds"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("cSteps"),
            Constants$root.C_LONG$LAYOUT.withName("cbCustomData"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("dwReserved")
        ).withName("Metrics")
    ).withName("tagMIXERCONTROLW");
    public static MemoryLayout $LAYOUT() {
        return tagMIXERCONTROLW.$struct$LAYOUT;
    }
    static final VarHandle cbStruct$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStruct"));
    public static VarHandle cbStruct$VH() {
        return tagMIXERCONTROLW.cbStruct$VH;
    }
    public static int cbStruct$get(MemorySegment seg) {
        return (int)tagMIXERCONTROLW.cbStruct$VH.get(seg);
    }
    public static void cbStruct$set( MemorySegment seg, int x) {
        tagMIXERCONTROLW.cbStruct$VH.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)tagMIXERCONTROLW.cbStruct$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        tagMIXERCONTROLW.cbStruct$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwControlID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwControlID"));
    public static VarHandle dwControlID$VH() {
        return tagMIXERCONTROLW.dwControlID$VH;
    }
    public static int dwControlID$get(MemorySegment seg) {
        return (int)tagMIXERCONTROLW.dwControlID$VH.get(seg);
    }
    public static void dwControlID$set( MemorySegment seg, int x) {
        tagMIXERCONTROLW.dwControlID$VH.set(seg, x);
    }
    public static int dwControlID$get(MemorySegment seg, long index) {
        return (int)tagMIXERCONTROLW.dwControlID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlID$set(MemorySegment seg, long index, int x) {
        tagMIXERCONTROLW.dwControlID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwControlType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwControlType"));
    public static VarHandle dwControlType$VH() {
        return tagMIXERCONTROLW.dwControlType$VH;
    }
    public static int dwControlType$get(MemorySegment seg) {
        return (int)tagMIXERCONTROLW.dwControlType$VH.get(seg);
    }
    public static void dwControlType$set( MemorySegment seg, int x) {
        tagMIXERCONTROLW.dwControlType$VH.set(seg, x);
    }
    public static int dwControlType$get(MemorySegment seg, long index) {
        return (int)tagMIXERCONTROLW.dwControlType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlType$set(MemorySegment seg, long index, int x) {
        tagMIXERCONTROLW.dwControlType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fdwControl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fdwControl"));
    public static VarHandle fdwControl$VH() {
        return tagMIXERCONTROLW.fdwControl$VH;
    }
    public static int fdwControl$get(MemorySegment seg) {
        return (int)tagMIXERCONTROLW.fdwControl$VH.get(seg);
    }
    public static void fdwControl$set( MemorySegment seg, int x) {
        tagMIXERCONTROLW.fdwControl$VH.set(seg, x);
    }
    public static int fdwControl$get(MemorySegment seg, long index) {
        return (int)tagMIXERCONTROLW.fdwControl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fdwControl$set(MemorySegment seg, long index, int x) {
        tagMIXERCONTROLW.fdwControl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cMultipleItems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cMultipleItems"));
    public static VarHandle cMultipleItems$VH() {
        return tagMIXERCONTROLW.cMultipleItems$VH;
    }
    public static int cMultipleItems$get(MemorySegment seg) {
        return (int)tagMIXERCONTROLW.cMultipleItems$VH.get(seg);
    }
    public static void cMultipleItems$set( MemorySegment seg, int x) {
        tagMIXERCONTROLW.cMultipleItems$VH.set(seg, x);
    }
    public static int cMultipleItems$get(MemorySegment seg, long index) {
        return (int)tagMIXERCONTROLW.cMultipleItems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cMultipleItems$set(MemorySegment seg, long index, int x) {
        tagMIXERCONTROLW.cMultipleItems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szShortName$slice(MemorySegment seg) {
        return seg.asSlice(20, 32);
    }
    public static MemorySegment szName$slice(MemorySegment seg) {
        return seg.asSlice(52, 128);
    }
    public static class Bounds {

        static final  GroupLayout Bounds$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("lMinimum"),
                Constants$root.C_LONG$LAYOUT.withName("lMaximum")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwMinimum"),
                Constants$root.C_LONG$LAYOUT.withName("dwMaximum")
            ).withName("$anon$1"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("dwReserved")
        );
        public static MemoryLayout $LAYOUT() {
            return Bounds.Bounds$union$LAYOUT;
        }
        static final VarHandle lMinimum$VH = Bounds$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("lMinimum"));
        public static VarHandle lMinimum$VH() {
            return Bounds.lMinimum$VH;
        }
        public static int lMinimum$get(MemorySegment seg) {
            return (int)Bounds.lMinimum$VH.get(seg);
        }
        public static void lMinimum$set( MemorySegment seg, int x) {
            Bounds.lMinimum$VH.set(seg, x);
        }
        public static int lMinimum$get(MemorySegment seg, long index) {
            return (int)Bounds.lMinimum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void lMinimum$set(MemorySegment seg, long index, int x) {
            Bounds.lMinimum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle lMaximum$VH = Bounds$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("lMaximum"));
        public static VarHandle lMaximum$VH() {
            return Bounds.lMaximum$VH;
        }
        public static int lMaximum$get(MemorySegment seg) {
            return (int)Bounds.lMaximum$VH.get(seg);
        }
        public static void lMaximum$set( MemorySegment seg, int x) {
            Bounds.lMaximum$VH.set(seg, x);
        }
        public static int lMaximum$get(MemorySegment seg, long index) {
            return (int)Bounds.lMaximum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void lMaximum$set(MemorySegment seg, long index, int x) {
            Bounds.lMaximum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwMinimum$VH = Bounds$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("dwMinimum"));
        public static VarHandle dwMinimum$VH() {
            return Bounds.dwMinimum$VH;
        }
        public static int dwMinimum$get(MemorySegment seg) {
            return (int)Bounds.dwMinimum$VH.get(seg);
        }
        public static void dwMinimum$set( MemorySegment seg, int x) {
            Bounds.dwMinimum$VH.set(seg, x);
        }
        public static int dwMinimum$get(MemorySegment seg, long index) {
            return (int)Bounds.dwMinimum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwMinimum$set(MemorySegment seg, long index, int x) {
            Bounds.dwMinimum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwMaximum$VH = Bounds$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("dwMaximum"));
        public static VarHandle dwMaximum$VH() {
            return Bounds.dwMaximum$VH;
        }
        public static int dwMaximum$get(MemorySegment seg) {
            return (int)Bounds.dwMaximum$VH.get(seg);
        }
        public static void dwMaximum$set( MemorySegment seg, int x) {
            Bounds.dwMaximum$VH.set(seg, x);
        }
        public static int dwMaximum$get(MemorySegment seg, long index) {
            return (int)Bounds.dwMaximum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwMaximum$set(MemorySegment seg, long index, int x) {
            Bounds.dwMaximum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment dwReserved$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Bounds$slice(MemorySegment seg) {
        return seg.asSlice(180, 24);
    }
    public static class Metrics {

        static final  GroupLayout Metrics$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("cSteps"),
            Constants$root.C_LONG$LAYOUT.withName("cbCustomData"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("dwReserved")
        );
        public static MemoryLayout $LAYOUT() {
            return Metrics.Metrics$union$LAYOUT;
        }
        static final VarHandle cSteps$VH = Metrics$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cSteps"));
        public static VarHandle cSteps$VH() {
            return Metrics.cSteps$VH;
        }
        public static int cSteps$get(MemorySegment seg) {
            return (int)Metrics.cSteps$VH.get(seg);
        }
        public static void cSteps$set( MemorySegment seg, int x) {
            Metrics.cSteps$VH.set(seg, x);
        }
        public static int cSteps$get(MemorySegment seg, long index) {
            return (int)Metrics.cSteps$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cSteps$set(MemorySegment seg, long index, int x) {
            Metrics.cSteps$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle cbCustomData$VH = Metrics$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbCustomData"));
        public static VarHandle cbCustomData$VH() {
            return Metrics.cbCustomData$VH;
        }
        public static int cbCustomData$get(MemorySegment seg) {
            return (int)Metrics.cbCustomData$VH.get(seg);
        }
        public static void cbCustomData$set( MemorySegment seg, int x) {
            Metrics.cbCustomData$VH.set(seg, x);
        }
        public static int cbCustomData$get(MemorySegment seg, long index) {
            return (int)Metrics.cbCustomData$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cbCustomData$set(MemorySegment seg, long index, int x) {
            Metrics.cbCustomData$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment dwReserved$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Metrics$slice(MemorySegment seg) {
        return seg.asSlice(204, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


