import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nStarting WAV Analyser\n");

        String fileName = "../test_files/Free_Test_Data_5MB_WAV.wav";

        try {
            analyseWav(fileName);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println();
        System.out.println("\nThat's all folk!\n");
    }

    private static void analyseWav(String fileName) throws Exception {

        // WAV Datei oeffnen
        RandomAccessFile fp = open_wav(fileName);

        // System.out.println(fp.getFilePointer());

        // Header einlesen
        byte[] ba = getWAVFDateiKopf(fp);

        // System.out.println(fp.getFilePointer());

        // WAV Datei schliessen
        close_wav(fp);

        // print RIFF Chunk
        printRIFFChunk(ba);

        // print Format Chunk
        printFormatChunk(ba);

        // print Data Chunk Header
        printDataChunkHeader(ba);
    }

    private static void printRIFFChunk(byte[] ba) {

        System.out.printf("%20s", "Chunk ID: ");
        System.out.println(get4Chars(ba, 0, 4));

        System.out.printf("%20s", "Chunk Size: ");
        System.out.println(getLengthFromLittleEndian(ba, 4, 4) + 8);

        System.out.printf("%20s", "Format: ");
        System.out.println(get4Chars(ba, 8, 4));

    }

    private static void printFormatChunk(byte[] ba) {

        // https://ccrma.stanford.edu/courses/422-winter-2014/projects/WaveFormat/

        System.out.printf("%20s", "Sub Chunk 1 ID: ");
        System.out.println(get4Chars(ba, 12, 4));

        System.out.printf("%20s", "Sub Chunk 1 Size: ");
        System.out.println(getLengthFromLittleEndian(ba, 16, 4));

        System.out.printf("%20s", "Audio Format: ");
        System.out.println(getLengthFromLittleEndian(ba, 20, 2));

        System.out.printf("%20s", "Channels: ");
        System.out.println(getLengthFromLittleEndian(ba, 22, 2));

        System.out.printf("%20s", "Sample Rate: ");
        System.out.println(getLengthFromLittleEndian(ba, 24, 4));

        System.out.printf("%20s", "Byte Rate: ");
        System.out.println(getLengthFromLittleEndian(ba, 28, 4));

        System.out.printf("%20s", "Block Align: ");
        System.out.println(getLengthFromLittleEndian(ba, 22, 2));

        System.out.printf("%20s", "Bits per Sample: ");
        System.out.println(getLengthFromLittleEndian(ba, 34, 2));
    }

    private static void printDataChunkHeader(byte[] ba) {

        System.out.printf("%20s", "Data Chunk ID: ");
        System.out.println(get4Chars(ba, 36, 4));

        System.out.printf("%20s", "Sub Chunk 2 ID: ");
        System.out.println(getLengthFromLittleEndian(ba, 40, 4));

    }

    private static long getLengthFromLittleEndian(byte[] ba, int start, int length) {

        int faktor = 1;
        long fileLength = 0;

        for (int i = start; i < start + length; i++) {

            int b = ba[i] < 0 ? 256 + ba[i] : ba[i];

            int r = b % 16;
            int l = b / 16;

            fileLength += r * faktor;

            faktor *= 16;
            fileLength += l * faktor;

            faktor *= 16;
        }

        return fileLength;
    }

    private static String get4Chars(byte[] bytes, int start, int length) {

        String s = "";

        for (int i = start; i < start + length; i++) {
            s += (char) bytes[i];
        }

        return s;
    }

    private static byte[] getWAVFDateiKopf(RandomAccessFile fp) throws IOException {

        byte[] header = new byte[44];

        fp.read(header);
        return header;

    }

    private static void close_wav(RandomAccessFile fp) {

        try {
            fp.close();
        } catch (IOException e) {
            new RuntimeException();
        }

    }

    private static RandomAccessFile open_wav(String fileName) throws FileNotFoundException {

        RandomAccessFile fp = new RandomAccessFile(fileName, "r");
        return fp;

    }
}
