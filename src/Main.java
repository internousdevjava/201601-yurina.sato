import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class streamTest7{

    public static void main(String args[]){
        try{
            File file = new File("C:\\Users\\internous\\Desktop\\新JavaScript演習\\KisoKadai.txt\\");

            if (checkBeforeWritefile(file)){
                PrintWriter pw 
                  = new PrintWriter(new BufferedWriter(new FileWriter(file)));

                pw.println("今日の最高気温は");
                pw.println(10);
                pw.println("度です");

                pw.close();
            }else{
                System.out.println("ファイルに書き込めません");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static boolean checkBeforeWritefile(File file){
        if (file.exists()){
            if (file.isFile() && file.canWrite()){
                return true;
            }
        }

        return false;
    }
}