import java.io.File;

public class DeleteCertainFile {
    public static void main(String[] args) {
        System.out.println("C:\\Temp 디렉터리의 .txt 파일을 모두 삭제합니다....");
        File file = new File("C:\\Temp");
        File[] subFiles = file.listFiles();
        int count = 0;
        for (int i=0; i<subFiles.length; i++){
            String name = subFiles[i].getName();

            if (!subFiles[i].isFile()) continue;

            int index = name.lastIndexOf('.');
            String res = name.substring(index);
            if (res.equals(".txt")){
                subFiles[i].delete();
                System.out.println(subFiles[i].getPath()+" 삭제");
                count++;
            }
        }
        System.out.println("총 "+count+"개의 파일을 삭제하였습니다.");
    }
}
