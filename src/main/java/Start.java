import java.io.File;
import java.util.Arrays;
import net.minecraft.client.main.Main;

public class Start {

   public static Object[] concat(Object[] array, Object[] array2) {
      Object[] array3 = Arrays.copyOf(array, array.length + array2.length);
      System.arraycopy(array2, 0, array3, array.length, array2.length);
      return array3;
   }

   public static void main(String[] args) {
      String assetsDir = new File("assets/indexes").isDirectory()
         ? "assets"
         : (new File("run/assets").isDirectory() ? "run/assets" : "assets");
      Main.main(
         (String[])concat(new String[]{"--version", "1.8.9", "--accessToken", "0", "--assetsDir", assetsDir, "--assetIndex", "1.8", "--userProperties", "{}"}, args)
      );
   }
}
