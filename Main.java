import java.util.*;
import java.io.*;
public class Main{

 public static void main(String[] args) {
	String test ="important information"; // proof of concept
	// I don't even know how to create user interfaces in java help 😀

	String filename = "tester.txt";
        String content = "wp={0.38,0}\n" +
                "wp={0.242,0.256}\n" +
                "wp={0.237,0.61}\n" +
                "wp={0.095,0.886}\n" +
                "wp={0.237,0.61}\n" +
                "wp={0.658,0.435}\n" +
                "wp={0.784,0.123}\n" +
                "wp={"+ test +",0.435}\n" +
                "wp={0.866,0.666}\n" +
                "wp={1,0.746}\n" +
                "rp={0.363,0.193}\n" +
                "rp={0.2,0.01}\n" +
                "rp={0,0}\n" +
                "rp={0,0}\n" +
                "rp={0,0}\n" +
                "rp={0,0}\n" +
                "rp={0,0}\n" +
                "rp={0,0}\n" +
                "rp={0,0}\n" +
                "rp={0,0}\n" +
                "gp={10}\n" +
                "gp={00}\n" +
                "gp={00}\n" +
                "gp={00}\n" +
                "gp={00}\n" +
                "gp={00}\n" +
                "gp={00}\n" +
                "gp={00}\n" +
                "gp={00}\n" +
                "gp={00}\n";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(content);
            writer.close();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();


}
}
}