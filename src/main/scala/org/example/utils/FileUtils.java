package org.example.utils;

import java.io.*;

/**
 * @author : chunji.yang
 * @date : 2021-01-19 22:05
 * @remark : Java的IO技术，文件的读写操作
 */
public class FileUtils {
    public static void main(String[] args) {
        String filename = "D:/testfile.txt";
        // ReadFileByLine(filename);
        // ReadFileByBytes(filename);
        // ReadFileByChar(filename);
        String writeFile = "javawrite2file.txt";
        // Write2FileByOutputStream(writeFile);
        // Write2FileByBuffered(writeFile);
        Write2FileByFileWriter(writeFile);
    }

    /**
     * 按行读取文件
     */
    public static void ReadFileByLine(String filename) {
        File file = new File(filename);
        InputStream is = null;
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            is = new FileInputStream(file);
            reader = new InputStreamReader(is);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bufferedReader)
                    bufferedReader.close();
                if (null != reader)
                    reader.close();
                if (null != is)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     *     功能：按字节读取文件
     * </pre>
     *
     * @param filename 读的文件名称
     */
    public static void ReadFileByBytes(String filename) {
        File file = new File(filename);
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            int index = 0;
            while (-1 != (index = is.read())) {
                System.out.write(index);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is)
                    is.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("-----------------------------------");
        try {
            is = new FileInputStream(file);
            byte[] tempbyte = new byte[1000];
            int index = 0;
            while (-1 != (index = is.read(tempbyte))) {
                System.out.write(tempbyte, 0, index);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is)
                    is.close();  //关闭资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 按字符读取文件
     *
     * @param filename  读的文件名称
     */
    public static void ReadFileByChar(String filename) {
        File file = new File(filename);
        InputStream is = null;
        Reader isr = null;
        try {
            is = new FileInputStream(file);
            isr = new InputStreamReader(is);
            int index = 0;
            while (-1 != (index = isr.read())) {
                System.out.print((char) index);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is)
                    is.close();
                if (null != isr)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 通过OutputStreamWriter写文件
     *
     * @param filename  写入的文件名称
     */
    public static void Write2FileByOutputStream(String filename) {
        File file = new File(filename);
        FileOutputStream fos = null;
        // BufferedOutputStream bos = null;
        OutputStreamWriter osw = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            osw.write("Write2FileByOutputStream");
            // bos = new BufferedOutputStream(fos);
            // bos.write("Write2FileByOutputStream".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != osw) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 通过BufferedWriter写文件
     *
     * @param filename
     */
    public static void Write2FileByBuffered(String filename) {
        File file = new File(filename);
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            bw.write("Write2FileByBuffered");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != osw) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 通过FileWriter写文件
     *
     * @param filename
     */
    public static void Write2FileByFileWriter(String filename) {
        File file = new File(filename);
        FileWriter fw = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            fw.write("Write2FileByFileWriter");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
