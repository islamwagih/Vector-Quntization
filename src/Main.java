import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception{
        try {
            VectorQuantization.Compress(2, 2, 5, "D:\\programming\\Java\\VectorQuantization\\original.jpg");
            VectorQuantization.Decompress("D:\\programming\\Java\\VectorQuantization\\original.VQ");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
