import java.io.*;

class strem {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.txt"));
        dos.writeInt(100);

        DataInputStream dis = new DataInputStream(new FileInputStream("output.txt"));
        System.out.println(dis.readInt());
    }
}

