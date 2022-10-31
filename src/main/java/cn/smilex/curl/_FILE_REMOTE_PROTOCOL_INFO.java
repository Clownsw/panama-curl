// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_REMOTE_PROTOCOL_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("StructureVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("StructureSize"),
        Constants$root.C_LONG$LAYOUT.withName("Protocol"),
        Constants$root.C_SHORT$LAYOUT.withName("ProtocolMajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("ProtocolMinorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("ProtocolRevision"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, Constants$root.C_LONG$LAYOUT).withName("Reserved")
        ).withName("GenericReserved"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Capabilities")
                ).withName("Server"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Capabilities"),
                    Constants$root.C_LONG$LAYOUT.withName("CachingFlags")
                ).withName("Share")
            ).withName("Smb2"),
            MemoryLayout.sequenceLayout(16, Constants$root.C_LONG$LAYOUT).withName("Reserved")
        ).withName("ProtocolSpecific")
    ).withName("_FILE_REMOTE_PROTOCOL_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_REMOTE_PROTOCOL_INFO.$struct$LAYOUT;
    }
    static final VarHandle StructureVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StructureVersion"));
    public static VarHandle StructureVersion$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH;
    }
    public static short StructureVersion$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH.get(seg);
    }
    public static void StructureVersion$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH.set(seg, x);
    }
    public static short StructureVersion$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StructureVersion$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StructureSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StructureSize"));
    public static VarHandle StructureSize$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH;
    }
    public static short StructureSize$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH.get(seg);
    }
    public static void StructureSize$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH.set(seg, x);
    }
    public static short StructureSize$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StructureSize$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Protocol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Protocol"));
    public static VarHandle Protocol$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.Protocol$VH;
    }
    public static int Protocol$get(MemorySegment seg) {
        return (int)_FILE_REMOTE_PROTOCOL_INFO.Protocol$VH.get(seg);
    }
    public static void Protocol$set( MemorySegment seg, int x) {
        _FILE_REMOTE_PROTOCOL_INFO.Protocol$VH.set(seg, x);
    }
    public static int Protocol$get(MemorySegment seg, long index) {
        return (int)_FILE_REMOTE_PROTOCOL_INFO.Protocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Protocol$set(MemorySegment seg, long index, int x) {
        _FILE_REMOTE_PROTOCOL_INFO.Protocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProtocolMajorVersion"));
    public static VarHandle ProtocolMajorVersion$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH;
    }
    public static short ProtocolMajorVersion$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH.get(seg);
    }
    public static void ProtocolMajorVersion$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH.set(seg, x);
    }
    public static short ProtocolMajorVersion$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolMajorVersion$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolMinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProtocolMinorVersion"));
    public static VarHandle ProtocolMinorVersion$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH;
    }
    public static short ProtocolMinorVersion$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH.get(seg);
    }
    public static void ProtocolMinorVersion$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH.set(seg, x);
    }
    public static short ProtocolMinorVersion$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolMinorVersion$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolRevision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProtocolRevision"));
    public static VarHandle ProtocolRevision$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH;
    }
    public static short ProtocolRevision$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH.get(seg);
    }
    public static void ProtocolRevision$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH.set(seg, x);
    }
    public static short ProtocolRevision$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolRevision$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_FILE_REMOTE_PROTOCOL_INFO.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _FILE_REMOTE_PROTOCOL_INFO.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FILE_REMOTE_PROTOCOL_INFO.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FILE_REMOTE_PROTOCOL_INFO.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class GenericReserved {

        static final  GroupLayout GenericReserved$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, Constants$root.C_LONG$LAYOUT).withName("Reserved")
        );
        public static MemoryLayout $LAYOUT() {
            return GenericReserved.GenericReserved$struct$LAYOUT;
        }
        public static MemorySegment Reserved$slice(MemorySegment seg) {
            return seg.asSlice(0, 32);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment GenericReserved$slice(MemorySegment seg) {
        return seg.asSlice(20, 32);
    }
    public static class ProtocolSpecific {

        static final  GroupLayout ProtocolSpecific$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Capabilities")
                ).withName("Server"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Capabilities"),
                    Constants$root.C_LONG$LAYOUT.withName("CachingFlags")
                ).withName("Share")
            ).withName("Smb2"),
            MemoryLayout.sequenceLayout(16, Constants$root.C_LONG$LAYOUT).withName("Reserved")
        );
        public static MemoryLayout $LAYOUT() {
            return ProtocolSpecific.ProtocolSpecific$union$LAYOUT;
        }
        public static class Smb2 {

            static final  GroupLayout ProtocolSpecific$Smb2$struct$LAYOUT = MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Capabilities")
                ).withName("Server"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Capabilities"),
                    Constants$root.C_LONG$LAYOUT.withName("CachingFlags")
                ).withName("Share")
            );
            public static MemoryLayout $LAYOUT() {
                return Smb2.ProtocolSpecific$Smb2$struct$LAYOUT;
            }
            public static class Server {

                static final  GroupLayout ProtocolSpecific$Smb2$Server$struct$LAYOUT = MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Capabilities")
                );
                public static MemoryLayout $LAYOUT() {
                    return Server.ProtocolSpecific$Smb2$Server$struct$LAYOUT;
                }
                static final VarHandle Capabilities$VH = ProtocolSpecific$Smb2$Server$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Capabilities"));
                public static VarHandle Capabilities$VH() {
                    return Server.Capabilities$VH;
                }
                public static int Capabilities$get(MemorySegment seg) {
                    return (int)Server.Capabilities$VH.get(seg);
                }
                public static void Capabilities$set( MemorySegment seg, int x) {
                    Server.Capabilities$VH.set(seg, x);
                }
                public static int Capabilities$get(MemorySegment seg, long index) {
                    return (int)Server.Capabilities$VH.get(seg.asSlice(index*sizeof()));
                }
                public static void Capabilities$set(MemorySegment seg, long index, int x) {
                    Server.Capabilities$VH.set(seg.asSlice(index*sizeof()), x);
                }
                public static long sizeof() { return $LAYOUT().byteSize(); }
                public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                    return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                }
                public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
            }

            public static MemorySegment Server$slice(MemorySegment seg) {
                return seg.asSlice(0, 4);
            }
            public static class Share {

                static final  GroupLayout ProtocolSpecific$Smb2$Share$struct$LAYOUT = MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Capabilities"),
                    Constants$root.C_LONG$LAYOUT.withName("CachingFlags")
                );
                public static MemoryLayout $LAYOUT() {
                    return Share.ProtocolSpecific$Smb2$Share$struct$LAYOUT;
                }
                static final VarHandle Capabilities$VH = ProtocolSpecific$Smb2$Share$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Capabilities"));
                public static VarHandle Capabilities$VH() {
                    return Share.Capabilities$VH;
                }
                public static int Capabilities$get(MemorySegment seg) {
                    return (int)Share.Capabilities$VH.get(seg);
                }
                public static void Capabilities$set( MemorySegment seg, int x) {
                    Share.Capabilities$VH.set(seg, x);
                }
                public static int Capabilities$get(MemorySegment seg, long index) {
                    return (int)Share.Capabilities$VH.get(seg.asSlice(index*sizeof()));
                }
                public static void Capabilities$set(MemorySegment seg, long index, int x) {
                    Share.Capabilities$VH.set(seg.asSlice(index*sizeof()), x);
                }
                static final VarHandle CachingFlags$VH = ProtocolSpecific$Smb2$Share$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CachingFlags"));
                public static VarHandle CachingFlags$VH() {
                    return Share.CachingFlags$VH;
                }
                public static int CachingFlags$get(MemorySegment seg) {
                    return (int)Share.CachingFlags$VH.get(seg);
                }
                public static void CachingFlags$set( MemorySegment seg, int x) {
                    Share.CachingFlags$VH.set(seg, x);
                }
                public static int CachingFlags$get(MemorySegment seg, long index) {
                    return (int)Share.CachingFlags$VH.get(seg.asSlice(index*sizeof()));
                }
                public static void CachingFlags$set(MemorySegment seg, long index, int x) {
                    Share.CachingFlags$VH.set(seg.asSlice(index*sizeof()), x);
                }
                public static long sizeof() { return $LAYOUT().byteSize(); }
                public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                    return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                }
                public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
            }

            public static MemorySegment Share$slice(MemorySegment seg) {
                return seg.asSlice(4, 8);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Smb2$slice(MemorySegment seg) {
            return seg.asSlice(0, 12);
        }
        public static MemorySegment Reserved$slice(MemorySegment seg) {
            return seg.asSlice(0, 64);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment ProtocolSpecific$slice(MemorySegment seg) {
        return seg.asSlice(52, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


