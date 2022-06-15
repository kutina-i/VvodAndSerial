import java.io.File;
import java.io.IOException;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class testsVvod {
 @Test
  public void BinaryTest() throws IOException {
  int n = 10;
  int[] arr = new int[n];
  for(int i = 0; i < n; i++){
   arr[i] = i;
  }
  vvod a = new vvod();
  a.outFile(arr);
   assertArrayEquals(arr, a.inFile(n));
  }

 @Test
 public void CharTest() throws IOException {
  int n = 8;
  char[] arr = new char[]{'a','b', 'c','d','e','f','g','h'};
  vvod a = new vvod();
  a.outFileChar(arr);
  assertArrayEquals(arr, a.inFileChar(n));
 }

 @Test
 public void RndmAccessFileTest()  throws IOException {
  int[] arr = new int[4];
  vvod a = new vvod();
  for(int i = 0; i < 4; i++){
   arr[i] = i + 2;
  }
  assertArrayEquals(arr, a.RndmAccessFile(2));
 }

 @Test
 public void listOfFilesTest()  throws IOException {
  File file = new File("C:\\Users\\Asus\\Desktop\\files");
  File[] res = new File[3];
  res[0] = new File("C:\\Users\\Asus\\Desktop\\files\\a.txt");
  res[1] = new File("C:\\Users\\Asus\\Desktop\\files\\b.txt");
  res[2] = new File("C:\\Users\\Asus\\Desktop\\files\\c.txt");
  vvod a = new vvod();
  assertArrayEquals(res, a.listOfFiles(file, ".txt"));
 }

 @Test
 public void listOfFilesTest1()  throws IOException {
  File file = new File("C:\\Users\\Asus\\Desktop\\files1");
  File[] res = new File[1];
  res[0] = new File("C:\\Users\\Asus\\Desktop\\files1\\r.rtf");
  vvod a = new vvod();
  assertArrayEquals(res, a.listOfFiles(file, ".rtf"));
 }






}
