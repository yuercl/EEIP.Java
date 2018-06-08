package de.re.eeip.tool;

public class Tool {

    public static byte segmentType(Format format) {
        int segmentByte = 0;

        segmentByte |= (1 << 5);
        segmentByte |= format.getType();

        return (byte) segmentByte;
    }

    public static Format smallestFormat(int value) {
        if ((value & 0xFF) == value) {
            return Format.Bits_8;
        } else if ((value & 0xFFFF) == value) {
            return Format.Bits_16;
        } else {
            return Format.Bits_32;
        }
    }

    public enum Format {
        Bits_8(0x0),
        Bits_16(0x1),
        Bits_32(0x2),
        Reserved(0x3);

        private final int type;

        Format(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }
    }
}
