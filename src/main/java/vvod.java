import java.io.*;

public class vvod {

    //читаем из файла в массив
    public int[] inFile(int n) throws IOException {
        int[] arr = new int[n];
        int i = -1;
        int j = 0;
        InputStream is = new FileInputStream("Test.txt");
        while((i = is.read()) != -1){
            arr[j] = i;
            j++;
        }
        return arr;
    }

    //записываем в файл из массива
    public void outFile(int[] arr) throws IOException {
    OutputStream w = null;
    try {
        w = new FileOutputStream("Test.txt");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    for (int i = 0; i < arr.length; i++) {
        w.write((byte)(arr[i]));
    }
    w.close();
    }

    //читаем из файла в массив
    public char[] inFileChar(int n) throws IOException {
        char[] arr = new char[n];
        FileReader is = new FileReader("Test.txt");
        while (is.ready()) {
                is.read(arr);
        }
            return arr;
    }

    //записываем в файл из массива
    public void outFileChar(char[] arr) throws IOException {
        FileWriter w = null;
        try {
            w = new FileWriter("Test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < arr.length; i++) {
            w.write((arr[i]));
        }
        w.close();
    }

    public int[] RndmAccessFile(int p) throws IOException {
        RandomAccessFile f = new RandomAccessFile("test_rndm.txt", "r");
        f.seek(p);
        String a = f.readLine();
        f.close();
        String[] Arr = a.split(" ");
        int[] arr = new int[Arr.length];
        for (int i = 0; i < Arr.length; i++) {
            arr[i] = Integer.parseInt(Arr[i]);
        }
        return arr;
    }

    public File[] listOfFiles(File file, String r){
        File[] list = file.listFiles(new FileFilter(r));
        return list;
    }





}
